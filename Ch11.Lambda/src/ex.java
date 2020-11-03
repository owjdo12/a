
interface LambdaExpression<T, V, S> {
	S run(T param1, V param2);
}

public class ex {
	public static <T, V, S> S test1(LambdaExpression<T, V, S> test, T param1, V param2) {
	// LambdaExpression 인터페이스의 run 함수에 첫번째, 두번째 파라미터 넣는다.
	return test.run(param1, param2);
	}
	
	public static void main(String... args) {
		int ret = test1((p1, p2) -> {
			return p1 + p2;
		}, 10, 20);

		System.out.println("Result - " + ret);
	}
}
