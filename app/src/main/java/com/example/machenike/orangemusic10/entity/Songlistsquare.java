package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;
import org.xutils.http.annotation.HttpResponse;
import java.io.Serializable;
import java.util.List;

@HttpResponse(parser = JsonRespondParse.class)
public class Songlistsquare implements Serializable {

    /**
     * code : 200
     * msg : OK
     * timestamp : 1561567558367
     * data : {"sortId":5,"sin":10,"sum":7673,"uin":0,"ein":19,"list":[{"imgurl":"http://p.qpic.cn/music_cover/aaxX4Babic4VicBPicJOwr5xmw7hG3gR90NXdDG1asnNuA2Ntk1suu9XQ/600?n=1","score":0,"dissid":"7033094594","createtime":"2019-06-10","creator":{"qq":1600189472,"avatarUrl":"","encrypt_uin":"oKCzoe6FNKvloc**","name":"Music Fans","followflag":0,"type":2,"isVip":2},"listennum":45538,"dissname":"沉陷低频 · 国人EDM Trap","commit_time":"2019-06-10","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Uj77DagTFgiccudSicYvppRtK94vRkNHqJb2DFSg44tunsS5CQjQnBkg/600?n=1","score":0,"dissid":"3605037365","createtime":"2019-06-20","creator":{"qq":919820535,"avatarUrl":"","encrypt_uin":"NK6qNe-z7Kok","name":"Lee BG嗷柏","followflag":0,"type":2,"isVip":2},"listennum":32513,"dissname":"日式嘻哈：融合文化的说唱美学","commit_time":"2019-06-20","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/ib5u1yLjrIls7cqVwYRpW6uYfUeq7kGEYHjUt2pu4T8ekgabjs1XfMw/600?n=1","score":0,"dissid":"3612373501","createtime":"2019-06-19","creator":{"qq":2909946281,"avatarUrl":"","encrypt_uin":"owEzNKEP7w-Fov**","name":"Lin衾浅","followflag":0,"type":2,"isVip":2},"listennum":37071,"dissname":"《我想吃掉你的胰脏》原声带","commit_time":"2019-06-19","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/h1M1V6hujiaDI90lX1CKAzDQHzgPcfquby7JDSYOEzLT2jePd6n8rGw/600?n=1","score":0,"dissid":"7043225960","createtime":"2019-06-17","creator":{"qq":3435166010,"avatarUrl":"","encrypt_uin":"oivi7K6s7wn5on**","name":"约翰大叔不约汤欧巴","followflag":0,"type":0,"isVip":0},"listennum":297825,"dissname":"站住！来和我谈场甜甜恋爱（*≧ω≦）","commit_time":"2019-06-17","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/XkvoO3t2zBy0z9cupUMtqriaEsib3fiaia2CLJE5q4cPySIAKByPLeAQdw/600?n=1","score":0,"dissid":"6967673403","createtime":"2019-05-08","creator":{"qq":359975977,"avatarUrl":"","encrypt_uin":"oi4qNKSkNKSl","name":"Nali","followflag":0,"type":2,"isVip":2},"listennum":341998,"dissname":"纵有人生低谷，愿你我都挺好","commit_time":"2019-05-08","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/z6iaBQ7jDmibXhEAlvTSQvn2zzMHvJDbfIibkxh5mbVVocpfpAF9ckEcw/600?n=1","score":0,"dissid":"4071242581","createtime":"2019-06-20","creator":{"qq":2507798282,"avatarUrl":"","encrypt_uin":"ow4z7iSqNe-Foc**","name":"尐尐","followflag":0,"type":0,"isVip":0},"listennum":47445,"dissname":"前卫浩室：夜跑提速专用","commit_time":"2019-06-20","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Z7haT1p6eeic63oTvdlNb7yvicdKZEmT6QucIpVbgxMf748EW1RyMbFA/600?n=1","score":0,"dissid":"7041067430","createtime":"2019-06-20","creator":{"qq":3028642107,"avatarUrl":"","encrypt_uin":"oinANeCPow6z7z**","name":"豆沙","followflag":0,"type":2,"isVip":2},"listennum":78037,"dissname":"古风家书丨相思赋遥寄沙场","commit_time":"2019-06-20","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/nvRBiaJHaPBvG00iczEYfbu6ycUt5m5WCvkZHEwgHaicU85pmicznTIqBQ/600?n=1","score":0,"dissid":"6995115845","createtime":"2019-05-20","creator":{"qq":467638189,"avatarUrl":"","encrypt_uin":"7eCl7woFoKcq","name":"蜜糖男孩","followflag":0,"type":2,"isVip":2},"listennum":672826,"dissname":"水 族 馆 の 爱 情 物 语","commit_time":"2019-05-20","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/XkvoO3t2zBy0z9cupUMtqg70VJhH0c3HRyeNLsxpceEiaXGvwDJ3ELg/600?n=1","score":0,"dissid":"6709412196","createtime":"2019-02-28","creator":{"qq":359975977,"avatarUrl":"","encrypt_uin":"oi4qNKSkNKSl","name":"Nali","followflag":0,"type":2,"isVip":2},"listennum":199960,"dissname":"幻想回响：神游中的微醺摇曳","commit_time":"2019-02-28","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/SXTicaprnQbfAyiaibTsguPlM1bEzsjMnPdecUuiagfUibDxHcSnjY2ib1UQ/600?n=1","score":0,"dissid":"1725199713","createtime":"2018-10-31","creator":{"qq":2640839003,"avatarUrl":"","encrypt_uin":"owCPoeciNKnzoz**","name":"毕业雨季","followflag":0,"type":2,"isVip":2},"listennum":3305852,"dissname":"《天赋异禀》两季BGM收录","commit_time":"2018-10-31","version":0,"introduction":""}],"categoryId":10000000}
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
        /**
         * sortId : 5
         * sin : 10
         * sum : 7673
         * uin : 0
         * ein : 19
         * list : [{"imgurl":"http://p.qpic.cn/music_cover/aaxX4Babic4VicBPicJOwr5xmw7hG3gR90NXdDG1asnNuA2Ntk1suu9XQ/600?n=1","score":0,"dissid":"7033094594","createtime":"2019-06-10","creator":{"qq":1600189472,"avatarUrl":"","encrypt_uin":"oKCzoe6FNKvloc**","name":"Music Fans","followflag":0,"type":2,"isVip":2},"listennum":45538,"dissname":"沉陷低频 · 国人EDM Trap","commit_time":"2019-06-10","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Uj77DagTFgiccudSicYvppRtK94vRkNHqJb2DFSg44tunsS5CQjQnBkg/600?n=1","score":0,"dissid":"3605037365","createtime":"2019-06-20","creator":{"qq":919820535,"avatarUrl":"","encrypt_uin":"NK6qNe-z7Kok","name":"Lee BG嗷柏","followflag":0,"type":2,"isVip":2},"listennum":32513,"dissname":"日式嘻哈：融合文化的说唱美学","commit_time":"2019-06-20","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/ib5u1yLjrIls7cqVwYRpW6uYfUeq7kGEYHjUt2pu4T8ekgabjs1XfMw/600?n=1","score":0,"dissid":"3612373501","createtime":"2019-06-19","creator":{"qq":2909946281,"avatarUrl":"","encrypt_uin":"owEzNKEP7w-Fov**","name":"Lin衾浅","followflag":0,"type":2,"isVip":2},"listennum":37071,"dissname":"《我想吃掉你的胰脏》原声带","commit_time":"2019-06-19","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/h1M1V6hujiaDI90lX1CKAzDQHzgPcfquby7JDSYOEzLT2jePd6n8rGw/600?n=1","score":0,"dissid":"7043225960","createtime":"2019-06-17","creator":{"qq":3435166010,"avatarUrl":"","encrypt_uin":"oivi7K6s7wn5on**","name":"约翰大叔不约汤欧巴","followflag":0,"type":0,"isVip":0},"listennum":297825,"dissname":"站住！来和我谈场甜甜恋爱（*≧ω≦）","commit_time":"2019-06-17","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/XkvoO3t2zBy0z9cupUMtqriaEsib3fiaia2CLJE5q4cPySIAKByPLeAQdw/600?n=1","score":0,"dissid":"6967673403","createtime":"2019-05-08","creator":{"qq":359975977,"avatarUrl":"","encrypt_uin":"oi4qNKSkNKSl","name":"Nali","followflag":0,"type":2,"isVip":2},"listennum":341998,"dissname":"纵有人生低谷，愿你我都挺好","commit_time":"2019-05-08","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/z6iaBQ7jDmibXhEAlvTSQvn2zzMHvJDbfIibkxh5mbVVocpfpAF9ckEcw/600?n=1","score":0,"dissid":"4071242581","createtime":"2019-06-20","creator":{"qq":2507798282,"avatarUrl":"","encrypt_uin":"ow4z7iSqNe-Foc**","name":"尐尐","followflag":0,"type":0,"isVip":0},"listennum":47445,"dissname":"前卫浩室：夜跑提速专用","commit_time":"2019-06-20","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Z7haT1p6eeic63oTvdlNb7yvicdKZEmT6QucIpVbgxMf748EW1RyMbFA/600?n=1","score":0,"dissid":"7041067430","createtime":"2019-06-20","creator":{"qq":3028642107,"avatarUrl":"","encrypt_uin":"oinANeCPow6z7z**","name":"豆沙","followflag":0,"type":2,"isVip":2},"listennum":78037,"dissname":"古风家书丨相思赋遥寄沙场","commit_time":"2019-06-20","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/nvRBiaJHaPBvG00iczEYfbu6ycUt5m5WCvkZHEwgHaicU85pmicznTIqBQ/600?n=1","score":0,"dissid":"6995115845","createtime":"2019-05-20","creator":{"qq":467638189,"avatarUrl":"","encrypt_uin":"7eCl7woFoKcq","name":"蜜糖男孩","followflag":0,"type":2,"isVip":2},"listennum":672826,"dissname":"水 族 馆 の 爱 情 物 语","commit_time":"2019-05-20","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/XkvoO3t2zBy0z9cupUMtqg70VJhH0c3HRyeNLsxpceEiaXGvwDJ3ELg/600?n=1","score":0,"dissid":"6709412196","createtime":"2019-02-28","creator":{"qq":359975977,"avatarUrl":"","encrypt_uin":"oi4qNKSkNKSl","name":"Nali","followflag":0,"type":2,"isVip":2},"listennum":199960,"dissname":"幻想回响：神游中的微醺摇曳","commit_time":"2019-02-28","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/SXTicaprnQbfAyiaibTsguPlM1bEzsjMnPdecUuiagfUibDxHcSnjY2ib1UQ/600?n=1","score":0,"dissid":"1725199713","createtime":"2018-10-31","creator":{"qq":2640839003,"avatarUrl":"","encrypt_uin":"owCPoeciNKnzoz**","name":"毕业雨季","followflag":0,"type":2,"isVip":2},"listennum":3305852,"dissname":"《天赋异禀》两季BGM收录","commit_time":"2018-10-31","version":0,"introduction":""}]
         * categoryId : 10000000
         */

        private int sortId;
        private int sin;
        private int sum;
        private int uin;
        private int ein;
        private int categoryId;
        private List<ListBean> list;

        public int getSortId() {
            return sortId;
        }

        public void setSortId(int sortId) {
            this.sortId = sortId;
        }

        public int getSin() {
            return sin;
        }

        public void setSin(int sin) {
            this.sin = sin;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }

        public int getUin() {
            return uin;
        }

        public void setUin(int uin) {
            this.uin = uin;
        }

        public int getEin() {
            return ein;
        }

        public void setEin(int ein) {
            this.ein = ein;
        }

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean implements Serializable{
            /**
             * imgurl : http://p.qpic.cn/music_cover/aaxX4Babic4VicBPicJOwr5xmw7hG3gR90NXdDG1asnNuA2Ntk1suu9XQ/600?n=1
             * score : 0.0
             * dissid : 7033094594
             * createtime : 2019-06-10
             * creator : {"qq":1600189472,"avatarUrl":"","encrypt_uin":"oKCzoe6FNKvloc**","name":"Music Fans","followflag":0,"type":2,"isVip":2}
             * listennum : 45538
             * dissname : 沉陷低频 · 国人EDM Trap
             * commit_time : 2019-06-10
             * version : 0
             * introduction :
             */

            private String imgurl;
            private double score;
            private String dissid;
            private String createtime;
            private CreatorBean creator;
            private int listennum;
            private String dissname;
            private String commit_time;
            private int version;
            private String introduction;

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }

            public double getScore() {
                return score;
            }

            public void setScore(double score) {
                this.score = score;
            }

            public String getDissid() {
                return dissid;
            }

            public void setDissid(String dissid) {
                this.dissid = dissid;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public CreatorBean getCreator() {
                return creator;
            }

            public void setCreator(CreatorBean creator) {
                this.creator = creator;
            }

            public int getListennum() {
                return listennum;
            }

            public void setListennum(int listennum) {
                this.listennum = listennum;
            }

            public String getDissname() {
                return dissname;
            }

            public void setDissname(String dissname) {
                this.dissname = dissname;
            }

            public String getCommit_time() {
                return commit_time;
            }

            public void setCommit_time(String commit_time) {
                this.commit_time = commit_time;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public String getIntroduction() {
                return introduction;
            }

            public void setIntroduction(String introduction) {
                this.introduction = introduction;
            }

            public static class CreatorBean implements Serializable{
                /**
                 * qq : 1600189472
                 * avatarUrl :
                 * encrypt_uin : oKCzoe6FNKvloc**
                 * name : Music Fans
                 * followflag : 0
                 * type : 2
                 * isVip : 2
                 */

                private String qq;
                private String avatarUrl;
                private String encrypt_uin;
                private String name;
                private int followflag;
                private int type;
                private int isVip;

                public String getQq() {
                    return qq;
                }

                public void setQq(String qq) {
                    this.qq = qq;
                }

                public String getAvatarUrl() {
                    return avatarUrl;
                }

                public void setAvatarUrl(String avatarUrl) {
                    this.avatarUrl = avatarUrl;
                }

                public String getEncrypt_uin() {
                    return encrypt_uin;
                }

                public void setEncrypt_uin(String encrypt_uin) {
                    this.encrypt_uin = encrypt_uin;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getFollowflag() {
                    return followflag;
                }

                public void setFollowflag(int followflag) {
                    this.followflag = followflag;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public int getIsVip() {
                    return isVip;
                }

                public void setIsVip(int isVip) {
                    this.isVip = isVip;
                }
            }
        }
    }
}
