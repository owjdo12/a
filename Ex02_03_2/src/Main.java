import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° ����� ���� �Է��ϼ��� ==> ");
		int first = s.nextInt();
		System.out.print("<1>���� <2>���� <3>���� <4>������ ==>");
		int operator = s.nextInt();
		System.out.print("�� ��° ����� ���� �Է��ϼ��� ==> ");
		int second = s.nextInt();
		int result;
		String op;
		if (operator==1) {
			result = first + second;
			op = "+";
		}
		else if (operator == 2) {
			result = first - second;
			op = "-";
		}
		else if (operator == 3) {
			result = first * second;
			op = "*";
		}
		else {
			result = first / second;
			op = "/";
		}
		System.out.println(first + op +  second + "=" + result);
	}

}
