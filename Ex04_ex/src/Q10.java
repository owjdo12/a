import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = s.nextInt();
		
		if (((year%4==0) && (year%100!=0)) || (year%400==0))		
			System.out.printf("%d 년은 윤년입니다.", year);
		
		else
			System.out.printf("%d 년은 윤년이 아닙니다.", year);
	}
}
