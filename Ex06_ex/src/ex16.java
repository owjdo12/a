import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է� : ");
		String str= s.nextLine();
		
		System.out.printf("�Է��� ���ڿ� ==> %s\n", str);
		System.out.printf("��ȯ�� ���ڿ� ==> ");
		
		int strCnt = str.length(); //�Էµ� ������ ���� ���
		
		for (int i=strCnt-1; i>=0; i--) {
			System.out.printf("%c", str.charAt(i));
		}
	}

}
