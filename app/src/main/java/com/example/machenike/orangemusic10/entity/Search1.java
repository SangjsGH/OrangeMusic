package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;
@HttpResponse(parser = JsonRespondParse.class)
public class Search1 implements Serializable{
    /**
     * announce : 本接口所有数据均来自 QQ 音乐, 仅供学习交流之用,请不要用于商业用途. 如果喜欢请下载 QQ 音乐 APP 畅听.如有侵权请联系微信(QQ): 1363693666, 我会第一时间删除~
     * errno : 0
     * msg : success
     * data : {"page":{"currentNumber":20,"currentPage":1,"totalNumber":400},"songList":[{"songMid":"003OUlho2HcRHC","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"告白气球","songId":107192078,"albumMid":"003RMaRI1iFoYd"},{"songMid":"002qU5aY3Qu24y","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"青花瓷","songId":410316,"albumMid":"002eFUFm2XYZ7z"},{"songMid":"002l8JN71d2Dxy","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"龙卷风","songId":97758,"albumMid":"000f01724fd7TH"},{"songMid":"003aAYrm3GE0Ac","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"稻香","songId":449205,"albumMid":"002Neh8l0uciQZ"},{"songMid":"001J5QJL1pRQYB","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"等你下课(with 杨瑞代)","songId":212877900,"albumMid":"003bSL0v4bpKAx"},{"songMid":"0039MnYb0qxYhV","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"晴天","songId":97773,"albumMid":"000MkMni19ClKG"},{"songMid":"0042QMDR1VzSsx","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"说好的幸福呢","songId":449200,"albumMid":"002Neh8l0uciQZ"},{"songMid":"001Js78a40BZU6","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"算什么男人","songId":101369814,"albumMid":"001uqejs3d6EID"},{"songMid":"002SVVvi3zwTNT","singer":[{"singerName":"山弟","singerMid":"0040oscq2Q9zzX"}],"songName":"周杰伦","songId":213932861,"albumMid":"002kjsIa3IOl6T"},{"songMid":"000oW8J53xPhZA","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"明明就","songId":3585884,"albumMid":"003Ow85E3pnoqi"},{"songMid":"000amRvH3wxv56","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"安静","songId":97743,"albumMid":"000I5jJB3blWeN"},{"songMid":"004Z8Ihr0JIu5s","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"七里香","songId":102065756,"albumMid":"003DFRzD192KKD"},{"songMid":"004emQMs09Z1lz","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"烟花易冷","songId":680279,"albumMid":"000bviBl4FjTpO"},{"songMid":"003xv4w313tZHV","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"红尘客栈","songId":5177680,"albumMid":"003Ow85E3pnoqi"},{"songMid":"0009BCJK1nRaad","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"简单爱","songId":97744,"albumMid":"000I5jJB3blWeN"},{"songMid":"002CUU2B3WuGLc","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"Mine Mine","songId":1018543,"albumMid":"003KNcyk0t3mwg"},{"songMid":"004BhQke4adHcf","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"给我一首歌的时间","songId":101091484,"albumMid":"002Neh8l0uciQZ"},{"songMid":"003iY6cU4YG0xi","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"黑色毛衣","songId":718480,"albumMid":"0024bjiL2aocxT"},{"songMid":"003ZrdgZ0UnjDl","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"最长的电影","songId":5177785,"albumMid":"002eFUFm2XYZ7z"},{"songMid":"002u8ZOM4C7QF4","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"手写的从前","songId":101787870,"albumMid":"001uqejs3d6EID"}]}
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

    public static class DataBean implements Serializable {
        /**
         * page : {"currentNumber":20,"currentPage":1,"totalNumber":400}
         * songList : [{"songMid":"003OUlho2HcRHC","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"告白气球","songId":107192078,"albumMid":"003RMaRI1iFoYd"},{"songMid":"002qU5aY3Qu24y","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"青花瓷","songId":410316,"albumMid":"002eFUFm2XYZ7z"},{"songMid":"002l8JN71d2Dxy","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"龙卷风","songId":97758,"albumMid":"000f01724fd7TH"},{"songMid":"003aAYrm3GE0Ac","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"稻香","songId":449205,"albumMid":"002Neh8l0uciQZ"},{"songMid":"001J5QJL1pRQYB","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"等你下课(with 杨瑞代)","songId":212877900,"albumMid":"003bSL0v4bpKAx"},{"songMid":"0039MnYb0qxYhV","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"晴天","songId":97773,"albumMid":"000MkMni19ClKG"},{"songMid":"0042QMDR1VzSsx","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"说好的幸福呢","songId":449200,"albumMid":"002Neh8l0uciQZ"},{"songMid":"001Js78a40BZU6","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"算什么男人","songId":101369814,"albumMid":"001uqejs3d6EID"},{"songMid":"002SVVvi3zwTNT","singer":[{"singerName":"山弟","singerMid":"0040oscq2Q9zzX"}],"songName":"周杰伦","songId":213932861,"albumMid":"002kjsIa3IOl6T"},{"songMid":"000oW8J53xPhZA","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"明明就","songId":3585884,"albumMid":"003Ow85E3pnoqi"},{"songMid":"000amRvH3wxv56","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"安静","songId":97743,"albumMid":"000I5jJB3blWeN"},{"songMid":"004Z8Ihr0JIu5s","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"七里香","songId":102065756,"albumMid":"003DFRzD192KKD"},{"songMid":"004emQMs09Z1lz","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"烟花易冷","songId":680279,"albumMid":"000bviBl4FjTpO"},{"songMid":"003xv4w313tZHV","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"红尘客栈","songId":5177680,"albumMid":"003Ow85E3pnoqi"},{"songMid":"0009BCJK1nRaad","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"简单爱","songId":97744,"albumMid":"000I5jJB3blWeN"},{"songMid":"002CUU2B3WuGLc","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"Mine Mine","songId":1018543,"albumMid":"003KNcyk0t3mwg"},{"songMid":"004BhQke4adHcf","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"给我一首歌的时间","songId":101091484,"albumMid":"002Neh8l0uciQZ"},{"songMid":"003iY6cU4YG0xi","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"黑色毛衣","songId":718480,"albumMid":"0024bjiL2aocxT"},{"songMid":"003ZrdgZ0UnjDl","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"最长的电影","songId":5177785,"albumMid":"002eFUFm2XYZ7z"},{"songMid":"002u8ZOM4C7QF4","singer":[{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}],"songName":"手写的从前","songId":101787870,"albumMid":"001uqejs3d6EID"}]
         */

        private PageBean page;
        private List<SongListBean> songList;

        public PageBean getPage() {
            return page;
        }

        public void setPage(PageBean page) {
            this.page = page;
        }

        public List<SongListBean> getSongList() {
            return songList;
        }

        public void setSongList(List<SongListBean> songList) {
            this.songList = songList;
        }

        public static class PageBean {
            /**
             * currentNumber : 20
             * currentPage : 1
             * totalNumber : 400
             */

            private int currentNumber;
            private int currentPage;
            private int totalNumber;

            public int getCurrentNumber() {
                return currentNumber;
            }

            public void setCurrentNumber(int currentNumber) {
                this.currentNumber = currentNumber;
            }

            public int getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public int getTotalNumber() {
                return totalNumber;
            }

            public void setTotalNumber(int totalNumber) {
                this.totalNumber = totalNumber;
            }
        }

        public static class SongListBean  implements Serializable{
            /**
             * songMid : 003OUlho2HcRHC
             * singer : [{"singerName":"周杰伦","singerMid":"0025NhlN2yWrP4"}]
             * songName : 告白气球
             * songId : 107192078
             * albumMid : 003RMaRI1iFoYd
             */

            private String songMid;
            private String songName;
            private int songId;
            private String albumMid;
            private List<SingerBean> singer;

            public String getSongMid() {
                return songMid;
            }

            public void setSongMid(String songMid) {
                this.songMid = songMid;
            }

            public String getSongName() {
                return songName;
            }

            public void setSongName(String songName) {
                this.songName = songName;
            }

            public int getSongId() {
                return songId;
            }

            public void setSongId(int songId) {
                this.songId = songId;
            }

            public String getAlbumMid() {
                return albumMid;
            }

            public void setAlbumMid(String albumMid) {
                this.albumMid = albumMid;
            }

            public List<SingerBean> getSinger() {
                return singer;
            }

            public void setSinger(List<SingerBean> singer) {
                this.singer = singer;
            }

            public static class SingerBean implements Serializable {
                /**
                 * singerName : 周杰伦
                 * singerMid : 0025NhlN2yWrP4
                 */

                private String singerName;
                private String singerMid;

                public String getSingerName() {
                    return singerName;
                }

                public void setSingerName(String singerName) {
                    this.singerName = singerName;
                }

                public String getSingerMid() {
                    return singerMid;
                }

                public void setSingerMid(String singerMid) {
                    this.singerMid = singerMid;
                }
            }
        }
    }
}
