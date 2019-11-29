package com.example.machenike.orangemusic10.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.entity.SingerClass;
import com.example.machenike.orangemusic10.entity.SingerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SingerviewAdapter extends BaseAdapter {
    private Context context;
    private List<SingerView.DataBean> Datas = new ArrayList<>();

    public SingerviewAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<SingerView.DataBean> data) {
        Datas.clear();
        this.Datas.addAll(data);
        notifyDataSetInvalidated();
    }

    @Override
    public int getCount() {
        return Datas.size();
    }

    @Override
    public SingerView.DataBean getItem(int position) {
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
            view = LayoutInflater.from(context).inflate(R.layout.singerview_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);//设置标签
        } else {
            //复用视图，直接使用已经绑定控件的viewholder
            holder = (ViewHolder) view.getTag();
        }
        SingerView.DataBean item = getItem(position);
        holder.rankingNumber.setText((position+1)+"");
        String albumname = item.getMusicData().getAlbumname();
        String singername = item.getMusicData().getSinger().get(0).getName();
        holder.singerView.setText(singername+"·"+albumname);
        holder.songName.setText(item.getMusicData().getSongname());
        return view;
    }

    static class ViewHolder {
        @BindView(R.id.ranking_number)
        TextView rankingNumber;
        @BindView(R.id.song_name)
        TextView songName;
        @BindView(R.id.singer_view)
        TextView singerView;
        @BindView(R.id.music_more)
        ImageView musicMore;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
