package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;
@HttpResponse(parser = JsonRespondParse.class)
public class Songlist implements Serializable{
    /**
     * code : 200
     * msg : OK
     * timestamp : 1560260710374
     * data : {"sortId":5,"sin":0,"sum":7623,"uin":0,"ein":59,"list":[{"imgurl":"http://p.qpic.cn/music_cover/AhbCa0vazSRDjEJhYwthgnyK8lEX3rbRP7gMoGPy1CM9UoNyZk1HkQ/600?n=1","score":0,"dissid":"6967377538","createtime":"2019-06-04","creator":{"qq":1747907171,"avatarUrl":"","encrypt_uin":"oKSP7iEz7i6lov**","name":"鹿仁","followflag":0,"type":2,"isVip":2},"listennum":266442,"dissname":"清新民谣 · 让夏日不再燥热","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/nvRBiaJHaPBvG00iczEYfbuzEhgOHhzJkGYzK1Adia9RasZ7DOznkGoxQ/600?n=1","score":0,"dissid":"7014439524","createtime":"2019-06-04","creator":{"qq":467638189,"avatarUrl":"","encrypt_uin":"7eCl7woFoKcq","name":"蜜糖男孩","followflag":0,"type":2,"isVip":2},"listennum":537299,"dissname":"中国风 · 何日君再来","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/lYiaEbscaryrFiaicJFp8euubSTTrkvUetZesQPdKaQ9wYbAnFUWVTmww/600?n=1","score":0,"dissid":"7022163351","createtime":"2019-06-02","creator":{"qq":1060444681,"avatarUrl":"","encrypt_uin":"oKnsoevP7eCFov**","name":"是硬糖啊","followflag":0,"type":2,"isVip":2},"listennum":93325,"dissname":"寄迹山林 · 尚留一方清净","commit_time":"2019-06-02","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/ibJJngZRP5m8ksRvDkGZxdcTjKvwic4LFL3W7xMWpeZla7oSgXIZZkVA/600?n=1","score":0,"dissid":"7000632052","createtime":"2019-05-31","creator":{"qq":793407810,"avatarUrl":"","encrypt_uin":"7iEi7enlNe6z","name":"谈谈心恋恋爱 *","followflag":0,"type":2,"isVip":2},"listennum":172482,"dissname":"我宁孤独终老，也不英年早婚","commit_time":"2019-05-31","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/bAYKXVPUHW0eoV1osjUANB4SdxYSBMXIUeYibQIyJFgqGicfhl32aFwg/600?n=1","score":0,"dissid":"7013376911","createtime":"2019-05-31","creator":{"qq":1198547939,"avatarUrl":"","encrypt_uin":"oK6qNe4P7iEiNv**","name":"Handsup-U","followflag":0,"type":2,"isVip":2},"listennum":91431,"dissname":"夜半微醺丨卸下疲惫和惆怅","commit_time":"2019-05-31","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/ibJJngZRP5m8ksRvDkGZxdcTjKvwic4LFLWKcBCtNwzufmb07jibYbhHQ/600?n=1","score":0,"dissid":"7012694365","createtime":"2019-06-04","creator":{"qq":793407810,"avatarUrl":"","encrypt_uin":"7iEi7enlNe6z","name":"谈谈心恋恋爱 *","followflag":0,"type":2,"isVip":2},"listennum":419086,"dissname":"和前任分手时，说过的违心话","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/MRv7K6JSIesyBiaHXtV4wnaNMtYQtP9nSnstqicgFfpvicpPZykvPJA3VpRIvicAroQj/600?n=1","score":0,"dissid":"7009803237","createtime":"2019-06-04","creator":{"qq":1152921504757501112,"avatarUrl":"","encrypt_uin":"oK6kowEAoK4z7eSk7i4zoK65oc**","name":"Bass ","followflag":0,"type":0,"isVip":0},"listennum":118521,"dissname":"Future Bass | 奇幻低音，置身仙境","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/jCPNL5FMs23Uk4XAo5aTmbibhjqPyChZO9knRibDakJTPhKsrPhObicUA/600?n=1","score":0,"dissid":"7027216410","createtime":"2019-06-06","creator":{"qq":2717056190,"avatarUrl":"","encrypt_uin":"owS57ink7w6qon**","name":"热云赫赫拉","followflag":0,"type":0,"isVip":0},"listennum":245606,"dissname":"「华研」选秀歌手合集","commit_time":"2019-06-06","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/lPMyCX1ybnfhZEbtP22TsLwoZkghEzlf7w4DAqUwNkmlbeLJsPTfZA/600?n=1","score":0,"dissid":"7022753020","createtime":"2019-06-03","creator":{"qq":1927552414,"avatarUrl":"","encrypt_uin":"oKEA7i4kowv57n**","name":"世俗","followflag":0,"type":0,"isVip":0},"listennum":324666,"dissname":"毕业季 : 时光荏苒，依稀如梦","commit_time":"2019-06-03","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/bglUEFSMMhA3eiblfHXvQRNICMnA5X4d11lqLnmwguvQ2ZmyBicwK70Q/600?n=1","score":0,"dissid":"4246958569","createtime":"2019-06-04","creator":{"qq":1653099231,"avatarUrl":"","encrypt_uin":"oKCkoinqNK-iov**","name":"不白","followflag":0,"type":0,"isVip":0},"listennum":347206,"dissname":"【入耳沉醉】 猝不及防的心动","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/jCPNL5FMs23Uk4XAo5aTmbibhjqPyChZOF27ZqOtlJDohxpnueufrqA/600?n=1","score":0,"dissid":"7027231106","createtime":"2019-06-06","creator":{"qq":2717056190,"avatarUrl":"","encrypt_uin":"owS57ink7w6qon**","name":"热云赫赫拉","followflag":0,"type":0,"isVip":0},"listennum":458072,"dissname":"「华研」影视剧原声合集","commit_time":"2019-06-06","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/KetjXWSVppvyrVJfzfdpib8IHrSyxErPrUAuMPO1zicorOlLNjVG8McA/600?n=1","score":0,"dissid":"7025242624","createtime":"2019-06-05","creator":{"qq":55894433,"avatarUrl":"","encrypt_uin":"7K4FNKvPoio*","name":"QQ音乐VIP","followflag":0,"type":6,"isVip":6},"listennum":304237,"dissname":"欧美励志 | 梦想是来自宙斯的礼物","commit_time":"2019-06-05","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/0yiaX8d9LSmnROyId1RsUU3XmFaXdcLzoZNPVklia4NZ7iaIuIbZtJnoQ/600?n=1","score":0,"dissid":"2368296852","createtime":"2017-11-07","creator":{"qq":707665875,"avatarUrl":"","encrypt_uin":"7inl7wCkNeSk","name":"爱听歌的兽gr","followflag":0,"type":2,"isVip":2},"listennum":995206,"dissname":"高 考 后 的 康 复 歌 单","commit_time":"2017-11-07","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/lYiaEbscaryrFiaicJFp8euubSTTrkvUetZcS3ndnw6YBf6kACdgXgE7g/600?n=1","score":0,"dissid":"7023369140","createtime":"2019-06-03","creator":{"qq":1060444681,"avatarUrl":"","encrypt_uin":"oKnsoevP7eCFov**","name":"是硬糖啊","followflag":0,"type":2,"isVip":2},"listennum":160078,"dissname":"余音袅袅 · 国风哼唱里的情愫","commit_time":"2019-06-03","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/lYiaEbscaryrFiaicJFp8euuUDkKFIqP1ZjoRa0X8jYgn8qgSnQvstWKA/600?n=1","score":0,"dissid":"7019488378","createtime":"2019-06-05","creator":{"qq":1060444681,"avatarUrl":"","encrypt_uin":"oKnsoevP7eCFov**","name":"是硬糖啊","followflag":0,"type":2,"isVip":2},"listennum":219151,"dissname":"民谣情信 : 予你手心的温暖","commit_time":"2019-06-05","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/8HhavvWNIicpyjlv0UnT5TQicNiadGKE87DXZWu9ibwHDiafpKKd3kJGicsg/600?n=1","score":0,"dissid":"6678579886","createtime":"2019-02-27","creator":{"qq":478695379,"avatarUrl":"","encrypt_uin":"7eSF7wEkoiSq","name":"DJ顾念晨","followflag":0,"type":3,"isVip":3},"listennum":1766602,"dissname":"大型高考冲刺现场！都给我冲鸭！","commit_time":"2019-02-27","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/KaFn5hQACzzVeLFOc4hamAyIL8gMZzaVJdBu6uwyOABMLUz8ICc7wg/600?n=1","score":0,"dissid":"7025269531","createtime":"2019-06-06","creator":{"qq":3300733760,"avatarUrl":"","encrypt_uin":"oiozoeSioiSson**","name":"冰的唐葫芦","followflag":0,"type":2,"isVip":2},"listennum":1030726,"dissname":"端午赏 · 轻柔温婉国风集","commit_time":"2019-06-06","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/K6CEv0Hv9DcRopdMZUDephk4ZKxVQ8KNOur3WktGKuhVfx65A9JO3g/600?n=1","score":0,"dissid":"6944634962","createtime":"2019-06-05","creator":{"qq":88480387,"avatarUrl":"","encrypt_uin":"NecPNeniNeS*","name":"World · 炎","followflag":0,"type":0,"isVip":0},"listennum":293508,"dissname":"00后童年记忆 : 怀念旧时动画","commit_time":"2019-06-05","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Uj77DagTFgiccudSicYvppRj0z5XbvXtwYgvshFEJBSK3HA9CciaUibG4g/600?n=1","score":0,"dissid":"3751500151","createtime":"2019-06-05","creator":{"qq":919820535,"avatarUrl":"","encrypt_uin":"NK6qNe-z7Kok","name":"Lee BG嗷柏","followflag":0,"type":2,"isVip":2},"listennum":93732,"dissname":"Trip跳：风格另类的说唱嘻哈","commit_time":"2019-06-05","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/uPA58W8yiam1c76QzvzYgL6iaic1MdpzDxEJiad1IhBh30lrBibCljBp04w/600?n=1","score":0,"dissid":"7024376622","createtime":"2019-06-04","creator":{"qq":2979842415,"avatarUrl":"","encrypt_uin":"owElNKcPowv57v**","name":"桃Tao音乐志","followflag":0,"type":2,"isVip":2},"listennum":229313,"dissname":"Billboard 2019上半年最佳50专","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Gh1XgWazibYlbuPicu2mQqzBVz6bF6UzCBOduZUdE7m2INH76E8I2UwA/600?n=1","score":0,"dissid":"7021698062","createtime":"2019-06-03","creator":{"qq":1173585965,"avatarUrl":"","encrypt_uin":"oK6loi4F7KEs7v**","name":"木焓","followflag":0,"type":2,"isVip":2},"listennum":333438,"dissname":"2019年网络流行语的歌","commit_time":"2019-06-03","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/aaxX4Babic4VicBPicJOwr5xia9JlSv0tkIM8c2gXWYh8e8fs54Wx4HK8g/600?n=1","score":0,"dissid":"3784914382","createtime":"2018-04-12","creator":{"qq":1600189472,"avatarUrl":"","encrypt_uin":"oKCzoe6FNKvloc**","name":"Music Fans","followflag":0,"type":2,"isVip":2},"listennum":889022,"dissname":"励志电子：濒临绝望时的一道曙光","commit_time":"2018-04-12","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/ibJJngZRP5m8ksRvDkGZxdcTjKvwic4LFLmx6NNVNRnXWDZXqLzFictBw/600?n=1","score":0,"dissid":"7024582292","createtime":"2019-06-06","creator":{"qq":793407810,"avatarUrl":"","encrypt_uin":"7iEi7enlNe6z","name":"谈谈心恋恋爱 *","followflag":0,"type":2,"isVip":2},"listennum":382247,"dissname":"静心民谣：夏日清凉专享","commit_time":"2019-06-06","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/HZnqT8B6sibc2iaxSb6biaOAYBrSTAzPZAUPgFcFvcaKWqbwbatzEqNiag/600?n=1","score":0,"dissid":"7023269050","createtime":"2019-06-04","creator":{"qq":3490786195,"avatarUrl":"","encrypt_uin":"oivqoeSF7w6q7v**","name":"允许部分冷门先热起来","followflag":0,"type":0,"isVip":0},"listennum":353014,"dissname":"民谣 · 我把时光写成歌","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/bExxovQqJ1rzMJ7pblQUuyDlg0zAqV3RNBmlenykT23M6QvvI0Txng/600?n=1","score":0,"dissid":"7023320174","createtime":"2019-06-03","creator":{"qq":3527181498,"avatarUrl":"","encrypt_uin":"oi4A7i6FoKvqNn**","name":"LAN费曼","followflag":0,"type":0,"isVip":0},"listennum":254104,"dissname":"经典不插电现场：原声也摇滚","commit_time":"2019-06-03","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/drZnBOxDNzaK3s5ZzZNDxYDtFaQfwQaH4vWGvr6UQk1L3GYlPrsgAA/600?n=1","score":0,"dissid":"7012019442","createtime":"2019-05-31","creator":{"qq":497974908,"avatarUrl":"","encrypt_uin":"7eElNKSPNKnF","name":"Etc in the great","followflag":0,"type":2,"isVip":2},"listennum":90533,"dissname":"狂暴轰响 · Frenchcore","commit_time":"2019-05-31","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/uPA58W8yiam1c76QzvzYgL6iaic1MdpzDxEaiab1pI3N37qRMpeibHeQgUg/600?n=1","score":0,"dissid":"7020075250","createtime":"2019-06-01","creator":{"qq":2979842415,"avatarUrl":"","encrypt_uin":"owElNKcPowv57v**","name":"桃Tao音乐志","followflag":0,"type":2,"isVip":2},"listennum":252221,"dissname":"S.H.E华语第一女团金曲全集","commit_time":"2019-06-01","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/JGWy4hDbeHGB4lAPwcanXGibtxtlhT8DtVOpZcvXgsNuI0NcBIe4MfA/600?n=1","score":0,"dissid":"6998651574","createtime":"2019-05-31","creator":{"qq":2822129197,"avatarUrl":"","encrypt_uin":"owcAow6ANK6q7z**","name":"故里","followflag":0,"type":0,"isVip":0},"listennum":341900,"dissname":"古风仙女嗓 · 我愿醉在这声音里","commit_time":"2019-05-31","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Fe6emiag6IuVbMib3oN6yctavBAUviamrjRicF8Z5D5atLIxtt10UQD2fw/600?n=1","score":0,"dissid":"7012831061","createtime":"2019-05-31","creator":{"qq":2407142727,"avatarUrl":"","encrypt_uin":"owvz7i6PowSA7z**","name":"就是一个听歌der","followflag":0,"type":2,"isVip":2},"listennum":399660,"dissname":"解压音药 · 耳内按摩赶走烦躁","commit_time":"2019-05-31","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/MhQ4bJBPt3Yt5icXyBGNhyGYDbBG6xZetyVuMGco4cOX7TaMEzkL9Yw/600?n=1","score":0,"dissid":"3757863512","createtime":"2018-07-25","creator":{"qq":452775188,"avatarUrl":"","encrypt_uin":"7e4A7iSkoKcF","name":"还不是因为你长得不好看","followflag":0,"type":2,"isVip":2},"listennum":10810637,"dissname":"缓解焦虑的日系纯音","commit_time":"2018-07-25","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/20Dr6sBicc57lmu46SAQthvDtT3IPXWShCvJfrat9qmH1fibKMiccUJhw/600?n=1","score":0,"dissid":"7002753531","createtime":"2019-05-24","creator":{"qq":819975016,"avatarUrl":"","encrypt_uin":"Ne6qNKSkoe6s","name":"像雾像雨又像风","followflag":0,"type":0,"isVip":0},"listennum":134405,"dissname":"弹跳模式 \u2022 狂热Future Bounce","commit_time":"2019-05-24","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Xewa2JUmZ1rQd7ZeuBIZX7tWwy41kStKbwRawhYBbSuVibj5ReccgPw/600?n=1","score":0,"dissid":"6998375386","createtime":"2019-05-25","creator":{"qq":86409274,"avatarUrl":"","encrypt_uin":"NeCPoeEA7iv*","name":"离歌","followflag":0,"type":0,"isVip":0},"listennum":199526,"dissname":"初夏｜宁静之间流动的缱绻时光","commit_time":"2019-05-25","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/JGWy4hDbeHGB4lAPwcanXIW0FIO3EuDWWk91B63nyyOibFgBDZMLTaQ/600?n=1","score":0,"dissid":"7000646175","createtime":"2019-05-24","creator":{"qq":2822129197,"avatarUrl":"","encrypt_uin":"owcAow6ANK6q7z**","name":"故里","followflag":0,"type":0,"isVip":0},"listennum":610762,"dissname":"影视歌曲 · 如果思念会说话","commit_time":"2019-05-24","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/xKbkocaBytGNfiaxCrPF7a7zdUUHn7JeO0RX0R5UcNRGviaqiau26414g/600?n=1","score":0,"dissid":"4974071442","createtime":"2018-10-17","creator":{"qq":1468388760,"avatarUrl":"","encrypt_uin":"oKvsNeoFNeSson**","name":"Smile","followflag":0,"type":2,"isVip":2},"listennum":739930,"dissname":"韩系R&B美声，摇曳酒杯里的威士忌","commit_time":"2018-10-17","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/SXTicaprnQbfAyiaibTsguPlEIia7xIjmV0rAZezIWIlQxkJLlQL9FzxicQ/600?n=1","score":0,"dissid":"1727562186","createtime":"2018-11-12","creator":{"qq":2640839003,"avatarUrl":"","encrypt_uin":"owCPoeciNKnzoz**","name":"毕业雨季","followflag":0,"type":2,"isVip":2},"listennum":3628945,"dissname":"30部真人奇幻冒险电影原声鉴赏","commit_time":"2018-11-12","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Fe6emiag6IuVbMib3oN6yctVHBicjUJMLI5R8LI7CNnILLQd8LMhBPWug/600?n=1","score":0,"dissid":"6967504715","createtime":"2019-05-08","creator":{"qq":2407142727,"avatarUrl":"","encrypt_uin":"owvz7i6PowSA7z**","name":"就是一个听歌der","followflag":0,"type":2,"isVip":2},"listennum":569094,"dissname":"华语说唱 · 堵在路上也要酷","commit_time":"2019-05-08","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/vWuLw7pgtD9Rts157EocyOw4f97nHqtj6SPiao8jaDwlv7iaiaGt4cLKw/600?n=1","score":0,"dissid":"7013848675","createtime":"2019-05-30","creator":{"qq":3231344116,"avatarUrl":"","encrypt_uin":"oi-ioKoP7e657c**","name":"斯国一咧","followflag":0,"type":0,"isVip":0},"listennum":182157,"dissname":"【ACG治愈】即使孤单也要温柔","commit_time":"2019-05-30","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/aaxX4Babic4VicBPicJOwr5xlmE4icb0CZbcfu4QTia4fE9ghFjkq82icibqg/600?n=1","score":0,"dissid":"4659497191","createtime":"2019-03-25","creator":{"qq":1600189472,"avatarUrl":"","encrypt_uin":"oKCzoe6FNKvloc**","name":"Music Fans","followflag":0,"type":2,"isVip":2},"listennum":77514,"dissname":"Melodic Bass｜悠游臆想幻境","commit_time":"2019-03-25","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/X9lmt3gQ1KkaezXF13jX30mTt22GJOibKVWLorcvcVic5HTMkVGkjrpg/600?n=1","score":0,"dissid":"5372758242","createtime":"2018-11-09","creator":{"qq":1079096147,"avatarUrl":"","encrypt_uin":"oKnlNKnq7w6P7z**","name":"蘑菇","followflag":0,"type":2,"isVip":2},"listennum":2090657,"dissname":"怀念你，是我最终爱你的方式","commit_time":"2018-11-09","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/XkvoO3t2zBy0z9cupUMtqtYwM5A3t5FAQCkicz8ZQvd6QlDFg8jpXgw/600?n=1","score":0,"dissid":"6938020960","createtime":"2019-04-23","creator":{"qq":359975977,"avatarUrl":"","encrypt_uin":"oi4qNKSkNKSl","name":"Nali","followflag":0,"type":2,"isVip":2},"listennum":245438,"dissname":"电音早餐 | 请查收今日份元气弹~","commit_time":"2019-04-23","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/gu6Yf5YflwkKK1xnz7gjxUYV8TWWHjGHhzt4r2lnSc8DoGfGMYyjuw/600?n=1","score":0,"dissid":"5519081958","createtime":"2018-11-14","creator":{"qq":2098173770,"avatarUrl":"","encrypt_uin":"ownqNe6loiSlon**","name":"西斯洛弗。Lam","followflag":0,"type":0,"isVip":0},"listennum":2600950,"dissname":"鬼才林振强笔下的粤语作品 ","commit_time":"2018-11-14","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Ye8xJJLS3zf0lX5xTNk0TB9tPkgKFNGSo9Y43PAibsRk7equapt7aOA/600?n=1","score":0,"dissid":"6585939787","createtime":"2019-05-29","creator":{"qq":1047366248,"avatarUrl":"","encrypt_uin":"oKnP7ios7w-PNn**","name":"薄荷凉","followflag":0,"type":0,"isVip":0},"listennum":508669,"dissname":"校园系列原声收录：我只喜欢你","commit_time":"2019-05-29","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/A3K6WU7EtiaOWXPWe0T7icH8B64G5miaZlibHKOsRwvvkR7xkt2VibWghOg/600?n=1","score":0,"dissid":"6749246314","createtime":"2019-02-26","creator":{"qq":1347165922,"avatarUrl":"","encrypt_uin":"oKoP7i6s7KEAoc**","name":"枯燥的读书人","followflag":0,"type":2,"isVip":2},"listennum":934991,"dissname":"《东宫》小说改编类古装电视剧原声","commit_time":"2019-02-26","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/R8unPZMA4Vp5v2Ms96bstyGEL0FSQnl1zPYOWcshOCmgq0aShyWDjw/600?n=1","score":0,"dissid":"6915377372","createtime":"2019-04-02","creator":{"qq":945187827,"avatarUrl":"","encrypt_uin":"NKvkoKclNe-l","name":"念安娜","followflag":0,"type":2,"isVip":2},"listennum":1311829,"dissname":"耳边软语：小憩时的温柔情歌 ","commit_time":"2019-04-02","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/qhuJFHlwiayRp1rhWoJk9HcgmiasAWicWF2gVBXb4JmlPnFscdYj70SAA/600?n=1","score":0,"dissid":"6021632883","createtime":"2018-12-19","creator":{"qq":3413833718,"avatarUrl":"","encrypt_uin":"oiv5oicioiS5Nn**","name":"腾讯音乐人","followflag":0,"type":2,"isVip":2},"listennum":1665645,"dissname":"华语R&B | 谁的嗓音俘虏你耳朵？","commit_time":"2018-12-19","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/z6iaBQ7jDmibXhEAlvTSQvnibQNGcNTuFItpyceibxeCroDgicozjUpm1qQ/600?n=1","score":0,"dissid":"1485413519","createtime":"2019-05-27","creator":{"qq":2507798282,"avatarUrl":"","encrypt_uin":"ow4z7iSqNe-Foc**","name":"尐尐","followflag":0,"type":0,"isVip":0},"listennum":109037,"dissname":"午间休憩 \u2022 缓拍慵懒爵士","commit_time":"2019-05-27","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/FrdAUicrPIibdU7cus4HYv0cbOJicI7ibYfIXQ3JkxZBg4pIk23NfwY25g/600?n=1","score":0,"dissid":"6966427368","createtime":"2019-05-26","creator":{"qq":33914824,"avatarUrl":"","encrypt_uin":"oioqoKvFowv*","name":"♂酷约翰♀","followflag":0,"type":0,"isVip":0},"listennum":161359,"dissname":"欧美电子：释放你的能量","commit_time":"2019-05-26","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/ib5u1yLjrIls7cqVwYRpW6qYVPex21O4tXqckrWOeB0WBl2yfLCcyow/600?n=1","score":0,"dissid":"3726293213","createtime":"2019-03-27","creator":{"qq":2909946281,"avatarUrl":"","encrypt_uin":"owEzNKEP7w-Fov**","name":"Lin衾浅","followflag":0,"type":2,"isVip":2},"listennum":454538,"dissname":"恋爱微醺 | 少女の微暖心事谱","commit_time":"2019-03-27","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/AhbCa0vazSRDjEJhYwthguicp6JicrknibesE5cVy4aTxWx5PVo47sOicQ/600?n=1","score":0,"dissid":"6987481844","createtime":"2019-05-22","creator":{"qq":1747907171,"avatarUrl":"","encrypt_uin":"oKSP7iEz7i6lov**","name":"鹿仁","followflag":0,"type":2,"isVip":2},"listennum":1090311,"dissname":"伤感情歌 · 害怕遇见下个你","commit_time":"2019-05-22","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/drZnBOxDNzaK3s5ZzZNDxev40uTEwIkOZ4emHBEGjAR4icLSVWIqiaxA/600?n=1","score":0,"dissid":"6949224821","createtime":"2019-05-20","creator":{"qq":497974908,"avatarUrl":"","encrypt_uin":"7eElNKSPNKnF","name":"Etc in the great","followflag":0,"type":2,"isVip":2},"listennum":520236,"dissname":"Downtempo丨悠缓节奏 秘境隐逸","commit_time":"2019-05-20","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/O7jWchh5tkOicJBz1xFCAv5Eum6O7Hrj2Lg4AMZ8ElwWvR9ICicA3o7A/600?n=1","score":0,"dissid":"6915990178","createtime":"2019-05-01","creator":{"qq":535710046,"avatarUrl":"","encrypt_uin":"7Kok7i6zoevs","name":"ca.sa.do.^^","followflag":0,"type":0,"isVip":0},"listennum":397012,"dissname":"韩系安利 : 专属于你的慵懒男友音","commit_time":"2019-05-01","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Xewa2JUmZ1rQd7ZeuBIZX66x9jiaV4FMGovgibtajLVMItlREEhEaXmw/600?n=1","score":0,"dissid":"7001373792","createtime":"2019-05-28","creator":{"qq":86409274,"avatarUrl":"","encrypt_uin":"NeCPoeEA7iv*","name":"离歌","followflag":0,"type":0,"isVip":0},"listennum":270573,"dissname":"成年人脆弱疗愈指南","commit_time":"2019-05-28","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/JqedGFGJsxS0zcnIkPtxO4BribfZQ54agGObuiboJjJTjmYlxY5ceeiaw/600?n=1","score":0,"dissid":"5341539480","createtime":"2019-05-20","creator":{"qq":1596944080,"avatarUrl":"","encrypt_uin":"oK4q7wEP7enFon**","name":"爱时乐c","followflag":0,"type":2,"isVip":2},"listennum":850769,"dissname":"入耳即醉！ 百首治愈向英文翻唱","commit_time":"2019-05-20","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/amD8XDvFG8ClIJ5Hib0U0jZkcKegBbM5fsrma6nunFzxJ7YEBCb9Yxw/600?n=1","score":0,"dissid":"3831035004","createtime":"2019-05-28","creator":{"qq":1214673117,"avatarUrl":"","encrypt_uin":"oK-57eCloi657z**","name":"小攀哟","followflag":0,"type":0,"isVip":0},"listennum":2753054,"dissname":"2019网络歌曲新歌分享","commit_time":"2019-05-28","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/z6iaBQ7jDmibXhEAlvTSQvn3NvzUNLbhadjv5VNRbycOQCQicBaaJRs6w/600?n=1","score":0,"dissid":"3857708989","createtime":"2019-05-27","creator":{"qq":2507798282,"avatarUrl":"","encrypt_uin":"ow4z7iSqNe-Foc**","name":"尐尐","followflag":0,"type":0,"isVip":0},"listennum":322325,"dissname":"浮躁宁静剂 \u2022 Alternative","commit_time":"2019-05-27","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/nvRBiaJHaPBvG00iczEYfbu6ycUt5m5WCv2ptDepzmEu0NWzeXcApN4A/600?n=1","score":0,"dissid":"7000539108","createtime":"2019-05-27","creator":{"qq":467638189,"avatarUrl":"","encrypt_uin":"7eCl7woFoKcq","name":"蜜糖男孩","followflag":0,"type":2,"isVip":2},"listennum":134673,"dissname":"一秒动心 · 柠檬味爱情","commit_time":"2019-05-27","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Q2BbehalbX9rf2ZwicYKia2EM69W8VMPOA6AWADeXsicfG4T5YPG28HCg/600?n=1","score":0,"dissid":"6916352693","createtime":"2019-04-02","creator":{"qq":3292495280,"avatarUrl":"","encrypt_uin":"oi-qowvq7K-Fon**","name":"桥环野の贰狗","followflag":0,"type":2,"isVip":2},"listennum":123891,"dissname":"《路人超能100》合集（两季全）","commit_time":"2019-04-02","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/ibJJngZRP5m8ksRvDkGZxdXkvbyaurhddQGibEpzhNAfqoNJNe3zv8Tw/600?n=1","score":0,"dissid":"6998756204","createtime":"2019-05-24","creator":{"qq":793407810,"avatarUrl":"","encrypt_uin":"7iEi7enlNe6z","name":"谈谈心恋恋爱 *","followflag":0,"type":2,"isVip":2},"listennum":215776,"dissname":"假日煲剧：2019上半年韩剧指南","commit_time":"2019-05-24","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/llTQ9l2AeicK2OLIORnsUdn18ibOl9hH8HvS61zjRvzdMibhpyHBZcv2Q/600?n=1","score":0,"dissid":"6977925827","createtime":"2019-05-24","creator":{"qq":348361207,"avatarUrl":"","encrypt_uin":"oivFoiC5ownl","name":"风少","followflag":0,"type":2,"isVip":2},"listennum":325518,"dissname":"欧美流行 ：情绪燃料供给站","commit_time":"2019-05-24","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/fPn0iapLleUFx4kZhMPupPufEFBz3rvcmqn37qk3N1DIJmNaNbHElzQ/600?n=1","score":0,"dissid":"7011264340","createtime":"2019-05-28","creator":{"qq":3521419564,"avatarUrl":"","encrypt_uin":"oi4AoKv5NK4s7n**","name":"穿着皮鞋跳大神","followflag":0,"type":0,"isVip":0},"listennum":78043,"dissname":"电子 · 房间里的单人舞池","commit_time":"2019-05-28","version":0,"introduction":""}],"categoryId":10000000}
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
         * sin : 0
         * sum : 7623
         * uin : 0
         * ein : 59
         * list : [{"imgurl":"http://p.qpic.cn/music_cover/AhbCa0vazSRDjEJhYwthgnyK8lEX3rbRP7gMoGPy1CM9UoNyZk1HkQ/600?n=1","score":0,"dissid":"6967377538","createtime":"2019-06-04","creator":{"qq":1747907171,"avatarUrl":"","encrypt_uin":"oKSP7iEz7i6lov**","name":"鹿仁","followflag":0,"type":2,"isVip":2},"listennum":266442,"dissname":"清新民谣 · 让夏日不再燥热","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/nvRBiaJHaPBvG00iczEYfbuzEhgOHhzJkGYzK1Adia9RasZ7DOznkGoxQ/600?n=1","score":0,"dissid":"7014439524","createtime":"2019-06-04","creator":{"qq":467638189,"avatarUrl":"","encrypt_uin":"7eCl7woFoKcq","name":"蜜糖男孩","followflag":0,"type":2,"isVip":2},"listennum":537299,"dissname":"中国风 · 何日君再来","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/lYiaEbscaryrFiaicJFp8euubSTTrkvUetZesQPdKaQ9wYbAnFUWVTmww/600?n=1","score":0,"dissid":"7022163351","createtime":"2019-06-02","creator":{"qq":1060444681,"avatarUrl":"","encrypt_uin":"oKnsoevP7eCFov**","name":"是硬糖啊","followflag":0,"type":2,"isVip":2},"listennum":93325,"dissname":"寄迹山林 · 尚留一方清净","commit_time":"2019-06-02","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/ibJJngZRP5m8ksRvDkGZxdcTjKvwic4LFL3W7xMWpeZla7oSgXIZZkVA/600?n=1","score":0,"dissid":"7000632052","createtime":"2019-05-31","creator":{"qq":793407810,"avatarUrl":"","encrypt_uin":"7iEi7enlNe6z","name":"谈谈心恋恋爱 *","followflag":0,"type":2,"isVip":2},"listennum":172482,"dissname":"我宁孤独终老，也不英年早婚","commit_time":"2019-05-31","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/bAYKXVPUHW0eoV1osjUANB4SdxYSBMXIUeYibQIyJFgqGicfhl32aFwg/600?n=1","score":0,"dissid":"7013376911","createtime":"2019-05-31","creator":{"qq":1198547939,"avatarUrl":"","encrypt_uin":"oK6qNe4P7iEiNv**","name":"Handsup-U","followflag":0,"type":2,"isVip":2},"listennum":91431,"dissname":"夜半微醺丨卸下疲惫和惆怅","commit_time":"2019-05-31","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/ibJJngZRP5m8ksRvDkGZxdcTjKvwic4LFLWKcBCtNwzufmb07jibYbhHQ/600?n=1","score":0,"dissid":"7012694365","createtime":"2019-06-04","creator":{"qq":793407810,"avatarUrl":"","encrypt_uin":"7iEi7enlNe6z","name":"谈谈心恋恋爱 *","followflag":0,"type":2,"isVip":2},"listennum":419086,"dissname":"和前任分手时，说过的违心话","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/MRv7K6JSIesyBiaHXtV4wnaNMtYQtP9nSnstqicgFfpvicpPZykvPJA3VpRIvicAroQj/600?n=1","score":0,"dissid":"7009803237","createtime":"2019-06-04","creator":{"qq":1152921504757501112,"avatarUrl":"","encrypt_uin":"oK6kowEAoK4z7eSk7i4zoK65oc**","name":"Bass ","followflag":0,"type":0,"isVip":0},"listennum":118521,"dissname":"Future Bass | 奇幻低音，置身仙境","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/jCPNL5FMs23Uk4XAo5aTmbibhjqPyChZO9knRibDakJTPhKsrPhObicUA/600?n=1","score":0,"dissid":"7027216410","createtime":"2019-06-06","creator":{"qq":2717056190,"avatarUrl":"","encrypt_uin":"owS57ink7w6qon**","name":"热云赫赫拉","followflag":0,"type":0,"isVip":0},"listennum":245606,"dissname":"「华研」选秀歌手合集","commit_time":"2019-06-06","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/lPMyCX1ybnfhZEbtP22TsLwoZkghEzlf7w4DAqUwNkmlbeLJsPTfZA/600?n=1","score":0,"dissid":"7022753020","createtime":"2019-06-03","creator":{"qq":1927552414,"avatarUrl":"","encrypt_uin":"oKEA7i4kowv57n**","name":"世俗","followflag":0,"type":0,"isVip":0},"listennum":324666,"dissname":"毕业季 : 时光荏苒，依稀如梦","commit_time":"2019-06-03","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/bglUEFSMMhA3eiblfHXvQRNICMnA5X4d11lqLnmwguvQ2ZmyBicwK70Q/600?n=1","score":0,"dissid":"4246958569","createtime":"2019-06-04","creator":{"qq":1653099231,"avatarUrl":"","encrypt_uin":"oKCkoinqNK-iov**","name":"不白","followflag":0,"type":0,"isVip":0},"listennum":347206,"dissname":"【入耳沉醉】 猝不及防的心动","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/jCPNL5FMs23Uk4XAo5aTmbibhjqPyChZOF27ZqOtlJDohxpnueufrqA/600?n=1","score":0,"dissid":"7027231106","createtime":"2019-06-06","creator":{"qq":2717056190,"avatarUrl":"","encrypt_uin":"owS57ink7w6qon**","name":"热云赫赫拉","followflag":0,"type":0,"isVip":0},"listennum":458072,"dissname":"「华研」影视剧原声合集","commit_time":"2019-06-06","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/KetjXWSVppvyrVJfzfdpib8IHrSyxErPrUAuMPO1zicorOlLNjVG8McA/600?n=1","score":0,"dissid":"7025242624","createtime":"2019-06-05","creator":{"qq":55894433,"avatarUrl":"","encrypt_uin":"7K4FNKvPoio*","name":"QQ音乐VIP","followflag":0,"type":6,"isVip":6},"listennum":304237,"dissname":"欧美励志 | 梦想是来自宙斯的礼物","commit_time":"2019-06-05","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/0yiaX8d9LSmnROyId1RsUU3XmFaXdcLzoZNPVklia4NZ7iaIuIbZtJnoQ/600?n=1","score":0,"dissid":"2368296852","createtime":"2017-11-07","creator":{"qq":707665875,"avatarUrl":"","encrypt_uin":"7inl7wCkNeSk","name":"爱听歌的兽gr","followflag":0,"type":2,"isVip":2},"listennum":995206,"dissname":"高 考 后 的 康 复 歌 单","commit_time":"2017-11-07","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/lYiaEbscaryrFiaicJFp8euubSTTrkvUetZcS3ndnw6YBf6kACdgXgE7g/600?n=1","score":0,"dissid":"7023369140","createtime":"2019-06-03","creator":{"qq":1060444681,"avatarUrl":"","encrypt_uin":"oKnsoevP7eCFov**","name":"是硬糖啊","followflag":0,"type":2,"isVip":2},"listennum":160078,"dissname":"余音袅袅 · 国风哼唱里的情愫","commit_time":"2019-06-03","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/lYiaEbscaryrFiaicJFp8euuUDkKFIqP1ZjoRa0X8jYgn8qgSnQvstWKA/600?n=1","score":0,"dissid":"7019488378","createtime":"2019-06-05","creator":{"qq":1060444681,"avatarUrl":"","encrypt_uin":"oKnsoevP7eCFov**","name":"是硬糖啊","followflag":0,"type":2,"isVip":2},"listennum":219151,"dissname":"民谣情信 : 予你手心的温暖","commit_time":"2019-06-05","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/8HhavvWNIicpyjlv0UnT5TQicNiadGKE87DXZWu9ibwHDiafpKKd3kJGicsg/600?n=1","score":0,"dissid":"6678579886","createtime":"2019-02-27","creator":{"qq":478695379,"avatarUrl":"","encrypt_uin":"7eSF7wEkoiSq","name":"DJ顾念晨","followflag":0,"type":3,"isVip":3},"listennum":1766602,"dissname":"大型高考冲刺现场！都给我冲鸭！","commit_time":"2019-02-27","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/KaFn5hQACzzVeLFOc4hamAyIL8gMZzaVJdBu6uwyOABMLUz8ICc7wg/600?n=1","score":0,"dissid":"7025269531","createtime":"2019-06-06","creator":{"qq":3300733760,"avatarUrl":"","encrypt_uin":"oiozoeSioiSson**","name":"冰的唐葫芦","followflag":0,"type":2,"isVip":2},"listennum":1030726,"dissname":"端午赏 · 轻柔温婉国风集","commit_time":"2019-06-06","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/K6CEv0Hv9DcRopdMZUDephk4ZKxVQ8KNOur3WktGKuhVfx65A9JO3g/600?n=1","score":0,"dissid":"6944634962","createtime":"2019-06-05","creator":{"qq":88480387,"avatarUrl":"","encrypt_uin":"NecPNeniNeS*","name":"World · 炎","followflag":0,"type":0,"isVip":0},"listennum":293508,"dissname":"00后童年记忆 : 怀念旧时动画","commit_time":"2019-06-05","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Uj77DagTFgiccudSicYvppRj0z5XbvXtwYgvshFEJBSK3HA9CciaUibG4g/600?n=1","score":0,"dissid":"3751500151","createtime":"2019-06-05","creator":{"qq":919820535,"avatarUrl":"","encrypt_uin":"NK6qNe-z7Kok","name":"Lee BG嗷柏","followflag":0,"type":2,"isVip":2},"listennum":93732,"dissname":"Trip跳：风格另类的说唱嘻哈","commit_time":"2019-06-05","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/uPA58W8yiam1c76QzvzYgL6iaic1MdpzDxEJiad1IhBh30lrBibCljBp04w/600?n=1","score":0,"dissid":"7024376622","createtime":"2019-06-04","creator":{"qq":2979842415,"avatarUrl":"","encrypt_uin":"owElNKcPowv57v**","name":"桃Tao音乐志","followflag":0,"type":2,"isVip":2},"listennum":229313,"dissname":"Billboard 2019上半年最佳50专","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Gh1XgWazibYlbuPicu2mQqzBVz6bF6UzCBOduZUdE7m2INH76E8I2UwA/600?n=1","score":0,"dissid":"7021698062","createtime":"2019-06-03","creator":{"qq":1173585965,"avatarUrl":"","encrypt_uin":"oK6loi4F7KEs7v**","name":"木焓","followflag":0,"type":2,"isVip":2},"listennum":333438,"dissname":"2019年网络流行语的歌","commit_time":"2019-06-03","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/aaxX4Babic4VicBPicJOwr5xia9JlSv0tkIM8c2gXWYh8e8fs54Wx4HK8g/600?n=1","score":0,"dissid":"3784914382","createtime":"2018-04-12","creator":{"qq":1600189472,"avatarUrl":"","encrypt_uin":"oKCzoe6FNKvloc**","name":"Music Fans","followflag":0,"type":2,"isVip":2},"listennum":889022,"dissname":"励志电子：濒临绝望时的一道曙光","commit_time":"2018-04-12","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/ibJJngZRP5m8ksRvDkGZxdcTjKvwic4LFLmx6NNVNRnXWDZXqLzFictBw/600?n=1","score":0,"dissid":"7024582292","createtime":"2019-06-06","creator":{"qq":793407810,"avatarUrl":"","encrypt_uin":"7iEi7enlNe6z","name":"谈谈心恋恋爱 *","followflag":0,"type":2,"isVip":2},"listennum":382247,"dissname":"静心民谣：夏日清凉专享","commit_time":"2019-06-06","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/HZnqT8B6sibc2iaxSb6biaOAYBrSTAzPZAUPgFcFvcaKWqbwbatzEqNiag/600?n=1","score":0,"dissid":"7023269050","createtime":"2019-06-04","creator":{"qq":3490786195,"avatarUrl":"","encrypt_uin":"oivqoeSF7w6q7v**","name":"允许部分冷门先热起来","followflag":0,"type":0,"isVip":0},"listennum":353014,"dissname":"民谣 · 我把时光写成歌","commit_time":"2019-06-04","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/bExxovQqJ1rzMJ7pblQUuyDlg0zAqV3RNBmlenykT23M6QvvI0Txng/600?n=1","score":0,"dissid":"7023320174","createtime":"2019-06-03","creator":{"qq":3527181498,"avatarUrl":"","encrypt_uin":"oi4A7i6FoKvqNn**","name":"LAN费曼","followflag":0,"type":0,"isVip":0},"listennum":254104,"dissname":"经典不插电现场：原声也摇滚","commit_time":"2019-06-03","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/drZnBOxDNzaK3s5ZzZNDxYDtFaQfwQaH4vWGvr6UQk1L3GYlPrsgAA/600?n=1","score":0,"dissid":"7012019442","createtime":"2019-05-31","creator":{"qq":497974908,"avatarUrl":"","encrypt_uin":"7eElNKSPNKnF","name":"Etc in the great","followflag":0,"type":2,"isVip":2},"listennum":90533,"dissname":"狂暴轰响 · Frenchcore","commit_time":"2019-05-31","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/uPA58W8yiam1c76QzvzYgL6iaic1MdpzDxEaiab1pI3N37qRMpeibHeQgUg/600?n=1","score":0,"dissid":"7020075250","createtime":"2019-06-01","creator":{"qq":2979842415,"avatarUrl":"","encrypt_uin":"owElNKcPowv57v**","name":"桃Tao音乐志","followflag":0,"type":2,"isVip":2},"listennum":252221,"dissname":"S.H.E华语第一女团金曲全集","commit_time":"2019-06-01","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/JGWy4hDbeHGB4lAPwcanXGibtxtlhT8DtVOpZcvXgsNuI0NcBIe4MfA/600?n=1","score":0,"dissid":"6998651574","createtime":"2019-05-31","creator":{"qq":2822129197,"avatarUrl":"","encrypt_uin":"owcAow6ANK6q7z**","name":"故里","followflag":0,"type":0,"isVip":0},"listennum":341900,"dissname":"古风仙女嗓 · 我愿醉在这声音里","commit_time":"2019-05-31","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Fe6emiag6IuVbMib3oN6yctavBAUviamrjRicF8Z5D5atLIxtt10UQD2fw/600?n=1","score":0,"dissid":"7012831061","createtime":"2019-05-31","creator":{"qq":2407142727,"avatarUrl":"","encrypt_uin":"owvz7i6PowSA7z**","name":"就是一个听歌der","followflag":0,"type":2,"isVip":2},"listennum":399660,"dissname":"解压音药 · 耳内按摩赶走烦躁","commit_time":"2019-05-31","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/MhQ4bJBPt3Yt5icXyBGNhyGYDbBG6xZetyVuMGco4cOX7TaMEzkL9Yw/600?n=1","score":0,"dissid":"3757863512","createtime":"2018-07-25","creator":{"qq":452775188,"avatarUrl":"","encrypt_uin":"7e4A7iSkoKcF","name":"还不是因为你长得不好看","followflag":0,"type":2,"isVip":2},"listennum":10810637,"dissname":"缓解焦虑的日系纯音","commit_time":"2018-07-25","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/20Dr6sBicc57lmu46SAQthvDtT3IPXWShCvJfrat9qmH1fibKMiccUJhw/600?n=1","score":0,"dissid":"7002753531","createtime":"2019-05-24","creator":{"qq":819975016,"avatarUrl":"","encrypt_uin":"Ne6qNKSkoe6s","name":"像雾像雨又像风","followflag":0,"type":0,"isVip":0},"listennum":134405,"dissname":"弹跳模式 \u2022 狂热Future Bounce","commit_time":"2019-05-24","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Xewa2JUmZ1rQd7ZeuBIZX7tWwy41kStKbwRawhYBbSuVibj5ReccgPw/600?n=1","score":0,"dissid":"6998375386","createtime":"2019-05-25","creator":{"qq":86409274,"avatarUrl":"","encrypt_uin":"NeCPoeEA7iv*","name":"离歌","followflag":0,"type":0,"isVip":0},"listennum":199526,"dissname":"初夏｜宁静之间流动的缱绻时光","commit_time":"2019-05-25","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/JGWy4hDbeHGB4lAPwcanXIW0FIO3EuDWWk91B63nyyOibFgBDZMLTaQ/600?n=1","score":0,"dissid":"7000646175","createtime":"2019-05-24","creator":{"qq":2822129197,"avatarUrl":"","encrypt_uin":"owcAow6ANK6q7z**","name":"故里","followflag":0,"type":0,"isVip":0},"listennum":610762,"dissname":"影视歌曲 · 如果思念会说话","commit_time":"2019-05-24","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/xKbkocaBytGNfiaxCrPF7a7zdUUHn7JeO0RX0R5UcNRGviaqiau26414g/600?n=1","score":0,"dissid":"4974071442","createtime":"2018-10-17","creator":{"qq":1468388760,"avatarUrl":"","encrypt_uin":"oKvsNeoFNeSson**","name":"Smile","followflag":0,"type":2,"isVip":2},"listennum":739930,"dissname":"韩系R&B美声，摇曳酒杯里的威士忌","commit_time":"2018-10-17","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/SXTicaprnQbfAyiaibTsguPlEIia7xIjmV0rAZezIWIlQxkJLlQL9FzxicQ/600?n=1","score":0,"dissid":"1727562186","createtime":"2018-11-12","creator":{"qq":2640839003,"avatarUrl":"","encrypt_uin":"owCPoeciNKnzoz**","name":"毕业雨季","followflag":0,"type":2,"isVip":2},"listennum":3628945,"dissname":"30部真人奇幻冒险电影原声鉴赏","commit_time":"2018-11-12","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Fe6emiag6IuVbMib3oN6yctVHBicjUJMLI5R8LI7CNnILLQd8LMhBPWug/600?n=1","score":0,"dissid":"6967504715","createtime":"2019-05-08","creator":{"qq":2407142727,"avatarUrl":"","encrypt_uin":"owvz7i6PowSA7z**","name":"就是一个听歌der","followflag":0,"type":2,"isVip":2},"listennum":569094,"dissname":"华语说唱 · 堵在路上也要酷","commit_time":"2019-05-08","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/vWuLw7pgtD9Rts157EocyOw4f97nHqtj6SPiao8jaDwlv7iaiaGt4cLKw/600?n=1","score":0,"dissid":"7013848675","createtime":"2019-05-30","creator":{"qq":3231344116,"avatarUrl":"","encrypt_uin":"oi-ioKoP7e657c**","name":"斯国一咧","followflag":0,"type":0,"isVip":0},"listennum":182157,"dissname":"【ACG治愈】即使孤单也要温柔","commit_time":"2019-05-30","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/aaxX4Babic4VicBPicJOwr5xlmE4icb0CZbcfu4QTia4fE9ghFjkq82icibqg/600?n=1","score":0,"dissid":"4659497191","createtime":"2019-03-25","creator":{"qq":1600189472,"avatarUrl":"","encrypt_uin":"oKCzoe6FNKvloc**","name":"Music Fans","followflag":0,"type":2,"isVip":2},"listennum":77514,"dissname":"Melodic Bass｜悠游臆想幻境","commit_time":"2019-03-25","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/X9lmt3gQ1KkaezXF13jX30mTt22GJOibKVWLorcvcVic5HTMkVGkjrpg/600?n=1","score":0,"dissid":"5372758242","createtime":"2018-11-09","creator":{"qq":1079096147,"avatarUrl":"","encrypt_uin":"oKnlNKnq7w6P7z**","name":"蘑菇","followflag":0,"type":2,"isVip":2},"listennum":2090657,"dissname":"怀念你，是我最终爱你的方式","commit_time":"2018-11-09","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/XkvoO3t2zBy0z9cupUMtqtYwM5A3t5FAQCkicz8ZQvd6QlDFg8jpXgw/600?n=1","score":0,"dissid":"6938020960","createtime":"2019-04-23","creator":{"qq":359975977,"avatarUrl":"","encrypt_uin":"oi4qNKSkNKSl","name":"Nali","followflag":0,"type":2,"isVip":2},"listennum":245438,"dissname":"电音早餐 | 请查收今日份元气弹~","commit_time":"2019-04-23","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/gu6Yf5YflwkKK1xnz7gjxUYV8TWWHjGHhzt4r2lnSc8DoGfGMYyjuw/600?n=1","score":0,"dissid":"5519081958","createtime":"2018-11-14","creator":{"qq":2098173770,"avatarUrl":"","encrypt_uin":"ownqNe6loiSlon**","name":"西斯洛弗。Lam","followflag":0,"type":0,"isVip":0},"listennum":2600950,"dissname":"鬼才林振强笔下的粤语作品 ","commit_time":"2018-11-14","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Ye8xJJLS3zf0lX5xTNk0TB9tPkgKFNGSo9Y43PAibsRk7equapt7aOA/600?n=1","score":0,"dissid":"6585939787","createtime":"2019-05-29","creator":{"qq":1047366248,"avatarUrl":"","encrypt_uin":"oKnP7ios7w-PNn**","name":"薄荷凉","followflag":0,"type":0,"isVip":0},"listennum":508669,"dissname":"校园系列原声收录：我只喜欢你","commit_time":"2019-05-29","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/A3K6WU7EtiaOWXPWe0T7icH8B64G5miaZlibHKOsRwvvkR7xkt2VibWghOg/600?n=1","score":0,"dissid":"6749246314","createtime":"2019-02-26","creator":{"qq":1347165922,"avatarUrl":"","encrypt_uin":"oKoP7i6s7KEAoc**","name":"枯燥的读书人","followflag":0,"type":2,"isVip":2},"listennum":934991,"dissname":"《东宫》小说改编类古装电视剧原声","commit_time":"2019-02-26","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/R8unPZMA4Vp5v2Ms96bstyGEL0FSQnl1zPYOWcshOCmgq0aShyWDjw/600?n=1","score":0,"dissid":"6915377372","createtime":"2019-04-02","creator":{"qq":945187827,"avatarUrl":"","encrypt_uin":"NKvkoKclNe-l","name":"念安娜","followflag":0,"type":2,"isVip":2},"listennum":1311829,"dissname":"耳边软语：小憩时的温柔情歌 ","commit_time":"2019-04-02","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/qhuJFHlwiayRp1rhWoJk9HcgmiasAWicWF2gVBXb4JmlPnFscdYj70SAA/600?n=1","score":0,"dissid":"6021632883","createtime":"2018-12-19","creator":{"qq":3413833718,"avatarUrl":"","encrypt_uin":"oiv5oicioiS5Nn**","name":"腾讯音乐人","followflag":0,"type":2,"isVip":2},"listennum":1665645,"dissname":"华语R&B | 谁的嗓音俘虏你耳朵？","commit_time":"2018-12-19","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/z6iaBQ7jDmibXhEAlvTSQvnibQNGcNTuFItpyceibxeCroDgicozjUpm1qQ/600?n=1","score":0,"dissid":"1485413519","createtime":"2019-05-27","creator":{"qq":2507798282,"avatarUrl":"","encrypt_uin":"ow4z7iSqNe-Foc**","name":"尐尐","followflag":0,"type":0,"isVip":0},"listennum":109037,"dissname":"午间休憩 \u2022 缓拍慵懒爵士","commit_time":"2019-05-27","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/FrdAUicrPIibdU7cus4HYv0cbOJicI7ibYfIXQ3JkxZBg4pIk23NfwY25g/600?n=1","score":0,"dissid":"6966427368","createtime":"2019-05-26","creator":{"qq":33914824,"avatarUrl":"","encrypt_uin":"oioqoKvFowv*","name":"♂酷约翰♀","followflag":0,"type":0,"isVip":0},"listennum":161359,"dissname":"欧美电子：释放你的能量","commit_time":"2019-05-26","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/ib5u1yLjrIls7cqVwYRpW6qYVPex21O4tXqckrWOeB0WBl2yfLCcyow/600?n=1","score":0,"dissid":"3726293213","createtime":"2019-03-27","creator":{"qq":2909946281,"avatarUrl":"","encrypt_uin":"owEzNKEP7w-Fov**","name":"Lin衾浅","followflag":0,"type":2,"isVip":2},"listennum":454538,"dissname":"恋爱微醺 | 少女の微暖心事谱","commit_time":"2019-03-27","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/AhbCa0vazSRDjEJhYwthguicp6JicrknibesE5cVy4aTxWx5PVo47sOicQ/600?n=1","score":0,"dissid":"6987481844","createtime":"2019-05-22","creator":{"qq":1747907171,"avatarUrl":"","encrypt_uin":"oKSP7iEz7i6lov**","name":"鹿仁","followflag":0,"type":2,"isVip":2},"listennum":1090311,"dissname":"伤感情歌 · 害怕遇见下个你","commit_time":"2019-05-22","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/drZnBOxDNzaK3s5ZzZNDxev40uTEwIkOZ4emHBEGjAR4icLSVWIqiaxA/600?n=1","score":0,"dissid":"6949224821","createtime":"2019-05-20","creator":{"qq":497974908,"avatarUrl":"","encrypt_uin":"7eElNKSPNKnF","name":"Etc in the great","followflag":0,"type":2,"isVip":2},"listennum":520236,"dissname":"Downtempo丨悠缓节奏 秘境隐逸","commit_time":"2019-05-20","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/O7jWchh5tkOicJBz1xFCAv5Eum6O7Hrj2Lg4AMZ8ElwWvR9ICicA3o7A/600?n=1","score":0,"dissid":"6915990178","createtime":"2019-05-01","creator":{"qq":535710046,"avatarUrl":"","encrypt_uin":"7Kok7i6zoevs","name":"ca.sa.do.^^","followflag":0,"type":0,"isVip":0},"listennum":397012,"dissname":"韩系安利 : 专属于你的慵懒男友音","commit_time":"2019-05-01","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Xewa2JUmZ1rQd7ZeuBIZX66x9jiaV4FMGovgibtajLVMItlREEhEaXmw/600?n=1","score":0,"dissid":"7001373792","createtime":"2019-05-28","creator":{"qq":86409274,"avatarUrl":"","encrypt_uin":"NeCPoeEA7iv*","name":"离歌","followflag":0,"type":0,"isVip":0},"listennum":270573,"dissname":"成年人脆弱疗愈指南","commit_time":"2019-05-28","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/JqedGFGJsxS0zcnIkPtxO4BribfZQ54agGObuiboJjJTjmYlxY5ceeiaw/600?n=1","score":0,"dissid":"5341539480","createtime":"2019-05-20","creator":{"qq":1596944080,"avatarUrl":"","encrypt_uin":"oK4q7wEP7enFon**","name":"爱时乐c","followflag":0,"type":2,"isVip":2},"listennum":850769,"dissname":"入耳即醉！ 百首治愈向英文翻唱","commit_time":"2019-05-20","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/amD8XDvFG8ClIJ5Hib0U0jZkcKegBbM5fsrma6nunFzxJ7YEBCb9Yxw/600?n=1","score":0,"dissid":"3831035004","createtime":"2019-05-28","creator":{"qq":1214673117,"avatarUrl":"","encrypt_uin":"oK-57eCloi657z**","name":"小攀哟","followflag":0,"type":0,"isVip":0},"listennum":2753054,"dissname":"2019网络歌曲新歌分享","commit_time":"2019-05-28","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/z6iaBQ7jDmibXhEAlvTSQvn3NvzUNLbhadjv5VNRbycOQCQicBaaJRs6w/600?n=1","score":0,"dissid":"3857708989","createtime":"2019-05-27","creator":{"qq":2507798282,"avatarUrl":"","encrypt_uin":"ow4z7iSqNe-Foc**","name":"尐尐","followflag":0,"type":0,"isVip":0},"listennum":322325,"dissname":"浮躁宁静剂 \u2022 Alternative","commit_time":"2019-05-27","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/nvRBiaJHaPBvG00iczEYfbu6ycUt5m5WCv2ptDepzmEu0NWzeXcApN4A/600?n=1","score":0,"dissid":"7000539108","createtime":"2019-05-27","creator":{"qq":467638189,"avatarUrl":"","encrypt_uin":"7eCl7woFoKcq","name":"蜜糖男孩","followflag":0,"type":2,"isVip":2},"listennum":134673,"dissname":"一秒动心 · 柠檬味爱情","commit_time":"2019-05-27","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/Q2BbehalbX9rf2ZwicYKia2EM69W8VMPOA6AWADeXsicfG4T5YPG28HCg/600?n=1","score":0,"dissid":"6916352693","createtime":"2019-04-02","creator":{"qq":3292495280,"avatarUrl":"","encrypt_uin":"oi-qowvq7K-Fon**","name":"桥环野の贰狗","followflag":0,"type":2,"isVip":2},"listennum":123891,"dissname":"《路人超能100》合集（两季全）","commit_time":"2019-04-02","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/ibJJngZRP5m8ksRvDkGZxdXkvbyaurhddQGibEpzhNAfqoNJNe3zv8Tw/600?n=1","score":0,"dissid":"6998756204","createtime":"2019-05-24","creator":{"qq":793407810,"avatarUrl":"","encrypt_uin":"7iEi7enlNe6z","name":"谈谈心恋恋爱 *","followflag":0,"type":2,"isVip":2},"listennum":215776,"dissname":"假日煲剧：2019上半年韩剧指南","commit_time":"2019-05-24","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/llTQ9l2AeicK2OLIORnsUdn18ibOl9hH8HvS61zjRvzdMibhpyHBZcv2Q/600?n=1","score":0,"dissid":"6977925827","createtime":"2019-05-24","creator":{"qq":348361207,"avatarUrl":"","encrypt_uin":"oivFoiC5ownl","name":"风少","followflag":0,"type":2,"isVip":2},"listennum":325518,"dissname":"欧美流行 ：情绪燃料供给站","commit_time":"2019-05-24","version":0,"introduction":""},{"imgurl":"http://p.qpic.cn/music_cover/fPn0iapLleUFx4kZhMPupPufEFBz3rvcmqn37qk3N1DIJmNaNbHElzQ/600?n=1","score":0,"dissid":"7011264340","createtime":"2019-05-28","creator":{"qq":3521419564,"avatarUrl":"","encrypt_uin":"oi4AoKv5NK4s7n**","name":"穿着皮鞋跳大神","followflag":0,"type":0,"isVip":0},"listennum":78043,"dissname":"电子 · 房间里的单人舞池","commit_time":"2019-05-28","version":0,"introduction":""}]
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
             * imgurl : http://p.qpic.cn/music_cover/AhbCa0vazSRDjEJhYwthgnyK8lEX3rbRP7gMoGPy1CM9UoNyZk1HkQ/600?n=1
             * score : 0.0
             * dissid : 6967377538
             * createtime : 2019-06-04
             * creator : {"qq":1747907171,"avatarUrl":"","encrypt_uin":"oKSP7iEz7i6lov**","name":"鹿仁","followflag":0,"type":2,"isVip":2}
             * listennum : 266442
             * dissname : 清新民谣 · 让夏日不再燥热
             * commit_time : 2019-06-04
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
                 * qq : 1747907171
                 * avatarUrl :
                 * encrypt_uin : oKSP7iEz7i6lov**
                 * name : 鹿仁
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
