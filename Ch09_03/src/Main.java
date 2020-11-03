
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
		
		//비교		
		int r = Util.min(10, 20);
		System.out.println(r);
		Point r2 = Util.min(new Point(10, 20), new Point(100, 200));
		System.out.printf("%d, %d\n", r2.getX(), r2.getY());
		
		String r3 = Util.min("당신을 미워합니다.", "사랑합니다."); //ㄷ < ㅅ
		System.out.println(r3);
		
		String r4 = Util.max("당신을 미워합니다.", "사랑합니다."); 
		System.out.println(r4);
		Point r5 = Util.max(new Point(1000, 2000), new Point(100, 200));
		System.out.printf("%d, %d\n", r5.getX(), r5.getY());

	}

}
