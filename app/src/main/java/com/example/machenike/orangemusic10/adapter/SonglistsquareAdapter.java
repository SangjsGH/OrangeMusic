package com.example.machenike.orangemusic10.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.Activity.SonglistActivity;
import com.example.machenike.orangemusic10.entity.Songlistsquare;
import com.example.machenike.orangemusic10.utils.GlideRoundTransform;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SonglistsquareAdapter extends BaseAdapter {
    private Context context;
    private List<Songlistsquare.DataBean.ListBean> Datas = new ArrayList<>();

    public SonglistsquareAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<Songlistsquare.DataBean.ListBean> data) {
        Datas.clear();
        this.Datas.addAll(data);
        notifyDataSetInvalidated();
    }

    @Override
    public int getCount() {
        return Datas.size();
    }

    @Override
    public Songlistsquare.DataBean.ListBean getItem(int position) {
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
            view = LayoutInflater.from(context).inflate(R.layout.songsquare_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);//设置标签
        } else {
            //复用视图，直接使用已经绑定控件的viewholder
            holder = (ViewHolder) view.getTag();
        }
        Songlistsquare.DataBean.ListBean item =getItem(position);
        holder.songsquareText.setText(item.getDissname());
        Glide.with(context).load(item.getImgurl()).transform(new CenterCrop(context), new GlideRoundTransform(context, 10))
                .into(holder.songsquareImg);
        holder.songsquareImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String songlistId = item.getDissid() ;
                String songlistName = item.getDissname();
                String songlistPic =item.getImgurl();
                Intent intent = new Intent(context, SonglistActivity.class);
                intent.putExtra("songlistId", songlistId);
                intent.putExtra("songlistName",songlistName);
                intent.putExtra("songlistPic",songlistPic);
                /*                intent.putExtra("songlistPic",songlistPic);*/
                context.startActivity(intent);
            }
        });
        return view;
    }

    static class ViewHolder {
        @BindView(R.id.songsquare_img)
        ImageView songsquareImg;
        @BindView(R.id.songsquare_text)
        TextView songsquareText;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
