package ch05_01;

public class Date {  // user-defined data type 사용자 정의 데이터타입
	private int year = 1990;
	private int month = 1;
	private int day = 1;
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int mm) { // mm : parameter
		month = mm;
	}
	
	public void setDate(int yy, int mm, int dd) {
		int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		/*
		if(yy >= 1990)
			year = yy;
		if(mm > 0 && mm < 13)
			month = mm;
		if(dd > 0 && dd < days[month-1]+1)
			day = dd;		
		*/
		year = max(1990, yy);
		month = max(1, mm);
		month = min(month, 12);
		day = max(1, dd);
		day = min(day, days[month-1]);
	}
	
	public void displayDate() {
		System.out.printf("%04d-%02d-%02d\n", year, month, day);
	}
	
	private int max(int x, int y) {
		if(x > y) 
			return x;
		return y;
	}
	
	private int min(int x, int y) {
		if(x < y)
			return x;
		return y;
	}
}
