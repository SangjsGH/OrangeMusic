package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;
@HttpResponse(parser = JsonRespondParse.class)
public class Seemylove implements Serializable {

    /**
     * result : {"msg":"查看成功","data":[{"songName":"9420","singer":"麦小兜","songMid":"000kbQ6l3srzE5","id":""},{"songName":"一个人记得","singer":"尤长靖","songMid":"0027CJIZ2ko9sk","id":""},{"songName":"多想在平庸的生活拥抱你","singer":"隔壁老樊","songMid":"001k3Be610tdON","id":""}],"url":"resource/page/shopIndex.jsp"}
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
         * msg : 查看成功
         * data : [{"songName":"9420","singer":"麦小兜","songMid":"000kbQ6l3srzE5","id":""},{"songName":"一个人记得","singer":"尤长靖","songMid":"0027CJIZ2ko9sk","id":""},{"songName":"多想在平庸的生活拥抱你","singer":"隔壁老樊","songMid":"001k3Be610tdON","id":""}]
         * url : resource/page/shopIndex.jsp
         */

        private String msg;
        private String url;
        private List<DataBean> data;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements Serializable{
            /**
             * songName : 9420
             * singer : 麦小兜
             * songMid : 000kbQ6l3srzE5
             * id :
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
