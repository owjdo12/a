import java.io.IOException;
import java.util.Scanner;

public class Main {//���ڸ�����

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int guess = 32;
		int value = -1;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		do {
			value = s.nextInt();
			if(value < guess)
				System.out.print("ū ���� �Է��ϼ���");
			if(value > guess)
				System.out.print("���� ���� �Է��ϼ���");
		}while(value != guess);
		
		System.out.print("�����Դϴ�.");
	}
}
