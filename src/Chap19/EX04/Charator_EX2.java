package Chap19.EX04;

/*
 	A ~ Z 까지의 아스키 코드값 출력
 	
 	출력결과
 	===========================
 	A,65
 	B,66
 	...
 	Z,90
 	
 	a ~ z 까지의 아스키 코드값 출력
 	a,97
 	b,98
 	...
 	z,90
 */


public class Charator_EX2 {

	public static void main(String[] args) {
		char Arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for(int i=0; i<Arr.length;i++) {
			System.out.println(Arr[i] +","+ (int)Arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arr[i]+"," + (int)Arr[i]);
		}

	}

}
