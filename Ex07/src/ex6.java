import java.io.IOException;
import java.util.Scanner;

public class ex6 {//ex04

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int menu;
		
		do {
			System.out.printf("\n�մ� �ֹ��Ͻðڽ��ϱ�? \n");
			System.out.printf("<1>ī��� <2>īǪġ�� <3>�Ƹ޸�ī�� <4>�׸���ų���� => ");
			menu = s.nextInt();
			
			if (menu==1)
				System.out.printf("#ī��� �ֹ��ϼ˽��ϴ�.\n");
			else if (menu==2)
				System.out.printf("#īǪġ�� �ֹ��ϼ˽��ϴ�.\n");
			else if (menu==3)
				System.out.printf("#�Ƹ޶�ī�� �ֹ��ϼ˽��ϴ�.\n");
			else if (menu==4)
				System.out.printf("#�ֹ��Ͻ� Ŀ�� �غ��ϰڽ��ϴ�.\n");
			else
				System.out.printf("�߸� �ֹ��ϼ̽��ϴ�.\n");
		}while(menu != 4);
	}

}
