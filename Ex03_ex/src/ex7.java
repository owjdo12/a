import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		String data;
		Scanner s = new Scanner(System.in);
		int i;
		
		System.out.print("문자열을 입력 ==> ");
		data = s.nextLine();
	
		for (i = data.length()-1; i >= 0; i--) {
			System.out.printf("%c", data.charAt(i));
		}
		System.out.printf("\n");
	}
}
