package com.example.machenike.orangemusic10.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

public class SlidingMenu extends HorizontalScrollView{

    private LinearLayout wrapper;
    private ViewGroup menu;
    private ViewGroup content;

    //屏幕的宽度
    private int screenWidth;
    //菜单view的宽度
    private int muneWidth;
    //内容view的宽度
    private int contentWidth;

    //菜单向右边拉出来时，离右边屏幕的距离,初始化为80dp
    private int muneRightPadding = 80;

    //判断onMeasure方法是不是第一次调用，我们只要求调用一次
    private boolean flag;

    //判断菜单是否是打开状态
    private boolean isOpen;

    //未使用自定义属性时，调用
    public SlidingMenu(Context context, AttributeSet attrs) {
        super(context, attrs);

        //获得屏幕的宽度
        WindowManager wm = (WindowManager) getContext()
                .getSystemService(Context.WINDOW_SERVICE);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;

        //将dip转化为px
        muneRightPadding = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 80, context.getResources().getDisplayMetrics());

    }

    /*
     * 设置子view的宽和高
     * 设置自己的宽和高
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        if(!flag){
            //获得HorizontalScrollView控件中对应的子view，参考activity_main.xml
            wrapper = (LinearLayout)getChildAt(0);
            menu = (ViewGroup)wrapper.getChildAt(0);
            content = (ViewGroup)wrapper.getChildAt(1);

            muneWidth= menu.getLayoutParams().width = screenWidth - muneRightPadding;
            contentWidth = content.getLayoutParams().width = screenWidth;
            //自己的宽度wrapperWidth,由于是一个LinearLayout,里面包含menu和content，子view的宽和高确定了，自己的宽和高就确定了，所以不设置了

            flag = true;
        }

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /*
     * 我们布局文件中是menu显示，content隐藏的
     * 所以在这里通过设置偏移量，将menu隐藏，content显示
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);

        //防止多次调用，我们只有在布局改变时才调用这个方法
        if(changed){
            //向左边滑动menu的宽度，就是隐藏了menu
            this.scrollTo(muneWidth, 0);
        }

    }

    /*
     * 判断手指滑动的结果
     */
    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_UP:

                //menu菜单隐藏在屏幕左边的宽度
                int scrollX = getScrollX();
                if(scrollX >= muneWidth/2){
                    //渐滑的效果,菜单隐藏，隐藏在屏幕左边的宽度为muneWidth
                    this.smoothScrollTo(muneWidth, 0);
                    isOpen = false;
                }else{
                    //菜单完全显示，隐藏在左边屏幕的宽度为0
                    this.smoothScrollTo(0, 0);
                    isOpen =true;
                }

                return true;
        }

        return super.onTouchEvent(ev);
    }

    //打开菜单
    public void openMenu(){

        if(isOpen) return;

        this.smoothScrollTo(0, 0);
        isOpen =true;
    }

    //关闭菜单
    public void closeMenu(){
        if(!isOpen) return;

        this.smoothScrollTo(muneWidth, 0);
        isOpen = false;
    }

    //点击按钮，切换菜单
    public void toggle(){

        if(isOpen){
            closeMenu();
        }
        else {
            openMenu();
        }
    }
}
