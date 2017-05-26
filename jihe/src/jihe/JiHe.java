package jihe;
import java.util.*;
public class JiHe {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("沙包");
		c1.add("豆包");
		c1.add("豆沙包");
//		Collection c2 = new ArrayList();
//		c2.add("包公");
//		c2.add("关公");
//		c2.add("周公");
//		c2.addAll(c1);
//		System.out.println("第二个结合中的元素个数有："+c2.size());
//		迭代器
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
