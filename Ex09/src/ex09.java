public class ex09 {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		String str3 = new String("Java Programming");
		
		System.out.println("�� ���ڿ� ==> ["+ str1 +"]");
		System.out.println("�� ���ڿ� ==> ["+ str2 +"]");
		System.out.println("�� ���ڿ� ==> ["+ str3 +"]\n");
		
		System.out.println("���ڿ�1==���ڿ�2 ���:\t\t"+(str1 == str2));
		System.out.println("���ڿ�1.equals(���ڿ�2) ���:\t"+ str1.equals(str2));
		System.out.println("���ڿ�1==���ڿ�3 ���:\t\t"+(str1 == str3));				// ==�� ���� ������� ��� �����ÿ��� true
		System.out.println("���ڿ�1.equals(���ڿ�3) ���:\t"+ str1.equals(str3));	// equals�� ���� ���� �� true
	}

}

