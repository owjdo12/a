import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 계산할 값을 입력하세요 ==> ");
		float num1 =s.nextFloat();
		System.out.print("두 번째 계산할 값을 입력하세요 ==> ");
		float num2 =s.nextFloat();
		
		System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1+num2);
		System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1-num2);
		System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1*num2);
		System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1/num2);
		System.out.printf("%d %% %d = %d\n", (int)num1, (int)num2, (int)num1%(int)num2);
	}
}
