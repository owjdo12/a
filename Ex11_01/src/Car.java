
public class Car {
	private String color;
	private int speed;
	public int setSpeed;
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(int speed) {
		
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void upSpeed(int value) {
		if (speed + value > 200)
			speed = 200; //�ִ�ӵ�����
		else
			speed += value;
		System.out.println("����ӵ� => "+getSpeed());
	}
	public void downSpeed(int value) {
		if (speed - value < 0)
			speed = 0; //�����ӵ�����
		else
			speed -= value;

		System.out.println("����ӵ� => "+getSpeed());
	}
}
