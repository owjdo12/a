import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1번째 숫자를 입력하세요 : ");
		int first = s.nextInt();
		System.out.print("2번째 숫자를 입력하세요 : ");
		int second = s.nextInt();
		System.out.print("3번째 숫자를 입력하세요 : ");
		int third = s.nextInt();
		System.out.print("4번째 숫자를 입력하세요 : ");
		int fourth = s.nextInt();
		
		int total= first+second+third+fourth;
		System.out.printf("합계 ==> %d\n", total);
	}

}
