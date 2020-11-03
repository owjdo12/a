
public class Pet {
	private String type;
	private int month;
	static int count = 0;
	
	Pet(String type, int month){
		this.type = type;
		this.month = month;
	}
		
	static int getCount() {
		return count;
	}
	public String getType() {
		return type;
	}
	public int getMonth() {
		return month;
	}
	
	public void move() {
		System.out.println(type+"가 움직입니다.");
	}
}
