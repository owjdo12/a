
public class ex02 {

	public static void main(String[] args) {
		int[]aa=new int[3];
		try {
			aa[2] = 100/0;
			aa[2] = 100;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ÷�ڰ� �迭ũ�⺸�� Ŀ��");
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ ���ǿ�������");
		}finally {
			System.out.println("�� �κ��� ������ ���Ϳ�");
		}
	}

}
