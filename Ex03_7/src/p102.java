
public class p102 {

	public static void main(String[] args) {
		int a, b, c, d; //����
		
		a = 100 + 100; //=:���Կ�����(�������� ���� ���ʿ� ����)
		b = a + 100;
		c = a + b - 100;
		d = a + b + c;
		System.out.printf("a, b, c, d�� �� ==> %d, %d, %d, %d\n", a, b, c, d);
		
		a = b = c = d = 100; //����
		System.out.printf("a, b, c, d�� �� ==> %d, %d, %d, %d\n", a, b, c, d);
		
		a = 100; //a:lvalue (left value)����, b:rvalue(right value) ����, ���
		a = a + 200;
		System.out.printf("a �� �� ==> %d\n", a);
	}

}
