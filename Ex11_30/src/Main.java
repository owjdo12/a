
public class Main {

	public static void main(String[] args) {
		Pet pet1 = new Pet();
		pet1.setType("������");
		pet1.setMonth(8);
		
		Pet pet2 = new Pet();
		pet2.setType("�����");
		pet2.setMonth(13);
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.getType()+"�� "+pet1.getMonth()+"�����Դϴ�.");
		System.out.println(pet2.getType()+"�� "+pet2.getMonth()+"�����Դϴ�.");
	}

}
