import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] queue= new char[5];
		
		char carName='A';
		int select=0;
		int rear=0;
		while(select != 3) {
			System.out.print("<1>�ڵ��� �ֱ� <2>�ڵ��� ���� <3>�� : ");
			select = s.nextInt();
			
			switch(select) {
				case 1:
					if(rear>=5) {
						System.out.print("����\n");
					}else {
						queue[rear] = carName++;
						System.out.printf("%c �ڵ����� �ͳο� �� \n", queue[rear]);
						rear++;
					}
					break;
				case 2:
					if(rear<=1) {
						System.out.print("���ͳ�\n");
					}else {
						System.out.printf("%c �ڵ����� �ͳο��� ���� \n", queue[0]);
						for (int i=0; i<4; i++)
							queue[i]=queue[i+1];
						rear--;
					}
					break;
				case 3:
					System.out.printf("���� �ͳο� %d�밡 ����.\n", rear);
					break;
				default:
					System.out.print("�߸��Է��߽��ϴ�. �ٽ� �Է��ϼ���.\n");
			}
		}
		
	}

}
