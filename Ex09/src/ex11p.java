import java.util.Scanner;

public class ex11p {
	static int coffeeMachine(int button) {
		System.out.printf("\n#1. �ڵ����� �߰ſ� ���� �غ��Ѵ�.\n");
		System.out.printf("#2. ���������� �غ��Ѵ�.\n");
		
		switch (button) {
		case 1:
			System.out.printf("�ڵ����� ����Ŀ�Ǹ� ź��.\n");
			break;
		case 2:
			System.out.printf("�ڵ����� ����Ŀ�Ǹ� ź��.\n");
			break;
		case 3:
			System.out.printf("�ڵ����� ��Ŀ�Ǹ� ź��.\n");
			break;
		default:
			System.out.printf("�ڵ����� �ƹ��ų� ź��.\n");
			break;
		}
		
		System.out.printf("#4. �ڵ����� ���� �״´�.\n");
		System.out.printf("#5. �ڵ����� ��Ǭ���� ��� ���δ�.\n");
		
		return 0;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int coffee;
		int ret;
		
		System.out.printf("A��, � Ŀ�Ǹ� �帱���? (1.���� 2.���� 3. ��)");
		coffee = s.nextInt();
		ret = coffeeMachine(coffee);
		System.out.printf("A��, Ŀ�� �����ֽ��ϴ�.\n");
		
		System.out.printf("B��, � Ŀ�Ǹ� �帱���? (1.���� 2.���� 3. ��)");
		coffee = s.nextInt();
		ret = coffeeMachine(coffee);
		System.out.printf("B��, Ŀ�� �����ֽ��ϴ�.\n");
		
		System.out.printf("C��, � Ŀ�Ǹ� �帱���? (1.���� 2.���� 3. ��)");
		coffee = s.nextInt();
		ret = coffeeMachine(coffee);
		System.out.printf("C��, Ŀ�� �����ֽ��ϴ�.\n");
	}

}

