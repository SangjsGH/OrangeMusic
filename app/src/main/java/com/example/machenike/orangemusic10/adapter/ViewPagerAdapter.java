package com.example.machenike.orangemusic10.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.machenike.orangemusic10.entity.Songlist;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {
    private List<Songlist.DataBean.ListBean> gridList;
    private List<Songlist.DataBean.ListBean> gridList1=new ArrayList<>();
    private int position=0;
    private Context context;

    public ViewPagerAdapter(List<Songlist.DataBean.ListBean> gridList, Context context) {
        this.gridList = gridList;
        this.context = context;
    }


    public void add(List<Songlist.DataBean.ListBean> datas) {
        if (gridList.size() > 0) {
            gridList.clear();
        }
        gridList.addAll(datas);
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return 6;
    }
    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        GridView gridView = new GridView(context);
        gridView.setNumColumns(3);
        SonglistAdapter adapter = new SonglistAdapter(context);
        gridList1.clear();
        gridList1=gridList.subList(position,position+6);
        position=position+6;
        adapter.setDatas(gridList1);
        gridView.setAdapter(adapter);
        container.addView(gridView);
        return gridView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}