import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row, col;
		
		System.out.print("�� ������ �Է�: ");
		row= s.nextInt();
		System.out.print("�� ������ �Է�: ");
		col= s.nextInt();
		
		int [][] aa = new int[row][col];
		int i, k;
		int val = 1;
		
		for (i=0; i<row; i++) {
			for (k=0; k<col; k++) {
				aa[i][k] = val;
				val++;
			}
		}
		
		System.out.printf("aa[0][0]���� aa[%d][%d]���� ��� \n", row-1, col-1);
		
		for (i=0; i<row; i++) {
			for (k=0; k<col; k++) {
				System.out.printf("%3d", aa[i][k]);
			}
			System.out.printf("\n");
		}	
	}

}
