package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;
@HttpResponse(parser = JsonRespondParse.class)
public class Index implements Serializable {

    /**
     * announce : 本接口所有数据均来自 QQ 音乐, 仅供学习交流之用,请不要用于商业用途. 如果喜欢请下载 QQ 音乐 APP 畅听.如有侵权请联系微信(QQ): 1363693666, 我会第一时间删除~
     * errno : 0
     * msg : success
     * data : {"slider":["http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/1355152.jpg","http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/1358233.jpg","http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/1356478.jpeg","http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/1355960.jpg","http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/1359213.jpg"],"radioList":[{"picUrl":"http://y.gtimg.cn/music/photo/radio/track_radio_199_13_1.jpg","title":"热歌","id":199},{"picUrl":"http://y.gtimg.cn/music/photo/radio/track_radio_307_13_1.jpg","title":"一人一首招牌歌","id":307}]}
     */

    private String announce;
    private int errno;
    private String msg;
    private DataBean data;

    public String getAnnounce() {
        return announce;
    }

    public void setAnnounce(String announce) {
        this.announce = announce;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable  {
        private List<String> slider;
        private List<RadioListBean> radioList;

        public List<String> getSlider() {
            return slider;
        }

        public void setSlider(List<String> slider) {
            this.slider = slider;
        }

        public List<RadioListBean> getRadioList() {
            return radioList;
        }

        public void setRadioList(List<RadioListBean> radioList) {
            this.radioList = radioList;
        }

        public static class RadioListBean implements Serializable {
            /**
             * picUrl : http://y.gtimg.cn/music/photo/radio/track_radio_199_13_1.jpg
             * title : 热歌
             * id : 199
             */

            private String picUrl;
            private String title;
            private int id;

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
