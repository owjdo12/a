
public class Main {

	public static void main(String[] args) {
		Pet pet1 = new Pet();
		pet1.type = "������";
		pet1.month = 8;
		
		Pet pet2 = new Pet();
		pet2.type = "�����";
		pet2.month = 13;
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.type+"�� "+pet1.month+"�����Դϴ�.");
		System.out.println(pet2.type+"�� "+pet2.month+"�����Դϴ�.");
	}

}
