
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 myCar1 = new Car1();
		myCar1.setColor("Red");
		myCar1.setSpeed(0);
		myCar1.upSpeed(100);
		Car1 myCar2 = new Car1();
		myCar2.setColor("Blue2");
		myCar2.setSpeed(0);
		myCar2.downSpeed(50);
		Car1 myCar3 = new Car1();
		myCar3.setColor("Yellow");
		myCar3.setSpeed(0);
		myCar3.upSpeed(80);
		myCar3.upSpeed(200);
		System.out.printf("myCar1 : color = %s, speed = %d\n", myCar1.getColor(), myCar1.getSpeed());
		System.out.printf("myCar2 : color = %s, speed = %d\n", myCar2.getColor(), myCar2.getSpeed());
		System.out.printf("myCar3 : color = %s, speed = %d\n", myCar3.getColor(), myCar3.getSpeed());
	}

}
