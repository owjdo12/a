public class ex15 { //구구단 출력

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++)
				System.out.printf("%d X %d = %d\t", j, i, j*i);
			System.out.println();
		}
	}

}
