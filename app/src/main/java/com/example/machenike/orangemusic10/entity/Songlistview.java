package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;
import com.google.gson.annotations.SerializedName;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;

@HttpResponse(parser = JsonRespondParse.class)
public class Songlistview implements Serializable {
    /**
     * code : 200
     * msg : OK
     * timestamp : 1560433296623
     * data : [{"isdj":0,"singermid":"","song_begin":0,"songnum":20,"encrypt_uin":"oivqoeSF7w6q7v**","likeit":0,"scoreusercount":0,"login":"oi6soiEq7i6*","mtime":0,"type":0,"isvip":0,"nick":"允许部分冷门先热起来","coveradurl":"","pic_mid":"","songids":"232854804,230625028,230433750,224822696,228713280,232408064,231273687,231626996,225047009,228657345,232396088,219058446,231628610,218763525,225098794,228945474,228657310,218955978,3587677,219645861","nickname":"允许部分冷门先热起来","ctime":1559629926,"dissname":"浅唱低吟，悠悠古韵之美","logo":"http://p.qpic.cn/music_cover/HZnqT8B6sibc2iaxSb6biaOAYBrSTAzPZAUUHu2iaTuQIicH3jfCn0nChJA/300?n=1","cmtnum":0,"dirid":6,"uin":"3490786195","isAd":0,"scoreavage":"0.0","cur_song_num":20,"dissid":7024415,"buynum":0,"cm_count":8,"headurl":"http://thirdqq.qlogo.cn/g?b=sdk&k=KoIDJgS9FPEXf2Oj2EFHCQ&s=140&t=1558489857","songtypes":"3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3","total_song_num":20,"disstid":"7024415872","owndir":0,"album_pic_mid":"","ifpicurl":"","pic_dpi":300,"tags":[{"name":"国语","pid":165,"id":165},{"name":"古风","pid":194,"id":194},{"name":"中国风","pid":145,"id":145}],"visitnum":255225,"singerid":0,"dir_show":1,"disstype":0,"dir_pic_url2":"","song_update_time":0,"song_update_num":0,"songlist":[{"singer":[{"name":"晓月老板","mid":"002dwW8C3cQtmC","id":1021787,"title":"晓月老板"}],"fnote":4009,"mid":"001hSVTk3F0guF","language":0,"title":"青玉案·元夕","type":0,"file":{"size_320mp3":8715712,"size_96aac":2653748,"size_aac":1328236,"size_dts":0,"size_128":3486415,"try_end":199720,"e_30s":60000,"b_30s":0,"size_24aac":678030,"size_48aac":1328236,"size_320":8715712,"try_begin":155387,"size_128mp3":3486415,"size_192aac":5273201,"size_ogg":5021953,"size_flac":20305622,"media_mid":"001hSVTk3F0guF","size_ape":0,"size_192ogg":5021953,"size_try":960887},"genre":0,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"002InPMf0yiVvw","id":0},"index_cd":0,"id":232854804,"songtype":3,"isonly":1,"album":{"subtitle":"","name":"行走歌谣（原力计划合辑Ⅲ）","mid":"000Ubh172DFozI","id":6923032,"title":"行走歌谣（原力计划合辑Ⅲ）"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/244854804.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-05-29","subtitle":"","name":"青玉案·元夕","interval":217,"index_album":11,"status":0},{"singer":[{"name":"欧阳耀莹","mid":"002xniyG2Zeszn","id":2090069,"title":"欧阳耀莹"}],"fnote":4009,"mid":"004BZ3m20riJiG","language":0,"title":"殇玉环","type":0,"file":{"size_320mp3":13068750,"size_96aac":3977679,"size_aac":1986739,"size_dts":0,"size_128":5227627,"try_end":123332,"e_30s":0,"b_30s":0,"size_24aac":1011887,"size_48aac":1986739,"size_320":13068750,"try_begin":62728,"size_128mp3":5227627,"size_192aac":7892009,"size_ogg":7264441,"size_flac":73542108,"media_mid":"004BZ3m20riJiG","size_ape":0,"size_192ogg":7264441,"size_try":0},"genre":1,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"000rY8X40LNPwk","id":0},"index_cd":0,"id":230625028,"songtype":3,"isonly":1,"album":{"subtitle":"","name":"地心游记（原力计划合辑Ⅰ）","mid":"003GFD1D232z4m","id":6524308,"title":"地心游记（原力计划合辑Ⅰ）"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/242625028.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-03-29","subtitle":"","name":"殇玉环","interval":326,"index_album":8,"status":0},{"singer":[{"name":"艾辰","mid":"000985uR2CKS2P","id":1327483,"title":"艾辰"}],"fnote":4009,"mid":"003oy6Kq3WgW61","language":0,"title":"东坡","type":0,"file":{"size_320mp3":10242277,"size_96aac":3126035,"size_aac":1560601,"size_dts":0,"size_128":4097023,"try_end":106340,"e_30s":0,"b_30s":0,"size_24aac":794493,"size_48aac":1560601,"size_320":10242277,"try_begin":79751,"size_128mp3":4097023,"size_192aac":6186475,"size_ogg":5899026,"size_flac":30915847,"media_mid":"003oy6Kq3WgW61","size_ape":0,"size_192ogg":5899026,"size_try":0},"genre":0,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"004SmI1w0HJGSZ","id":0},"index_cd":0,"id":230433750,"songtype":3,"isonly":1,"album":{"subtitle":"","name":"东坡","mid":"004eGnFU2KQKJF","id":6475150,"title":"东坡"},"mv":{"vid":"i00306pgyxh","id":1515822},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/242433750.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-03-23","subtitle":"","name":"东坡","interval":255,"index_album":1,"status":0},{"singer":[{"name":"一棵小葱","mid":"001TWN8Q441MGC","id":1518990,"title":"一棵小葱"},{"name":"戚琦","mid":"000uQY8r3rnB9Q","id":2154176,"title":"戚琦"}],"fnote":4009,"mid":"003aSoaV42KbMf","language":0,"title":"洛水近广寒","type":0,"file":{"size_320mp3":11136246,"size_96aac":3397138,"size_aac":1698333,"size_dts":0,"size_128":4454839,"try_end":160481,"e_30s":0,"b_30s":0,"size_24aac":865161,"size_48aac":1698333,"size_320":11136246,"try_begin":101376,"size_128mp3":4454839,"size_192aac":6743883,"size_ogg":6417498,"size_flac":30544602,"media_mid":"003aSoaV42KbMf","size_ape":0,"size_192ogg":6417498,"size_try":0},"genre":1,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"001WTwA74Uzwx7","id":0},"index_cd":0,"id":224822696,"songtype":3,"isonly":1,"album":{"subtitle":"","name":"洛水近广寒","mid":"00062ULq3EaClu","id":5540152,"title":"洛水近广寒"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream2.qqmusic.qq.com/236822696.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2018-12-13","subtitle":"","name":"洛水近广寒","interval":278,"index_album":1,"status":0},{"singer":[{"name":"莫以海之名","mid":"003HkthU2jyrqs","id":2119982,"title":"莫以海之名"}],"fnote":0,"mid":"0028VpLf0UdNYV","language":0,"title":"花间词","type":0,"file":{"size_320mp3":11827398,"size_96aac":3632725,"size_aac":1816669,"size_dts":0,"size_128":4731078,"try_end":118197,"e_30s":0,"b_30s":0,"size_24aac":924785,"size_48aac":1816669,"size_320":11827398,"try_begin":91501,"size_128mp3":4731078,"size_192aac":7175002,"size_ogg":6742771,"size_flac":30875647,"media_mid":"0028VpLf0UdNYV","size_ape":0,"size_192ogg":6742771,"size_try":0},"genre":12,"action":{"msgpay":0,"alert":11,"msgid":0,"icons":135752,"switch":605983},"ksong":{"mid":"003nlfZg36INbD","id":0},"index_cd":0,"id":228713280,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"花间词","mid":"003flOPE3NLZjz","id":6245350,"title":"花间词"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"url":"http://stream0.qqmusic.qq.com/240713280.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-02-08","subtitle":"","name":"花间词","interval":295,"index_album":1,"status":31},{"singer":[{"name":"夙夜未歌","mid":"001Lz4212jhBUO","id":1343184,"title":"夙夜未歌"}],"fnote":0,"mid":"000zwj2C17wMPU","language":0,"title":"宇舟烟渡","type":0,"file":{"size_320mp3":12862894,"size_96aac":3945634,"size_aac":1964054,"size_dts":0,"size_128":5145277,"try_end":0,"e_30s":0,"b_30s":0,"size_24aac":1000072,"size_48aac":1964054,"size_320":12862894,"try_begin":0,"size_128mp3":5145277,"size_192aac":7782255,"size_ogg":6994714,"size_flac":63072017,"media_mid":"000zwj2C17wMPU","size_ape":0,"size_192ogg":6994714,"size_try":0},"genre":12,"action":{"msgpay":0,"alert":11,"msgid":0,"icons":135752,"switch":605983},"ksong":{"mid":"0015yVaD1pgM28","id":0},"index_cd":0,"id":232408064,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"宇舟烟渡","mid":"0049c5lY0MiIcH","id":6861226,"title":"宇舟烟渡"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"url":"http://stream0.qqmusic.qq.com/244408064.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-05-18","subtitle":"","name":"宇舟烟渡","interval":321,"index_album":1,"status":31},{"singer":[{"name":"陈茂源","mid":"002l9ACP43ZVMZ","id":970789,"title":"陈茂源"}],"fnote":4009,"mid":"002zE8U92ui3Jz","language":0,"title":"白羊白羊","type":0,"file":{"size_320mp3":10893896,"size_96aac":3321446,"size_aac":1661398,"size_dts":0,"size_128":4357840,"try_end":150145,"e_30s":0,"b_30s":0,"size_24aac":846280,"size_48aac":1661398,"size_320":10893896,"try_begin":91097,"size_128mp3":4357840,"size_192aac":6575413,"size_ogg":5802394,"size_flac":28417302,"media_mid":"002zE8U92ui3Jz","size_ape":0,"size_192ogg":5802394,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17413891},"ksong":{"mid":"002WPWSq1xvnLI","id":0},"index_cd":0,"id":231273687,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"白羊白羊","mid":"0008gEhD47hxLy","id":6602121,"title":"白羊白羊"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/243273687.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-04-10","subtitle":"","name":"白羊白羊","interval":272,"index_album":1,"status":0},{"singer":[{"name":"谭杨","mid":"002QWZdI0CmJSh","id":3127596,"title":"谭杨"}],"fnote":4009,"mid":"001DPrWF2JibCQ","language":0,"title":"空杯","type":0,"file":{"size_320mp3":10846229,"size_96aac":3346868,"size_aac":1674339,"size_dts":0,"size_128":4338349,"try_end":253375,"e_30s":0,"b_30s":0,"size_24aac":850483,"size_48aac":1674339,"size_320":10846229,"try_begin":70346,"size_128mp3":4338349,"size_192aac":6580136,"size_ogg":5743364,"size_flac":0,"media_mid":"001DPrWF2JibCQ","size_ape":0,"size_192ogg":5743364,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17413891},"ksong":{"mid":"000sgF032hWli2","id":0},"index_cd":0,"id":231626996,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"空杯","mid":"002VDRrN0k67Jb","id":6660030,"title":"空杯"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/243626996.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-04-16","subtitle":"","name":"空杯","interval":271,"index_album":1,"status":0},{"singer":[{"name":"Winky诗","mid":"000aGmw90UirrR","id":62565,"title":"Winky诗"}],"fnote":0,"mid":"001TKCPQ31tOOV","language":0,"title":"离骚","type":0,"file":{"size_320mp3":10443951,"size_96aac":3156805,"size_aac":1579732,"size_dts":0,"size_128":4177698,"try_end":120134,"e_30s":0,"b_30s":0,"size_24aac":804824,"size_48aac":1579732,"size_320":10443951,"try_begin":72964,"size_128mp3":4177698,"size_192aac":6254963,"size_ogg":5544661,"size_flac":0,"media_mid":"001TKCPQ31tOOV","size_ape":0,"size_192ogg":5544661,"size_try":0},"genre":12,"action":{"msgpay":0,"alert":11,"msgid":0,"icons":135752,"switch":605975},"ksong":{"mid":"000xIJtx2jQUXI","id":0},"index_cd":0,"id":225047009,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"离骚","mid":"003rXwDy40tx9W","id":5569655,"title":"离骚"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"url":"http://stream0.qqmusic.qq.com/237047009.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2017-05-31","subtitle":"","name":"离骚","interval":261,"index_album":1,"status":31},{"singer":[{"name":"司南","mid":"0001CJGI3KUaN6","id":2169579,"title":"司南"}],"fnote":4009,"mid":"004MHZ922K3LKn","language":0,"title":"小女司南","type":0,"file":{"size_320mp3":5413537,"size_96aac":1661189,"size_aac":829057,"size_dts":0,"size_128":2165658,"try_end":62996,"e_30s":0,"b_30s":0,"size_24aac":420928,"size_48aac":829057,"size_320":5413537,"try_begin":40973,"size_128mp3":2165658,"size_192aac":3272819,"size_ogg":3066120,"size_flac":14252871,"media_mid":"004MHZ922K3LKn","size_ape":0,"size_192ogg":3066120,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17413891},"ksong":{"mid":"001CQA9u1DTl9V","id":0},"index_cd":0,"id":228657345,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"【大家新年快乐】小女司南","mid":"002Oybux31lQJG","id":6233404,"title":"【大家新年快乐】小女司南"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/240657345.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-02-05","subtitle":"","name":"小女司南","interval":135,"index_album":1,"status":0},{"singer":[{"name":"LunaLiu","mid":"000Acq0F39FioL","id":1521158,"title":"LunaLiu"},{"name":"空山原创音乐","mid":"002hgs3a42mPzL","id":3257173,"title":"空山原创音乐"}],"fnote":0,"mid":"002E31w93msWxn","language":0,"title":"醉梦叹浮生","type":0,"file":{"size_320mp3":11053140,"size_96aac":3409442,"size_aac":1705499,"size_dts":0,"size_128":4421382,"try_end":128960,"e_30s":0,"b_30s":0,"size_24aac":866290,"size_48aac":1705499,"size_320":11053140,"try_begin":77685,"size_128mp3":4421382,"size_192aac":6711581,"size_ogg":6365053,"size_flac":0,"media_mid":"002E31w93msWxn","size_ape":0,"size_192ogg":6365053,"size_try":0},"genre":12,"action":{"msgpay":0,"alert":11,"msgid":0,"icons":135752,"switch":605975},"ksong":{"mid":"003zn0Si1Thbuz","id":0},"index_cd":0,"id":232396088,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"醉梦叹浮生","mid":"003DccwK2VSBkt","id":6857540,"title":"醉梦叹浮生"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"url":"http://stream0.qqmusic.qq.com/244396088.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-05-17","subtitle":"","name":"醉梦叹浮生","interval":276,"index_album":1,"status":31},{"singer":[{"name":"左颜","mid":"003khD1E1r8che","id":968629,"title":"左颜"}],"fnote":4009,"mid":"004TcsSv0SYezr","language":0,"title":"幡灵迷境","type":0,"file":{"size_320mp3":9111746,"size_96aac":2772816,"size_aac":1387806,"size_dts":0,"size_128":3644840,"try_end":83616,"e_30s":0,"b_30s":0,"size_24aac":707603,"size_48aac":1387806,"size_320":9111746,"try_begin":52399,"size_128mp3":3644840,"size_192aac":5511135,"size_ogg":5099551,"size_flac":43425428,"media_mid":"004TcsSv0SYezr","size_ape":0,"size_192ogg":5099551,"size_try":0},"genre":37,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"003zQ73r2wNLZJ","id":0},"index_cd":0,"id":219058446,"songtype":3,"isonly":0,"album":{"subtitle":"《幡灵迷境》浸没式戏剧同名主题曲","name":"幡灵迷境","mid":"002bmG8x2SXOn5","id":4908294,"title":"幡灵迷境"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream4.qqmusic.qq.com/231058446.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2018-11-07","subtitle":"","name":"幡灵迷境","interval":227,"index_album":1,"status":0},{"singer":[{"name":"小时","mid":"0047INbz4Tra3U","id":1541046,"title":"小时"}],"fnote":4009,"mid":"002DPTIc42h0bT","language":0,"title":"荒年旧岁","type":0,"file":{"size_320mp3":10246465,"size_96aac":3139507,"size_aac":1566169,"size_dts":0,"size_128":4098703,"try_end":109888,"e_30s":0,"b_30s":0,"size_24aac":797212,"size_48aac":1566169,"size_320":10246465,"try_begin":82799,"size_128mp3":4098703,"size_192aac":6225764,"size_ogg":5894705,"size_flac":29308910,"media_mid":"002DPTIc42h0bT","size_ape":0,"size_192ogg":5894705,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17413891},"ksong":{"mid":"000PaK3j0GfK56","id":0},"index_cd":0,"id":231628610,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"荒年旧岁","mid":"000emeXp4Tu4Za","id":6660383,"title":"荒年旧岁"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/243628610.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-04-22","subtitle":"","name":"荒年旧岁","interval":256,"index_album":1,"status":0},{"singer":[{"name":"Mukyo木西","mid":"003ySyIW1YW4fU","id":1481775,"title":"Mukyo木西"}],"fnote":4009,"mid":"0007G6353B7iiC","language":0,"title":"诗经风雅颂","type":0,"file":{"size_320mp3":11267141,"size_96aac":3393250,"size_aac":1697516,"size_dts":0,"size_128":4507079,"try_end":128931,"e_30s":0,"b_30s":0,"size_24aac":870363,"size_48aac":1697516,"size_320":11267141,"try_begin":95680,"size_128mp3":4507079,"size_192aac":6694848,"size_ogg":6491498,"size_flac":0,"media_mid":"001Drnwd1tQUw0","size_ape":0,"size_192ogg":6491498,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17409795},"ksong":{"mid":"","id":0},"index_cd":0,"id":218763525,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"花鸟风月夜（第一期主题曲）","mid":"000vIdZZ3g9JnY","id":4739720,"title":"花鸟风月夜（第一期主题曲）"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/230763525.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2018-09-28","subtitle":"","name":"诗经风雅颂","interval":281,"index_album":1,"status":0},{"singer":[{"name":"Pig小优","mid":"002pjzm51CCh5v","id":2090192,"title":"Pig小优"}],"fnote":4009,"mid":"002EkWub1dEa2w","language":0,"title":"知蹊行","type":0,"file":{"size_320mp3":9079967,"size_96aac":2792267,"size_aac":1388264,"size_dts":0,"size_128":3632287,"try_end":112020,"e_30s":0,"b_30s":0,"size_24aac":708175,"size_48aac":1388264,"size_320":9079967,"try_begin":66327,"size_128mp3":3632287,"size_192aac":5500885,"size_ogg":5081205,"size_flac":24894286,"media_mid":"002EkWub1dEa2w","size_ape":0,"size_192ogg":5081205,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17413891},"ksong":{"mid":"003zb1bI3fc47e","id":0},"index_cd":0,"id":225098794,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"知蹊行（完美国际2师徒主题曲）","mid":"000W1yOT2E9cAK","id":5576256,"title":"知蹊行（完美国际2师徒主题曲）"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/237098794.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2018-12-13","subtitle":"","name":"知蹊行","interval":226,"index_album":1,"status":0},{"singer":[{"name":"水云汐Camus","mid":"001e8nKp4UQn5c","id":1522524,"title":"水云汐Camus"}],"fnote":4009,"mid":"002nKCNp4TWLKP","language":0,"title":"幸相逢","type":0,"file":{"size_320mp3":7678677,"size_96aac":2349356,"size_aac":1171885,"size_dts":0,"size_128":3071786,"try_end":77337,"e_30s":0,"b_30s":0,"size_24aac":599098,"size_48aac":1171885,"size_320":7678677,"try_begin":59986,"size_128mp3":3071786,"size_192aac":4660211,"size_ogg":4610327,"size_flac":21339562,"media_mid":"002nKCNp4TWLKP","size_ape":0,"size_192ogg":4610327,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17413891},"ksong":{"mid":"004QQiBk3nCAhD","id":0},"index_cd":0,"id":228945474,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"幸相逢","mid":"004CSjTB28ID9P","id":6286212,"title":"幸相逢"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/240945474.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-02-19","subtitle":"","name":"幸相逢","interval":191,"index_album":1,"status":0},{"singer":[{"name":"莫以海之名","mid":"003HkthU2jyrqs","id":2119982,"title":"莫以海之名"}],"fnote":0,"mid":"004Ar1L51BSspQ","language":0,"title":"湛","type":0,"file":{"size_320mp3":9317545,"size_96aac":2866880,"size_aac":1427397,"size_dts":0,"size_128":3727132,"try_end":100036,"e_30s":0,"b_30s":0,"size_24aac":727547,"size_48aac":1427397,"size_320":9317545,"try_begin":74401,"size_128mp3":3727132,"size_192aac":5667326,"size_ogg":5333705,"size_flac":25083361,"media_mid":"004Ar1L51BSspQ","size_ape":0,"size_192ogg":5333705,"size_try":0},"genre":12,"action":{"msgpay":0,"alert":11,"msgid":0,"icons":135752,"switch":605983},"ksong":{"mid":"000KbkUR00vmVM","id":0},"index_cd":0,"id":228657310,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"湛","mid":"000NaAaT0dE9J4","id":6233380,"title":"湛"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"url":"http://stream0.qqmusic.qq.com/240657310.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-01-23","subtitle":"","name":"湛","interval":232,"index_album":1,"status":31},{"singer":[{"name":"鸾音社","mid":"003oe0Gi4LoOZ3","id":2684565,"title":"鸾音社"}],"fnote":4009,"mid":"004S7Ge02WFK2M","language":0,"title":"南山悠然","type":0,"file":{"size_320mp3":8560934,"size_96aac":2613308,"size_aac":1305547,"size_dts":0,"size_128":3424537,"try_end":99568,"e_30s":0,"b_30s":0,"size_24aac":665898,"size_48aac":1305547,"size_320":8560934,"try_begin":75090,"size_128mp3":3424537,"size_192aac":5184237,"size_ogg":4964157,"size_flac":43252468,"media_mid":"003CIVwq0iwJOQ","size_ape":0,"size_192ogg":4964157,"size_try":0},"genre":1,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"001b0OwN3IOR1L","id":0},"index_cd":0,"id":218955978,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"南山悠然","mid":"000SRi3B08B4JU","id":4895687,"title":"南山悠然"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream7.qqmusic.qq.com/230955978.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2018-11-06","subtitle":"","name":"南山悠然","interval":213,"index_album":1,"status":0},{"singer":[{"name":"小曲儿","mid":"0038UP0n2geLf2","id":71108,"title":"小曲儿"}],"fnote":8013,"mid":"000yWApQ2BKqYf","language":0,"title":"红尘","type":0,"file":{"size_320mp3":10119433,"size_96aac":3094993,"size_aac":1611068,"size_dts":0,"size_128":4048562,"try_end":105248,"e_30s":0,"b_30s":0,"size_24aac":809934,"size_48aac":1611068,"size_320":10119433,"try_begin":65219,"size_128mp3":4048562,"size_192aac":5822721,"size_ogg":5463583,"size_flac":0,"media_mid":"000yWApQ2BKqYf","size_ape":0,"size_192ogg":5463583,"size_try":0},"genre":1,"action":{"msgpay":0,"alert":11,"msgid":0,"icons":135752,"switch":81687},"ksong":{"mid":"002qowSx2CJugj","id":0},"index_cd":0,"id":3587677,"songtype":3,"isonly":0,"album":{"subtitle":"《欲·黑鸢》原创游戏ED主题曲","name":"欲 黑鸢","mid":"000vWax81vuApc","id":1136314,"title":"欲 黑鸢"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"url":"http://stream4.qqmusic.qq.com/15587677.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2015-09-08","subtitle":"","name":"红尘","interval":252,"index_album":1,"status":0},{"singer":[{"name":"魏新雨","mid":"000LsFo136kIv4","id":39657,"title":"魏新雨"}],"fnote":4009,"mid":"004JqR300FlJ4T","language":0,"title":"梨花落","type":0,"file":{"size_320mp3":11004028,"size_96aac":3366674,"size_aac":1679540,"size_dts":0,"size_128":4401736,"try_end":127474,"e_30s":0,"b_30s":0,"size_24aac":856550,"size_48aac":1679540,"size_320":11004028,"try_begin":77707,"size_128mp3":4401736,"size_192aac":6641121,"size_ogg":6240847,"size_flac":31762253,"media_mid":"004JqR300FlJ4T","size_ape":0,"size_192ogg":6240847,"size_try":0},"genre":1,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"001NYBcH0iKlW9","id":0},"index_cd":0,"id":219645861,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"梨花落","mid":"003yVWVb0QSc3O","id":4951569,"title":"梨花落"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream9.qqmusic.qq.com/231645861.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2018-11-13","subtitle":"","name":"梨花落","interval":275,"index_album":1,"status":0}],"desc":"一曲古韵，梦回千古。在这些古色古香的词曲里，一点一点地感受歌曲里那些唯美之处。"}]
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

    public static class DataBean implements Serializable {
        /**
         * isdj : 0
         * singermid :
         * song_begin : 0
         * songnum : 20
         * encrypt_uin : oivqoeSF7w6q7v**
         * likeit : 0
         * scoreusercount : 0
         * login : oi6soiEq7i6*
         * mtime : 0
         * type : 0
         * isvip : 0
         * nick : 允许部分冷门先热起来
         * coveradurl :
         * pic_mid :
         * songids : 232854804,230625028,230433750,224822696,228713280,232408064,231273687,231626996,225047009,228657345,232396088,219058446,231628610,218763525,225098794,228945474,228657310,218955978,3587677,219645861
         * nickname : 允许部分冷门先热起来
         * ctime : 1559629926
         * dissname : 浅唱低吟，悠悠古韵之美
         * logo : http://p.qpic.cn/music_cover/HZnqT8B6sibc2iaxSb6biaOAYBrSTAzPZAUUHu2iaTuQIicH3jfCn0nChJA/300?n=1
         * cmtnum : 0
         * dirid : 6
         * uin : 3490786195
         * isAd : 0
         * scoreavage : 0.0
         * cur_song_num : 20
         * dissid : 7024415
         * buynum : 0
         * cm_count : 8
         * headurl : http://thirdqq.qlogo.cn/g?b=sdk&k=KoIDJgS9FPEXf2Oj2EFHCQ&s=140&t=1558489857
         * songtypes : 3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3
         * total_song_num : 20
         * disstid : 7024415872
         * owndir : 0
         * album_pic_mid :
         * ifpicurl :
         * pic_dpi : 300
         * tags : [{"name":"国语","pid":165,"id":165},{"name":"古风","pid":194,"id":194},{"name":"中国风","pid":145,"id":145}]
         * visitnum : 255225
         * singerid : 0
         * dir_show : 1
         * disstype : 0
         * dir_pic_url2 :
         * song_update_time : 0
         * song_update_num : 0
         * songlist : [{"singer":[{"name":"晓月老板","mid":"002dwW8C3cQtmC","id":1021787,"title":"晓月老板"}],"fnote":4009,"mid":"001hSVTk3F0guF","language":0,"title":"青玉案·元夕","type":0,"file":{"size_320mp3":8715712,"size_96aac":2653748,"size_aac":1328236,"size_dts":0,"size_128":3486415,"try_end":199720,"e_30s":60000,"b_30s":0,"size_24aac":678030,"size_48aac":1328236,"size_320":8715712,"try_begin":155387,"size_128mp3":3486415,"size_192aac":5273201,"size_ogg":5021953,"size_flac":20305622,"media_mid":"001hSVTk3F0guF","size_ape":0,"size_192ogg":5021953,"size_try":960887},"genre":0,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"002InPMf0yiVvw","id":0},"index_cd":0,"id":232854804,"songtype":3,"isonly":1,"album":{"subtitle":"","name":"行走歌谣（原力计划合辑Ⅲ）","mid":"000Ubh172DFozI","id":6923032,"title":"行走歌谣（原力计划合辑Ⅲ）"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/244854804.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-05-29","subtitle":"","name":"青玉案·元夕","interval":217,"index_album":11,"status":0},{"singer":[{"name":"欧阳耀莹","mid":"002xniyG2Zeszn","id":2090069,"title":"欧阳耀莹"}],"fnote":4009,"mid":"004BZ3m20riJiG","language":0,"title":"殇玉环","type":0,"file":{"size_320mp3":13068750,"size_96aac":3977679,"size_aac":1986739,"size_dts":0,"size_128":5227627,"try_end":123332,"e_30s":0,"b_30s":0,"size_24aac":1011887,"size_48aac":1986739,"size_320":13068750,"try_begin":62728,"size_128mp3":5227627,"size_192aac":7892009,"size_ogg":7264441,"size_flac":73542108,"media_mid":"004BZ3m20riJiG","size_ape":0,"size_192ogg":7264441,"size_try":0},"genre":1,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"000rY8X40LNPwk","id":0},"index_cd":0,"id":230625028,"songtype":3,"isonly":1,"album":{"subtitle":"","name":"地心游记（原力计划合辑Ⅰ）","mid":"003GFD1D232z4m","id":6524308,"title":"地心游记（原力计划合辑Ⅰ）"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/242625028.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-03-29","subtitle":"","name":"殇玉环","interval":326,"index_album":8,"status":0},{"singer":[{"name":"艾辰","mid":"000985uR2CKS2P","id":1327483,"title":"艾辰"}],"fnote":4009,"mid":"003oy6Kq3WgW61","language":0,"title":"东坡","type":0,"file":{"size_320mp3":10242277,"size_96aac":3126035,"size_aac":1560601,"size_dts":0,"size_128":4097023,"try_end":106340,"e_30s":0,"b_30s":0,"size_24aac":794493,"size_48aac":1560601,"size_320":10242277,"try_begin":79751,"size_128mp3":4097023,"size_192aac":6186475,"size_ogg":5899026,"size_flac":30915847,"media_mid":"003oy6Kq3WgW61","size_ape":0,"size_192ogg":5899026,"size_try":0},"genre":0,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"004SmI1w0HJGSZ","id":0},"index_cd":0,"id":230433750,"songtype":3,"isonly":1,"album":{"subtitle":"","name":"东坡","mid":"004eGnFU2KQKJF","id":6475150,"title":"东坡"},"mv":{"vid":"i00306pgyxh","id":1515822},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/242433750.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-03-23","subtitle":"","name":"东坡","interval":255,"index_album":1,"status":0},{"singer":[{"name":"一棵小葱","mid":"001TWN8Q441MGC","id":1518990,"title":"一棵小葱"},{"name":"戚琦","mid":"000uQY8r3rnB9Q","id":2154176,"title":"戚琦"}],"fnote":4009,"mid":"003aSoaV42KbMf","language":0,"title":"洛水近广寒","type":0,"file":{"size_320mp3":11136246,"size_96aac":3397138,"size_aac":1698333,"size_dts":0,"size_128":4454839,"try_end":160481,"e_30s":0,"b_30s":0,"size_24aac":865161,"size_48aac":1698333,"size_320":11136246,"try_begin":101376,"size_128mp3":4454839,"size_192aac":6743883,"size_ogg":6417498,"size_flac":30544602,"media_mid":"003aSoaV42KbMf","size_ape":0,"size_192ogg":6417498,"size_try":0},"genre":1,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"001WTwA74Uzwx7","id":0},"index_cd":0,"id":224822696,"songtype":3,"isonly":1,"album":{"subtitle":"","name":"洛水近广寒","mid":"00062ULq3EaClu","id":5540152,"title":"洛水近广寒"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream2.qqmusic.qq.com/236822696.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2018-12-13","subtitle":"","name":"洛水近广寒","interval":278,"index_album":1,"status":0},{"singer":[{"name":"莫以海之名","mid":"003HkthU2jyrqs","id":2119982,"title":"莫以海之名"}],"fnote":0,"mid":"0028VpLf0UdNYV","language":0,"title":"花间词","type":0,"file":{"size_320mp3":11827398,"size_96aac":3632725,"size_aac":1816669,"size_dts":0,"size_128":4731078,"try_end":118197,"e_30s":0,"b_30s":0,"size_24aac":924785,"size_48aac":1816669,"size_320":11827398,"try_begin":91501,"size_128mp3":4731078,"size_192aac":7175002,"size_ogg":6742771,"size_flac":30875647,"media_mid":"0028VpLf0UdNYV","size_ape":0,"size_192ogg":6742771,"size_try":0},"genre":12,"action":{"msgpay":0,"alert":11,"msgid":0,"icons":135752,"switch":605983},"ksong":{"mid":"003nlfZg36INbD","id":0},"index_cd":0,"id":228713280,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"花间词","mid":"003flOPE3NLZjz","id":6245350,"title":"花间词"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"url":"http://stream0.qqmusic.qq.com/240713280.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-02-08","subtitle":"","name":"花间词","interval":295,"index_album":1,"status":31},{"singer":[{"name":"夙夜未歌","mid":"001Lz4212jhBUO","id":1343184,"title":"夙夜未歌"}],"fnote":0,"mid":"000zwj2C17wMPU","language":0,"title":"宇舟烟渡","type":0,"file":{"size_320mp3":12862894,"size_96aac":3945634,"size_aac":1964054,"size_dts":0,"size_128":5145277,"try_end":0,"e_30s":0,"b_30s":0,"size_24aac":1000072,"size_48aac":1964054,"size_320":12862894,"try_begin":0,"size_128mp3":5145277,"size_192aac":7782255,"size_ogg":6994714,"size_flac":63072017,"media_mid":"000zwj2C17wMPU","size_ape":0,"size_192ogg":6994714,"size_try":0},"genre":12,"action":{"msgpay":0,"alert":11,"msgid":0,"icons":135752,"switch":605983},"ksong":{"mid":"0015yVaD1pgM28","id":0},"index_cd":0,"id":232408064,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"宇舟烟渡","mid":"0049c5lY0MiIcH","id":6861226,"title":"宇舟烟渡"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"url":"http://stream0.qqmusic.qq.com/244408064.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-05-18","subtitle":"","name":"宇舟烟渡","interval":321,"index_album":1,"status":31},{"singer":[{"name":"陈茂源","mid":"002l9ACP43ZVMZ","id":970789,"title":"陈茂源"}],"fnote":4009,"mid":"002zE8U92ui3Jz","language":0,"title":"白羊白羊","type":0,"file":{"size_320mp3":10893896,"size_96aac":3321446,"size_aac":1661398,"size_dts":0,"size_128":4357840,"try_end":150145,"e_30s":0,"b_30s":0,"size_24aac":846280,"size_48aac":1661398,"size_320":10893896,"try_begin":91097,"size_128mp3":4357840,"size_192aac":6575413,"size_ogg":5802394,"size_flac":28417302,"media_mid":"002zE8U92ui3Jz","size_ape":0,"size_192ogg":5802394,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17413891},"ksong":{"mid":"002WPWSq1xvnLI","id":0},"index_cd":0,"id":231273687,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"白羊白羊","mid":"0008gEhD47hxLy","id":6602121,"title":"白羊白羊"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/243273687.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-04-10","subtitle":"","name":"白羊白羊","interval":272,"index_album":1,"status":0},{"singer":[{"name":"谭杨","mid":"002QWZdI0CmJSh","id":3127596,"title":"谭杨"}],"fnote":4009,"mid":"001DPrWF2JibCQ","language":0,"title":"空杯","type":0,"file":{"size_320mp3":10846229,"size_96aac":3346868,"size_aac":1674339,"size_dts":0,"size_128":4338349,"try_end":253375,"e_30s":0,"b_30s":0,"size_24aac":850483,"size_48aac":1674339,"size_320":10846229,"try_begin":70346,"size_128mp3":4338349,"size_192aac":6580136,"size_ogg":5743364,"size_flac":0,"media_mid":"001DPrWF2JibCQ","size_ape":0,"size_192ogg":5743364,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17413891},"ksong":{"mid":"000sgF032hWli2","id":0},"index_cd":0,"id":231626996,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"空杯","mid":"002VDRrN0k67Jb","id":6660030,"title":"空杯"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/243626996.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-04-16","subtitle":"","name":"空杯","interval":271,"index_album":1,"status":0},{"singer":[{"name":"Winky诗","mid":"000aGmw90UirrR","id":62565,"title":"Winky诗"}],"fnote":0,"mid":"001TKCPQ31tOOV","language":0,"title":"离骚","type":0,"file":{"size_320mp3":10443951,"size_96aac":3156805,"size_aac":1579732,"size_dts":0,"size_128":4177698,"try_end":120134,"e_30s":0,"b_30s":0,"size_24aac":804824,"size_48aac":1579732,"size_320":10443951,"try_begin":72964,"size_128mp3":4177698,"size_192aac":6254963,"size_ogg":5544661,"size_flac":0,"media_mid":"001TKCPQ31tOOV","size_ape":0,"size_192ogg":5544661,"size_try":0},"genre":12,"action":{"msgpay":0,"alert":11,"msgid":0,"icons":135752,"switch":605975},"ksong":{"mid":"000xIJtx2jQUXI","id":0},"index_cd":0,"id":225047009,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"离骚","mid":"003rXwDy40tx9W","id":5569655,"title":"离骚"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"url":"http://stream0.qqmusic.qq.com/237047009.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2017-05-31","subtitle":"","name":"离骚","interval":261,"index_album":1,"status":31},{"singer":[{"name":"司南","mid":"0001CJGI3KUaN6","id":2169579,"title":"司南"}],"fnote":4009,"mid":"004MHZ922K3LKn","language":0,"title":"小女司南","type":0,"file":{"size_320mp3":5413537,"size_96aac":1661189,"size_aac":829057,"size_dts":0,"size_128":2165658,"try_end":62996,"e_30s":0,"b_30s":0,"size_24aac":420928,"size_48aac":829057,"size_320":5413537,"try_begin":40973,"size_128mp3":2165658,"size_192aac":3272819,"size_ogg":3066120,"size_flac":14252871,"media_mid":"004MHZ922K3LKn","size_ape":0,"size_192ogg":3066120,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17413891},"ksong":{"mid":"001CQA9u1DTl9V","id":0},"index_cd":0,"id":228657345,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"【大家新年快乐】小女司南","mid":"002Oybux31lQJG","id":6233404,"title":"【大家新年快乐】小女司南"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/240657345.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-02-05","subtitle":"","name":"小女司南","interval":135,"index_album":1,"status":0},{"singer":[{"name":"LunaLiu","mid":"000Acq0F39FioL","id":1521158,"title":"LunaLiu"},{"name":"空山原创音乐","mid":"002hgs3a42mPzL","id":3257173,"title":"空山原创音乐"}],"fnote":0,"mid":"002E31w93msWxn","language":0,"title":"醉梦叹浮生","type":0,"file":{"size_320mp3":11053140,"size_96aac":3409442,"size_aac":1705499,"size_dts":0,"size_128":4421382,"try_end":128960,"e_30s":0,"b_30s":0,"size_24aac":866290,"size_48aac":1705499,"size_320":11053140,"try_begin":77685,"size_128mp3":4421382,"size_192aac":6711581,"size_ogg":6365053,"size_flac":0,"media_mid":"002E31w93msWxn","size_ape":0,"size_192ogg":6365053,"size_try":0},"genre":12,"action":{"msgpay":0,"alert":11,"msgid":0,"icons":135752,"switch":605975},"ksong":{"mid":"003zn0Si1Thbuz","id":0},"index_cd":0,"id":232396088,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"醉梦叹浮生","mid":"003DccwK2VSBkt","id":6857540,"title":"醉梦叹浮生"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"url":"http://stream0.qqmusic.qq.com/244396088.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-05-17","subtitle":"","name":"醉梦叹浮生","interval":276,"index_album":1,"status":31},{"singer":[{"name":"左颜","mid":"003khD1E1r8che","id":968629,"title":"左颜"}],"fnote":4009,"mid":"004TcsSv0SYezr","language":0,"title":"幡灵迷境","type":0,"file":{"size_320mp3":9111746,"size_96aac":2772816,"size_aac":1387806,"size_dts":0,"size_128":3644840,"try_end":83616,"e_30s":0,"b_30s":0,"size_24aac":707603,"size_48aac":1387806,"size_320":9111746,"try_begin":52399,"size_128mp3":3644840,"size_192aac":5511135,"size_ogg":5099551,"size_flac":43425428,"media_mid":"004TcsSv0SYezr","size_ape":0,"size_192ogg":5099551,"size_try":0},"genre":37,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"003zQ73r2wNLZJ","id":0},"index_cd":0,"id":219058446,"songtype":3,"isonly":0,"album":{"subtitle":"《幡灵迷境》浸没式戏剧同名主题曲","name":"幡灵迷境","mid":"002bmG8x2SXOn5","id":4908294,"title":"幡灵迷境"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream4.qqmusic.qq.com/231058446.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2018-11-07","subtitle":"","name":"幡灵迷境","interval":227,"index_album":1,"status":0},{"singer":[{"name":"小时","mid":"0047INbz4Tra3U","id":1541046,"title":"小时"}],"fnote":4009,"mid":"002DPTIc42h0bT","language":0,"title":"荒年旧岁","type":0,"file":{"size_320mp3":10246465,"size_96aac":3139507,"size_aac":1566169,"size_dts":0,"size_128":4098703,"try_end":109888,"e_30s":0,"b_30s":0,"size_24aac":797212,"size_48aac":1566169,"size_320":10246465,"try_begin":82799,"size_128mp3":4098703,"size_192aac":6225764,"size_ogg":5894705,"size_flac":29308910,"media_mid":"002DPTIc42h0bT","size_ape":0,"size_192ogg":5894705,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17413891},"ksong":{"mid":"000PaK3j0GfK56","id":0},"index_cd":0,"id":231628610,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"荒年旧岁","mid":"000emeXp4Tu4Za","id":6660383,"title":"荒年旧岁"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/243628610.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-04-22","subtitle":"","name":"荒年旧岁","interval":256,"index_album":1,"status":0},{"singer":[{"name":"Mukyo木西","mid":"003ySyIW1YW4fU","id":1481775,"title":"Mukyo木西"}],"fnote":4009,"mid":"0007G6353B7iiC","language":0,"title":"诗经风雅颂","type":0,"file":{"size_320mp3":11267141,"size_96aac":3393250,"size_aac":1697516,"size_dts":0,"size_128":4507079,"try_end":128931,"e_30s":0,"b_30s":0,"size_24aac":870363,"size_48aac":1697516,"size_320":11267141,"try_begin":95680,"size_128mp3":4507079,"size_192aac":6694848,"size_ogg":6491498,"size_flac":0,"media_mid":"001Drnwd1tQUw0","size_ape":0,"size_192ogg":6491498,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17409795},"ksong":{"mid":"","id":0},"index_cd":0,"id":218763525,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"花鸟风月夜（第一期主题曲）","mid":"000vIdZZ3g9JnY","id":4739720,"title":"花鸟风月夜（第一期主题曲）"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/230763525.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2018-09-28","subtitle":"","name":"诗经风雅颂","interval":281,"index_album":1,"status":0},{"singer":[{"name":"Pig小优","mid":"002pjzm51CCh5v","id":2090192,"title":"Pig小优"}],"fnote":4009,"mid":"002EkWub1dEa2w","language":0,"title":"知蹊行","type":0,"file":{"size_320mp3":9079967,"size_96aac":2792267,"size_aac":1388264,"size_dts":0,"size_128":3632287,"try_end":112020,"e_30s":0,"b_30s":0,"size_24aac":708175,"size_48aac":1388264,"size_320":9079967,"try_begin":66327,"size_128mp3":3632287,"size_192aac":5500885,"size_ogg":5081205,"size_flac":24894286,"media_mid":"002EkWub1dEa2w","size_ape":0,"size_192ogg":5081205,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17413891},"ksong":{"mid":"003zb1bI3fc47e","id":0},"index_cd":0,"id":225098794,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"知蹊行（完美国际2师徒主题曲）","mid":"000W1yOT2E9cAK","id":5576256,"title":"知蹊行（完美国际2师徒主题曲）"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/237098794.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2018-12-13","subtitle":"","name":"知蹊行","interval":226,"index_album":1,"status":0},{"singer":[{"name":"水云汐Camus","mid":"001e8nKp4UQn5c","id":1522524,"title":"水云汐Camus"}],"fnote":4009,"mid":"002nKCNp4TWLKP","language":0,"title":"幸相逢","type":0,"file":{"size_320mp3":7678677,"size_96aac":2349356,"size_aac":1171885,"size_dts":0,"size_128":3071786,"try_end":77337,"e_30s":0,"b_30s":0,"size_24aac":599098,"size_48aac":1171885,"size_320":7678677,"try_begin":59986,"size_128mp3":3071786,"size_192aac":4660211,"size_ogg":4610327,"size_flac":21339562,"media_mid":"002nKCNp4TWLKP","size_ape":0,"size_192ogg":4610327,"size_try":0},"genre":12,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":147324,"switch":17413891},"ksong":{"mid":"004QQiBk3nCAhD","id":0},"index_cd":0,"id":228945474,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"幸相逢","mid":"004CSjTB28ID9P","id":6286212,"title":"幸相逢"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream0.qqmusic.qq.com/240945474.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-02-19","subtitle":"","name":"幸相逢","interval":191,"index_album":1,"status":0},{"singer":[{"name":"莫以海之名","mid":"003HkthU2jyrqs","id":2119982,"title":"莫以海之名"}],"fnote":0,"mid":"004Ar1L51BSspQ","language":0,"title":"湛","type":0,"file":{"size_320mp3":9317545,"size_96aac":2866880,"size_aac":1427397,"size_dts":0,"size_128":3727132,"try_end":100036,"e_30s":0,"b_30s":0,"size_24aac":727547,"size_48aac":1427397,"size_320":9317545,"try_begin":74401,"size_128mp3":3727132,"size_192aac":5667326,"size_ogg":5333705,"size_flac":25083361,"media_mid":"004Ar1L51BSspQ","size_ape":0,"size_192ogg":5333705,"size_try":0},"genre":12,"action":{"msgpay":0,"alert":11,"msgid":0,"icons":135752,"switch":605983},"ksong":{"mid":"000KbkUR00vmVM","id":0},"index_cd":0,"id":228657310,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"湛","mid":"000NaAaT0dE9J4","id":6233380,"title":"湛"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"url":"http://stream0.qqmusic.qq.com/240657310.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2019-01-23","subtitle":"","name":"湛","interval":232,"index_album":1,"status":31},{"singer":[{"name":"鸾音社","mid":"003oe0Gi4LoOZ3","id":2684565,"title":"鸾音社"}],"fnote":4009,"mid":"004S7Ge02WFK2M","language":0,"title":"南山悠然","type":0,"file":{"size_320mp3":8560934,"size_96aac":2613308,"size_aac":1305547,"size_dts":0,"size_128":3424537,"try_end":99568,"e_30s":0,"b_30s":0,"size_24aac":665898,"size_48aac":1305547,"size_320":8560934,"try_begin":75090,"size_128mp3":3424537,"size_192aac":5184237,"size_ogg":4964157,"size_flac":43252468,"media_mid":"003CIVwq0iwJOQ","size_ape":0,"size_192ogg":4964157,"size_try":0},"genre":1,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"001b0OwN3IOR1L","id":0},"index_cd":0,"id":218955978,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"南山悠然","mid":"000SRi3B08B4JU","id":4895687,"title":"南山悠然"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream7.qqmusic.qq.com/230955978.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2018-11-06","subtitle":"","name":"南山悠然","interval":213,"index_album":1,"status":0},{"singer":[{"name":"小曲儿","mid":"0038UP0n2geLf2","id":71108,"title":"小曲儿"}],"fnote":8013,"mid":"000yWApQ2BKqYf","language":0,"title":"红尘","type":0,"file":{"size_320mp3":10119433,"size_96aac":3094993,"size_aac":1611068,"size_dts":0,"size_128":4048562,"try_end":105248,"e_30s":0,"b_30s":0,"size_24aac":809934,"size_48aac":1611068,"size_320":10119433,"try_begin":65219,"size_128mp3":4048562,"size_192aac":5822721,"size_ogg":5463583,"size_flac":0,"media_mid":"000yWApQ2BKqYf","size_ape":0,"size_192ogg":5463583,"size_try":0},"genre":1,"action":{"msgpay":0,"alert":11,"msgid":0,"icons":135752,"switch":81687},"ksong":{"mid":"002qowSx2CJugj","id":0},"index_cd":0,"id":3587677,"songtype":3,"isonly":0,"album":{"subtitle":"《欲·黑鸢》原创游戏ED主题曲","name":"欲 黑鸢","mid":"000vWax81vuApc","id":1136314,"title":"欲 黑鸢"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":0,"time_free":0,"price_album":0,"pay_month":0,"pay_down":0},"url":"http://stream4.qqmusic.qq.com/15587677.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2015-09-08","subtitle":"","name":"红尘","interval":252,"index_album":1,"status":0},{"singer":[{"name":"魏新雨","mid":"000LsFo136kIv4","id":39657,"title":"魏新雨"}],"fnote":4009,"mid":"004JqR300FlJ4T","language":0,"title":"梨花落","type":0,"file":{"size_320mp3":11004028,"size_96aac":3366674,"size_aac":1679540,"size_dts":0,"size_128":4401736,"try_end":127474,"e_30s":0,"b_30s":0,"size_24aac":856550,"size_48aac":1679540,"size_320":11004028,"try_begin":77707,"size_128mp3":4401736,"size_192aac":6641121,"size_ogg":6240847,"size_flac":31762253,"media_mid":"004JqR300FlJ4T","size_ape":0,"size_192ogg":6240847,"size_try":0},"genre":1,"action":{"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891},"ksong":{"mid":"001NYBcH0iKlW9","id":0},"index_cd":0,"id":219645861,"songtype":3,"isonly":0,"album":{"subtitle":"","name":"梨花落","mid":"003yVWVb0QSc3O","id":4951569,"title":"梨花落"},"mv":{"vid":"","id":0},"pay":{"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1},"url":"http://stream9.qqmusic.qq.com/231645861.wma","volume":{"lra":0,"peak":0,"gain":0},"time_public":"2018-11-13","subtitle":"","name":"梨花落","interval":275,"index_album":1,"status":0}]
         * desc : 一曲古韵，梦回千古。在这些古色古香的词曲里，一点一点地感受歌曲里那些唯美之处。
         */

        private int isdj;
        private String singermid;
        private int song_begin;
        private int songnum;
        private String encrypt_uin;
        private int likeit;
        private int scoreusercount;
        private String login;
        private int mtime;
        private int type;
        private int isvip;
        private String nick;
        private String coveradurl;
        private String pic_mid;
        private String songids;
        private String nickname;
        private int ctime;
        private String dissname;
        private String logo;
        private int cmtnum;
        private int dirid;
        private String uin;
        private int isAd;
        private String scoreavage;
        private int cur_song_num;
        private int dissid;
        private int buynum;
        private int cm_count;
        private String headurl;
        private String songtypes;
        private int total_song_num;
        private String disstid;
        private int owndir;
        private String album_pic_mid;
        private String ifpicurl;
        private int pic_dpi;
        private int visitnum;
        private int singerid;
        private int dir_show;
        private int disstype;
        private String dir_pic_url2;
        private int song_update_time;
        private int song_update_num;
        private String desc;
        private List<TagsBean> tags;
        private List<SonglistBean> songlist;

        public int getIsdj() {
            return isdj;
        }

        public void setIsdj(int isdj) {
            this.isdj = isdj;
        }

        public String getSingermid() {
            return singermid;
        }

        public void setSingermid(String singermid) {
            this.singermid = singermid;
        }

        public int getSong_begin() {
            return song_begin;
        }

        public void setSong_begin(int song_begin) {
            this.song_begin = song_begin;
        }

        public int getSongnum() {
            return songnum;
        }

        public void setSongnum(int songnum) {
            this.songnum = songnum;
        }

        public String getEncrypt_uin() {
            return encrypt_uin;
        }

        public void setEncrypt_uin(String encrypt_uin) {
            this.encrypt_uin = encrypt_uin;
        }

        public int getLikeit() {
            return likeit;
        }

        public void setLikeit(int likeit) {
            this.likeit = likeit;
        }

        public int getScoreusercount() {
            return scoreusercount;
        }

        public void setScoreusercount(int scoreusercount) {
            this.scoreusercount = scoreusercount;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getMtime() {
            return mtime;
        }

        public void setMtime(int mtime) {
            this.mtime = mtime;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getIsvip() {
            return isvip;
        }

        public void setIsvip(int isvip) {
            this.isvip = isvip;
        }

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public String getCoveradurl() {
            return coveradurl;
        }

        public void setCoveradurl(String coveradurl) {
            this.coveradurl = coveradurl;
        }

        public String getPic_mid() {
            return pic_mid;
        }

        public void setPic_mid(String pic_mid) {
            this.pic_mid = pic_mid;
        }

        public String getSongids() {
            return songids;
        }

        public void setSongids(String songids) {
            this.songids = songids;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getCtime() {
            return ctime;
        }

        public void setCtime(int ctime) {
            this.ctime = ctime;
        }

        public String getDissname() {
            return dissname;
        }

        public void setDissname(String dissname) {
            this.dissname = dissname;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public int getCmtnum() {
            return cmtnum;
        }

        public void setCmtnum(int cmtnum) {
            this.cmtnum = cmtnum;
        }

        public int getDirid() {
            return dirid;
        }

        public void setDirid(int dirid) {
            this.dirid = dirid;
        }

        public String getUin() {
            return uin;
        }

        public void setUin(String uin) {
            this.uin = uin;
        }

        public int getIsAd() {
            return isAd;
        }

        public void setIsAd(int isAd) {
            this.isAd = isAd;
        }

        public String getScoreavage() {
            return scoreavage;
        }

        public void setScoreavage(String scoreavage) {
            this.scoreavage = scoreavage;
        }

        public int getCur_song_num() {
            return cur_song_num;
        }

        public void setCur_song_num(int cur_song_num) {
            this.cur_song_num = cur_song_num;
        }

        public int getDissid() {
            return dissid;
        }

        public void setDissid(int dissid) {
            this.dissid = dissid;
        }

        public int getBuynum() {
            return buynum;
        }

        public void setBuynum(int buynum) {
            this.buynum = buynum;
        }

        public int getCm_count() {
            return cm_count;
        }

        public void setCm_count(int cm_count) {
            this.cm_count = cm_count;
        }

        public String getHeadurl() {
            return headurl;
        }

        public void setHeadurl(String headurl) {
            this.headurl = headurl;
        }

        public String getSongtypes() {
            return songtypes;
        }

        public void setSongtypes(String songtypes) {
            this.songtypes = songtypes;
        }

        public int getTotal_song_num() {
            return total_song_num;
        }

        public void setTotal_song_num(int total_song_num) {
            this.total_song_num = total_song_num;
        }

        public String getDisstid() {
            return disstid;
        }

        public void setDisstid(String disstid) {
            this.disstid = disstid;
        }

        public int getOwndir() {
            return owndir;
        }

        public void setOwndir(int owndir) {
            this.owndir = owndir;
        }

        public String getAlbum_pic_mid() {
            return album_pic_mid;
        }

        public void setAlbum_pic_mid(String album_pic_mid) {
            this.album_pic_mid = album_pic_mid;
        }

        public String getIfpicurl() {
            return ifpicurl;
        }

        public void setIfpicurl(String ifpicurl) {
            this.ifpicurl = ifpicurl;
        }

        public int getPic_dpi() {
            return pic_dpi;
        }

        public void setPic_dpi(int pic_dpi) {
            this.pic_dpi = pic_dpi;
        }

        public int getVisitnum() {
            return visitnum;
        }

        public void setVisitnum(int visitnum) {
            this.visitnum = visitnum;
        }

        public int getSingerid() {
            return singerid;
        }

        public void setSingerid(int singerid) {
            this.singerid = singerid;
        }

        public int getDir_show() {
            return dir_show;
        }

        public void setDir_show(int dir_show) {
            this.dir_show = dir_show;
        }

        public int getDisstype() {
            return disstype;
        }

        public void setDisstype(int disstype) {
            this.disstype = disstype;
        }

        public String getDir_pic_url2() {
            return dir_pic_url2;
        }

        public void setDir_pic_url2(String dir_pic_url2) {
            this.dir_pic_url2 = dir_pic_url2;
        }

        public int getSong_update_time() {
            return song_update_time;
        }

        public void setSong_update_time(int song_update_time) {
            this.song_update_time = song_update_time;
        }

        public int getSong_update_num() {
            return song_update_num;
        }

        public void setSong_update_num(int song_update_num) {
            this.song_update_num = song_update_num;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<SonglistBean> getSonglist() {
            return songlist;
        }

        public void setSonglist(List<SonglistBean> songlist) {
            this.songlist = songlist;
        }

        public static class TagsBean implements Serializable {
            /**
             * name : 国语
             * pid : 165
             * id : 165
             */

            private String name;
            private int pid;
            private int id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class SonglistBean implements Serializable {
            /**
             * singer : [{"name":"晓月老板","mid":"002dwW8C3cQtmC","id":1021787,"title":"晓月老板"}]
             * fnote : 4009
             * mid : 001hSVTk3F0guF
             * language : 0
             * title : 青玉案·元夕
             * type : 0
             * file : {"size_320mp3":8715712,"size_96aac":2653748,"size_aac":1328236,"size_dts":0,"size_128":3486415,"try_end":199720,"e_30s":60000,"b_30s":0,"size_24aac":678030,"size_48aac":1328236,"size_320":8715712,"try_begin":155387,"size_128mp3":3486415,"size_192aac":5273201,"size_ogg":5021953,"size_flac":20305622,"media_mid":"001hSVTk3F0guF","size_ape":0,"size_192ogg":5021953,"size_try":960887}
             * genre : 0
             * action : {"msgpay":6,"alert":2,"msgid":14,"icons":139132,"switch":17413891}
             * ksong : {"mid":"002InPMf0yiVvw","id":0}
             * index_cd : 0
             * id : 232854804
             * songtype : 3
             * isonly : 1
             * album : {"subtitle":"","name":"行走歌谣（原力计划合辑Ⅲ）","mid":"000Ubh172DFozI","id":6923032,"title":"行走歌谣（原力计划合辑Ⅲ）"}
             * mv : {"vid":"","id":0}
             * pay : {"pay_play":0,"pay_status":0,"price_track":200,"time_free":0,"price_album":0,"pay_month":1,"pay_down":1}
             * url : http://stream0.qqmusic.qq.com/244854804.wma
             * volume : {"lra":0,"peak":0,"gain":0}
             * time_public : 2019-05-29
             * subtitle :
             * name : 青玉案·元夕
             * interval : 217
             * index_album : 11
             * status : 0
             */

            private int fnote;
            private String mid;
            private int language;
            private String title;
            private int type;
            private FileBean file;
            private int genre;
            private ActionBean action;
            private KsongBean ksong;
            private int index_cd;
            private int id;
            private int songtype;
            private int isonly;
            private AlbumBean album;
            private MvBean mv;
            private PayBean pay;
            private String url;
            private VolumeBean volume;
            private String time_public;
            private String subtitle;
            private String name;
            private int interval;
            private int index_album;
            private int status;
            private List<SingerBean> singer;

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

            public int getSongtype() {
                return songtype;
            }

            public void setSongtype(int songtype) {
                this.songtype = songtype;
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

            public static class FileBean implements Serializable {
                /**
                 * size_320mp3 : 8715712
                 * size_96aac : 2653748
                 * size_aac : 1328236
                 * size_dts : 0
                 * size_128 : 3486415
                 * try_end : 199720
                 * e_30s : 60000
                 * b_30s : 0
                 * size_24aac : 678030
                 * size_48aac : 1328236
                 * size_320 : 8715712
                 * try_begin : 155387
                 * size_128mp3 : 3486415
                 * size_192aac : 5273201
                 * size_ogg : 5021953
                 * size_flac : 20305622
                 * media_mid : 001hSVTk3F0guF
                 * size_ape : 0
                 * size_192ogg : 5021953
                 * size_try : 960887
                 */

                private int size_320mp3;
                private int size_96aac;
                private int size_aac;
                private int size_dts;
                private int size_128;
                private int try_end;
                private int e_30s;
                private int b_30s;
                private int size_24aac;
                private int size_48aac;
                private int size_320;
                private int try_begin;
                private int size_128mp3;
                private int size_192aac;
                private int size_ogg;
                private int size_flac;
                private String media_mid;
                private int size_ape;
                private int size_192ogg;
                private int size_try;

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

                public int getSize_aac() {
                    return size_aac;
                }

                public void setSize_aac(int size_aac) {
                    this.size_aac = size_aac;
                }

                public int getSize_dts() {
                    return size_dts;
                }

                public void setSize_dts(int size_dts) {
                    this.size_dts = size_dts;
                }

                public int getSize_128() {
                    return size_128;
                }

                public void setSize_128(int size_128) {
                    this.size_128 = size_128;
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

                public int getSize_320() {
                    return size_320;
                }

                public void setSize_320(int size_320) {
                    this.size_320 = size_320;
                }

                public int getTry_begin() {
                    return try_begin;
                }

                public void setTry_begin(int try_begin) {
                    this.try_begin = try_begin;
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

                public int getSize_ogg() {
                    return size_ogg;
                }

                public void setSize_ogg(int size_ogg) {
                    this.size_ogg = size_ogg;
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

            public static class ActionBean implements Serializable {
                /**
                 * msgpay : 6
                 * alert : 2
                 * msgid : 14
                 * icons : 139132
                 * switch : 17413891
                 */

                private int msgpay;
                private int alert;
                private int msgid;
                private int icons;
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

                public int getIcons() {
                    return icons;
                }

                public void setIcons(int icons) {
                    this.icons = icons;
                }

                public int getSwitchX() {
                    return switchX;
                }

                public void setSwitchX(int switchX) {
                    this.switchX = switchX;
                }
            }

            public static class KsongBean implements Serializable {
                /**
                 * mid : 002InPMf0yiVvw
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

            public static class AlbumBean implements Serializable {
                /**
                 * subtitle :
                 * name : 行走歌谣（原力计划合辑Ⅲ）
                 * mid : 000Ubh172DFozI
                 * id : 6923032
                 * title : 行走歌谣（原力计划合辑Ⅲ）
                 */

                private String subtitle;
                private String name;
                private String mid;
                private int id;
                private String title;

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

            public static class MvBean  implements Serializable{
                /**
                 * vid :
                 * id : 0
                 */

                private String vid;
                private int id;

                public String getVid() {
                    return vid;
                }

                public void setVid(String vid) {
                    this.vid = vid;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }
            }

            public static class PayBean implements Serializable {
                /**
                 * pay_play : 0
                 * pay_status : 0
                 * price_track : 200
                 * time_free : 0
                 * price_album : 0
                 * pay_month : 1
                 * pay_down : 1
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

            public static class VolumeBean implements Serializable {
                /**
                 * lra : 0.0
                 * peak : 0.0
                 * gain : 0.0
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

            public static class SingerBean implements Serializable {
                /**
                 * name : 晓月老板
                 * mid : 002dwW8C3cQtmC
                 * id : 1021787
                 * title : 晓月老板
                 */

                private String name;
                private String mid;
                private int id;
                private String title;

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
        }
    }
}
