import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.print("������ �Է��ϼ��� : ");
		a = s.nextInt();
		
		if(a % 2 == 0)
			System.out.println("¦���� �Է��߽��ϴ�.");
		else
			System.out.println("Ȧ���� �Է��߽��ϴ�.");
	}

}
