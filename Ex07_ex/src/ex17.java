import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.printf("�հ��� ���۰� ==> ");
		int start=s.nextInt();
		
		System.out.print("�հ��� ���� ==> ");
		int last=s.nextInt();
		
		System.out.print("��� ==> ");
		int dan = s.nextInt();
		
		int total = 0;
		for(int i=start; i<=last; i++) {
			if (i%dan==0) {
				total = total+i;
			}
						
		}System.out.printf("%d���� %d������ %d����� �հ� ==> %d\n", start, last, dan, total);	
	}
}