package Exex;
public class Ex5 {
	public static void main(String[] args) {
		//배열을 이용해서 1~10까지 합을 출력 하시오.
		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int array: scores) {
			sum += array;
		}
		System.out.println(sum); //55
	}
}
