import java.io.IOException;
import java.util.Scanner;

public class Main {//숫자맞히기

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int guess = 32;
		int value = -1;
		System.out.print("숫자를 입력하세요 : ");
		do {
			value = s.nextInt();
			if(value < guess)
				System.out.print("큰 수를 입력하세요");
			if(value > guess)
				System.out.print("작은 수를 입력하세요");
		}while(value != guess);
		
		System.out.print("정답입니다.");
	}
}
