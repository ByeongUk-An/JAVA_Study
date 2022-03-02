package chap05;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr1 = new int[100];
		// for 문을 사용해서 arr1 배열의 각방에 값을 입력
		
		for (int i = 0; i< arr1.length;i++) {
			arr1[i] = i+1;
		}
		
		// 출력 구문 for
		for (int i = 0; i < arr1.length;i++) {
			System.out.println(i + "번째방의 값 :" + arr1[i]);
		}
		
		// 향상된(Enhanced) for 문
		for(int k : arr1) {
			System.out.println(k);
		}
		
		//Arrays.toString(arr1)
		System.out.println(Arrays.toString(arr1));
	}

}
