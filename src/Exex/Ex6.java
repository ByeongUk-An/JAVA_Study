package Exex;

public class Ex6 {
	public static void main(String[] args) {
		// 주어진 배열의 항목에서 최대값을 구하기

		int max = 0;
		int[] array = { 4, 5, 1, 2, 3 };
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				System.out.println("max :" + max);
			}

		}

	}
}
