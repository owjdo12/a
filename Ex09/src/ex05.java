import java.util.Scanner;

public class ex05 { //indexOF(), lastIndexOF()

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str, strRep, strSub, strAry[];
		
		System.out.print("���ڿ� �Է�: ");
		str = s.nextLine();
		
		strRep = str.replace(" ", "$");	//���� $�� ä��
		strSub = str.substring(3,8); 	//3~8��° ���ڿ� ����
		strAry = str.split(" ");		//�������� �и�
		
		System.out.println("�Է� ���ڿ� ==> " +str);
		System.out.println("�ٲ� ���ڿ� ==> " +strRep);
		System.out.println("�Ϻ� ���ڿ� ==> " +strSub);
		for (int i=0; i<strAry.length; i++)
			System.out.println("�и��� ���ڿ�"+ i+ " ==> "+ strAry[i]);
	}

}