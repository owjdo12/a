
interface LambdaExpression<T, V, S> {
	S run(T param1, V param2);
}

public class ex {
	public static <T, V, S> S test1(LambdaExpression<T, V, S> test, T param1, V param2) {
	// LambdaExpression �������̽��� run �Լ��� ù��°, �ι�° �Ķ���� �ִ´�.
	return test.run(param1, param2);
	}
	
	public static void main(String... args) {
		int ret = test1((p1, p2) -> {
			return p1 + p2;
		}, 10, 20);

		System.out.println("Result - " + ret);
	}
}
