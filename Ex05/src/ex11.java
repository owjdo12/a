import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = s.nextInt();
		
		System.out.print("계산할 연산자를 입력하세요 : ");
		char op = s.next().charAt(0);
		
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = s.nextInt();
		
		if(op == '+')
			System.out.printf("%d + %d = %d 입니다.", num1, num2, num1+num2);
		if(op == '-')
			System.out.printf("%d - %d = %d 입니다.", num1, num2, num1-num2);
		if(op == '*')
			System.out.printf("%d * %d = %d 입니다.", num1, num2, num1*num2);
		if(op == '/')
			System.out.printf("%d / %d = %d 입니다.", num1, num2, num1/num2);
		if(op == '%')
			System.out.printf("%d %% %d = %d 입니다.", num1, num2, num1%num2);
			
	}
}
