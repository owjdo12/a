package shopping;

public class SmartTV extends Product {
	private String resolution; //해상도
	
	public SmartTV(String pname, int price, String resolution) {
		super(pname, price); //부모에 생성자필요
		this.resolution = resolution;
	}

	@Override
	void printExtra() {
		System.out.println("해상도 정보: "+ resolution);
	}

}
