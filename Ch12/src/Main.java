import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		for(int i = 0; i < 10; ++i)
			list.add("List"+i);
		
		list.remove(1);
		list.remove("Three");
		for(String s : list)
			System.out.println(s);
		
		int size = list.size();
		System.out.println("Size : " + size);
		
		String [] arrs = new String[list.size()];
		arrs = list.toArray(arrs);
		for(String s : arrs)
			System.out.println(s);
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}

}
