
public class ex03 {

	public static void main(String[] args) {
		int a = 100, b = 0;
		int result;
		try {
			result = a/b;
		}catch(ArithmeticException e) {
			System.out.print("�߻����� ==> ");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("����ó���Ǿ����ϴ�.");
		}
	}

}
