import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int total;
		
		for(int i=0; i<=3; i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ���: ", i+1);
			aa[i]=s.nextInt();
		}
		
		total=aa[0]+aa[1]+aa[2]+aa[3];
		
		System.out.printf("�հ� ==> %d", total);
	}

}
