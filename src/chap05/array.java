package chap05;

public class array {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5};
		int[] b = a;
		boolean[] c = new boolean[3];
		
		System.out.println(a[0]);
		
		b[0] = 3;
		
		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);
		
	}

}
