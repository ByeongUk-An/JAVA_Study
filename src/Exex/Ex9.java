package Exex;

public class Ex9 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.println(arr[i]);
			sum+=arr[i];
			
			
		}
		System.out.println("???? ?? : " + (double)sum/arr.length);

	}

}
