public class Main{
	public static void main(String[] args){
		Train[] trains = new Train[5];
		Train train1 = new Train("����","��г��",100001,"����","����,ʯ��ׯ","�Ϻ�");
        trains[0] = train1;
		Train train2 = new Train("����","��ʹ��",100002,"���","����,ʯ��ׯ","����");
        trains[1] = train2;
		Train train3 = new Train("����","��غ�",100003,"�Ͼ�","����,�Ĵ�","����");
        trains[2] = train3;
		Train train4 = new Train("��ͨ","�ɹ���",100004,"�Ϻ�","����,����","�ຣ");
        trains[3] = train4;
		Train train5 = new Train("����","Բ����",100005,"����","����,ʯ��ׯ","��³ľ��");
        trains[4] = train5;
	    for(int i = 0;i<trains.length;i++){
            trains[i].say();
        }
	}
}
/**����
		������
		������
		�𳵱��
		��ʼ����
		��;����
		���յ�
*/