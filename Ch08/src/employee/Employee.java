package employee;

public class Employee {
	//이름, 생년원일, 주소
	private String name;
	private int birth;
	private String address;
	
	public Employee(String name, int birth, String address) {
		this.name=name;
		this.birth=birth;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	public void display() {
		System.out.printf("이름: %s, 생년: %d, 주소: %s시\n", name, birth, address);
	}
	
}
