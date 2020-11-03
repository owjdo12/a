
public class Util {
	static <T extends Comparable<T>> T min(T x, T y) {
		if(x.compareTo(y) < 0)
			return x;
		return y;
	}
	static <T extends Comparable<T>> T max(T x, T y) {
		if(x.compareTo(y) > 0)
			return x;
		return y;
	}
}
