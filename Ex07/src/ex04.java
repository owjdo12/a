import java.io.IOException;
import java.util.Scanner;

public class ex04 {//ex04

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int first, second;
		char op;
		
		while(true){
			System.out.print("계산할 첫번째 수를 입력 : ");
			first= s.nextInt();
			System.out.print("계산할 두번째 수를 입력 : ");
			second= s.nextInt();
			System.out.print("계산할 연산자를 입력하세요(종료하려면 !) : ");
			op = (char)System.in.read();
			if(op == '!')
				break;
			
			switch(op) {
				case '+':
					System.out.printf("%d + %d = %d 입니다.\n", first, second, first+second); 
					break;
				case '-':
					System.out.printf("%d - %d = %d 입니다.\n", first, second, first-second); 
					break;
				case '*':
					System.out.printf("%d * %d = %d 입니다.\n", first, second, first*second); 
					break;
				case '/':
					System.out.printf("%d / %d = %.2f 입니다.\n", first, second, first/(float)second);
					break;
				case '%':
					System.out.printf("%d %% %d = %d 입니다.\n", first, second, first%second); 
					break;
				default:
					System.out.printf("연산자를 잘못 입력했습니다.\n");
			}
			
		}
	}

}
