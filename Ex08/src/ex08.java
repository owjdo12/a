public class ex08 {

	public static void main(String[] args) {
		int [][] aa = new int[3][4];	//2���� �迭 ����
		int i, k;						//�迭�� ÷�ڷ� �� ����
		int val = 1;					//�迭�� �� �� �ʱ�ȭ
		
		for (i=0; i<3; i++) {			//�� ÷�� ����(�� ���� ����-����)
			for (k=0; k<4; k++) {		//�� ÷�� ����(�� ���� ����-����)
				aa[i][k] = val;			//�迭�� val�� �Է� �� +1
				val++;
			}
		}
		
		System.out.printf("aa[0][0]���� aa[2][3]���� ���\n");
		
		for (i=0; i<3; i++) {			//�Է°� ���� ����� ���
			for(k=0; k<4; k++) {
				System.out.printf("%5d", aa[i][k]);
			}
			System.out.printf("\n");
		}
	}

}
