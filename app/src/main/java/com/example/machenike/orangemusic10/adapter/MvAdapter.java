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
import com.example.machenike.orangemusic10.Activity.MVActivity;
import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.entity.MV;
import com.example.machenike.orangemusic10.utils.GlideRoundTransform;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class MvAdapter extends BaseAdapter {
    private Context context;
    private List<MV.DataBean.ListBean> Datas = new ArrayList<>();

    public MvAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<MV.DataBean.ListBean> data) {
        Datas.clear();
        this.Datas.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return Datas.size();
    }

    @Override
    public MV.DataBean.ListBean getItem(int position) {
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
            view = LayoutInflater.from(context).inflate(R.layout.found_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);//设置标签
        } else {
            //复用视图，直接使用已经绑定控件的viewholder
            holder = (ViewHolder) view.getTag();
        }
        MV.DataBean.ListBean item = getItem(position);

        holder.mvTitle.setText(item.getTitle());
        holder.mvSinger.setText(item.getSingers().get(0).getName());
        Glide.with(context).load(item.getPicurl()).transform(new CenterCrop(context), new GlideRoundTransform(context, 10))
                .into(holder.mvPic);
        Glide.with(context).load(item.getSingers().get(0).getPicurl()).into(holder.mvSingerPic);
        holder.mvPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mvId = item.getVid();
                String mvTitle =item.getTitle();
                String singerPic =item.getSingers().get(0).getPicurl();
                String singerName =item.getSingers().get(0).getName();
                Intent intent = new Intent(context, MVActivity.class);
                intent.putExtra("mvId",mvId);
                intent.putExtra("mvTitle",mvTitle);
                intent.putExtra("singerPic",singerPic);
                intent.putExtra("singerName",singerName);
                context.startActivity(intent);
            }
        });
        return view;
    }

    static class ViewHolder {
        @BindView(R.id.mv_pic)
        ImageView mvPic;
        @BindView(R.id.mv_title)
        TextView mvTitle;
        @BindView(R.id.mv_singer_pic)
        CircleImageView mvSingerPic;
        @BindView(R.id.mv_singer)
        TextView mvSinger;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
