import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���ڿ��� �Է� : ");
		String sen = s.nextLine();
	
		int upper_cnt=0, lower_cnt=0, digit_cnt=0;
		int i = 0;
		do {
			char ch = sen.charAt(i); 	//���ڿ����� �ѱ��� ����
			
			if(ch >='A' && ch <= 'Z') 	// &&:��� �� 
				upper_cnt++;
			if(ch >='a' && ch <= 'z')
				lower_cnt++;
			if(ch >='0' && ch <= '9')
				digit_cnt++;
			
			i++;
		}while (i < sen.length()); //�Է¹��� ���ڿ� ������ �ݺ�
		
		System.out.printf("�빮�� %d��, �ҹ��� %d��, ���� %d��", upper_cnt, lower_cnt, digit_cnt);
		
	}
}