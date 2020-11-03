package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	private String title;
	int selUser;
	
	Product[] products = new Product[10];
	ArrayList<Product> carts = new ArrayList<Product>();
	User[] users = new User[2];

	Scanner s = new Scanner(System.in);
	private String input;
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		//쇼핑몰 사용자 생성후 배열에 담기 
//		User user1 = new User("a", PayType.CARD);
//		User user2 = new User("b", PayType.CASH);
//		
//		users[0] = user1;
//		users[1] = user2;
		
		users[0] = new User("a", PayType.CARD);
		users[1] = new User("b", PayType.CASH); //축약
		
	}

	@Override
	public void genProduct() { //쇼핑몰에서 판매하는 제품 생성 각 5개씩
		products[0] = new CellPhone("CellPhone1", 10, "sk");
		products[1] = new CellPhone("CellPhone2", 100, "sk");
		products[2] = new CellPhone("CellPhone3", 1000, "kt");
		products[3] = new CellPhone("CellPhone4", 10000, "kt");
		products[4] = new CellPhone("CellPhone5", 100000, "lg");
		products[5] = new SmartTV("TV1", 10, "HD");
		products[6] = new SmartTV("TV2", 100, "FHD");
		products[7] = new SmartTV("TV3", 1000, "UHD");
		products[8] = new SmartTV("TV4", 10000, "2K");
		products[9] = new SmartTV("TV5", 100000, "4K");
	}

	@Override
	public void start() {
		System.out.println(title +" : 메인 화면 - 계정 선택");
		System.out.println("==========================");
		
		int i = 0;
		for(User u:users) {
			System.out.printf("[%d} %s(%s)\n", i++, u.getName(), u.getPaytype());
		}
		System.out.println("[x] 종 료");
		System.out.println("선택 : ");
		
		String input = s.next();
		switch (input) {
		case "0" : case "1": //case 0 or 1
			System.out.println("### "+input + "선택 ###");
			selUser = Integer.parseInt(input);
			productList();
			break;
		case "x" : case "X":
			System.out.println("shop을 종료합니다.");
		default:
			System.out.println("\n입력값을 확인해 주세요.");
			start();
			break;
		}
	}
	public void productList() {
		System.out.println(title +" : 상품 목록 - 상품 선택");
		System.out.println("==========================");
		int i =0;
		for(Product p:products) {
			System.out.printf("[%d]", i++);
			p.printDetail();
			System.out.println();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.println("선택 : ");
		
		String input = s.next();
		switch (input) {
		case "h" : case "H":
			start();
			break;
		case "c" : case "C":
			checkout();
			break;
		case "0":case "1":case "2":case "3":case "4":
		case "5":case "6":case "7":case "8":case "9":
			carts.add(products[Integer.parseInt(input)]);
			productList();
			break;
		default:
			System.out.println("\n입력값을 확인해 주세요.");
			productList();
			break;
		}
	}
	
	public void checkout() {
		System.out.println(title +" : 체크아웃");
		System.out.println("==========================");
		
		int i = 0;
		int total = 0;
		for(Product p:carts) {
			System.out.printf("[%d] %s(%d)\n", ++i, p.getPname(), p.getPrice());
			total += p.getPrice();
		}
		System.out.println("==========================");
		System.out.printf("결제방법: "+users[selUser].getPaytype());
		System.out.printf("합계: "+total+"원 입니다.\n" );
		System.out.println("[p] 이전, [q] 결제 완료");
		System.out.println("선택 : ");
		
		String input = s.next();
		switch (input) {
		case "p":
			checkout();
			break;
		case "q":
			System.out.println("결제가 완료되었습니다.");
			break;
		default:
			System.out.println("입력값을 확인해 주세요.");
			checkout();
			break;
		}
	}
}
