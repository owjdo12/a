public class HelloJava {

	enum Week {sunday, monday, tuesday, wednesday, thursday, friday, saturday};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = Utility.add(10,  20);
		r = Utility.multiply(2, 3);
		Utility.subtract(20, 3);
		Utility.foo(10, 20, 30, 40, 50);
		Utility.foo(100, 200);
		Utility.foo(true, false);
		Utility.foo("I love you", 10, 20);
	}

}
