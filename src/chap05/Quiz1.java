package chap05;

import java.util.Arrays;

public class Quiz1 {

	public static void main(String[] args) {
		int[] arr1 = new int[100];
		int[] arr2 = new int[3];
		for(int i=0; i<arr1.length;i++) {
			arr1[i] = i+1;
			System.out.println(arr1[i]);
		}
		
		
		for(int k:arr1) {
			
			System.out.println(k);
		}
		
		
			System.out.println(Arrays.toString(arr1));
		
	}
}
