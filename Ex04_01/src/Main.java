
public class Main {

	public static void main(String[] args) {
		int a;
		int b = 5;
		int c = 3;
		
		a = b + c;
		System.out.printf("%d + %d = %d\n", b, c, a);
		a = b - c;
		System.out.printf("%d - %d = %d\n", b, c, a);
		a = b * c;
		System.out.printf("%d * %d = %d\n", b, c, a);
		a = b / c;
		System.out.printf("%d / %d = %d\n", b, c, a);
		a = b % c;
		System.out.printf("%d % %d = %d\n", b, c, a);
	
		short s1 = 10000;
		short s2 = 20000;
		short s3 = (short)(s1 + s2); //강제 형변환
		System.out.println(s3);
		
		float f1 = 20000.0f;
		double d1 = 30000.1234;
		
		//d1 = f1;
		f1 = (float)d1;
		System.out.printf("%f : %f\n", f1, d1);
		
		long l1 = 200000000000000L;
		f1 = l1;
		d1 = l1;
		
		System.out.printf("%f, %f\n", f1, d1);
		
	}

}
