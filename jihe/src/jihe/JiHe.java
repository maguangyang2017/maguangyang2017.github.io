package jihe;
import java.util.*;
public class JiHe {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("ɳ��");
		c1.add("����");
		c1.add("��ɳ��");
//		Collection c2 = new ArrayList();
//		c2.add("����");
//		c2.add("�ع�");
//		c2.add("�ܹ�");
//		c2.addAll(c1);
//		System.out.println("�ڶ�������е�Ԫ�ظ����У�"+c2.size());
//		������
		Iterator It = c1.iterator();
		while(It.hasNext()){
			Object obj = It.next();
			System.out.println(obj);
			
		}
		Set set = new TreeSet();
		set.add("aa");
		set.add("bb");
		set.add("dd");
		set.add("cc");
		Iterator interator = set.iterator();
	}

}
