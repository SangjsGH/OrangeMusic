package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;

@HttpResponse(parser = JsonRespondParse.class)
public class Singer implements Serializable {

    /**
     * code : 200
     * msg : OK
     * timestamp : 1561467694876
     * data : [{"singer_id":13948,"country":"香港","singer_name":"G.E.M. 邓紫棋","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001fNHEf1SFEFN.webp","singer_mid":"001fNHEf1SFEFN"},{"singer_id":1473880,"country":"内地","singer_name":"陈雪凝","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004V53Ga0bV65j.webp","singer_mid":"004V53Ga0bV65j"},{"singer_id":4558,"country":"台湾","singer_name":"周杰伦","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M0000025NhlN2yWrP4.webp","singer_mid":"0025NhlN2yWrP4"},{"singer_id":5062,"country":"内地","singer_name":"薛之谦","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000002J4UUk29y8BY.webp","singer_mid":"002J4UUk29y8BY"},{"singer_id":265,"country":"美国","singer_name":"王力宏","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001JDzPT3JdvqK.webp","singer_mid":"001JDzPT3JdvqK"},{"singer_id":4286,"country":"新加坡","singer_name":"林俊杰","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001BLpXF2DyJe2.webp","singer_mid":"001BLpXF2DyJe2"},{"singer_id":60505,"country":"内地","singer_name":"李荣浩","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000aHmbL2aPXWH.webp","singer_mid":"000aHmbL2aPXWH"},{"singer_id":944940,"country":"英国","singer_name":"Alan Walker (艾伦·沃克)","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M0000020PeOh4ZaCw1.webp","singer_mid":"0020PeOh4ZaCw1"},{"singer_id":1507534,"country":"内地","singer_name":"毛不易","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001BHDR33FZVZ0.webp","singer_mid":"001BHDR33FZVZ0"},{"singer_id":3954,"country":"内地","singer_name":"汪苏泷","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001z2JmX09LLgL.webp","singer_mid":"001z2JmX09LLgL"},{"singer_id":39657,"country":"内地","singer_name":"魏新雨","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000LsFo136kIv4.webp","singer_mid":"000LsFo136kIv4"},{"singer_id":143,"country":"香港","singer_name":"陈奕迅","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003Nz2So3XXYek.webp","singer_mid":"003Nz2So3XXYek"},{"singer_id":1199153,"country":"内地","singer_name":"焦迈奇","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003JE8jQ46n049.webp","singer_mid":"003JE8jQ46n049"},{"singer_id":7221,"country":"内地","singer_name":"许嵩","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000CK5xN3yZDJt.webp","singer_mid":"000CK5xN3yZDJt"},{"singer_id":33625,"country":"内地","singer_name":"蒋家驹（蒋蒋）","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001ii8ME2uOv92.webp","singer_mid":"001ii8ME2uOv92"},{"singer_id":89698,"country":"内地","singer_name":"庄心妍","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003Cn3Yh16q1MO.webp","singer_mid":"003Cn3Yh16q1MO"},{"singer_id":11921,"country":"美国","singer_name":"Taylor Swift (泰勒·斯威夫特)","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000qrPik2w6lDr.webp","singer_mid":"000qrPik2w6lDr"},{"singer_id":219,"country":"香港","singer_name":"张敬轩","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003AfDK34H82GU.webp","singer_mid":"003AfDK34H82GU"},{"singer_id":2,"country":"香港","singer_name":"BEYOND","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000002pUZT93gF4Cu.webp","singer_mid":"002pUZT93gF4Cu"},{"singer_id":67008,"country":"内地","singer_name":"于文文","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000poF8D027tPr.webp","singer_mid":"000poF8D027tPr"},{"singer_id":11608,"country":"台湾","singer_name":"杨宗纬","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003tMm0y0TuewY.webp","singer_mid":"003tMm0y0TuewY"},{"singer_id":867,"country":"内地","singer_name":"贺一航","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001s4BJ92fSpPu.webp","singer_mid":"001s4BJ92fSpPu"},{"singer_id":24833,"country":"内地","singer_name":"胡夏","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000002mze3U0NYXOM.webp","singer_mid":"002mze3U0NYXOM"},{"singer_id":1199300,"country":"内地","singer_name":"半阳","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M0000013RsPD3Xs0FG.webp","singer_mid":"0013RsPD3Xs0FG"},{"singer_id":180646,"country":"加拿大","singer_name":"吴亦凡","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000002yeznU3VAVEV.webp","singer_mid":"002yeznU3VAVEV"},{"singer_id":963482,"country":"内地","singer_name":"白小白","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004GZcGF2ZgJYo.webp","singer_mid":"004GZcGF2ZgJYo"},{"singer_id":4615,"country":"内地","singer_name":"李宇春","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000002ZOuVm3Qn20Y.webp","singer_mid":"002ZOuVm3Qn20Y"},{"singer_id":156095,"country":"美国","singer_name":"The Chainsmokers (烟鬼组合)","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004ABIFV1EZUAj.webp","singer_mid":"004ABIFV1EZUAj"},{"singer_id":19329,"country":"内地","singer_name":"李玉刚","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000Qm9wO1bcM6J.webp","singer_mid":"000Qm9wO1bcM6J"},{"singer_id":6499,"country":"内地","singer_name":"张杰","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000002azErJ0UcDN6.webp","singer_mid":"002azErJ0UcDN6"},{"singer_id":1005787,"country":"内地","singer_name":"摩登兄弟","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001KH1tJ02U8KY.webp","singer_mid":"001KH1tJ02U8KY"},{"singer_id":163,"country":"香港","singer_name":"刘德华","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003aQYLo2x8izP.webp","singer_mid":"003aQYLo2x8izP"},{"singer_id":4607,"country":"内地","singer_name":"张靓颖","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000aw4WC2EQYTv.webp","singer_mid":"000aw4WC2EQYTv"},{"singer_id":174,"country":"香港","singer_name":"张学友","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004Be55m1SJaLk.webp","singer_mid":"004Be55m1SJaLk"},{"singer_id":22785,"country":"英国","singer_name":"Olly Murs (奥利·莫尔斯)","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001RRlcX2n2NLs.webp","singer_mid":"001RRlcX2n2NLs"},{"singer_id":2079450,"country":"内地","singer_name":"胡66","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000wHoyF0OZB6B.webp","singer_mid":"000wHoyF0OZB6B"},{"singer_id":161301,"country":"内地","singer_name":"王源","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000IBYF50SRnXP.webp","singer_mid":"000IBYF50SRnXP"},{"singer_id":8061,"country":"","singer_name":"儿歌","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000002DYd0J2HmOvc.webp","singer_mid":"002DYd0J2HmOvc"},{"singer_id":40449,"country":"内地","singer_name":"赵雷","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001Lr98T0yEWAk.webp","singer_mid":"001Lr98T0yEWAk"},{"singer_id":1103924,"country":"内地","singer_name":"曲肖冰","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001ZVMXf3ZYVX7.webp","singer_mid":"001ZVMXf3ZYVX7"},{"singer_id":74,"country":"台湾","singer_name":"五月天","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000Sp0Bz4JXH0o.webp","singer_mid":"000Sp0Bz4JXH0o"},{"singer_id":940748,"country":"内地","singer_name":"陈粒","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004WgCsE3KBddt.webp","singer_mid":"004WgCsE3KBddt"},{"singer_id":3376,"country":"内地","singer_name":"许巍","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M00000235pCx2tYjlq.webp","singer_mid":"00235pCx2tYjlq"},{"singer_id":199509,"country":"内地","singer_name":"周深","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003fA5G40k6hKc.webp","singer_mid":"003fA5G40k6hKc"},{"singer_id":163550,"country":"内地","singer_name":"华晨宇","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000002Vcz8F2hpBQj.webp","singer_mid":"002Vcz8F2hpBQj"},{"singer_id":11733,"country":"韩国","singer_name":"BIGBANG (빅뱅)","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004AlfUb0cVkN1.webp","singer_mid":"004AlfUb0cVkN1"},{"singer_id":283148,"country":"韩国","singer_name":"Red Velvet (레드벨벳)","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004NfJdF0gn6Z1.webp","singer_mid":"004NfJdF0gn6Z1"},{"singer_id":1055436,"country":"内地","singer_name":"季彦霖","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004IHCLx2eWTCC.webp","singer_mid":"004IHCLx2eWTCC"},{"singer_id":109,"country":"新加坡","singer_name":"孙燕姿","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001pWERg3vFgg8.webp","singer_mid":"001pWERg3vFgg8"},{"singer_id":244,"country":"内地","singer_name":"刀郎","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000iZroE1VWLJG.webp","singer_mid":"000iZroE1VWLJG"},{"singer_id":4701,"country":"台湾","singer_name":"田馥甄","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001ByAsv3XCdgm.webp","singer_mid":"001ByAsv3XCdgm"},{"singer_id":54,"country":"香港","singer_name":"莫文蔚","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000cISVf2QqLc6.webp","singer_mid":"000cISVf2QqLc6"},{"singer_id":112,"country":"新加坡","singer_name":"蔡健雅","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000hNnWC3kko2c.webp","singer_mid":"000hNnWC3kko2c"},{"singer_id":14411,"country":"内地","singer_name":"孙露","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004dXznj3zlHKW.webp","singer_mid":"004dXznj3zlHKW"},{"singer_id":4442,"country":"内地","singer_name":"朴树","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000mLAT42CFWNa.webp","singer_mid":"000mLAT42CFWNa"},{"singer_id":173914,"country":"荷兰","singer_name":"Vicetone (副音乐团)","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003AD17D4PYPFR.webp","singer_mid":"003AD17D4PYPFR"},{"singer_id":168,"country":"台湾","singer_name":"张宇","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M0000044wQXL0ElWF1.webp","singer_mid":"0044wQXL0ElWF1"},{"singer_id":31035,"country":"内地","singer_name":"简弘亦","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003U6coz1AhN3H.webp","singer_mid":"003U6coz1AhN3H"},{"singer_id":4610,"country":"内地","singer_name":"周笔畅","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004HlS192u9J5g.webp","singer_mid":"004HlS192u9J5g"},{"singer_id":4419,"country":"内地","singer_name":"韩红","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003WlPvN2EvRaj.webp","singer_mid":"003WlPvN2EvRaj"},{"singer_id":12111,"country":"内地","singer_name":"金志文","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004YXxql1sSr2o.webp","singer_mid":"004YXxql1sSr2o"},{"singer_id":196676,"country":"加拿大","singer_name":"Shawn Mendes (肖恩·曼德斯)","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001NODJ71LGPD5.webp","singer_mid":"001NODJ71LGPD5"},{"singer_id":1398057,"country":"内地","singer_name":"广东雨神","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004Hxj1m48xwGi.webp","singer_mid":"004Hxj1m48xwGi"},{"singer_id":6028,"country":"台湾","singer_name":"A-Lin","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003ArN8Z0WpjTz.webp","singer_mid":"003ArN8Z0WpjTz"},{"singer_id":4857,"country":"新加坡","singer_name":"阿杜","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M0000022VtZd19rZpi.webp","singer_mid":"0022VtZd19rZpi"},{"singer_id":61620,"country":"内地","singer_name":"宋冬野","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004KKLWZ4320g1.webp","singer_mid":"004KKLWZ4320g1"},{"singer_id":51,"country":"台湾","singer_name":"刘若英","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003jJGvv3C82KZ.webp","singer_mid":"003jJGvv3C82KZ"},{"singer_id":1288409,"country":"内地","singer_name":"音阙诗听","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000002vALgR3hRRlv.webp","singer_mid":"002vALgR3hRRlv"},{"singer_id":11606,"country":"台湾","singer_name":"林宥嘉","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001f0VyZ1hmWZ1.webp","singer_mid":"001f0VyZ1hmWZ1"},{"singer_id":167,"country":"台湾","singer_name":"张信哲","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M0000000mFvh1jtLcz.webp","singer_mid":"0000mFvh1jtLcz"},{"singer_id":4365,"country":"台湾","singer_name":"周传雄","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000004NMZuf2BLjg8.webp","singer_mid":"004NMZuf2BLjg8"},{"singer_id":44,"country":"马来西亚","singer_name":"梁静茹","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000GGDys0yA0Nk.webp","singer_mid":"000GGDys0yA0Nk"},{"singer_id":29222,"country":"英国","singer_name":"Ed Sheeran (艾德·希兰)","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M0000045p4Sz0LIwL5.webp","singer_mid":"0045p4Sz0LIwL5"},{"singer_id":13578,"country":"新加坡","singer_name":"BY2","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000Z1Ow71FFutX.webp","singer_mid":"000Z1Ow71FFutX"},{"singer_id":1233588,"country":"内地","singer_name":"冯提莫","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001yMNFV23daTV.webp","singer_mid":"001yMNFV23daTV"},{"singer_id":116322,"country":"内地","singer_name":"黄子韬","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003XriCI0OfGYj.webp","singer_mid":"003XriCI0OfGYj"},{"singer_id":1327483,"country":"内地","singer_name":"艾辰","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000000985uR2CKS2P.webp","singer_mid":"000985uR2CKS2P"},{"singer_id":1190986,"country":"韩国","singer_name":"BLACKPINK","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000003DBAjk2MMfhR.webp","singer_mid":"003DBAjk2MMfhR"},{"singer_id":204664,"country":"内地","singer_name":"鹿晗","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001SqkF53OEhdO.webp","singer_mid":"001SqkF53OEhdO"},{"singer_id":4588,"country":"内地","singer_name":"黑龙","singer_pic":"http://y.gtimg.cn/music/photo_new/T001R150x150M000001C0c6j1VyLfh.webp","singer_mid":"001C0c6j1VyLfh"}]
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
         * singer_id : 13948
         * country : 香港
         * singer_name : G.E.M. 邓紫棋
         * singer_pic : http://y.gtimg.cn/music/photo_new/T001R150x150M000001fNHEf1SFEFN.webp
         * singer_mid : 001fNHEf1SFEFN
         */

        private int singer_id;
        private String country;
        private String singer_name;
        private String singer_pic;
        private String singer_mid;

        public int getSinger_id() {
            return singer_id;
        }

        public void setSinger_id(int singer_id) {
            this.singer_id = singer_id;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getSinger_name() {
            return singer_name;
        }

        public void setSinger_name(String singer_name) {
            this.singer_name = singer_name;
        }

        public String getSinger_pic() {
            return singer_pic;
        }

        public void setSinger_pic(String singer_pic) {
            this.singer_pic = singer_pic;
        }

        public String getSinger_mid() {
            return singer_mid;
        }

        public void setSinger_mid(String singer_mid) {
            this.singer_mid = singer_mid;
        }
    }
}
