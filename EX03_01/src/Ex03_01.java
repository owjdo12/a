
public class Ex03_01 {     

	public static void main(String[] args) {
		//���ڿ�
		System.out.printf("%d + %d = %d", 100, 200, 100+200);
		System.out.print("\n");
		System.out.printf("%d / %d = %.1f", 100, 200, 100.0/200.0); //�Ǽ�(�Ҽ���) �ڸ� ���߱�
		System.out.print("\n");
		System.out.printf("%s\n", "I love you.");
		System.out.printf("%15s\n", "I love you.");
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%05d\n", 123);
		System.out.printf("%f\n", 123.45);
		System.out.printf("%7.1f\n", 123.45); //�ݿø�
		System.out.printf("%7.3f\n", 123.45);
		
		//���Ĺ���
		System.out.printf("%s\t%s\n", "I love you", "more than I can say");			// \:Ż�⹮�� ��������
		System.out.printf("%s\n", "He said, \"It's my book.\"");	  //�ο뱸(����) ���� \"
		System.out.printf("%s\n", "c:\\myhome\\test"); 		//���丮����   
	}

}