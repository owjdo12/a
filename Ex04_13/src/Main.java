
public class Main {

	public static void main(String[] args) {
		int a = 12345;

		System.out.printf("%d \n", ~a + 1); //비트 부정연산자 = 보수
		
		//시프트연산자>>
		int x= 10;
		System.out.printf("%d를 왼쪽 1회 시프트하면 %d이다.\n", x, x << 1);
		System.out.printf("%d를 왼쪽 2회 시프트하면 %d이다.\n", x, x << 2);
		System.out.printf("%d를 왼쪽 3회 시프트하면 %d이다.\n", x, x << 3);
		//2의n승 10*2 10*4 10*8...
		
		System.out.printf("%d를 오른쪽 1회 시프트하면 %d이다.\n", x, x >> 1);
		System.out.printf("%d를 오른쪽 2회 시프트하면 %d이다.\n", x, x >> 2);
		System.out.printf("%d를 오른쪽 3회 시프트하면 %d이다.\n", x, x >> 3);
		System.out.printf("%d를 오른쪽 4회 시프트하면 %d이다.\n", x, x >> 4);
		//몫만 남음. 1010(10/2) 101(10/4) 10(10/8) 1(10/16)
		
	}

}
