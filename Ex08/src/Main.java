import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char [] stack = new char[5];
		int top = 0;
		char carName = 'A';

		int select = 9;
		while(select != 3) {
			System.out.print("1: push, 2: pop, 3: end :");
			select = s.nextInt();
			switch(select) {
			case 1:
				if(top == 5) {
					System.out.println("Full!");
				} else {
					stack[top] = carName++;
					System.out.printf("%c is pushed.\n", stack[top]);
					top++;
				}
				break;
			case 2:
				if(top == 0) {
					System.out.println("Empty!");
				} else {
					top--;
					System.out.printf("%c is poped.\n", stack[top]);
					stack[top] = ' ';
				}
				break;
			case 3:
				System.out.printf("%d is occupied!\n", top);
				System.out.println("End!");
				break;
			default:
				System.out.println("Again!");
			}
		}
		
	}

}
