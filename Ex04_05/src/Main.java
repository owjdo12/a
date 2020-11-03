
public class Main {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		System.out.printf("%d == %d는 %s 이다.\n", a, b, a == b);
		System.out.printf("%d != %d는 %s 이다.\n", a, b, a != b);
		System.out.printf("%d > %d는 %s 이다.\n", a, b, a > b);
		System.out.printf("%d < %d는 %s 이다.\n", a, b, a < b);
		System.out.printf("%d >= %d는 %s 이다.\n", a, b, a >= b);
		System.out.printf("%d <= %d는 %s 이다.\n", a, b, a <= b);
		
		System.out.printf("%d = %d는 %s 이다.\n", a, b, a = b);
	}

}
