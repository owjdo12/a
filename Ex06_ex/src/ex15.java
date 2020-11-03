
public class ex15 {

	public static void main(String[] args) {
		System.out.println("---------------------");
		System.out.println(" 10진수  16진수  문자");
		System.out.println("---------------------");
		
		for(int i=0; i<128; i++) {
			System.out.printf("%5d %5x %5c\n", i, i, i);
		}
	}

}
