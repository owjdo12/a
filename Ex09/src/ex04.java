import java.util.Scanner;

public class ex04 { //indexOF(), lastIndexOF()

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ� �Է�: ");
		str = s.nextLine();
		
		System.out.println(str.indexOf("Java"));
		System.out.println(str.lastIndexOf("Java"));
	}

}

