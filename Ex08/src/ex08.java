public class ex08 {

	public static void main(String[] args) {
		int [][] aa = new int[3][4];	//2차원 배열 선언
		int i, k;						//배열의 첨자로 쓸 변수
		int val = 1;					//배열에 들어갈 값 초기화
		
		for (i=0; i<3; i++) {			//앞 첨자 변경(행 단위 변경-세로)
			for (k=0; k<4; k++) {		//뒤 첨자 변경(열 단위 변경-가로)
				aa[i][k] = val;			//배열에 val값 입력 후 +1
				val++;
			}
		}
		
		System.out.printf("aa[0][0]부터 aa[2][3]까지 출력\n");
		
		for (i=0; i<3; i++) {			//입력과 같은 방식의 출력
			for(k=0; k<4; k++) {
				System.out.printf("%5d", aa[i][k]);
			}
			System.out.printf("\n");
		}
	}

}
