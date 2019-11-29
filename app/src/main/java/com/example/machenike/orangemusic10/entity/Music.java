package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;
import org.xutils.http.annotation.HttpResponse;
import java.io.Serializable;
import java.util.List;

@HttpResponse(parser = JsonRespondParse.class)

public class Music implements Serializable {

    /**
     * announce : 本接口所有数据均来自 QQ 音乐, 仅供学习交流之用,请不要用于商业用途. 如果喜欢请下载 QQ 音乐 APP 畅听.如有侵权请联系微信(QQ): 1363693666, 我会第一时间删除~
     * errno : 0
     * msg : success
     * data : [{"id":4,"title":"巅峰榜·流行指数","listenCount":19900000,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003pN5OZ2qK86g.jpg","songList":[{"singerName":"方雅贤","songName":"遇到","number":1},{"singerName":"刘宪华 (Henry)","songName":"当你孤单你会想起谁","number":2},{"singerName":"俞彬/代少冬/周兆渊/赵泽帆/李鑫一","songName":"你，好不好？ (Live)","number":3}]},{"id":26,"title":"巅峰榜·热歌","listenCount":19700000,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000WgwH50KZhAO.jpg","songList":[{"singerName":"陈雪凝","songName":"灰姑娘","number":1},{"singerName":"陈雪凝","songName":"绿色","number":2},{"singerName":"张敬轩","songName":"只是太爱你","number":3}]},{"id":27,"title":"巅峰榜·新歌","listenCount":3790420,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002uBcdm3k01RB.jpg","songList":[{"singerName":"陈雪凝","songName":"灰姑娘","number":1},{"singerName":"胡夏","songName":"我只喜欢你","number":2},{"singerName":"Taylor Swift/Brendon Urie","songName":"ME! (feat. Brendon Urie of Panic! At The Disco)","number":3}]},{"id":58,"title":"说唱榜","listenCount":7172540,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001psZl51gFS69.jpg","songList":[{"singerName":"吴亦凡","songName":"大碗宽面","number":1},{"singerName":"Papi酱/tang","songName":"我妈爱Say No","number":2},{"singerName":"MC HotDog","songName":"Do You Remember","number":3}]},{"id":57,"title":"电音榜","listenCount":4245720,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000043jwU30QA0M7.jpg","songList":[{"singerName":"Avicii/Agnes/Vargas & Lagola","songName":"Tough Love","number":1},{"singerName":"Alan Walker/Sabrina Carpenter/Farruko","songName":"On My Way","number":2},{"singerName":"The Chainsmokers/Ty Dolla $ign/Bülow","songName":"Do You Mean","number":3}]},{"id":28,"title":"巅峰榜·网络歌曲","listenCount":9500000,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000GUi8B4fYD9N.jpg","songList":[{"singerName":"王琪","songName":"万爱千恩","number":1},{"singerName":"贺一航","songName":"别爱太满别睡太晚","number":2},{"singerName":"安筱冷","songName":"Sexy lady (Original Mix)","number":3}]},{"id":5,"title":"巅峰榜·内地","listenCount":8284940,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M00000445zsj0ru3qH.jpg","songList":[{"singerName":"陈雪凝","songName":"灰姑娘","number":1},{"singerName":"胡夏","songName":"我只喜欢你","number":2},{"singerName":"毛不易","songName":"逆风","number":3}]},{"id":3,"title":"巅峰榜·欧美","listenCount":9300000,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000diuS24FYFs0.jpg","songList":[{"singerName":"Taylor Swift/Brendon Urie","songName":"ME! (feat. Brendon Urie of Panic! At The Disco)","number":1},{"singerName":"Shawn Mendes","songName":"If I Can't Have You","number":2},{"singerName":"Ed Sheeran/Justin Bieber","songName":"I Don't Care","number":3}]},{"id":59,"title":"香港地区榜","listenCount":2447340,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004DqlZP07ZOsF.jpg","songList":[{"singerName":"许靖韵","songName":"原来我们都一样","number":1},{"singerName":"G.E.M. 邓紫棋/王嘉尔","songName":"热爱就一起","number":2},{"singerName":"古巨基","songName":"心中的巨人","number":3}]},{"id":16,"title":"巅峰榜·韩国","listenCount":4448380,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001u1ALu1aYKxR.jpg","songList":[{"singerName":"규현 (圭贤)","songName":"Time with you (그게 좋은거야)","number":1},{"singerName":"박봄 (朴春)/휘인 (辉人)","songName":"4시 44분","number":2},{"singerName":"WINNER (위너)","songName":"AH YEAH (아예)","number":3}]},{"id":60,"title":"抖音排行榜","listenCount":19100000,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004UjT611guPe2.jpg","songList":[{"singerName":"贺一航","songName":"别爱太满别睡太晚","number":1},{"singerName":"李俊佑/小潘潘","songName":"宠坏","number":2},{"singerName":"大壮","songName":"伪装","number":3}]},{"id":29,"title":"巅峰榜·影视金曲","listenCount":2249540,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000yoxGb3ifPjO.jpg","songList":[{"singerName":"鞠婧祎","songName":"青城山下白素贞","number":1},{"singerName":"李俊毅","songName":"两人份美好","number":2},{"singerName":"余昭源/叶里","songName":"初见","number":3}]},{"id":17,"title":"巅峰榜·日本","listenCount":1961760,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003DFlFL1Ca7nf.jpg","songList":[{"singerName":"Superfly (スーパーフライ)","songName":"Ambitious","number":1},{"singerName":"[Alexandros]","songName":"Pray","number":2},{"singerName":"リリィ、さよなら。 (莉莉萨友呐乐)","songName":"Clover (naked version)","number":3}]},{"id":201,"title":"巅峰榜·MV","listenCount":279832,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000004zI2z2r8oOl.jpg","songList":[{"singerName":"鹿晗","songName":"体会（Nature）","number":1},{"singerName":"火箭少女101孟美岐","songName":"犟","number":2},{"singerName":"蔡徐坤","songName":"Hard To Get","number":3}]},{"id":52,"title":"巅峰榜·腾讯音乐人原创榜","listenCount":781305,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004FEw3S1xsRjf.jpg","songList":[{"singerName":"赵政豪","songName":"船帆","number":1},{"singerName":"刘晓盈","songName":"10000","number":2},{"singerName":"简弘亦","songName":"半夏","number":3}]},{"id":36,"title":"巅峰榜·K歌金曲","listenCount":2446000,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000BaxMk4FhI1P.jpg","songList":[{"singerName":"K.D","songName":"心如止水 (Live)","number":1},{"singerName":"麓七","songName":"你的酒馆对我打了烊","number":2},{"singerName":"尹东星","songName":"Me！","number":3}]},{"id":61,"title":"台湾地区榜","listenCount":956935,"picUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002fiTU501US9b.jpg","songList":[{"singerName":"五月天","songName":"纯真 #MaydayBlue20th","number":1},{"singerName":"吴青峰","songName":"歌颂者","number":2},{"singerName":"MC HotDog","songName":"Do You Remember","number":3}]}]
     */

    private String announce;
    private int errno;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * id : 4
         * title : 巅峰榜·流行指数
         * listenCount : 19900000
         * picUrl : http://y.gtimg.cn/music/photo_new/T003R300x300M000003pN5OZ2qK86g.jpg
         * songList : [{"singerName":"方雅贤","songName":"遇到","number":1},{"singerName":"刘宪华 (Henry)","songName":"当你孤单你会想起谁","number":2},{"singerName":"俞彬/代少冬/周兆渊/赵泽帆/李鑫一","songName":"你，好不好？ (Live)","number":3}]
         */

        private int id;
        private String title;
        private int listenCount;
        private String picUrl;
        private List<SongListBean> songList;

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

        public int getListenCount() {
            return listenCount;
        }

        public void setListenCount(int listenCount) {
            this.listenCount = listenCount;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public List<SongListBean> getSongList() {
            return songList;
        }

        public void setSongList(List<SongListBean> songList) {
            this.songList = songList;
        }

        public static class SongListBean implements Serializable {
            /**
             * singerName : 方雅贤
             * songName : 遇到
             * number : 1
             */

            private String singerName;
            private String songName;
            private int number;

            public String getSingerName() {
                return singerName;
            }

            public void setSingerName(String singerName) {
                this.singerName = singerName;
            }

            public String getSongName() {
                return songName;
            }

            public void setSongName(String songName) {
                this.songName = songName;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }
        }
    }
}

