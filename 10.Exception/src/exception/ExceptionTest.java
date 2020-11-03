package exception;
/*
 * Error(해결못함 -컴퓨터다운..)
 * Exception(예외)
 * 컴파일 예외 - 코딩할 때 이클립스에서 알려줌
 * 런타임 예외 - 실행 할 때 나타나는 예외사항
 */
public class ExceptionTest {

	public static void main(String[] args) {
		//컴파일 예외
		//Class.forName("java.lang.String2");
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("입력값을 확인해 주세요");
		}
	}

}
