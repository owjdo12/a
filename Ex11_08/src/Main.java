
public class Main {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.setColor("Yellow");
		myCar1.setSpeed(200);
		
		Car myCar2 = new Car("Yellow", 100);
		//myCar2 = myCar1;
		myCar2.setColor("Yellow");
		myCar2.setSpeed(200);
		
		System.out.printf("myCar1: color= %s, speed= %d\n", myCar1.getColor(), myCar1.getSpeed());
		System.out.printf("myCar2: color= %s, speed= %d\n", myCar2.getColor(), myCar2.getSpeed());
		if(myCar1 == myCar2)
			System.out.println("=");
		else 
			System.out.println("!=");
	}

}
