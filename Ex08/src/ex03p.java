import java.util.Scanner;

public class ex03p {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int total=0;
		for(int i=0; i<=aa.length; i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ���: ", i+1);
			total += s.nextInt();
		}
		
		for(int i=0; i<aa.length; i++) {
			total += aa[i];
		}
		
		System.out.printf("�հ� ==> %d", total);
	}

}
