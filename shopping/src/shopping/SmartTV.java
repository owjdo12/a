package shopping;

public class SmartTV extends Product {
	private String resolution; //�ػ�
	
	public SmartTV(String pname, int price, String resolution) {
		super(pname, price); //�θ� �������ʿ�
		this.resolution = resolution;
	}

	@Override
	void printExtra() {
		System.out.println("�ػ� ����: "+ resolution);
	}

}
