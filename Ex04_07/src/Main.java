
public class Main {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int max = a > b ? a : b; //ǥ����1?ǥ����1:ǥ����3; ���ΰ�� ǥ����2, �����ΰ�� ǥ����3
		System.out.printf("max = %d, a = %d, b = %d\n", max, a, b);
		
		int x = 3;
		int y = 4;
		int max1 = x > y ? ++x : ++y;
		System.out.printf("max1 = %d, x = %d, y = %d\n", max1, x, y); //���꿡 �������� ���� ǥ������ ����x ==> x=3
		
		int j = 99;
		System.out.printf("AND���� : %s \n", (j>= 100) && (j <= 200));
		System.out.printf("OR���� : %s \n", (j>= 100) || (j <= 200));
		System.out.printf("NOT���� : %s \n", !(j == 100));
	}

}
