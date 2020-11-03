import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] queue= new char[5];
		
		char carName='A';
		int select=0;
		int rear=0;
		while(select != 3) {
			System.out.print("<1>자동차 넣기 <2>자동차 빼기 <3>끝 : ");
			select = s.nextInt();
			
			switch(select) {
				case 1:
					if(rear>=5) {
						System.out.print("만차\n");
					}else {
						queue[rear] = carName++;
						System.out.printf("%c 자동차가 터널에 들어감 \n", queue[rear]);
						rear++;
					}
					break;
				case 2:
					if(rear<=1) {
						System.out.print("빈터널\n");
					}else {
						System.out.printf("%c 자동차가 터널에서 나옴 \n", queue[0]);
						for (int i=0; i<4; i++)
							queue[i]=queue[i+1];
						rear--;
					}
					break;
				case 3:
					System.out.printf("현재 터널에 %d대가 있음.\n", rear);
					break;
				default:
					System.out.print("잘못입력했습니다. 다시 입력하세요.\n");
			}
		}
		
	}

}
