
public class Main {

	public static void main(String[] args) {
		byte a = 'A', b;
		byte mask = 0x0F;
		
		System.out.printf("%X & %X = %X \n", a, mask, a & mask); //논리곱
		System.out.printf("%X | %X = %X \n", a, mask, a | mask); //논리합
	
		mask = 'a' - 'A'; //a와 A의 차는 32
		
		b = (byte)('A' ^ mask);
		System.out.printf(" %c ^ %d = %c \n", a, mask, b);
		a = (byte)('a' ^ mask);
		System.out.printf(" %c ^ %d = %c \n", b, mask, a);
	}

}
