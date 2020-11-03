
public class Main {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new Map<Integer, String>(5);
		for(int i = 0; i < 5; ++i) {
			m1.push(i, "value"+i);
		}
		String s = m1.get(2);
		System.out.println(s);
		
		for(int i = 0; i < m1.size(); ++i) {
			System.out.printf("key = %d, value = %s\n", i, m1.get(i));
		}
		
		Map<Double, String> m2 = new Map<Double, String>(5);
		for(int i = 0; i < 5; ++i)
			m2.push((double)i, "definition"+i);
		s = m2.get((double)4);
		System.out.println(s);
		
		for(int i = 0; i < m2.size(); ++i) {
			System.out.printf("key = %d, value = %s\n", i, m2.get((double)i));
		}
	}

}
