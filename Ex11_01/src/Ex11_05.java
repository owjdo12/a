
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
		System.out.println("�ڵ���1�� ������ "+myCar1.getColor()+"�̸�, ����ӵ��� "+myCar1.getSpeed()+"km �Դϴ�.");
		myCar2.upSpeed(60);
		System.out.println("�ڵ���2�� ������ "+myCar2.getColor()+"�̸�, ����ӵ��� "+myCar2.getSpeed()+"km �Դϴ�.");
		myCar3.downSpeed(100);
		System.out.println("�ڵ���3�� ������ "+myCar3.getColor()+"�̸�, ����ӵ��� "+myCar3.getSpeed()+"km �Դϴ�.");
	}

}
