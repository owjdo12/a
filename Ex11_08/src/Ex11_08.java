
public class Ex11_08 {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		Car myCar2 = new Car("����");
		Car myCar3 = new Car("�Ķ�", 30);
		
		System.out.println("�ڵ���1�� ������ "+myCar1.getColor()+"�̸�, ����ӵ��� "+myCar1.getSpeed()+"km�Դϴ�.");
		System.out.println("�ڵ���2�� ������ "+myCar2.getColor()+"�̸�, ����ӵ��� "+myCar2.getSpeed()+"km�Դϴ�.");
		System.out.println("�ڵ���3�� ������ "+myCar3.getColor()+"�̸�, ����ӵ��� "+myCar3.getSpeed()+"km�Դϴ�.");
	}

}
