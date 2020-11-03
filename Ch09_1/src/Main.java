import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStack<Integer> si = new Stack<Integer>(5);
		si.push(10);
		si.push(100);
		si.push(1000);
		/*
		System.out.println(si.size());
		int ret = si.pop();
		System.out.println(ret);
		ret = si.pop();
		System.out.println(ret);
		ret = si.pop();
		System.out.println(ret);
	
		int size = si.size();
		for(int i = 0; i < size; ++i) {
			int r = si.pop();
			System.out.println(r);
		}
			*/
		IStack<Character> sc = new Stack<Character>(5);
		sc.push('c');
		char ch = sc.pop();
		System.out.println(ch);
		
		Point p1 = new Point(10, 20);
		IStack<Point> sp = new Stack<Point>(5);
		sp.push(p1);
		//Point p = sp.pop();
		//System.out.printf("%d, %d\n", p.getX(), p.getY());
		
		IStack<Integer> si2 = new Stack<Integer>(5);
		si2.push(20);
		System.out.printf("si = %d, si2 = %d\n", si.size(), si2.size());
		boolean b = si.compareSize(si2);
		System.out.println(b);
		System.out.printf("si = %d, sp = %d\n", si.size(), sp.size());
		b = si.compareSize(sp);
		System.out.println(b);
	}

}
