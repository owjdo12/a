package shopping;
/* 추상 메서드
 * 
 */
public abstract class Product {
	private String pname;
	private int price;
	
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}	//추상클래스지만 하위클래스를 위해 생성자필요
	
	void printDetail() {
		System.out.println("상품이름: "+pname);
		System.out.println("가격: "+ price);
		printExtra();
	}
	abstract void printExtra();
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
