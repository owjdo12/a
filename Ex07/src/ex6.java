import java.io.IOException;
import java.util.Scanner;

public class ex6 {//ex04

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int menu;
		
		do {
			System.out.printf("\n손님 주문하시겠습니까? \n");
			System.out.printf("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬래요 => ");
			menu = s.nextInt();
			
			if (menu==1)
				System.out.printf("#카페라떼 주문하셧습니다.\n");
			else if (menu==2)
				System.out.printf("#카푸치노 주문하셧습니다.\n");
			else if (menu==3)
				System.out.printf("#아메라카노 주문하셧습니다.\n");
			else if (menu==4)
				System.out.printf("#주문하신 커피 준비하겠습니다.\n");
			else
				System.out.printf("잘못 주문하셨습니다.\n");
		}while(menu != 4);
	}

}
