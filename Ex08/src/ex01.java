import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
		int first = s.nextInt();
		System.out.print("2��° ���ڸ� �Է��ϼ��� : ");
		int second = s.nextInt();
		System.out.print("3��° ���ڸ� �Է��ϼ��� : ");
		int third = s.nextInt();
		System.out.print("4��° ���ڸ� �Է��ϼ��� : ");
		int fourth = s.nextInt();
		
		int total= first+second+third+fourth;
		System.out.printf("�հ� ==> %d\n", total);
	}

}
