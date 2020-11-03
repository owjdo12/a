
public class ex21 {

	public static void main(String[] args) {
		int[][][] array = new int[10][10][10];
		int index=1, total=0;
		int i, j, k;
		for(i=0; i<10; i++) {
			for (j=0; j<10; j++) {
				for( k=0; k<10; k++) {
					array[i][j][k]=index++;
				}
			}
		}
		for (i=0; i<10; i++)
			for(j=0; j<10; j++)
				for(k=0; k<10; k++)
					total += array[i][j][k];
		System.out.printf("1~1000까지 합계: %d", total);
	}

}
