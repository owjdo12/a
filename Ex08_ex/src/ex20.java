
public class ex20 {

	public static void main(String[] args) {
		int[][] dan = new int[9][9];
		
		for(int i=1; i<9; i++) {
			for (int k=1; k<9; k++) {
				dan[i][k] = i*k;
			}
		}
		for (int i=1; i<9; i++) {
			for (int k=1; k<9; k++) {
				System.out.printf("%d * %d = %d\t", k, i, dan[i][k]);
			}
			System.out.println();
		}
	}

}
