import java.util.Scanner;

public class ex08p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [][] exams = new int[5][4];
		for(int i = 0; i < exams.length; ++i) {
			System.out.printf("%d �л��� ������ �Է��ϼ���..\n", i);
			for(int j = 0; j < exams[i].length; ++j) {
				System.out.printf("%d ��° ���� ���� : ", j);
				exams[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < exams.length; ++i) {
			System.out.printf("%d �л� -----------------\n", i);
			int total = 0;
			for(int j = 0; j < exams[i].length; ++j) {
				System.out.printf("%d ��° ���� : %d\t", j, exams[i][j]);
				total += exams[i][j];
			}
			System.out.printf("��� : %d\n", total/exams[i].length);
		}
	}
}
