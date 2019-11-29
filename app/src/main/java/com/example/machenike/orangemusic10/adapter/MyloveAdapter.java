package com.example.machenike.orangemusic10.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.entity.Addmylove;
import com.example.machenike.orangemusic10.entity.Ranking;
import com.example.machenike.orangemusic10.entity.Seemylove;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyloveAdapter extends BaseAdapter {
    private Context context;
    private List<Seemylove.ResultBean.DataBean> Datas = new ArrayList<>();

    public MyloveAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<Seemylove.ResultBean.DataBean> data) {
        Datas.clear();
        this.Datas.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return Datas.size();
    }

    @Override
    public Seemylove.ResultBean.DataBean getItem(int position) {
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
            view = LayoutInflater.from(context).inflate(R.layout.mylove_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);//设置标签
        } else {
            //复用视图，直接使用已经绑定控件的viewholder
            holder = (ViewHolder) view.getTag();
        }
        Seemylove.ResultBean.DataBean item = getItem(position);
        holder.myloveNumber.setText((position+1)+"");
        holder.myloveSongname.setText(item.getSongName());
        holder.myloveSinger.setText(item.getSinger());
        return view;
    }

    static class ViewHolder {
        @BindView(R.id.mylove_number)
        TextView myloveNumber;
        @BindView(R.id.mylove_songname)
        TextView myloveSongname;
        @BindView(R.id.mylove_singer)
        TextView myloveSinger;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
