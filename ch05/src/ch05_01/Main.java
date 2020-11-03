package ch05_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date myDate = new Date();   // reference type refer to
		
		int month = myDate.getMonth();
		System.out.println(month);
		
		myDate.setMonth(month);
		myDate.setDate(2020, 11, 31);

		myDate.displayDate();

	}

}
