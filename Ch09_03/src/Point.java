
public class Point implements Comparable<Point> {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		if(x <= o.x && y < o.y) return -1;
		if(x == o.x && y == o.y) return 0;
		return 1;
	}
	
}
