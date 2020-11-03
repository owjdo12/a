public class ex05p {

	public static void main(String[] args) {
		int[] aa=new int[100];
		int bb[]=new int[100];
		int i;
		
		for(i=0; i<aa.length; i++) {
			aa[i] =i*2;
		}
		for(i=0; i<bb.length; i++) {
			bb[i] =aa[aa.length-i-1];
		}
		for(i=0; i<bb.length; i++)
			System.out.printf("%d: %d\n", i, bb[i]);
		
		int count=aa.length;
		int size=count*Integer.BYTES;
		System.out.println(count);
		System.out.println(size);
		
		System.out.printf("bb[0]Àº %d, bb[99]´Â %d ÀÔ·ÂµÊ", bb[0], bb[99]);
	}

}
