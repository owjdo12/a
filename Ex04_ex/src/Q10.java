import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int year = s.nextInt();
		
		if (((year%4==0) && (year%100!=0)) || (year%400==0))		
			System.out.printf("%d ���� �����Դϴ�.", year);
		
		else
			System.out.printf("%d ���� ������ �ƴմϴ�.", year);
	}
}
