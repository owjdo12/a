class Main <T> {
	public static void main(String[] args) {
		Stack <Integer> si = new Stack<Integer>(5);
		
		si.push(10);
		si.push(100);
		si.push(1000);

		int size = si.size();
		for(int i = 0; i<size; ++i) {
			int r = si.pop();
			System.out.println(r);
		}
		
	}
}