
public class Ex11_08 {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		Car myCar2 = new Car("빨강");
		Car myCar3 = new Car("파랑", 30);
		
		System.out.println("자동차1의 색상은 "+myCar1.getColor()+"이며, 현재속도는 "+myCar1.getSpeed()+"km입니다.");
		System.out.println("자동차2의 색상은 "+myCar2.getColor()+"이며, 현재속도는 "+myCar2.getSpeed()+"km입니다.");
		System.out.println("자동차3의 색상은 "+myCar3.getColor()+"이며, 현재속도는 "+myCar3.getSpeed()+"km입니다.");
	}

}
