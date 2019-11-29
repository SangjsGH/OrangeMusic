package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;

@HttpResponse(parser = JsonRespondParse.class)
public class Addmylove implements Serializable {

    /**
     * result : {"msg":"已加入我的歌单","data":{"songName":"方圆几里","singer":"薛之谦","songMid":"123","id":"2c83391d-a24a-4fd2-ab32-4833b0c8885d"}}
     */

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean implements Serializable{
        /**
         * msg : 已加入我的歌单
         * data : {"songName":"方圆几里","singer":"薛之谦","songMid":"123","id":"2c83391d-a24a-4fd2-ab32-4833b0c8885d"}
         */

        private String msg;
        private DataBean data;

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

        public static class DataBean implements Serializable{
            /**
             * songName : 方圆几里
             * singer : 薛之谦
             * songMid : 123
             * id : 2c83391d-a24a-4fd2-ab32-4833b0c8885d
             */

            private String songName;
            private String singer;
            private String songMid;
            private String id;

            public String getSongName() {
                return songName;
            }

            public void setSongName(String songName) {
                this.songName = songName;
            }

            public String getSinger() {
                return singer;
            }

            public void setSinger(String singer) {
                this.singer = singer;
            }

            public String getSongMid() {
                return songMid;
            }

            public void setSongMid(String songMid) {
                this.songMid = songMid;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }
    }
}
