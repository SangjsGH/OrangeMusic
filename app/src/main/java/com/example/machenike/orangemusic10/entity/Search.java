package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;

@HttpResponse(parser = JsonRespondParse.class)
public class Search implements Serializable {


    /**
     * announce : 本接口所有数据均来自 QQ 音乐, 仅供学习交流之用,请不要用于商业用途. 如果喜欢请下载 QQ 音乐 APP 畅听.如有侵权请联系微信(QQ): 1363693666, 我会第一时间删除~
     * errno : 0
     * msg : success
     * data : {"page":{"currentNumber":10,"currentPage":1,"totalNumber":395},"songList":[{"songMid":"003ALEZa186Qlq","singer":[{"singerName":"孙子涵","singerMid":"001oXbjs29oPul"}],"songName":"唐人","songId":4823575,"albumMid":"002CWEnV2g4m3p"},{"songMid":"00471VLy0ECBej","singer":[{"singerName":"乔洋","singerMid":"003kkBR72cYK0q"}],"songName":"唐人","songId":931825,"albumMid":"0031JMuL42xl8p"},{"songMid":"002Kgubo3wLGeP","singer":[{"singerName":"DJ奶小深","singerMid":"003cK3Nh0WkFO4"}],"songName":"唐人 (中文电摇)","songId":202030880,"albumMid":"003clRXQ2zegpA"},{"songMid":"003vgZDS20RQ1a","singer":[{"singerName":"潇小潇","singerMid":"001VlqIl4HJNxo"}],"songName":"唐人","songId":204537591,"albumMid":"0033FmTg3OX3lP"},{"songMid":"001K7NS03hbrk4","singer":[{"singerName":"网络歌手","singerMid":"003WyUfh2uKIjh"}],"songName":"唐人","songId":104418380,"albumMid":"001ZaCQY2OxVMg"},{"songMid":"002CtXQm3cSkOI","singer":[{"singerName":"唐人","singerMid":"0032fmHO2UDnV3"}],"songName":"一人镇守雁门关","songId":125511747,"albumMid":""},{"songMid":"002DtCzv1KX7NF","singer":[{"singerName":"唐人","singerMid":"0032fmHO2UDnV3"}],"songName":"我多想在出战","songId":125511746,"albumMid":""},{"songMid":"001uhAE32VYBQX","singer":[{"singerName":"陈渊","singerMid":"000PFBEN0LdDmJ"}],"songName":"摇滚唐人街 (伴奏)","songId":213282520,"albumMid":"003u1QCo3xFnUp"},{"songMid":"001g3BqA0Nc903","singer":[{"singerName":"赵英俊","singerMid":"002sfdNU1f3nHD"}],"songName":"唐人街 (Live)","songId":231509716,"albumMid":"001e3pnu2d1T9S"},{"songMid":"002n3pED3JoYmk","singer":[{"singerName":"唐人","singerMid":"0032fmHO2UDnV3"}],"songName":"战火燃烧 (DJ版)","songId":125742342,"albumMid":""}]}
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
         * page : {"currentNumber":10,"currentPage":1,"totalNumber":395}
         * songList : [{"songMid":"003ALEZa186Qlq","singer":[{"singerName":"孙子涵","singerMid":"001oXbjs29oPul"}],"songName":"唐人","songId":4823575,"albumMid":"002CWEnV2g4m3p"},{"songMid":"00471VLy0ECBej","singer":[{"singerName":"乔洋","singerMid":"003kkBR72cYK0q"}],"songName":"唐人","songId":931825,"albumMid":"0031JMuL42xl8p"},{"songMid":"002Kgubo3wLGeP","singer":[{"singerName":"DJ奶小深","singerMid":"003cK3Nh0WkFO4"}],"songName":"唐人 (中文电摇)","songId":202030880,"albumMid":"003clRXQ2zegpA"},{"songMid":"003vgZDS20RQ1a","singer":[{"singerName":"潇小潇","singerMid":"001VlqIl4HJNxo"}],"songName":"唐人","songId":204537591,"albumMid":"0033FmTg3OX3lP"},{"songMid":"001K7NS03hbrk4","singer":[{"singerName":"网络歌手","singerMid":"003WyUfh2uKIjh"}],"songName":"唐人","songId":104418380,"albumMid":"001ZaCQY2OxVMg"},{"songMid":"002CtXQm3cSkOI","singer":[{"singerName":"唐人","singerMid":"0032fmHO2UDnV3"}],"songName":"一人镇守雁门关","songId":125511747,"albumMid":""},{"songMid":"002DtCzv1KX7NF","singer":[{"singerName":"唐人","singerMid":"0032fmHO2UDnV3"}],"songName":"我多想在出战","songId":125511746,"albumMid":""},{"songMid":"001uhAE32VYBQX","singer":[{"singerName":"陈渊","singerMid":"000PFBEN0LdDmJ"}],"songName":"摇滚唐人街 (伴奏)","songId":213282520,"albumMid":"003u1QCo3xFnUp"},{"songMid":"001g3BqA0Nc903","singer":[{"singerName":"赵英俊","singerMid":"002sfdNU1f3nHD"}],"songName":"唐人街 (Live)","songId":231509716,"albumMid":"001e3pnu2d1T9S"},{"songMid":"002n3pED3JoYmk","singer":[{"singerName":"唐人","singerMid":"0032fmHO2UDnV3"}],"songName":"战火燃烧 (DJ版)","songId":125742342,"albumMid":""}]
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

        public static class PageBean implements Serializable {
            /**
             * currentNumber : 10
             * currentPage : 1
             * totalNumber : 395
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

        public static class SongListBean implements Serializable{
            /**
             * songMid : 003ALEZa186Qlq
             * singer : [{"singerName":"孙子涵","singerMid":"001oXbjs29oPul"}]
             * songName : 唐人
             * songId : 4823575
             * albumMid : 002CWEnV2g4m3p
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

            public static class SingerBean implements Serializable{
                /**
                 * singerName : 孙子涵
                 * singerMid : 001oXbjs29oPul
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
