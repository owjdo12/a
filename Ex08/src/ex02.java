import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4]; //������ �迭����
		int total;
		
		System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
		aa[0] = s.nextInt();
		System.out.print("2��° ���ڸ� �Է��ϼ��� : ");
		aa[1] = s.nextInt();
		System.out.print("3��° ���ڸ� �Է��ϼ��� : ");
		aa[2] = s.nextInt();
		System.out.print("4��° ���ڸ� �Է��ϼ��� : ");
		aa[3] = s.nextInt();
		
		total=aa[0]+aa[1]+aa[2]+aa[3];
		
		System.out.printf("�հ� ==> %d", total);
	}

}
