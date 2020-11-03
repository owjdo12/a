import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayList {
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		
		for (int i=0; i<5; i++) {
			list.add("list"+i);
		}
		
		list.remove(2);
		list.remove(4);
		list.add("3");
		
//		for(String s : list)
//			System.out.println(s);
		
		int size = list.size();
		System.out.println("List size: "+size);
		
//		Iterator<String> iter = list.iterator();
//		while(iter.hasNext()) {
//			String str = iter.next();
//			System.out.println(str);
//		}
//		
		list.clear();
		for(String s : list)
			System.out.println(s);
                                   
	}
}
