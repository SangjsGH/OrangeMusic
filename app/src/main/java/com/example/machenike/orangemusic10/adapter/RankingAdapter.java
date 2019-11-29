package com.example.machenike.orangemusic10.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.entity.Ranking;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RankingAdapter extends BaseAdapter {
    private Context context;
    private List<Ranking.DataBean.SongListBean> Datas = new ArrayList<>();

    public RankingAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<Ranking.DataBean.SongListBean> data) {
        Datas.clear();
        this.Datas.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return Datas.size();
    }

    @Override
    public Ranking.DataBean.SongListBean getItem(int position) {
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
            view = LayoutInflater.from(context).inflate(R.layout.ranking_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);//设置标签
        } else {
            //复用视图，直接使用已经绑定控件的viewholder
            holder = (ViewHolder) view.getTag();
        }
        Ranking.DataBean.SongListBean item = getItem(position);
        holder.rankingNumber.setText((position+1)+"");
        List<Ranking.DataBean.SongListBean.SingerBean> singer = item.getSinger();
        if (singer!=null&&singer.size()!=0){
            holder.rankingSinger.setText(singer.get(0).getSingerName());
        }
        holder.rankingSongname.setText(item.getSongName());

        return view;
    }

    static class ViewHolder {
        @BindView(R.id.ranking_number)
        TextView rankingNumber;
        @BindView(R.id.ranking_songname)
        TextView rankingSongname;
        @BindView(R.id.ranking_singer)
        TextView rankingSinger;
        @BindView(R.id.music_more)
        ImageView musicMore;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
