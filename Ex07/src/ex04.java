import java.io.IOException;
import java.util.Scanner;

public class ex04 {//ex04

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int first, second;
		char op;
		
		while(true){
			System.out.print("����� ù��° ���� �Է� : ");
			first= s.nextInt();
			System.out.print("����� �ι�° ���� �Է� : ");
			second= s.nextInt();
			System.out.print("����� �����ڸ� �Է��ϼ���(�����Ϸ��� !) : ");
			op = (char)System.in.read();
			if(op == '!')
				break;
			
			switch(op) {
				case '+':
					System.out.printf("%d + %d = %d �Դϴ�.\n", first, second, first+second); 
					break;
				case '-':
					System.out.printf("%d - %d = %d �Դϴ�.\n", first, second, first-second); 
					break;
				case '*':
					System.out.printf("%d * %d = %d �Դϴ�.\n", first, second, first*second); 
					break;
				case '/':
					System.out.printf("%d / %d = %.2f �Դϴ�.\n", first, second, first/(float)second);
					break;
				case '%':
					System.out.printf("%d %% %d = %d �Դϴ�.\n", first, second, first%second); 
					break;
				default:
					System.out.printf("�����ڸ� �߸� �Է��߽��ϴ�.\n");
			}
			
		}
	}

}
