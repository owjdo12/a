import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° ����� ���� �Է��ϼ��� ==> ");
		float num1 =s.nextFloat();
		System.out.print("�� ��° ����� ���� �Է��ϼ��� ==> ");
		float num2 =s.nextFloat();
		
		System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1+num2);
		System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1-num2);
		System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1*num2);
		System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1/num2);
		System.out.printf("%d %% %d = %d\n", (int)num1, (int)num2, (int)num1%(int)num2);
	}
}
