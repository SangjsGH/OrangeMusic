package com.example.machenike.orangemusic10.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.entity.Search1;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchAdapter1 extends BaseAdapter{
    String TAG="SearchAdapter1";
    private Context context;
    private List<Search1.DataBean.SongListBean> Datas = new ArrayList<>();

    public SearchAdapter1(Context context) {
        this.context = context;
    }

    public void setDatas(List<Search1.DataBean.SongListBean> data) {
        Datas.clear();
        this.Datas.addAll(data);
        notifyDataSetInvalidated();

    }

    @Override
    public int getCount() {
        Log.e(TAG, "数量: "+Datas.size() );
        return Datas.size();
    }

    @Override
    public Search1.DataBean.SongListBean getItem(int position) {
        return Datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        //布局加载器   attachToRoot :是否将载入的视图绑定到根视图中
        ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.search_view_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);//设置标签
        } else {
            //复用视图，直接使用已经绑定控件的viewholder
            holder = (ViewHolder) view.getTag();
        }
        holder.itemSongname.setText(Datas.get(position).getSongName());
        String Singers="";
        for (int i=0;i<Datas.get(position).getSinger().size();i++){
            Singers+=Datas.get(position).getSinger().get(i).getSingerName()+" ";
        }
        holder.itemSinger.setText(Singers);
        return view;
    }

    static class ViewHolder {
        @BindView(R.id.item_Songname)
        TextView itemSongname;
        @BindView(R.id.item_Singer)
        TextView itemSinger;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
