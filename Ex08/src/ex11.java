public class ex11 {

	public static void main(String[] args) {
		char[] stack = new char[5];
		int top=0;
		
		stack[top] ='A';
		System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
		top++;
		
		stack[top] ='B';
		System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
		top++;
		
		stack[top] ='C';
		System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
		top++;
		
		System.out.println();
		
		top--;
		System.out.printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
		stack[top]=' ';
		top--;
		System.out.printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
		stack[top]=' ';
		top--;
		System.out.printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
		stack[top]=' ';
	}

}
