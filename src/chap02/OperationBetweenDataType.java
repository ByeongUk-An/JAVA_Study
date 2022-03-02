package chap02;

public class OperationBetweenDataType {

	public static void main(String[] args) {
		//같은 자료형 간의 연산
		int value1 = 3+5; //int + int ===> int
		int value2 = 8 / 5; // int / int ===> int
		float value3 = 3.0f + 5.0f; // float + float ==> float
		double value4 = 8.0 / 5.0; // double /double ==> double
		
		byte data1 = 3;
		byte data2 = 5;
		
		// byte value55 = data1 + data2;
		int value5 = data1 + data2; //int보다 작은 자료형은 연산 결과를 int 타입으로 변환

		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		// 다른 자료형 간의 연산
		int value66 = (int)(5+3.5); //
		double value6 = 5 + 3.5;   // int + double 은 double형으로
	}

}
