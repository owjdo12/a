import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요 ==> ");
		num = s.nextInt();
		
		System.out.printf("10진수 ==> %d \n", num);
		System.out.printf("16진수 ==> %X \n", num);
		System.out.printf("8진수 ==> %o \n", num);
	}

}
