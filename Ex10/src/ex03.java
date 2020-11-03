
public class ex03 {

	public static void main(String[] args) {
		int a = 100, b = 0;
		int result;
		try {
			result = a/b;
		}catch(ArithmeticException e) {
			System.out.print("발생오류 ==> ");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("정상처리되었습니다.");
		}
	}

}
