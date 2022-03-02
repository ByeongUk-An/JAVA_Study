package chap04;
public class Switch_Ex02 {
	public static void main(String[] args) {

		// Switch 문에서 Break를 처리 하지 않았을때 : 해당 case로 이동한 후 하위의 case를 전부 실행!!
		int value1 = 2;
		
		switch(value1) {
		case 1:
			System.out.println("A 학점");
		case 2:
			System.out.println("B 학점");
		case 3:
			System.out.println("C 학점");
		case 4:
			System.out.println("D 학점");
		default :
			System.out.println("학고라니!!");
		}
		
		System.out.println("===============================");
		
		// Switch문에 break가 포함 된 경우
		
		int value2 = 3;
		
		switch(value2) {
		case 1:
			System.out.println("A 학점");
			break;
		case 2:
			System.out.println("B 학점");
			break;
		case 3:
			System.out.println("C 학점");
			break;
		case 4:
			System.out.println("D 학점");
			break;
		default :
			System.out.println("학고라니!!");          //Switch문의 마지막 default는 break문을 생략 해도 된다.
		}
		
		System.out.println("===========================");
		
		if(value2 == 1) {
			System.out.println("A 학점");
		} else if(value2 == 2) {
			System.out.println("B 학점");
		} else if(value2 == 3) {
			System.out.println("C 학점");
		} else {
			System.out.println("학고");
		}
		
		/*
		 * switch 문 사용해서 점수가 7점 이상은 pass, 7점 이하는 fail 을 출력 (점수 : 1~10)
		 */
		
		int a = 8;
		
		switch(a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("Pass");
			break;
		default :
			System.out.println("Fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
