package chap05;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr2 = new int[300];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (i + 1) * 3;

			if (arr2[i] <= 300) {
				System.out.println(arr2[i]);
			}
		}

		System.out.println();
		for (int k : arr2) {

			System.out.println(k);

		}

		System.out.println();

		System.out.println(Arrays.toString(arr2));

		for (int j = 0; j < arr2.length; j++) {
//			System.out.println(arr2[j]);
			if (arr2[j] % 2 == 1) {
				if (j >= 100 && j <= 300) {
					System.out.println(arr2[j]);
				}
			}
		}
	}

}
