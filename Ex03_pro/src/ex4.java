import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� ==> ");
		num = s.nextInt();
		
		System.out.printf("10���� ==> %d \n", num);
		System.out.printf("16���� ==> %X \n", num);
		System.out.printf("8���� ==> %o \n", num);
	}

}
