public class Main{
	public static void main(String[] args){
		School[] schools = new School[5];
		School school1 = new School("临沂第十九中学","罗庄","高中","4000");
        schools[0] = school1;
		School school2 = new School("临沂第十八中学","兰山","初中","2000");
        schools[1] = school2;
		School school3 = new School("临沂第十七中学","沂水","初中","2000");
        schools[2] = school3;
		School school4 = new School("临沂第十六中学","郯城","高中","4000");
        schools[3] = school4;
		School school5 = new School("临沂第十五中学","罗庄","小学","1000");
        schools[4] = school5;
	    for(int i = 0;i<schools.length;i++){
            schools[i].say();
        }
	}
}