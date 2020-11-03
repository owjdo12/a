import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("## 교환할 돈은?");
		int money = s.nextInt();
				
		int c500 = money / 500;
		money = money % 500;
		
		int c100 = money / 100;
		money = money % 100;
		
		int c50 = money / 50;
		money = money % 50;
		
		int c10 = money / 10;
		money = money % 10;
		
		System.out.printf("오백원짜리 ==> %d\n개", c500);
		System.out.printf("백원짜리 ==> %d\n개", c100);
		System.out.printf("오십원짜리 ==> %d\n개", c50);
		System.out.printf("십원짜리 ==> %d\n개", c10);
		System.out.printf("바꾸지 못한 잔돈 ==> %d원", money);
	}
}
