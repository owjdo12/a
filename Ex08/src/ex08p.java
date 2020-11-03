import java.util.Scanner;

public class ex08p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [][] exams = new int[5][4];
		for(int i = 0; i < exams.length; ++i) {
			System.out.printf("%d 학생의 성적을 입력하세요..\n", i);
			for(int j = 0; j < exams[i].length; ++j) {
				System.out.printf("%d 번째 시험 성적 : ", j);
				exams[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < exams.length; ++i) {
			System.out.printf("%d 학생 -----------------\n", i);
			int total = 0;
			for(int j = 0; j < exams[i].length; ++j) {
				System.out.printf("%d 번째 시험 : %d\t", j, exams[i][j]);
				total += exams[i][j];
			}
			System.out.printf("평균 : %d\n", total/exams[i].length);
		}
	}
}
