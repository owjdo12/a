import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int num1 = s.nextInt();
		
		System.out.print("����� �����ڸ� �Է��ϼ��� : ");
		char op = s.next().charAt(0);
		
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int num2 = s.nextInt();
		
		if(op == '+')
			System.out.printf("%d + %d = %d �Դϴ�.", num1, num2, num1+num2);
		if(op == '-')
			System.out.printf("%d - %d = %d �Դϴ�.", num1, num2, num1-num2);
		if(op == '*')
			System.out.printf("%d * %d = %d �Դϴ�.", num1, num2, num1*num2);
		if(op == '/')
			System.out.printf("%d / %d = %d �Դϴ�.", num1, num2, num1/num2);
		if(op == '%')
			System.out.printf("%d %% %d = %d �Դϴ�.", num1, num2, num1%num2);
			
	}
}
