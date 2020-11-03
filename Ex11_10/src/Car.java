
public class Car {
	String color;
	int speed;
	static private int count = 0;

	Car(){
		count++;
	}
	static int getCount() {
		return count;
	}
}
