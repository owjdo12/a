import java.util.Scanner;

public class ex14 {
	static int calc(int a, int b, int op) {
		int result = -1;
		
		switch(op) {
			case 1:
				result = a + b;
				break;
			case 2:
				result = a - b;
				break;
			case 3:
				result = a * b;
				break;
			case 4:
				if (b != 0)
					result = a / b;
				break;
			default:
				result = 0;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1)+, 2)-, 3)*, 4)/ : ");
		int op = s.nextInt();
			
		System.out.print("첫 번째 숫자: ");
		int a = s.nextInt();
		System.out.print("두 번째 숫자: ");
		int b = s.nextInt();
		
		int result = calc(a, b, op);
		
		System.out.printf("계산결과 : %d\n", result);
	}

}
