import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("## ��ȯ�� ����?");
		int money = s.nextInt();
				
		int c500 = money / 500;
		money = money % 500;
		
		int c100 = money / 100;
		money = money % 100;
		
		int c50 = money / 50;
		money = money % 50;
		
		int c10 = money / 10;
		money = money % 10;
		
		System.out.printf("�����¥�� ==> %d\n��", c500);
		System.out.printf("���¥�� ==> %d\n��", c100);
		System.out.printf("���ʿ�¥�� ==> %d\n��", c50);
		System.out.printf("�ʿ�¥�� ==> %d\n��", c10);
		System.out.printf("�ٲ��� ���� �ܵ� ==> %d��", money);
	}
}
