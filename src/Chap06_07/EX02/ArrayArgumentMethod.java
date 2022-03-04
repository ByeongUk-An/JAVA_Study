package Chap06_07.EX02;

import java.util.Arrays;

public class ArrayArgumentMethod {
	//static 있으면서 같은 클래스에 존재하는 메소드 : 메소드 이름으로 호출이 가능
	//다른 패키지에서 접근 가능하도록 설정 : 접근 제어자( public, protected, default, private)
	//접근제어자가 생략 되어 있으면 : default (같은 패키지에서 접근 가능)
	static void printArray (int[] a) { 
		System.out.println("================Array.toString()로 출력===================");
		System.out.println(Arrays.toString(a));
		System.out.println("===<for문 으로 출력 ===========");
		//for문을 사용해서 출력
		for(int i =0; i<a.length; i++) {
			System.out.println("배열"+i+"번째값은 :"+a[i]);
		}
		System.out.println("===<향상된 for 문으로 출력==============");
		//향상된 for 문을 사용해서 출력
		for(int s : a) {
			System.out.print("향상된 배열"+s+" ");
		}
		
	}
	
	public static void main(String[] args) {
		//배열을 매개 변수로 가지는 메소드 호출
		
		int[] a = new int[] {1,2,3}; // 배열변수를 선언하고 값을 넣은후
		printArray(a);  //배열변수를 메소드 호출시 배열 변수 입력
		
		printArray (new int[] {4,5,6,7,8});
		
//		printArray ({1,2,3}); // 오류 발생
	}

}
