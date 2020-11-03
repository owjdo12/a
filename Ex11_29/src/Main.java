
public class Main {

	public static void main(String[] args) {
		Pet pet1 = new Pet();
		pet1.type = "강아지";
		pet1.month = 8;
		
		Pet pet2 = new Pet();
		pet2.type = "고양이";
		pet2.month = 13;
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.type+"는 "+pet1.month+"개월입니다.");
		System.out.println(pet2.type+"는 "+pet2.month+"개월입니다.");
	}

}
