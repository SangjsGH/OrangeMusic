package com.example.machenike.orangemusic10.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.machenike.orangemusic10.Interface.OnRecyclerItemClickListener;
import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.entity.SingerClass;
import java.util.List;

public class SingerRecyclerViewAdapter extends RecyclerView.Adapter<SingerRecyclerViewAdapter.ViewHolder> {

    private int flag;
    private SingerClass.DataBean singerClass;
    private OnRecyclerItemClickListener monItemClickListener;
    private int thisPosition;
    Context context;
    private List<SingerClass.DataBean.AreaBean> list1;
    private List<SingerClass.DataBean.GenreBean> list2;
    private List<SingerClass.DataBean.SexBean> list3;


    public SingerRecyclerViewAdapter(Context context, SingerClass.DataBean SingerClass, int i) {
        this.context = context;
        singerClass = SingerClass;
        flag = i;
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
        TextView singerClass;
        LinearLayout bgSinger;
    }
    @Override
    public int getItemCount() {
        if (flag == 1) {
            list1 = singerClass.getArea();
            return list1.size();
        }
        if (flag == 2) {
            list2 = singerClass.getGenre();
            return list2.size();
        }
        if (flag == 3) {
            list3 = singerClass.getSex();
            return list3.size();
        }
        return 0;
    }

    public int getthisPosition() {
        return thisPosition;
    }

    public void setThisPosition(int thisPosition) {
        this.thisPosition = thisPosition;
    }

    //提供set方法供Activity或Fragment调用
    public void setRecyclerItemClickListener(OnRecyclerItemClickListener listener) {
        monItemClickListener = listener;
    }

    /**
     * 创建ViewHolder
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.class_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.bgSinger = view.findViewById(R.id.bg_singer);
        viewHolder.singerClass = view.findViewById(R.id.singer_class);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
        viewHolder.bgSinger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (monItemClickListener != null) {
                    monItemClickListener.onItemClick(position, singerClass, flag);
                }
            }
        });

        if (flag == 1) {
            list1 = singerClass.getArea();
            String zi = list1.get(position).getName();
            viewHolder.singerClass.setText(zi);

            if (position == getthisPosition()) {
                //選中的顔色就設成了  黃色
                viewHolder.bgSinger.setBackgroundResource(R.drawable.shape_singerlx_red);
            } else {
                //未選中的顔色 就設成了 白色
                viewHolder.bgSinger.setBackgroundResource(R.drawable.shape_singerlx);
            }
        }
        if (flag == 2) {
            list2 = singerClass.getGenre();
            String zi = list2.get(position).getName();
            viewHolder.singerClass.setText(zi);

            if (position == getthisPosition()) {
                //選中的顔色就設成了  黃色
                viewHolder.bgSinger.setBackgroundResource(R.drawable.shape_singerlx_red);
            } else {
                //未選中的顔色 就設成了 白色
                viewHolder.bgSinger.setBackgroundResource(R.drawable.shape_singerlx);
            }
        }
        if (flag == 3) {
            list3 = singerClass.getSex();
            String zi = list3.get(position).getName();
            viewHolder.singerClass.setText(zi);

            if (position == getthisPosition()) {
                //選中的顔色就設成了  黃色
                viewHolder.bgSinger.setBackgroundResource(R.drawable.shape_singerlx_red);
            } else {
                //未選中的顔色 就設成了 白色
                viewHolder.bgSinger.setBackgroundResource(R.drawable.shape_singerlx);
            }
        }
    }

}
