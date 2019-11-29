package com.example.machenike.orangemusic10.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.Service.PlayService;
import com.example.machenike.orangemusic10.adapter.MyloveAdapter;
import com.example.machenike.orangemusic10.entity.Seemylove;
import com.example.machenike.orangemusic10.utils.Commononline;
import com.example.machenike.orangemusic10.utils.NestedListView;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyloveActivity extends AppCompatActivity {
    @BindView(R.id.ic_back)
    ImageView icBack;
    @BindView(R.id.ranking_title)
    CollapsingToolbarLayout rankingTitle;
    @BindView(R.id.list_total)
    TextView listTotal;
    @BindView(R.id.ranking_list)
    NestedListView rankingList;
    private List<Seemylove.ResultBean.DataBean> list =new ArrayList<>();
    private MyloveAdapter adapter;
    private String API ="http://192.168.43.234:8080/Music/songList_SongList_seeSong_json";
    private String total;
    private PlayService playService = new PlayService();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylove_list);
        ButterKnife.bind(this);
        rankingTitle.setTitle("我喜欢的音乐");
        adapter = new MyloveAdapter(this);
        rankingList.setAdapter(adapter);
        getData();
        playSong();
    }

    @OnClick({R.id.ic_back, R.id.ranking_title, R.id.list_total})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ic_back:
                this.finish();
                break;
            case R.id.ranking_title:
                break;
            case R.id.list_total:
                break;
        }
    }
    private void playSong() {
        rankingList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String songMid = Commononline.musiconlineList.get(position).getSongMid();
                // String URL ="https://v1.itooi.cn/tencent/url?id="+songMid+"&quality=192";
                playService.playMusic(songMid);
                Intent intent = new Intent(MyloveActivity.this, MusiconlineActivity.class);
                // intent.putExtra("songMid", songMid);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }

  private void getData() {
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<Seemylove>() {
            @Override
            public void onSuccess(Seemylove result) {
                Commononline.musiconlineList.clear();
                Commononline.musiconlineList.addAll(result.getResult().getData());
                adapter.setDatas(Commononline.musiconlineList);
                rankingList.setAdapter(adapter);
                List<Seemylove.ResultBean.DataBean> songList = result.getResult().getData();
                int size = songList.size();
                total = "(" + size + ")";
                listTotal.setText(total);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                System.out.println(ex);
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
}
