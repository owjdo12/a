
public class ex01 {

	public static void main(String[] args) {
		
		int total = 0;
		for (int i = 1; i <= 10; ++i) {
			total += i;
			System.out.printf("%d 번째 합계: %d\n", i, total);
		}
		System.out.println(total);
	}

}
