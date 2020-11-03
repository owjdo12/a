
public interface IStack <T> {
	void push(T item);
	T pop();
	int size();
	boolean compareSize(IStack<?> o);
}
