package shopping;

public class ShopLauncher {

	public static void main(String[] args) {
		MyShop shop = new MyShop();
		
		//�����̸� ����
		shop.setTitle("MyShop");
		
		//User ����
		shop.genUser();		
		
		//��ǰ ����
		shop.genProduct();
		
		//���� ����
		shop.start();
	}

}
