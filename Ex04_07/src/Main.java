
public class Main {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int max = a > b ? a : b; //표현식1?표현식1:표현식3; 참인경우 표현식2, 거짓인경우 표현식3
		System.out.printf("max = %d, a = %d, b = %d\n", max, a, b);
		
		int x = 3;
		int y = 4;
		int max1 = x > y ? ++x : ++y;
		System.out.printf("max1 = %d, x = %d, y = %d\n", max1, x, y); //연산에 참여되지 않은 표현식은 실행x ==> x=3
		
		int j = 99;
		System.out.printf("AND연산 : %s \n", (j>= 100) && (j <= 200));
		System.out.printf("OR연산 : %s \n", (j>= 100) || (j <= 200));
		System.out.printf("NOT연산 : %s \n", !(j == 100));
	}

}
