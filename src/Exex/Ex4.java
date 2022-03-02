package Exex;

public class Ex4 {
	public static void main(String[] args) {
		//for 문을 이용해서 실행 결과와 같은 삼각형 출력하기
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
