import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("글자를 입력 : ");
		String str= s.nextLine();
		
		System.out.printf("입력한 문자열 ==> %s\n", str);
		System.out.printf("변환한 문자열 ==> ");
		
		int strCnt = str.length(); //입력된 문자의 개수 계산
		
		for (int i=strCnt-1; i>=0; i--) {
			System.out.printf("%c", str.charAt(i));
		}
	}

}
