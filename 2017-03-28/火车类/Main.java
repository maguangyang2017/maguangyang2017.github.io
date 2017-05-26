public class Main{
	public static void main(String[] args){
		Train[] trains = new Train[5];
		Train train1 = new Train("动车","和谐号",100001,"北京","临沂,石家庄","上海");
        trains[0] = train1;
		Train train2 = new Train("高铁","天使号",100002,"天津","临沂,石家庄","海南");
        trains[1] = train2;
		Train train3 = new Train("高铁","天地号",100003,"南京","临沂,四川","云南");
        trains[2] = train3;
		Train train4 = new Train("普通","成功号",100004,"上海","临沂,河南","青海");
        trains[3] = train4;
		Train train5 = new Train("动车","圆满号",100005,"海南","临沂,石家庄","乌鲁木齐");
        trains[4] = train5;
	    for(int i = 0;i<trains.length;i++){
            trains[i].say();
        }
	}
}
/**火车类
		火车类型
		火车名字
		火车编号
		火车始发点
		火车途经点
		火车终点
*/