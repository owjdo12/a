
public class Car {
	private String color;
	private int speed;
	
	Car(){}
	Car(String color){
		this.color = color;
	}
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
}
