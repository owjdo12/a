public class ex09 {

	public static void main(String[] args){
		int hap = 0;
		int i;
		
		for(i=1; i<=100; i++) {
			hap = hap+i;
			
			if(hap>1000)
				break;
		}System.out.printf("1~100�� �տ��� ���ʷ� 1000�� �Ѵ� ��ġ��? : %d, ����?: %d", i, hap);
	}
}
