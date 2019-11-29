package com.example.machenike.orangemusic10.Interface;
import com.example.machenike.orangemusic10.entity.SingerClass;


public interface OnRecyclerItemClickListener {
    //RecyclerView的点击事件，将信息回调给view
    void onItemClick(int Position, SingerClass.DataBean singerClass, int flag);
}