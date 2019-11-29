package com.example.machenike.orangemusic10.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.entity.Music;
import com.example.machenike.orangemusic10.utils.GlideRoundTransform;

import java.util.ArrayList;
import java.util.List;


import butterknife.BindView;
import butterknife.ButterKnife;

public class RankingListAdapter extends BaseAdapter {
    private Context context;
    private List<Music.DataBean> mDatas = new ArrayList<>();

    public RankingListAdapter(Context context) {
        this.context = context;
    }

    public void setmDatas(List<Music.DataBean> data) {
        mDatas.clear();
        this.mDatas.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Music.DataBean getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        //布局加载器   attachToRoot :是否将载入的视图绑定到根视图中
        ViewHolder holder;
        if (view==null) {
            view = LayoutInflater.from(context).inflate(R.layout.ranking_list_item, viewGroup, false);
            holder= new ViewHolder(view);
            view.setTag(holder);//设置标签
        }else {
            //复用视图，直接使用已经绑定控件的viewholder
            holder = (ViewHolder) view.getTag();
        }
        Music.DataBean item= getItem(position);
        int itemId = item.getId();
        holder.title.setText(item.getTitle());

        int number = item.getSongList().get(0).getNumber();
        String songName =item.getSongList().get(0).getSongName();
        String singerName = item.getSongList().get(0).getSingerName();
        String Song1 = number+"."+songName+"-"+singerName;

        int number1 = item.getSongList().get(1).getNumber();
        String songName1 =item.getSongList().get(1).getSongName();
        String singerName1 = item.getSongList().get(1).getSingerName();
        String Song2 = number1+"."+songName1+"-"+singerName1;

        int number2 = item.getSongList().get(2).getNumber();
        String songName2 =item.getSongList().get(2).getSongName();
        String singerName2 = item.getSongList().get(2).getSingerName();
        String Song3 = number2+"."+songName2+"-"+singerName2;

        holder.song1.setText(Song1);
        holder.song2.setText(Song2);
        holder.song3.setText(Song3);
        Glide.with(context).load(item.getPicUrl()).transform(new CenterCrop(context), new GlideRoundTransform(context, 10))
                .into(holder.image);
        return view;
    }

    /**
     * 静态内部类，在listview滚动时快速设置值，而不必每次都初始化控件，从而提升性能
     */
    static class ViewHolder {
        @BindView(R.id.title_view)
        TextView title;
        @BindView(R.id.song_1)
        TextView song1;
        @BindView(R.id.song_2)
        TextView song2;
        @BindView(R.id.song_3)
        TextView song3;
        @BindView(R.id.list_img)
        ImageView image;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
