import java.util.Scanner;

public class explus {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("연산자 : ");
		String str = s.next();
		if(str.equals("+"))
			System.out.println("당신을 사랑합니다.");
		else if(str.equals("-"))
			System.out.println("당신을 미워합니다.");
		else System.out.println("사랑도 미움도");
		
		switch(str) {
			case "+":
				System.out.println("당신을 사랑합니다.");
				break;
			case "-":
				System.out.println("당신을 미워합니다.");
				break;
			default:
				System.out.println("사랑도 미움도");
		}
		
		
	}
}
