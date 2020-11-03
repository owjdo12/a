import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 계산할 값을 입력하세요 ==> ");
		int a = s.nextInt();
		System.out.print("두 번째 계산할 값을 입력하세요 ==> ");
		int b = s.nextInt();
		System.out.print("세 번째 계산할 값을 입력하세요 ==> ");
		int c = s.nextInt();
		System.out.print("네 번째 계산할 값을 입력하세요 ==> ");
		int d = s.nextInt();
		
		int result = a + b + c + d;
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);
	}

}
