import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° ����� ���� �Է��ϼ��� ==> ");
		int a = s.nextInt();
		System.out.print("�� ��° ����� ���� �Է��ϼ��� ==> ");
		int b = s.nextInt();
		System.out.print("�� ��° ����� ���� �Է��ϼ��� ==> ");
		int c = s.nextInt();
		System.out.print("�� ��° ����� ���� �Է��ϼ��� ==> ");
		int d = s.nextInt();
		
		int result = a + b + c + d;
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);
	}

}
