package exception;
/*
 * Error(�ذ���� -��ǻ�ʹٿ�..)
 * Exception(����)
 * ������ ���� - �ڵ��� �� ��Ŭ�������� �˷���
 * ��Ÿ�� ���� - ���� �� �� ��Ÿ���� ���ܻ���
 */
public class ExceptionTest {

	public static void main(String[] args) {
		//������ ����
		//Class.forName("java.lang.String2");
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("�Է°��� Ȯ���� �ּ���");
		}
	}

}
