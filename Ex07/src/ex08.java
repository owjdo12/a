import java.util.Scanner;

public class ex08 {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a, b;
		
		while(true) {
			System.out.print("���� ù ���� �� �Է� : ");
			a = s.nextInt();
			System.out.print("���� �� ���� �� �Է� : ");
			b = s.nextInt();
			
			if (a == 0)
				break;
			System.out.printf("%d + %d = %d\n", a, b, a + b);
		}System.out.print("0�� �Է��ؼ� �ݺ����� Ż���߽��ϴ�.");
	}
}
