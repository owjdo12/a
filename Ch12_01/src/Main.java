import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>();
		list.add("HuhJun Sir.");
		list.add("Lady Yejin");
		list.add("Perl Jin");
		List<String> list2 = new LinkedList<>();
		list2.add("Mr. Joo");
		list2.add("Musician");
		list2.add("Dive Yongjub");
		
		ListIterator<String> iter = list.listIterator();
		Iterator<String> iter2 = list2.iterator();
		while(iter2.hasNext()) {
			if(iter.hasNext()) iter.next();
			iter.add(iter2.next());
		}
		System.out.println(list);
		
		iter2 = list2.iterator();
		while(iter2.hasNext()) {
			iter2.next();
			if(iter2.hasNext()) {
				iter2.next();
				iter2.remove();
			}
		}
		System.out.println(list2);
		
		list.removeAll(list2);
		System.out.println(list);
	}

}
