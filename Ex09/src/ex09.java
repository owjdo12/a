public class ex09 {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		String str3 = new String("Java Programming");
		
		System.out.println("원 문자열 ==> ["+ str1 +"]");
		System.out.println("원 문자열 ==> ["+ str2 +"]");
		System.out.println("원 문자열 ==> ["+ str3 +"]\n");
		
		System.out.println("문자열1==문자열2 결과:\t\t"+(str1 == str2));
		System.out.println("문자열1.equals(문자열2) 결과:\t"+ str1.equals(str2));
		System.out.println("문자열1==문자열3 결과:\t\t"+(str1 == str3));				// ==는 값과 저장공간 모두 같은시에만 true
		System.out.println("문자열1.equals(문자열3) 결과:\t"+ str1.equals(str3));	// equals은 값이 같을 시 true
	}

}

