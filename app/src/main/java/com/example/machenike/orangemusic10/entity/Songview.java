package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;
import com.google.gson.annotations.SerializedName;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;
@HttpResponse(parser = JsonRespondParse.class)
public class Songview implements Serializable {

    /**
     * code : 200
     * msg : OK
     * timestamp : 1560592527391
     * data : [{"modify_stamp":0,"singer":[{"name":"The Kiboomers","mid":"000Ps45y1ReP89","id":153935,"uin":0,"title":"The Kiboomers","type":3}],"fnote":0,"mid":"000tbKFw1ItPTX","language":7,"title":"Nature Sounds Waterfall","type":0,"trace":"","file":{"hires_sample":0,"hires_bitdepth":0,"size_320mp3":34558232,"size_96aac":11185343,"size_dts":0,"try_end":0,"e_30s":0,"b_30s":0,"size_24aac":2670183,"size_48aac":5821991,"try_begin":0,"url":"","size_128mp3":13823486,"size_192aac":21337691,"size_flac":0,"media_mid":"000tbKFw1ItPTX","size_ape":0,"size_hires":0,"size_192ogg":19511347,"size_try":0},"genre":16,"action":{"msgpay":0,"alert":11,"msgid":0,"msgshare":0,"icons":135752,"msgdown":0,"msgfav":0,"switch":601875},"ksong":{"mid":"","id":0},"index_cd":0,"id":107247352,"bpm":214,"isonly":0,"album":{"time_public":"2015-08-01","subtitle":"","name":"Baby Sleep: White Noise Nature Sounds","mid":"001liYoG48CHp5","id":1466007,"title":"Baby Sleep: White Noise Nature Sounds"},"mv":{"vid":"","name":"","id":0,"title":""},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"label":"4611686018427387904","version":0,"url":"http://stream7.qqmusic.qq.com/119247352.wma","volume":{"lra":0.286,"peak":0.461,"gain":-0.121},"time_public":"2015-08-01","subtitle":"","data_type":0,"name":"Nature Sounds Waterfall","interval":863,"index_album":1,"status":31}]
     */

    private int code;
    private String msg;
    private long timestamp;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{
        /**
         * modify_stamp : 0
         * singer : [{"name":"The Kiboomers","mid":"000Ps45y1ReP89","id":153935,"uin":0,"title":"The Kiboomers","type":3}]
         * fnote : 0
         * mid : 000tbKFw1ItPTX
         * language : 7
         * title : Nature Sounds Waterfall
         * type : 0
         * trace :
         * file : {"hires_sample":0,"hires_bitdepth":0,"size_320mp3":34558232,"size_96aac":11185343,"size_dts":0,"try_end":0,"e_30s":0,"b_30s":0,"size_24aac":2670183,"size_48aac":5821991,"try_begin":0,"url":"","size_128mp3":13823486,"size_192aac":21337691,"size_flac":0,"media_mid":"000tbKFw1ItPTX","size_ape":0,"size_hires":0,"size_192ogg":19511347,"size_try":0}
         * genre : 16
         * action : {"msgpay":0,"alert":11,"msgid":0,"msgshare":0,"icons":135752,"msgdown":0,"msgfav":0,"switch":601875}
         * ksong : {"mid":"","id":0}
         * index_cd : 0
         * id : 107247352
         * bpm : 214
         * isonly : 0
         * album : {"time_public":"2015-08-01","subtitle":"","name":"Baby Sleep: White Noise Nature Sounds","mid":"001liYoG48CHp5","id":1466007,"title":"Baby Sleep: White Noise Nature Sounds"}
         * mv : {"vid":"","name":"","id":0,"title":""}
         * pay : {"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0}
         * label : 4611686018427387904
         * version : 0
         * url : http://stream7.qqmusic.qq.com/119247352.wma
         * volume : {"lra":0.286,"peak":0.461,"gain":-0.121}
         * time_public : 2015-08-01
         * subtitle :
         * data_type : 0
         * name : Nature Sounds Waterfall
         * interval : 863
         * index_album : 1
         * status : 31
         */

        private int modify_stamp;
        private int fnote;
        private String mid;
        private int language;
        private String title;
        private int type;
        private String trace;
        private FileBean file;
        private int genre;
        private ActionBean action;
        private KsongBean ksong;
        private int index_cd;
        private int id;
        private int bpm;
        private int isonly;
        private AlbumBean album;
        private MvBean mv;
        private PayBean pay;
        private String label;
        private int version;
        private String url;
        private VolumeBean volume;
        private String time_public;
        private String subtitle;
        private int data_type;
        private String name;
        private int interval;
        private int index_album;
        private int status;
        private List<SingerBean> singer;

        public int getModify_stamp() {
            return modify_stamp;
        }

        public void setModify_stamp(int modify_stamp) {
            this.modify_stamp = modify_stamp;
        }

        public int getFnote() {
            return fnote;
        }

        public void setFnote(int fnote) {
            this.fnote = fnote;
        }

        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }

        public int getLanguage() {
            return language;
        }

        public void setLanguage(int language) {
            this.language = language;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getTrace() {
            return trace;
        }

        public void setTrace(String trace) {
            this.trace = trace;
        }

        public FileBean getFile() {
            return file;
        }

        public void setFile(FileBean file) {
            this.file = file;
        }

        public int getGenre() {
            return genre;
        }

        public void setGenre(int genre) {
            this.genre = genre;
        }

        public ActionBean getAction() {
            return action;
        }

        public void setAction(ActionBean action) {
            this.action = action;
        }

        public KsongBean getKsong() {
            return ksong;
        }

        public void setKsong(KsongBean ksong) {
            this.ksong = ksong;
        }

        public int getIndex_cd() {
            return index_cd;
        }

        public void setIndex_cd(int index_cd) {
            this.index_cd = index_cd;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getBpm() {
            return bpm;
        }

        public void setBpm(int bpm) {
            this.bpm = bpm;
        }

        public int getIsonly() {
            return isonly;
        }

        public void setIsonly(int isonly) {
            this.isonly = isonly;
        }

        public AlbumBean getAlbum() {
            return album;
        }

        public void setAlbum(AlbumBean album) {
            this.album = album;
        }

        public MvBean getMv() {
            return mv;
        }

        public void setMv(MvBean mv) {
            this.mv = mv;
        }

        public PayBean getPay() {
            return pay;
        }

        public void setPay(PayBean pay) {
            this.pay = pay;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public VolumeBean getVolume() {
            return volume;
        }

        public void setVolume(VolumeBean volume) {
            this.volume = volume;
        }

        public String getTime_public() {
            return time_public;
        }

        public void setTime_public(String time_public) {
            this.time_public = time_public;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public int getData_type() {
            return data_type;
        }

        public void setData_type(int data_type) {
            this.data_type = data_type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getInterval() {
            return interval;
        }

        public void setInterval(int interval) {
            this.interval = interval;
        }

        public int getIndex_album() {
            return index_album;
        }

        public void setIndex_album(int index_album) {
            this.index_album = index_album;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public List<SingerBean> getSinger() {
            return singer;
        }

        public void setSinger(List<SingerBean> singer) {
            this.singer = singer;
        }

        public static class FileBean implements Serializable{
            /**
             * hires_sample : 0
             * hires_bitdepth : 0
             * size_320mp3 : 34558232
             * size_96aac : 11185343
             * size_dts : 0
             * try_end : 0
             * e_30s : 0
             * b_30s : 0
             * size_24aac : 2670183
             * size_48aac : 5821991
             * try_begin : 0
             * url :
             * size_128mp3 : 13823486
             * size_192aac : 21337691
             * size_flac : 0
             * media_mid : 000tbKFw1ItPTX
             * size_ape : 0
             * size_hires : 0
             * size_192ogg : 19511347
             * size_try : 0
             */

            private int hires_sample;
            private int hires_bitdepth;
            private int size_320mp3;
            private int size_96aac;
            private int size_dts;
            private int try_end;
            private int e_30s;
            private int b_30s;
            private int size_24aac;
            private int size_48aac;
            private int try_begin;
            private String url;
            private int size_128mp3;
            private int size_192aac;
            private int size_flac;
            private String media_mid;
            private int size_ape;
            private int size_hires;
            private int size_192ogg;
            private int size_try;

            public int getHires_sample() {
                return hires_sample;
            }

            public void setHires_sample(int hires_sample) {
                this.hires_sample = hires_sample;
            }

            public int getHires_bitdepth() {
                return hires_bitdepth;
            }

            public void setHires_bitdepth(int hires_bitdepth) {
                this.hires_bitdepth = hires_bitdepth;
            }

            public int getSize_320mp3() {
                return size_320mp3;
            }

            public void setSize_320mp3(int size_320mp3) {
                this.size_320mp3 = size_320mp3;
            }

            public int getSize_96aac() {
                return size_96aac;
            }

            public void setSize_96aac(int size_96aac) {
                this.size_96aac = size_96aac;
            }

            public int getSize_dts() {
                return size_dts;
            }

            public void setSize_dts(int size_dts) {
                this.size_dts = size_dts;
            }

            public int getTry_end() {
                return try_end;
            }

            public void setTry_end(int try_end) {
                this.try_end = try_end;
            }

            public int getE_30s() {
                return e_30s;
            }

            public void setE_30s(int e_30s) {
                this.e_30s = e_30s;
            }

            public int getB_30s() {
                return b_30s;
            }

            public void setB_30s(int b_30s) {
                this.b_30s = b_30s;
            }

            public int getSize_24aac() {
                return size_24aac;
            }

            public void setSize_24aac(int size_24aac) {
                this.size_24aac = size_24aac;
            }

            public int getSize_48aac() {
                return size_48aac;
            }

            public void setSize_48aac(int size_48aac) {
                this.size_48aac = size_48aac;
            }

            public int getTry_begin() {
                return try_begin;
            }

            public void setTry_begin(int try_begin) {
                this.try_begin = try_begin;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getSize_128mp3() {
                return size_128mp3;
            }

            public void setSize_128mp3(int size_128mp3) {
                this.size_128mp3 = size_128mp3;
            }

            public int getSize_192aac() {
                return size_192aac;
            }

            public void setSize_192aac(int size_192aac) {
                this.size_192aac = size_192aac;
            }

            public int getSize_flac() {
                return size_flac;
            }

            public void setSize_flac(int size_flac) {
                this.size_flac = size_flac;
            }

            public String getMedia_mid() {
                return media_mid;
            }

            public void setMedia_mid(String media_mid) {
                this.media_mid = media_mid;
            }

            public int getSize_ape() {
                return size_ape;
            }

            public void setSize_ape(int size_ape) {
                this.size_ape = size_ape;
            }

            public int getSize_hires() {
                return size_hires;
            }

            public void setSize_hires(int size_hires) {
                this.size_hires = size_hires;
            }

            public int getSize_192ogg() {
                return size_192ogg;
            }

            public void setSize_192ogg(int size_192ogg) {
                this.size_192ogg = size_192ogg;
            }

            public int getSize_try() {
                return size_try;
            }

            public void setSize_try(int size_try) {
                this.size_try = size_try;
            }
        }

        public static class ActionBean {
            /**
             * msgpay : 0
             * alert : 11
             * msgid : 0
             * msgshare : 0
             * icons : 135752
             * msgdown : 0
             * msgfav : 0
             * switch : 601875
             */

            private int msgpay;
            private int alert;
            private int msgid;
            private int msgshare;
            private int icons;
            private int msgdown;
            private int msgfav;
            @SerializedName("switch")
            private int switchX;

            public int getMsgpay() {
                return msgpay;
            }

            public void setMsgpay(int msgpay) {
                this.msgpay = msgpay;
            }

            public int getAlert() {
                return alert;
            }

            public void setAlert(int alert) {
                this.alert = alert;
            }

            public int getMsgid() {
                return msgid;
            }

            public void setMsgid(int msgid) {
                this.msgid = msgid;
            }

            public int getMsgshare() {
                return msgshare;
            }

            public void setMsgshare(int msgshare) {
                this.msgshare = msgshare;
            }

            public int getIcons() {
                return icons;
            }

            public void setIcons(int icons) {
                this.icons = icons;
            }

            public int getMsgdown() {
                return msgdown;
            }

            public void setMsgdown(int msgdown) {
                this.msgdown = msgdown;
            }

            public int getMsgfav() {
                return msgfav;
            }

            public void setMsgfav(int msgfav) {
                this.msgfav = msgfav;
            }

            public int getSwitchX() {
                return switchX;
            }

            public void setSwitchX(int switchX) {
                this.switchX = switchX;
            }
        }

        public static class KsongBean {
            /**
             * mid :
             * id : 0
             */

            private String mid;
            private int id;

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class AlbumBean {
            /**
             * time_public : 2015-08-01
             * subtitle :
             * name : Baby Sleep: White Noise Nature Sounds
             * mid : 001liYoG48CHp5
             * id : 1466007
             * title : Baby Sleep: White Noise Nature Sounds
             */

            private String time_public;
            private String subtitle;
            private String name;
            private String mid;
            private int id;
            private String title;

            public String getTime_public() {
                return time_public;
            }

            public void setTime_public(String time_public) {
                this.time_public = time_public;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class MvBean {
            /**
             * vid :
             * name :
             * id : 0
             * title :
             */

            private String vid;
            private String name;
            private int id;
            private String title;

            public String getVid() {
                return vid;
            }

            public void setVid(String vid) {
                this.vid = vid;
            }

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

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class PayBean {
            /**
             * pay_play : 0
             * pay_status : 0
             * price_track : 0
             * time_free : 0
             * price_album : 0
             * pay_month : 0
             * pay_down : 0
             */

            private int pay_play;
            private int pay_status;
            private int price_track;
            private int time_free;
            private int price_album;
            private int pay_month;
            private int pay_down;

            public int getPay_play() {
                return pay_play;
            }

            public void setPay_play(int pay_play) {
                this.pay_play = pay_play;
            }

            public int getPay_status() {
                return pay_status;
            }

            public void setPay_status(int pay_status) {
                this.pay_status = pay_status;
            }

            public int getPrice_track() {
                return price_track;
            }

            public void setPrice_track(int price_track) {
                this.price_track = price_track;
            }

            public int getTime_free() {
                return time_free;
            }

            public void setTime_free(int time_free) {
                this.time_free = time_free;
            }

            public int getPrice_album() {
                return price_album;
            }

            public void setPrice_album(int price_album) {
                this.price_album = price_album;
            }

            public int getPay_month() {
                return pay_month;
            }

            public void setPay_month(int pay_month) {
                this.pay_month = pay_month;
            }

            public int getPay_down() {
                return pay_down;
            }

            public void setPay_down(int pay_down) {
                this.pay_down = pay_down;
            }
        }

        public static class VolumeBean {
            /**
             * lra : 0.286
             * peak : 0.461
             * gain : -0.121
             */

            private double lra;
            private double peak;
            private double gain;

            public double getLra() {
                return lra;
            }

            public void setLra(double lra) {
                this.lra = lra;
            }

            public double getPeak() {
                return peak;
            }

            public void setPeak(double peak) {
                this.peak = peak;
            }

            public double getGain() {
                return gain;
            }

            public void setGain(double gain) {
                this.gain = gain;
            }
        }

        public static class SingerBean {
            /**
             * name : The Kiboomers
             * mid : 000Ps45y1ReP89
             * id : 153935
             * uin : 0
             * title : The Kiboomers
             * type : 3
             */

            private String name;
            private String mid;
            private int id;
            private int uin;
            private String title;
            private int type;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getUin() {
                return uin;
            }

            public void setUin(int uin) {
                this.uin = uin;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
