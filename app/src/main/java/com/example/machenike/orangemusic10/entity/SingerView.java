package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;
import com.google.gson.annotations.SerializedName;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;

@HttpResponse(parser = JsonRespondParse.class)
public class SingerView implements Serializable {
    /**
     * code : 200
     * msg : OK
     * timestamp : 1561532611352
     * data : [{"vid":{"Fmv_id":"658093","Fstatus":"1","Fvid":"v001892io9b"},"Flisten_count1":0,"musicData":{"preview":{"tryend":144022,"trybegin":42938,"trysize":0},"belongCD":4,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"004dFFPd4JNv8q","type":0,"switch":636675,"albumname":"新的心跳","vid":"v001892io9b","rate":31,"stream":13,"songorig":"来自天堂的魔鬼","songtype":0,"isonly":0,"albumdesc":"","albummid":"003c616O2Zlswm","albumid":1196826,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3929040,"sizeflac":29903656,"label":"4611686018444165121","sizeogg":5414048,"songname":"来自天堂的魔鬼","size320":9822265,"strMediaMid":"004dFFPd4JNv8q","sizeape":29815674,"size5_1":0,"interval":245,"alertid":2,"cdIdx":0,"songid":104913384},"price":320,"listenCount":0,"Fupload_time":"2015-11-04 15:57:19","index":1,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"1067783","Fstatus":"1","Fvid":"g0022q7z0um"},"Flisten_count1":0,"musicData":{"preview":{"tryend":86629,"trybegin":65648,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"002E3MtF0IAMMY","type":0,"switch":636675,"albumname":"光年之外","vid":"g0022q7z0um","rate":31,"stream":13,"songorig":"光年之外","songtype":0,"isonly":0,"albumdesc":"《太空旅客（Passengers）》电影中国区主题曲","albummid":"001mTkmb4GJlh4","albumid":1796874,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3769367,"sizeflac":25851452,"label":"0","sizeogg":5100736,"songname":"光年之外","size320":9423101,"strMediaMid":"002E3MtF0IAMMY","sizeape":25810526,"size5_1":0,"interval":235,"alertid":2,"cdIdx":0,"songid":200255722},"price":320,"listenCount":0,"Fupload_time":"2016-12-28 19:10:37","index":2,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"1480508","Fstatus":"1","Fvid":"z0027n118z6"},"Flisten_count1":0,"musicData":{"preview":{"tryend":68627,"trybegin":44567,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"003jjoM94WLiTf","type":0,"switch":636675,"albumname":"另一个童话","vid":"z0027n118z6","rate":31,"stream":13,"songorig":"倒数","songtype":0,"isonly":0,"albumdesc":"","albummid":"003cKIKZ1J4Yyu","albumid":4331954,"msgid":14,"pay":{"payplay":0,"payalbum":1,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":700,"payinfo":1,"timefree":0},"size128":3670721,"sizeflac":27224684,"label":"0","sizeogg":5096892,"songname":"倒数","size320":9176126,"strMediaMid":"002Jbzn235xaQZ","sizeape":27274586,"size5_1":0,"interval":229,"alertid":2,"cdIdx":0,"songid":215540451},"price":320,"listenCount":0,"Fupload_time":"2018-08-08 17:03:30","index":3,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"276169","Fstatus":"1","Fvid":"j00131150pv"},"Flisten_count1":0,"musicData":{"preview":{"tryend":107382,"trybegin":64779,"trysize":0},"belongCD":7,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"002wKHHm42wVh1","type":0,"switch":636675,"albumname":"My Secret","vid":"j00131150pv","rate":23,"stream":13,"songorig":"我的秘密","songtype":0,"isonly":0,"albumdesc":"","albummid":"002F059l1kCcdr","albumid":62251,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":4035200,"sizeflac":30315609,"label":"4611686018435776513","sizeogg":5557505,"songname":"我的秘密","size320":10087667,"strMediaMid":"002DDrk12IuwUW","sizeape":0,"size5_1":0,"interval":252,"alertid":2,"cdIdx":0,"songid":736924},"price":320,"listenCount":0,"Fupload_time":"2010-11-01 11:14:15","index":4,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"149424","Fstatus":"1","Fvid":"b0011lorm6w"},"Flisten_count1":0,"musicData":{"preview":{"tryend":0,"trybegin":0,"trysize":0},"belongCD":4,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"001X0PDf0W4lBq","type":0,"switch":636675,"albumname":"Xposed","vid":"b0011lorm6w","rate":31,"stream":13,"songorig":"泡沫","songtype":0,"isonly":0,"albumdesc":"","albummid":"002YFufr4bXZyI","albumid":123298,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":4143023,"sizeflac":26269879,"label":"5764607658329899009","sizeogg":5327033,"songname":"泡沫","size320":10356596,"strMediaMid":"000ryYx71hFmdF","sizeape":26200298,"size5_1":0,"interval":258,"alertid":2,"cdIdx":0,"songid":1530858},"price":320,"listenCount":0,"Fupload_time":"2012-06-28 18:55:48","index":5,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"657673","Fstatus":"1","Fvid":"n0018uvi2yb"},"Flisten_count1":0,"musicData":{"preview":{"tryend":61297,"trybegin":34333,"trysize":0},"belongCD":2,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"003sYHuC3aBd4r","type":0,"switch":636675,"albumname":"新的心跳","vid":"n0018uvi2yb","rate":31,"stream":13,"songorig":"再见","songtype":0,"isonly":0,"albumdesc":"","albummid":"003c616O2Zlswm","albumid":1196826,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3297902,"sizeflac":22538551,"label":"5764607523034234881","sizeogg":4596251,"songname":"再见","size320":8244449,"strMediaMid":"003sYHuC3aBd4r","sizeape":22403888,"size5_1":0,"interval":206,"alertid":2,"cdIdx":0,"songid":104883226},"price":320,"listenCount":0,"Fupload_time":"2015-10-29 15:26:58","index":6,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"295453","Fstatus":"1","Fvid":"v00149ipnk5"},"Flisten_count1":0,"musicData":{"preview":{"tryend":82974,"trybegin":53902,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"002G0sJY2wThyx","type":0,"switch":636675,"albumname":"喜欢你","vid":"v00149ipnk5","rate":31,"stream":13,"songorig":"喜欢你","songtype":0,"isonly":0,"albumdesc":"","albummid":"000cFPKx3ZGzks","albumid":654246,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3825370,"sizeflac":28523771,"label":"4611686153727246338","sizeogg":5732238,"songname":"喜欢你","size320":9563080,"strMediaMid":"002G0sJY2wThyx","sizeape":27765256,"size5_1":0,"interval":239,"alertid":2,"cdIdx":0,"songid":7168586},"price":320,"listenCount":0,"Fupload_time":"2014-08-14 16:34:33","index":7,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"651171","Fstatus":"1","Fvid":"q0025ym3g4k"},"Flisten_count1":0,"musicData":{"preview":{"tryend":100618,"trybegin":77108,"trysize":0},"belongCD":6,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"001GUQPq2zBgLJ","type":0,"switch":17413891,"albumname":"女也 Herstory with Mayday","vid":"q0025ym3g4k","rate":31,"stream":13,"songorig":"你不是真正的快乐","songtype":0,"isonly":1,"albumdesc":"","albummid":"003TNHpm2RoA9g","albumid":1021237,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":4993198,"sizeflac":34856876,"label":"4611686018435776513","sizeogg":7003783,"songname":"你不是真正的快乐","size320":12482609,"strMediaMid":"000imGxf4R0HKA","sizeape":35262431,"size5_1":0,"interval":312,"alertid":21,"cdIdx":0,"songid":102701006},"price":320,"listenCount":0,"Fupload_time":"2015-06-26 11:23:49","index":8,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"196383","Fstatus":"1","Fvid":"w0012n9nf0b"},"Flisten_count1":0,"musicData":{"preview":{"tryend":57768,"trybegin":30076,"trysize":0},"belongCD":4,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"000ruq2M3hZIAO","type":0,"switch":636675,"albumname":"18...","vid":"w0012n9nf0b","rate":31,"stream":13,"songorig":"A.I.N.Y.","songtype":0,"isonly":0,"albumdesc":"","albummid":"000HZzEx0QIMNM","albumid":57457,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3634616,"sizeflac":27997531,"label":"4611686018431582209","sizeogg":5562701,"songname":"A.I.N.Y.","size320":8985317,"strMediaMid":"000ruq2M3hZIAO","sizeape":26887097,"size5_1":0,"interval":226,"alertid":2,"cdIdx":0,"songid":680056},"price":320,"listenCount":0,"Fupload_time":"2010-05-17 10:03:38","index":9,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"308250","Fstatus":"1","Fvid":"v00166itsfm"},"Flisten_count1":0,"musicData":{"preview":{"tryend":86788,"trybegin":55669,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"003S1hgM2asCye","type":0,"switch":636675,"albumname":"新的心跳","vid":"v00166itsfm","rate":31,"stream":13,"songorig":"多远都要在一起","songtype":0,"isonly":0,"albumdesc":"","albummid":"003c616O2Zlswm","albumid":1196826,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3484749,"sizeflac":24086044,"label":"5764607523042623489","sizeogg":4850019,"songname":"多远都要在一起","size320":8711538,"strMediaMid":"003S1hgM2asCye","sizeape":23901166,"size5_1":0,"interval":217,"alertid":2,"cdIdx":0,"songid":102174489},"price":320,"listenCount":0,"Fupload_time":"2015-02-18 23:52:16","index":10,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"307989","Fstatus":"1","Fvid":"e0015fcdups"},"Flisten_count1":0,"musicData":{"preview":{"tryend":103213,"trybegin":60097,"trysize":0},"belongCD":6,"singer":[{"name":"林俊杰","mid":"001BLpXF2DyJe2","id":4286},{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"004EQ5TI0LEEB1","type":0,"switch":17413891,"albumname":"新地球","vid":"e0015fcdups","rate":31,"stream":13,"songorig":"手心的蔷薇","songtype":0,"isonly":1,"albumdesc":"","albummid":"001IV22P1RDX7p","albumid":852443,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":4482002,"sizeflac":32614239,"label":"5764607523042623489","sizeogg":6062905,"songname":"手心的蔷薇","size320":11204489,"strMediaMid":"004EQ5TI0LEEB1","sizeape":32423397,"size5_1":0,"interval":280,"alertid":21,"cdIdx":0,"songid":101795113},"price":320,"listenCount":0,"Fupload_time":"2014-12-26 17:38:01","index":11,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"334509","Fstatus":"1","Fvid":"n0016pj0xgn"},"Flisten_count1":0,"musicData":{"preview":{"tryend":87179,"trybegin":56979,"trysize":0},"belongCD":3,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"004TYbSN3tr1sd","type":0,"switch":636675,"albumname":"G.E.M","vid":"n0016pj0xgn","rate":31,"stream":13,"songorig":"回忆的沙漏","songtype":0,"isonly":0,"albumdesc":"","albummid":"003FBC9b4XV8i9","albumid":36427,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3736771,"sizeflac":27078069,"label":"4611686153723052033","sizeogg":5554031,"songname":"回忆的沙漏","size320":9341603,"strMediaMid":"004MNKbY0gBwTK","sizeape":26373006,"size5_1":0,"interval":233,"alertid":2,"cdIdx":0,"songid":447624},"price":320,"listenCount":0,"Fupload_time":"2008-10-22 15:40:24","index":12,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"292806","Fstatus":"1","Fvid":"n001490p7j8"},"Flisten_count1":0,"musicData":{"preview":{"tryend":91000,"trybegin":64020,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"003de5C906SZp9","type":0,"switch":636675,"albumname":"后会无期 电影原声带","vid":"n001490p7j8","rate":31,"stream":13,"songorig":"后会无期","songtype":0,"isonly":0,"albumdesc":"《后会无期》电影同名主题歌|《The End Of The World》中文版","albummid":"001axO7402nnGG","albumid":638859,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3569595,"sizeflac":19093117,"label":"4611686153723052033","sizeogg":4430945,"songname":"后会无期","size320":8923652,"strMediaMid":"003de5C906SZp9","sizeape":18324014,"size5_1":0,"interval":223,"alertid":2,"cdIdx":0,"songid":7060463},"price":320,"listenCount":0,"Fupload_time":"2014-07-10 17:41:54","index":13,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"208522","Fstatus":"1","Fvid":"g0012m91lr5"},"Flisten_count1":0,"musicData":{"preview":{"tryend":94448,"trybegin":62713,"trysize":0},"belongCD":25,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"002w13LS0dkKLg","type":0,"switch":636675,"albumname":"The Best of G.E.M. 2008-2012","vid":"g0012m91lr5","rate":31,"stream":13,"songorig":"你把我灌醉","songtype":0,"isonly":0,"albumdesc":"","albummid":"000mmrVb4fam2C","albumid":425675,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":4564376,"sizeflac":31453153,"label":"4611686153727246337","sizeogg":6344322,"songname":"你把我灌醉","size320":11410547,"strMediaMid":"001TflX838Qawq","sizeape":31322841,"size5_1":0,"interval":285,"alertid":2,"cdIdx":2,"songid":4969615},"price":320,"listenCount":0,"Fupload_time":"2013-07-17 17:32:09","index":14,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"1539692","Fstatus":"1","Fvid":"r0031d40x8c"},"Flisten_count1":0,"musicData":{"preview":{"tryend":0,"trybegin":0,"trysize":0},"belongCD":1,"singer":[{"name":"吴亦凡","mid":"002yeznU3VAVEV","id":180646},{"name":"张震岳","mid":"003gA4Y334rnOf","id":89},{"name":"MC HotDog","mid":"0023JlKC41RuGV","id":4},{"name":"潘玮柏","mid":"000iM9BB2TXFqu","id":4359},{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"0002pVPZ2r4nJD","type":0,"switch":17409795,"albumname":"中国新说唱2019 第1期","vid":"r0031d40x8c","rate":23,"stream":13,"songorig":"MyWay","songtype":0,"isonly":0,"albumdesc":"","albummid":"000Kz6t71hKho9","albumid":7009507,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":6340240,"sizeflac":90499879,"label":"0","sizeogg":9592311,"songname":"MyWay (Live)","size320":15850275,"strMediaMid":"003h67M81fc4nQ","sizeape":0,"size5_1":0,"interval":396,"alertid":43,"cdIdx":0,"songid":233348883},"price":320,"listenCount":0,"Fupload_time":"2019-06-14 17:25:57","index":15,"isnew":1,"playurl":""},{"vid":{"Fmv_id":"1498188","Fstatus":"1","Fvid":"l0029c4gtx6"},"Flisten_count1":0,"musicData":{"preview":{"tryend":113570,"trybegin":81165,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"001A9o5D1EWzyd","type":0,"switch":636675,"albumname":"睡皇后","vid":"l0029c4gtx6","rate":23,"stream":13,"songorig":"岩石里的花","songtype":0,"isonly":0,"albumdesc":"","albummid":"003w92u63Kz75u","albumid":5447180,"msgid":14,"pay":{"payplay":0,"payalbum":1,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":700,"payinfo":1,"timefree":0},"size128":4707268,"sizeflac":30532891,"label":"0","sizeogg":6107923,"songname":"岩石里的花","size320":11767853,"strMediaMid":"101A9o5D1EWzyd","sizeape":0,"size5_1":0,"interval":294,"alertid":2,"cdIdx":0,"songid":224111860},"price":320,"listenCount":0,"Fupload_time":"2018-12-03 10:14:33","index":16,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"1312257","Fstatus":"1","Fvid":"o00230ukvzb"},"Flisten_count1":0,"musicData":{"preview":{"tryend":102596,"trybegin":74585,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"004TEo4m1cwCtf","type":0,"switch":636675,"albumname":"上古情歌 电视剧原声带","vid":"o00230ukvzb","rate":31,"stream":13,"songorig":"桃花诺","songtype":0,"isonly":0,"albumdesc":"《上古情歌》电视剧片尾曲","albummid":"000Vk6tG2kuHDU","albumid":2135134,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3517334,"sizeflac":21452203,"label":"0","sizeogg":4586689,"songname":"桃花诺","size320":8793024,"strMediaMid":"004TEo4m1cwCtf","sizeape":21366862,"size5_1":0,"interval":219,"alertid":2,"cdIdx":0,"songid":202553248},"price":320,"listenCount":0,"Fupload_time":"2017-05-26 15:40:02","index":17,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"298423","Fstatus":"1","Fvid":"q0015lrzd1k"},"Flisten_count1":0,"musicData":{"preview":{"tryend":142466,"trybegin":59509,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"0040T0EA00oi4h","type":0,"switch":3751735,"albumname":"龙卷风","vid":"q0015lrzd1k","rate":31,"stream":13,"songorig":"龙卷风","songtype":0,"isonly":0,"albumdesc":"","albummid":"002J1yeb1T8kzq","albumid":675370,"msgid":0,"pay":{"payplay":0,"payalbum":0,"paydownload":0,"paytrackmouth":0,"paytrackprice":0,"payalbumprice":0,"payinfo":0,"timefree":0},"size128":3983359,"sizeflac":30566899,"label":"4611686018435776513","sizeogg":5919551,"songname":"龙卷风","size320":9958085,"strMediaMid":"0040T0EA00oi4h","sizeape":29770564,"size5_1":0,"interval":248,"alertid":11,"cdIdx":0,"songid":7416139},"price":320,"listenCount":0,"Fupload_time":"2014-09-26 11:27:04","index":18,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"1519986","Fstatus":"1","Fvid":"v00308yf23j"},"Flisten_count1":0,"musicData":{"preview":{"tryend":72218,"trybegin":53247,"trysize":960887},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948},{"name":"王嘉尔","mid":"00216fJA496xQG","id":179603}],"songmid":"002dHioU04uDVj","type":0,"switch":3751735,"albumname":"热爱就一起","vid":"v00308yf23j","rate":23,"stream":13,"songorig":"热爱就一起","songtype":0,"isonly":0,"albumdesc":"","albummid":"0029q3xa2xXPXi","albumid":6620953,"msgid":0,"pay":{"payplay":0,"payalbum":0,"paydownload":0,"paytrackmouth":0,"paytrackprice":0,"payalbumprice":0,"payinfo":0,"timefree":0},"size128":2654256,"sizeflac":20353677,"label":"0","sizeogg":3912991,"songname":"热爱就一起","size320":6635318,"strMediaMid":"002dHioU04uDVj","sizeape":0,"size5_1":0,"interval":165,"alertid":11,"cdIdx":0,"songid":231407063},"price":320,"listenCount":0,"Fupload_time":"2019-04-12 18:21:55","index":19,"isnew":1,"playurl":""},{"vid":{"Fmv_id":"1453308","Fstatus":"1","Fvid":"w0026hnkr6z"},"Flisten_count1":0,"musicData":{"preview":{"tryend":78324,"trybegin":46223,"trysize":960887},"belongCD":6,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948},{"name":"张靓颖","mid":"000aw4WC2EQYTv","id":4607}],"songmid":"002yMPiX3tRqyL","type":0,"switch":17422081,"albumname":"王牌对王牌第三季 第8期","vid":"w0026hnkr6z","rate":31,"stream":13,"songorig":"雨蝶","songtype":0,"isonly":1,"albumdesc":"","albummid":"004QfBJm1Nbwms","albumid":3961463,"msgid":13,"pay":{"payplay":1,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":4078271,"sizeflac":28704493,"label":"0","sizeogg":5436542,"songname":"雨蝶 (Live)","size320":10195313,"strMediaMid":"002yMPiX3tRqyL","sizeape":28748038,"size5_1":0,"interval":254,"alertid":41,"cdIdx":0,"songid":213374392},"price":320,"listenCount":0,"Fupload_time":"2018-03-16 17:51:52","index":20,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"1494611","Fstatus":"1","Fvid":"j00280de2wp"},"Flisten_count1":0,"musicData":{"preview":{"tryend":105296,"trybegin":65307,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"000zBURs2OgW6n","type":0,"switch":636675,"albumname":"毒苹果","vid":"j00280de2wp","rate":23,"stream":13,"songorig":"那一夜","songtype":0,"isonly":0,"albumdesc":"","albummid":"000Qy6FL03pkEU","albumid":4809788,"msgid":14,"pay":{"payplay":0,"payalbum":1,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":700,"payinfo":1,"timefree":0},"size128":3745540,"sizeflac":25468845,"label":"0","sizeogg":5138597,"songname":"那一夜","size320":9363538,"strMediaMid":"100zBURs2OgW6n","sizeape":0,"size5_1":0,"interval":234,"alertid":2,"cdIdx":0,"songid":218269406},"price":320,"listenCount":0,"Fupload_time":"2018-10-17 11:51:14","index":21,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"1262111","Fstatus":"1","Fvid":"u00237zy1v7"},"Flisten_count1":0,"musicData":{"preview":{"tryend":97014,"trybegin":67728,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"004cRkew2I7Zil","type":0,"switch":3751735,"albumname":"红蔷薇白玫瑰","vid":"u00237zy1v7","rate":31,"stream":13,"songorig":"红蔷薇白玫瑰","songtype":0,"isonly":0,"albumdesc":"","albummid":"004TGXEy0UxhfJ","albumid":1509968,"msgid":0,"pay":{"payplay":0,"payalbum":0,"paydownload":0,"paytrackmouth":0,"paytrackprice":0,"payalbumprice":0,"payinfo":0,"timefree":0},"size128":4527973,"sizeflac":29348853,"label":"4611686018431582209","sizeogg":6410642,"songname":"红蔷薇白玫瑰","size320":11319601,"strMediaMid":"004cRkew2I7Zil","sizeape":29462679,"size5_1":0,"interval":282,"alertid":11,"cdIdx":0,"songid":107602436},"price":320,"listenCount":0,"Fupload_time":"2016-07-09 18:29:43","index":22,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"1482240","Fstatus":"1","Fvid":"y00276b4ftu"},"Flisten_count1":0,"musicData":{"preview":{"tryend":76903,"trybegin":44631,"trysize":960887},"belongCD":4,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"0015VjLs2Wksw0","type":0,"switch":17422081,"albumname":"金曲捞第二季 第5期","vid":"y00276b4ftu","rate":31,"stream":13,"songorig":"来自天堂的魔鬼","songtype":0,"isonly":1,"albumdesc":"","albummid":"001JL2ML2az25l","albumid":4362696,"msgid":13,"pay":{"payplay":1,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3940327,"sizeflac":32358997,"label":"0","sizeogg":5333385,"songname":"来自天堂的魔鬼 (Live)","size320":9850479,"strMediaMid":"0015VjLs2Wksw0","sizeape":32335481,"size5_1":0,"interval":246,"alertid":41,"cdIdx":0,"songid":215847838},"price":320,"listenCount":0,"Fupload_time":"2018-08-17 15:50:02","index":23,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"536550","Fstatus":"1","Fvid":"f001700eiv3"},"Flisten_count1":0,"musicData":{"preview":{"tryend":146017,"trybegin":34808,"trysize":0},"belongCD":3,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"004LHkGL1GVdZo","type":0,"switch":636675,"albumname":"新的心跳","vid":"f001700eiv3","rate":31,"stream":13,"songorig":"新的心跳","songtype":0,"isonly":0,"albumdesc":"《极速前进 第二季》真人秀主题曲","albummid":"003c616O2Zlswm","albumid":1196826,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3464257,"sizeflac":28135644,"label":"5764607658342481921","sizeogg":5183228,"songname":"新的心跳","size320":8660167,"strMediaMid":"004LHkGL1GVdZo","sizeape":28056464,"size5_1":0,"interval":216,"alertid":2,"cdIdx":0,"songid":102822120},"price":320,"listenCount":0,"Fupload_time":"2015-07-10 18:17:37","index":24,"isnew":0,"playurl":""},{"Flisten_count1":0,"musicData":{"preview":{"tryend":80527,"trybegin":42931,"trysize":0},"belongCD":6,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"0000rPzC2Wy2GV","type":0,"switch":17413891,"albumname":"2017湖南卫视快乐中国跨年演唱会","vid":"i002051zm1b","rate":1,"stream":13,"songorig":"夜空中最亮的星","songtype":0,"isonly":1,"albumdesc":"","albummid":"000b7cY72yX9Vq","albumid":1799780,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3671179,"sizeflac":0,"label":"0","sizeogg":0,"songname":"夜空中最亮的星 (Live)","size320":0,"strMediaMid":"0000rPzC2Wy2GV","sizeape":0,"size5_1":0,"interval":229,"alertid":21,"cdIdx":0,"songid":200282783},"price":320,"listenCount":0,"Fupload_time":"2017-01-01 21:53:32","index":25,"isnew":0,"playurl":""},{"vid":{},"Flisten_count1":0,"musicData":{"preview":{"tryend":61892,"trybegin":41548,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948},{"name":"艾热","mid":"000djEdv2aAycA","id":944677}],"songmid":"0017rouV01H3u7","type":0,"switch":636675,"albumname":"光年之外（热爱版）","vid":"g0022q7z0um","rate":23,"stream":13,"songorig":"光年之外","songtype":0,"isonly":0,"albumdesc":"","albummid":"002YAM6K2f4hWJ","albumid":5500617,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3481000,"sizeflac":26507192,"label":"0","sizeogg":4872965,"songname":"光年之外 (热爱版)","size320":8702146,"strMediaMid":"001LaE2s1cprks","sizeape":0,"size5_1":0,"interval":217,"alertid":2,"cdIdx":0,"songid":224528315},"price":320,"listenCount":0,"Fupload_time":"2018-12-06 12:20:15","index":26,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"1344333","Fstatus":"1","Fvid":"l0024lkw2x2"},"Flisten_count1":0,"musicData":{"preview":{"tryend":125877,"trybegin":71484,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"003eVmWZ1wHkA0","type":0,"switch":636675,"albumname":"心之焰","vid":"l0024lkw2x2","rate":31,"stream":13,"songorig":"心之焰","songtype":0,"isonly":0,"albumdesc":"《楚乔传》电视剧片尾曲","albummid":"000YGZge12vRwH","albumid":2094649,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":2374634,"sizeflac":15315309,"label":"0","sizeogg":3192692,"songname":"心之焰","size320":5936273,"strMediaMid":"003eVmWZ1wHkA0","sizeape":15242826,"size5_1":0,"interval":148,"alertid":2,"cdIdx":0,"songid":202612961},"price":320,"listenCount":0,"Fupload_time":"2017-06-01 16:31:44","index":27,"isnew":0,"playurl":""},{"vid":{},"Flisten_count1":0,"musicData":{"preview":{"tryend":93444,"trybegin":67722,"trysize":960887},"belongCD":7,"singer":[{"name":"华晨宇","mid":"002Vcz8F2hpBQj","id":163550},{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"001Them10AwQVz","type":0,"switch":17422081,"albumname":"歌手第二季 歌王之战","vid":"011TkfGH3mWZ9o","rate":31,"stream":13,"songorig":"光年之外","songtype":0,"isonly":1,"albumdesc":"","albummid":"002TCudF3sqMGh","albumid":4014656,"msgid":13,"pay":{"payplay":1,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":4434757,"sizeflac":56077849,"label":"0","sizeogg":5656521,"songname":"光年之外 (Live)","size320":11086277,"strMediaMid":"003d4DHo3Qy5YM","sizeape":56114999,"size5_1":0,"interval":277,"alertid":41,"cdIdx":0,"songid":213725696},"price":320,"listenCount":0,"Fupload_time":"2018-04-13 18:16:07","index":28,"isnew":0,"playurl":""},{"vid":{"Fmv_id":"1356163","Fstatus":"1","Fvid":"a00244g7ap8"},"Flisten_count1":0,"musicData":{"preview":{"tryend":97515,"trybegin":68860,"trysize":0},"belongCD":1,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"000ezHp20SWP9y","type":0,"switch":3751735,"albumname":"穿越火线","vid":"a00244g7ap8","rate":31,"stream":13,"songorig":"穿越火线","songtype":0,"isonly":0,"albumdesc":"国民枪战游戏《穿越火线》主题曲","albummid":"004cjNY22OzFVF","albumid":2195549,"msgid":0,"pay":{"payplay":0,"payalbum":0,"paydownload":0,"paytrackmouth":0,"paytrackprice":0,"payalbumprice":0,"payinfo":0,"timefree":0},"size128":3143683,"sizeflac":26189235,"label":"0","sizeogg":4828203,"songname":"穿越火线","size320":7858889,"strMediaMid":"000ezHp20SWP9y","sizeape":26108320,"size5_1":0,"interval":196,"alertid":11,"cdIdx":0,"songid":203509499},"price":320,"listenCount":0,"Fupload_time":"2017-08-03 18:24:57","index":29,"isnew":0,"playurl":""},{"vid":{},"Flisten_count1":0,"musicData":{"preview":{"tryend":135197,"trybegin":88458,"trysize":0},"belongCD":2,"singer":[{"name":"潘玮柏","mid":"000iM9BB2TXFqu","id":4359},{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948},{"name":"艾热","mid":"000djEdv2aAycA","id":944677}],"songmid":"004YUIB22WvTWe","type":0,"switch":3751735,"albumname":"中国新说唱 第13期","vid":"013JuOn62GIj1R","rate":23,"stream":13,"songorig":"攀登","songtype":0,"isonly":0,"albumdesc":"","albummid":"001kgcVb1p6Qao","albumid":4747474,"msgid":0,"pay":{"payplay":0,"payalbum":0,"paydownload":0,"paytrackmouth":0,"paytrackprice":0,"payalbumprice":0,"payinfo":0,"timefree":0},"size128":4023945,"sizeflac":57674034,"label":"0","sizeogg":5639239,"songname":"攀登 (Live)","size320":10059484,"strMediaMid":"004YUIB22WvTWe","sizeape":0,"size5_1":0,"interval":251,"alertid":11,"cdIdx":0,"songid":217911288},"price":320,"listenCount":0,"Fupload_time":"2018-10-06 16:19:38","index":30,"isnew":0,"playurl":""}]
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
         * vid : {"Fmv_id":"658093","Fstatus":"1","Fvid":"v001892io9b"}
         * Flisten_count1 : 0
         * musicData : {"preview":{"tryend":144022,"trybegin":42938,"trysize":0},"belongCD":4,"singer":[{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}],"songmid":"004dFFPd4JNv8q","type":0,"switch":636675,"albumname":"新的心跳","vid":"v001892io9b","rate":31,"stream":13,"songorig":"来自天堂的魔鬼","songtype":0,"isonly":0,"albumdesc":"","albummid":"003c616O2Zlswm","albumid":1196826,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0},"size128":3929040,"sizeflac":29903656,"label":"4611686018444165121","sizeogg":5414048,"songname":"来自天堂的魔鬼","size320":9822265,"strMediaMid":"004dFFPd4JNv8q","sizeape":29815674,"size5_1":0,"interval":245,"alertid":2,"cdIdx":0,"songid":104913384}
         * price : 320
         * listenCount : 0
         * Fupload_time : 2015-11-04 15:57:19
         * index : 1
         * isnew : 0
         * playurl :
         */

        private VidBean vid;
        private int Flisten_count1;
        private MusicDataBean musicData;
        private int price;
        private int listenCount;
        private String Fupload_time;
        private int index;
        private int isnew;
        private String playurl;

        public VidBean getVid() {
            return vid;
        }

        public void setVid(VidBean vid) {
            this.vid = vid;
        }

        public int getFlisten_count1() {
            return Flisten_count1;
        }

        public void setFlisten_count1(int Flisten_count1) {
            this.Flisten_count1 = Flisten_count1;
        }

        public MusicDataBean getMusicData() {
            return musicData;
        }

        public void setMusicData(MusicDataBean musicData) {
            this.musicData = musicData;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getListenCount() {
            return listenCount;
        }

        public void setListenCount(int listenCount) {
            this.listenCount = listenCount;
        }

        public String getFupload_time() {
            return Fupload_time;
        }

        public void setFupload_time(String Fupload_time) {
            this.Fupload_time = Fupload_time;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getIsnew() {
            return isnew;
        }

        public void setIsnew(int isnew) {
            this.isnew = isnew;
        }

        public String getPlayurl() {
            return playurl;
        }

        public void setPlayurl(String playurl) {
            this.playurl = playurl;
        }

        public static class VidBean implements Serializable{
            /**
             * Fmv_id : 658093
             * Fstatus : 1
             * Fvid : v001892io9b
             */

            private String Fmv_id;
            private String Fstatus;
            private String Fvid;

            public String getFmv_id() {
                return Fmv_id;
            }

            public void setFmv_id(String Fmv_id) {
                this.Fmv_id = Fmv_id;
            }

            public String getFstatus() {
                return Fstatus;
            }

            public void setFstatus(String Fstatus) {
                this.Fstatus = Fstatus;
            }

            public String getFvid() {
                return Fvid;
            }

            public void setFvid(String Fvid) {
                this.Fvid = Fvid;
            }
        }

        public static class MusicDataBean implements Serializable{
            /**
             * preview : {"tryend":144022,"trybegin":42938,"trysize":0}
             * belongCD : 4
             * singer : [{"name":"G.E.M. 邓紫棋","mid":"001fNHEf1SFEFN","id":13948}]
             * songmid : 004dFFPd4JNv8q
             * type : 0
             * switch : 636675
             * albumname : 新的心跳
             * vid : v001892io9b
             * rate : 31
             * stream : 13
             * songorig : 来自天堂的魔鬼
             * songtype : 0
             * isonly : 0
             * albumdesc :
             * albummid : 003c616O2Zlswm
             * albumid : 1196826
             * msgid : 14
             * pay : {"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1,"timefree":0}
             * size128 : 3929040
             * sizeflac : 29903656
             * label : 4611686018444165121
             * sizeogg : 5414048
             * songname : 来自天堂的魔鬼
             * size320 : 9822265
             * strMediaMid : 004dFFPd4JNv8q
             * sizeape : 29815674
             * size5_1 : 0
             * interval : 245
             * alertid : 2
             * cdIdx : 0
             * songid : 104913384
             */

            private PreviewBean preview;
            private int belongCD;
            private String songmid;
            private int type;
            @SerializedName("switch")
            private int switchX;
            private String albumname;
            private String vid;
            private int rate;
            private int stream;
            private String songorig;
            private int songtype;
            private int isonly;
            private String albumdesc;
            private String albummid;
            private int albumid;
            private int msgid;
            private PayBean pay;
            private int size128;
            private int sizeflac;
            private String label;
            private int sizeogg;
            private String songname;
            private int size320;
            private String strMediaMid;
            private int sizeape;
            private int size5_1;
            private int interval;
            private int alertid;
            private int cdIdx;
            private int songid;
            private List<SingerBean> singer;

            public PreviewBean getPreview() {
                return preview;
            }

            public void setPreview(PreviewBean preview) {
                this.preview = preview;
            }

            public int getBelongCD() {
                return belongCD;
            }

            public void setBelongCD(int belongCD) {
                this.belongCD = belongCD;
            }

            public String getSongmid() {
                return songmid;
            }

            public void setSongmid(String songmid) {
                this.songmid = songmid;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getSwitchX() {
                return switchX;
            }

            public void setSwitchX(int switchX) {
                this.switchX = switchX;
            }

            public String getAlbumname() {
                return albumname;
            }

            public void setAlbumname(String albumname) {
                this.albumname = albumname;
            }

            public String getVid() {
                return vid;
            }

            public void setVid(String vid) {
                this.vid = vid;
            }

            public int getRate() {
                return rate;
            }

            public void setRate(int rate) {
                this.rate = rate;
            }

            public int getStream() {
                return stream;
            }

            public void setStream(int stream) {
                this.stream = stream;
            }

            public String getSongorig() {
                return songorig;
            }

            public void setSongorig(String songorig) {
                this.songorig = songorig;
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

            public String getAlbumdesc() {
                return albumdesc;
            }

            public void setAlbumdesc(String albumdesc) {
                this.albumdesc = albumdesc;
            }

            public String getAlbummid() {
                return albummid;
            }

            public void setAlbummid(String albummid) {
                this.albummid = albummid;
            }

            public int getAlbumid() {
                return albumid;
            }

            public void setAlbumid(int albumid) {
                this.albumid = albumid;
            }

            public int getMsgid() {
                return msgid;
            }

            public void setMsgid(int msgid) {
                this.msgid = msgid;
            }

            public PayBean getPay() {
                return pay;
            }

            public void setPay(PayBean pay) {
                this.pay = pay;
            }

            public int getSize128() {
                return size128;
            }

            public void setSize128(int size128) {
                this.size128 = size128;
            }

            public int getSizeflac() {
                return sizeflac;
            }

            public void setSizeflac(int sizeflac) {
                this.sizeflac = sizeflac;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public int getSizeogg() {
                return sizeogg;
            }

            public void setSizeogg(int sizeogg) {
                this.sizeogg = sizeogg;
            }

            public String getSongname() {
                return songname;
            }

            public void setSongname(String songname) {
                this.songname = songname;
            }

            public int getSize320() {
                return size320;
            }

            public void setSize320(int size320) {
                this.size320 = size320;
            }

            public String getStrMediaMid() {
                return strMediaMid;
            }

            public void setStrMediaMid(String strMediaMid) {
                this.strMediaMid = strMediaMid;
            }

            public int getSizeape() {
                return sizeape;
            }

            public void setSizeape(int sizeape) {
                this.sizeape = sizeape;
            }

            public int getSize5_1() {
                return size5_1;
            }

            public void setSize5_1(int size5_1) {
                this.size5_1 = size5_1;
            }

            public int getInterval() {
                return interval;
            }

            public void setInterval(int interval) {
                this.interval = interval;
            }

            public int getAlertid() {
                return alertid;
            }

            public void setAlertid(int alertid) {
                this.alertid = alertid;
            }

            public int getCdIdx() {
                return cdIdx;
            }

            public void setCdIdx(int cdIdx) {
                this.cdIdx = cdIdx;
            }

            public int getSongid() {
                return songid;
            }

            public void setSongid(int songid) {
                this.songid = songid;
            }

            public List<SingerBean> getSinger() {
                return singer;
            }

            public void setSinger(List<SingerBean> singer) {
                this.singer = singer;
            }

            public static class PreviewBean implements Serializable{
                /**
                 * tryend : 144022
                 * trybegin : 42938
                 * trysize : 0
                 */

                private int tryend;
                private int trybegin;
                private int trysize;

                public int getTryend() {
                    return tryend;
                }

                public void setTryend(int tryend) {
                    this.tryend = tryend;
                }

                public int getTrybegin() {
                    return trybegin;
                }

                public void setTrybegin(int trybegin) {
                    this.trybegin = trybegin;
                }

                public int getTrysize() {
                    return trysize;
                }

                public void setTrysize(int trysize) {
                    this.trysize = trysize;
                }
            }

            public static class PayBean implements Serializable{
                /**
                 * payplay : 0
                 * payalbum : 0
                 * paydownload : 1
                 * paytrackmouth : 1
                 * paytrackprice : 200
                 * payalbumprice : 0
                 * payinfo : 1
                 * timefree : 0
                 */

                private int payplay;
                private int payalbum;
                private int paydownload;
                private int paytrackmouth;
                private int paytrackprice;
                private int payalbumprice;
                private int payinfo;
                private int timefree;

                public int getPayplay() {
                    return payplay;
                }

                public void setPayplay(int payplay) {
                    this.payplay = payplay;
                }

                public int getPayalbum() {
                    return payalbum;
                }

                public void setPayalbum(int payalbum) {
                    this.payalbum = payalbum;
                }

                public int getPaydownload() {
                    return paydownload;
                }

                public void setPaydownload(int paydownload) {
                    this.paydownload = paydownload;
                }

                public int getPaytrackmouth() {
                    return paytrackmouth;
                }

                public void setPaytrackmouth(int paytrackmouth) {
                    this.paytrackmouth = paytrackmouth;
                }

                public int getPaytrackprice() {
                    return paytrackprice;
                }

                public void setPaytrackprice(int paytrackprice) {
                    this.paytrackprice = paytrackprice;
                }

                public int getPayalbumprice() {
                    return payalbumprice;
                }

                public void setPayalbumprice(int payalbumprice) {
                    this.payalbumprice = payalbumprice;
                }

                public int getPayinfo() {
                    return payinfo;
                }

                public void setPayinfo(int payinfo) {
                    this.payinfo = payinfo;
                }

                public int getTimefree() {
                    return timefree;
                }

                public void setTimefree(int timefree) {
                    this.timefree = timefree;
                }
            }

            public static class SingerBean implements Serializable{
                /**
                 * name : G.E.M. 邓紫棋
                 * mid : 001fNHEf1SFEFN
                 * id : 13948
                 */

                private String name;
                private String mid;
                private int id;

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
            }
        }
    }
}
