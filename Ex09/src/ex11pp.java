import java.util.Scanner;

public class ex11pp {
	static void coffeeMachine(int button) {
		System.out.println("1");
		System.out.println("2");
		switch(button) {
		case 1:
			System.out.println("3 - normal");
			break;
		case 2:
			System.out.println("3 - sugar");
			break;
		case 3:
			System.out.println("3 - black");
			break;
		default:
			System.out.println("3 - Anyone");
		}
		System.out.println("4");
		System.out.println("5");
	}

	public static void main(String[] args) {
		System.out.println("Which one? -1 for exit");
		Scanner s = new Scanner(System.in);
		int coffee;
		do {
			coffee = s.nextInt();
			coffeeMachine(coffee);
			System.out.println("Done!");
		} while(coffee != -1);
	}

}
