
public class Pet {
	private String type;
	private int month;
	
	public void move() {
		System.out.println(type+"�� �����Դϴ�.");
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
}
