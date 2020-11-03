import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.printf("합계의 시작값 ==> ");
		int start=s.nextInt();
		
		System.out.print("합계의 끝값 ==> ");
		int last=s.nextInt();
		
		System.out.print("배수 ==> ");
		int dan = s.nextInt();
		
		int total = 0;
		for(int i=start; i<=last; i++) {
			if (i%dan==0) {
				total = total+i;
			}
						
		}System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d\n", start, last, dan, total);	
	}
}