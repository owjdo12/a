import java.util.Scanner;

public class ex23 {		//입력된 문자열 거꾸로 출력
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String tt = "";
		
		System.out.print("문자열을 입력하세요 : ");
		String str = s.nextLine();
		
		for(int i=0; i<str.length(); ++i) {
			tt += str.charAt(str.length()-(i+1));
		}
		System.out.printf("내용을 거꾸로 출력 ==> %s\n", tt);
	}
}


//		Scanner s = new Scanner(System.in);
//		String ec = "";
//		
//		System.out.print("문자열을 입력하세요 : ");
//		String str = s.nextLine();
//		int count = str.length();
//		
//		for (int i=0; i<count; ++i) {
//			ec += str.charAt(count-(i+1));
//		}
//		
//		System.out.printf("내용을 거꾸로 출력 ==> %s \n", ec);



//public static void main(String[] args) {
//	String str;
//	String[] str2;
//	Scanner sc = new Scanner(System.in);
//	System.out.print("문자열을 입력하시오");
//	str = sc.nextLine();
//	str2 = str.split("");
//	for(int i = 0; i <str.length(); i++){
//		System.out.print(str2[str.length()-1-i]);
//		}
//}

