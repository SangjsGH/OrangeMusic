package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;

@HttpResponse(parser = JsonRespondParse.class)
public class SingerClass implements Serializable {
    /**
     * code : 200
     * msg : OK
     * timestamp : 1561447700061
     * data : {"area":[{"name":"全部","id":-100},{"name":"内地","id":200},{"name":"港台","id":2},{"name":"欧美","id":5},{"name":"日本","id":4},{"name":"韩国","id":3},{"name":"其他","id":6}],"sex":[{"name":"全部","id":-100},{"name":"男","id":0},{"name":"女","id":1},{"name":"组合","id":2}],"genre":[{"name":"全部","id":-100},{"name":"流行","id":1},{"name":"嘻哈","id":6},{"name":"摇滚","id":2},{"name":"电子","id":4},{"name":"民谣","id":3},{"name":"R&B","id":8},{"name":"民歌","id":10},{"name":"轻音乐","id":9},{"name":"爵士","id":5},{"name":"古典","id":14},{"name":"乡村","id":25},{"name":"蓝调","id":20}],"index":[{"name":"热门","id":-100},{"name":"A","id":1},{"name":"B","id":2},{"name":"C","id":3},{"name":"D","id":4},{"name":"E","id":5},{"name":"F","id":6},{"name":"G","id":7},{"name":"H","id":8},{"name":"I","id":9},{"name":"J","id":10},{"name":"K","id":11},{"name":"L","id":12},{"name":"M","id":13},{"name":"N","id":14},{"name":"O","id":15},{"name":"P","id":16},{"name":"Q","id":17},{"name":"R","id":18},{"name":"S","id":19},{"name":"T","id":20},{"name":"U","id":21},{"name":"V","id":22},{"name":"W","id":23},{"name":"X","id":24},{"name":"Y","id":25},{"name":"Z","id":26},{"name":"#","id":27}]}
     */
    private int code;
    private String msg;
    private long timestamp;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{
        private List<AreaBean> area;
        private List<SexBean> sex;
        private List<GenreBean> genre;
        private List<IndexBean> index;

        public List<AreaBean> getArea() {
            return area;
        }

        public void setArea(List<AreaBean> area) {
            this.area = area;
        }

        public List<SexBean> getSex() {
            return sex;
        }

        public void setSex(List<SexBean> sex) {
            this.sex = sex;
        }

        public List<GenreBean> getGenre() {
            return genre;
        }

        public void setGenre(List<GenreBean> genre) {
            this.genre = genre;
        }

        public List<IndexBean> getIndex() {
            return index;
        }

        public void setIndex(List<IndexBean> index) {
            this.index = index;
        }

        public static class AreaBean implements Serializable{
            /**
             * name : 全部
             * id : -100
             */

            private String name;
            private int id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class SexBean implements Serializable{
            /**
             * name : 全部
             * id : -100
             */

            private String name;
            private int id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class GenreBean {
            /**
             * name : 全部
             * id : -100
             */

            private String name;
            private int id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class IndexBean implements Serializable{
            /**
             * name : 热门
             * id : -100
             */

            private String name;
            private int id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
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
