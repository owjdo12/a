import java.util.Scanner;

public class explus {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������ : ");
		String str = s.next();
		if(str.equals("+"))
			System.out.println("����� ����մϴ�.");
		else if(str.equals("-"))
			System.out.println("����� �̿��մϴ�.");
		else System.out.println("����� �̿�");
		
		switch(str) {
			case "+":
				System.out.println("����� ����մϴ�.");
				break;
			case "-":
				System.out.println("����� �̿��մϴ�.");
				break;
			default:
				System.out.println("����� �̿�");
		}
		
		
	}
}
