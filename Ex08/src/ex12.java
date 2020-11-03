import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] stack = new char[5];
		int select=0;
		int top=0;
		char carName='A';
		
		while(select !=3) {
			System.out.print("<1>자동차 넣기 <2>자동차 빼기 <3>끝 : ");
			select = s.nextInt();
		
			switch (select){
				case 1:
					if (top == 5) {
						System.out.print("터널이 꽉 차서 못들어감\n");
					}else {
						stack[top]=carName++;
						System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
						top++;
					}break;
					
				case 2:
					if (top == 0) {
						System.out.print("빠져나갈 자동차 없음\n");
					}else {
						top--;
						System.out.printf("%c 자동차가 터널에서 빠짐\n", stack[top]);
						stack[top]=' ';
					}break;
				
				case 3:
					System.out.printf("현재 터널에 %d대가 있음\n", top);
					System.out.printf("프로그램을 종료합니다.");
					break;
					
				default:
					System.out.print("잘못 입력했습니다. 다시 입력하세요.\n");
			}
		
		}
	}

}
