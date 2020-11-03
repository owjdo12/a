
import java.util.Scanner;

public class ex24 { 	//대소문자 변환
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String in, out = "";
		char ch;
		int count, i;
		int diff ='a' - 'A';
		
		System.out.printf("문자열을 입력하세요: ");
		in = s.nextLine();
		
		count = in.length();
		
		for (i=0; i<count; i++) {
			ch = in.charAt(i);
			if (('A' <= ch)&&(ch <= 'Z'))
				out += (char)(ch + diff);
			else if(('a' <= ch)&&(ch <= 'z'))
				out += (char) (ch-diff);
			else 
				out += (char)ch;
		}
		System.out.printf("변환된 문자열 ==> %s \n", out);
		
		
		
		System.out.println(diff);
		System.out.println('A'-'a');
	}

}




//public static void main(String[] args) {
//	String str;
//	String str2="";
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("문자열 입력하시오:");
//	str = sc.nextLine();
//	
//	for(int i = 0; i <str.length(); i++) {
//		if('a'<= (char) str.charAt(i)&& (char) str.charAt(i)<= 'z' ) {
//			str2 += (char)(str.charAt(i)-32);
//		}
//		else if('A'<= (char) str.charAt(i)&& (char) str.charAt(i)<= 'Z' ) {
//			str2 += (char)(str.charAt(i)+32);
//		}
//		else {
//			str2 += str.charAt(i);
//		}
//		
//		
//	}
//	System.out.print(str2);
//
//}
//
//}


