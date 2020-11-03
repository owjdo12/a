import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력 : ");
		String sen = s.nextLine();
	
		int upper_cnt=0, lower_cnt=0, digit_cnt=0;
		int i = 0;
		do {
			char ch = sen.charAt(i); 	//문자열에서 한글자 추출
			
			if(ch >='A' && ch <= 'Z') 	// &&:모두 참 
				upper_cnt++;
			if(ch >='a' && ch <= 'z')
				lower_cnt++;
			if(ch >='0' && ch <= '9')
				digit_cnt++;
			
			i++;
		}while (i < sen.length()); //입력받은 문자열 끝까지 반복
		
		System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개", upper_cnt, lower_cnt, digit_cnt);
		
	}
}