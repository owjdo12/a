import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] stack = new char[5];
		int select=0;
		int top=0;
		char carName='A';
		
		while(select !=3) {
			System.out.print("<1>�ڵ��� �ֱ� <2>�ڵ��� ���� <3>�� : ");
			select = s.nextInt();
		
			switch (select){
				case 1:
					if (top == 5) {
						System.out.print("�ͳ��� �� ���� ����\n");
					}else {
						stack[top]=carName++;
						System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
						top++;
					}break;
					
				case 2:
					if (top == 0) {
						System.out.print("�������� �ڵ��� ����\n");
					}else {
						top--;
						System.out.printf("%c �ڵ����� �ͳο��� ����\n", stack[top]);
						stack[top]=' ';
					}break;
				
				case 3:
					System.out.printf("���� �ͳο� %d�밡 ����\n", top);
					System.out.printf("���α׷��� �����մϴ�.");
					break;
					
				default:
					System.out.print("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.\n");
			}
		
		}
	}

}
