import java.util.Scanner;

public class ex5p {

	public static void main(String[] args) {
		int type;
		int data = 0;
		String str;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("입력진수 결정 <1>10 <2>16 <3>8 : ");
		type = s.nextInt();
		
		System.out.print("값 읿력 : ");
		if (type == 1) {
			str = s.next();
			data = Integer.parseInt(str, 10);
			
		}
		if (type == 2) {
			str = s.next();
			data = Integer.parseInt(str, 16);
			
		}
		if (type == 3) {
			str = s.next();
			data = Integer.parseInt(str, 8);
			
		}
		
		System.out.printf("10진수 ==> %d \n", data);
		System.out.printf("16진수 ==> %X \n", data);
		System.out.printf("8진수 ==> %o \n", data);
	}

}
