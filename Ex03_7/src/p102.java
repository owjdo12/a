
public class p102 {

	public static void main(String[] args) {
		int a, b, c, d; //선언
		
		a = 100 + 100; //=:대입연산자(오른쪽의 것이 왼쪽에 대입)
		b = a + 100;
		c = a + b - 100;
		d = a + b + c;
		System.out.printf("a, b, c, d의 값 ==> %d, %d, %d, %d\n", a, b, c, d);
		
		a = b = c = d = 100; //저장
		System.out.printf("a, b, c, d의 값 ==> %d, %d, %d, %d\n", a, b, c, d);
		
		a = 100; //a:lvalue (left value)변수, b:rvalue(right value) 변수, 상수
		a = a + 200;
		System.out.printf("a 의 값 ==> %d\n", a);
	}

}
