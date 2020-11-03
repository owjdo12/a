
class Car1 {
	private String color;
	private int speed;
	
	public void upSpeed(int value) {
		if(speed + value > 200)
			speed = 200;
		else 
			speed += value;
	}
	
	public void downSpeed(int value) {
		if(speed - value < 0)
			speed = 0;
		else
			speed -= value;
	}
	
	public void setColor(String color) {
		if(color.equals("Red") || color.equals("Blue") || color.equals("Yellow") )
			this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSpeed(int speed) {
		if(speed >= 0)
			this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
}
