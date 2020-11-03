public class Utility {
	private Utility() {
		
	}
	public static int add(int i, int j) {
		return i + j;
	}
	public static int subtract(int i, int j) {
		return i - j;
	}
	public static int multiply(int i, int j) {
		return i * j;
	}
	public static int divide(int i, int j) {
		return i / j;
	}
	
	public static void foo(int ... v) {
		System.out.print("인수 개수 : " + v.length + "개 인수값 :");
		for(int i = 0; i < v.length; ++i)
			System.out.print(v[i] + ", ");
		System.out.println();

	}	
	public static void foo(boolean ... v) {
		System.out.println("foo(boolean ... v)");
	}
	public static void foo(String msg, int ... v) {
		System.out.println("foo(String msg, int ... v)");
	}

}
