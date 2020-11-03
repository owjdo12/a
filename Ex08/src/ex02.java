import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4]; //정수형 배열선언
		int total;
		
		System.out.print("1번째 숫자를 입력하세요 : ");
		aa[0] = s.nextInt();
		System.out.print("2번째 숫자를 입력하세요 : ");
		aa[1] = s.nextInt();
		System.out.print("3번째 숫자를 입력하세요 : ");
		aa[2] = s.nextInt();
		System.out.print("4번째 숫자를 입력하세요 : ");
		aa[3] = s.nextInt();
		
		total=aa[0]+aa[1]+aa[2]+aa[3];
		
		System.out.printf("합계 ==> %d", total);
	}

}
