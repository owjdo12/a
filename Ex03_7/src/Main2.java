
public class Main2 {

	public static void main(String[] args) {
		int a, b;
		float c, d;
		
		a = 100;
		b = a;
		
		//c = (float)111.1;   (float):ĳ����=���� ����ȯ double->float
		c = 111.1f;
		d = c;
		
		System.out.printf("a, b�� �� => %d, %d\n", a, b);
		System.out.printf("c, d�� �� => %5.1f, %5.1f\n", c, d);

	}

}