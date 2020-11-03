
public class Ex11_05 {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.setColor("red");
		myCar1.setSpeed = 0;
		
		Car myCar2 = new Car();
		myCar2.setColor("blue");
		myCar2.setSpeed = 0;
		
		Car myCar3 = new Car();
		myCar3.setColor("yellow");
		myCar3.setSpeed = 0;
		
		myCar1.upSpeed(150);
		System.out.println("자동차1의 색상은 "+myCar1.getColor()+"이며, 현재속도는 "+myCar1.getSpeed()+"km 입니다.");
		myCar2.upSpeed(60);
		System.out.println("자동차2의 색상은 "+myCar2.getColor()+"이며, 현재속도는 "+myCar2.getSpeed()+"km 입니다.");
		myCar3.downSpeed(100);
		System.out.println("자동차3의 색상은 "+myCar3.getColor()+"이며, 현재속도는 "+myCar3.getSpeed()+"km 입니다.");
	}

}
