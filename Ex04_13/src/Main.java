
public class Main {

	public static void main(String[] args) {
		int a = 12345;

		System.out.printf("%d \n", ~a + 1); //��Ʈ ���������� = ����
		
		//����Ʈ������>>
		int x= 10;
		System.out.printf("%d�� ���� 1ȸ ����Ʈ�ϸ� %d�̴�.\n", x, x << 1);
		System.out.printf("%d�� ���� 2ȸ ����Ʈ�ϸ� %d�̴�.\n", x, x << 2);
		System.out.printf("%d�� ���� 3ȸ ����Ʈ�ϸ� %d�̴�.\n", x, x << 3);
		//2��n�� 10*2 10*4 10*8...
		
		System.out.printf("%d�� ������ 1ȸ ����Ʈ�ϸ� %d�̴�.\n", x, x >> 1);
		System.out.printf("%d�� ������ 2ȸ ����Ʈ�ϸ� %d�̴�.\n", x, x >> 2);
		System.out.printf("%d�� ������ 3ȸ ����Ʈ�ϸ� %d�̴�.\n", x, x >> 3);
		System.out.printf("%d�� ������ 4ȸ ����Ʈ�ϸ� %d�̴�.\n", x, x >> 4);
		//�� ����. 1010(10/2) 101(10/4) 10(10/8) 1(10/16)
		
	}

}
