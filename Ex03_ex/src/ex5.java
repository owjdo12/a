import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		
		System.out.print("입력진수 결정 <1>10 <2>16 <3>8 : ");
		int type = s.nextInt();
		
		System.out.print("값 읿력 : ");
		int data;
		String str = s.next();
		if (type == 1)
			data = Integer.parseInt(str, 10);
		else if (type == 2) 
			data = Integer.parseInt(str, 16);		
		else
			data = Integer.parseInt(str, 8);
		
		System.out.printf("10진수 ==> %d \n", data);
		System.out.printf("16진수 ==> %x \n", data);
		System.out.printf("8진수 ==> %o \n", data);
	}

}
