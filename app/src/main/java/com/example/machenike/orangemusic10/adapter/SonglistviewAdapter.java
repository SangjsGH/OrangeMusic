package com.example.machenike.orangemusic10.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.entity.Songlistview;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SonglistviewAdapter extends BaseAdapter {
    private Context context;
    private List<Songlistview.DataBean.SonglistBean> Datas = new ArrayList<>();

    public SonglistviewAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<Songlistview.DataBean.SonglistBean> data) {
        Datas.clear();
        this.Datas.addAll(data);
        notifyDataSetInvalidated();
    }

    @Override
    public int getCount() {
        return Datas.size();
    }

    @Override
    public Songlistview.DataBean.SonglistBean getItem(int position) {
        return Datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.songlistitem, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);//设置标签
        } else {
            //复用视图，直接使用已经绑定控件的viewholder
            holder = (ViewHolder) view.getTag();
        }
        Songlistview.DataBean.SonglistBean item = getItem(position);
        holder.songlistSongname.setText(item.getName());
        holder.songlistSinger.setText(item.getSinger().get(0).getName());
        holder.songlistNumber.setText((position+1)+"");
        return view;
    }

    static class ViewHolder {
        @BindView(R.id.songlist_number)
        TextView songlistNumber;
        @BindView(R.id.songlist_songname)
        TextView songlistSongname;
        @BindView(R.id.songlist_singer)
        TextView songlistSinger;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
