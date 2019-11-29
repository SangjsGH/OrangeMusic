package com.example.machenike.orangemusic10.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.entity.Singer;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class SingerAdapter extends BaseAdapter {
    private Context context;
    private List<Singer.DataBean> Datas = new ArrayList<>();

    public SingerAdapter(Context context, List<Singer.DataBean> list) {
        Datas.clear();
        this.Datas.addAll(list);
        notifyDataSetChanged();
        this.context = context;
    }


    @Override
    public int getCount() {
        return Datas.size();
    }

    @Override
    public Singer.DataBean getItem(int position) {
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
            view = LayoutInflater.from(context).inflate(R.layout.singer_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);//设置标签
        } else {
            //复用视图，直接使用已经绑定控件的viewholder
            holder = (ViewHolder) view.getTag();
        }
        Singer.DataBean item= getItem(position);
        holder.singerName.setText(item.getSinger_name());
        Glide.with(context).load(item.getSinger_pic()).into(holder.singerPic);
        return view;
    }

    static class ViewHolder {
        @BindView(R.id.singer_pic)
        CircleImageView singerPic;
        @BindView(R.id.singer_name)
        TextView singerName;
        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
