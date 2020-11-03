import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("¸î ´Ü?");
		int level = s.nextInt();
		for(int i = 1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", level, i , level*i);
		}
		for(int i = 9; i>=1; i--) {
			System.out.printf("%d X %d = %d\n", level, i , level*i);
		}
	}

}
