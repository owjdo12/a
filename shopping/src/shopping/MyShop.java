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
		//���θ� ����� ������ �迭�� ��� 
//		User user1 = new User("a", PayType.CARD);
//		User user2 = new User("b", PayType.CASH);
//		
//		users[0] = user1;
//		users[1] = user2;
		
		users[0] = new User("a", PayType.CARD);
		users[1] = new User("b", PayType.CASH); //���
		
	}

	@Override
	public void genProduct() { //���θ����� �Ǹ��ϴ� ��ǰ ���� �� 5����
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
		System.out.println(title +" : ���� ȭ�� - ���� ����");
		System.out.println("==========================");
		
		int i = 0;
		for(User u:users) {
			System.out.printf("[%d} %s(%s)\n", i++, u.getName(), u.getPaytype());
		}
		System.out.println("[x] �� ��");
		System.out.println("���� : ");
		
		String input = s.next();
		switch (input) {
		case "0" : case "1": //case 0 or 1
			System.out.println("### "+input + "���� ###");
			selUser = Integer.parseInt(input);
			productList();
			break;
		case "x" : case "X":
			System.out.println("shop�� �����մϴ�.");
		default:
			System.out.println("\n�Է°��� Ȯ���� �ּ���.");
			start();
			break;
		}
	}
	public void productList() {
		System.out.println(title +" : ��ǰ ��� - ��ǰ ����");
		System.out.println("==========================");
		int i =0;
		for(Product p:products) {
			System.out.printf("[%d]", i++);
			p.printDetail();
			System.out.println();
		}
		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		System.out.println("���� : ");
		
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
			System.out.println("\n�Է°��� Ȯ���� �ּ���.");
			productList();
			break;
		}
	}
	
	public void checkout() {
		System.out.println(title +" : üũ�ƿ�");
		System.out.println("==========================");
		
		int i = 0;
		int total = 0;
		for(Product p:carts) {
			System.out.printf("[%d] %s(%d)\n", ++i, p.getPname(), p.getPrice());
			total += p.getPrice();
		}
		System.out.println("==========================");
		System.out.printf("�������: "+users[selUser].getPaytype());
		System.out.printf("�հ�: "+total+"�� �Դϴ�.\n" );
		System.out.println("[p] ����, [q] ���� �Ϸ�");
		System.out.println("���� : ");
		
		String input = s.next();
		switch (input) {
		case "p":
			checkout();
			break;
		case "q":
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			break;
		default:
			System.out.println("�Է°��� Ȯ���� �ּ���.");
			checkout();
			break;
		}
	}
}
