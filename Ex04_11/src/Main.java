
public class Main {

	public static void main(String[] args) {
		byte a = 'A', b;
		byte mask = 0x0F;
		
		System.out.printf("%X & %X = %X \n", a, mask, a & mask); //����
		System.out.printf("%X | %X = %X \n", a, mask, a | mask); //����
	
		mask = 'a' - 'A'; //a�� A�� ���� 32
		
		b = (byte)('A' ^ mask);
		System.out.printf(" %c ^ %d = %c \n", a, mask, b);
		a = (byte)('a' ^ mask);
		System.out.printf(" %c ^ %d = %c \n", b, mask, a);
	}

}
