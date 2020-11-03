import java.util.Scanner;

public class ex05 { //indexOF(), lastIndexOF()

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str, strRep, strSub, strAry[];
		
		System.out.print("문자열 입력: ");
		str = s.nextLine();
		
		strRep = str.replace(" ", "$");	//공백 $로 채움
		strSub = str.substring(3,8); 	//3~8번째 문자열 추출
		strAry = str.split(" ");		//공백으로 분리
		
		System.out.println("입력 문자열 ==> " +str);
		System.out.println("바꾼 문자열 ==> " +strRep);
		System.out.println("일부 문자열 ==> " +strSub);
		for (int i=0; i<strAry.length; i++)
			System.out.println("분리한 문자열"+ i+ " ==> "+ strAry[i]);
	}

}