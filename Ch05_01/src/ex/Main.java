package ex;

public class Main {

	public static void main(String[] args) {
		Date myDate = new Date();   // reference type refer to
		
		int month = myDate.getMonth();
		System.out.println(month);
		
		//myDate.setMonth(13);
		//myDate.setDate(2020, 11, 31);

		myDate.displayDate();
		
		Date currentDate;
		
		currentDate = new Date(2020, 10, 23);
		currentDate.displayDate();
		
		Date yourDate = new Date(2000, 12, 31);
		System.out.println("----");
		yourDate.displayDate();
		
		yourDate = currentDate;
		yourDate.displayDate();
		
		yourDate.setDate(1960, 9, 9);
		yourDate.displayDate();
		currentDate.displayDate();

		System.out.println(currentDate);
		System.out.println(yourDate);
		
		System.out.println(myDate);
		
	}

}
