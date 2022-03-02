package chap04;
public class IF__Ex01 {
	public static void main(String[] args) {
		//if 문 : 
		/*
		 * if(조건) {
		 * 	 실행될 코드;
		 * }
		 */
		int value1 =5;
		if(value1 > 3) {
			System.out.println("실행1 : 조건이 참일때 실행");
		}
		/*
		 * if (조건) {
		 *    조건이 참일때 실행할 문장;
		 * } else {
		 *    조건이 거짓일때 실행할 문장;
		 * }
		 */
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if(bool1) {
			System.out.println("실행3");   // 조건이 True 일때 실행
		}else {
			System.out.println("실행4");   // 조건이 False 일때 실행
		}
		
		if(bool2) {
			System.out.println("실행5");   // 조건이 True 일때 실행
		}else {
			System.out.println("실행6");   // 조건이 False 일때 실행
		}
		
		System.out.println("=========================");
		
		//if ~ else 는 삼항 연산자로 변환이 가능하다!!
		
		System.out.println((bool1) ? "실행7" : "실행8"); // 참 : 실행7
		System.out.println((bool2) ? "실행7" : "실행8"); // 거짓 : 실행8
		
		/*
		 * if의 조건이 여러 개일때 ?
		 * 
		 * if (조건1) {
		 *    조건1이 참일때 실행 코드;
		 * } else if(조건2) {
		 *    조건1이 거짓이고 조건2가 참일때 실행 코드;
		 * } else if(조건3) {
		 *    조건1,조건2 가 거짓이고 조건3이 참일때 실행 코드;
		 * } else {
		 *    조건1,조건2,조건3이 다 거짓일때 else문 실행;
		 * }
		 */
		
		int value2 = 55;
		
		if(value2 >= 90) {
			System.out.println("A 학점, 점수 :" + value2);
		}else if(value2 >= 80) {
			System.out.println("B 학점, 점수 :" + value2);     //실행후에 if 문을 빠져 나온다.
		}else if(value2 >= 70) {
			System.out.println("C 학점, 점수 :" + value2);
		}else {
			System.out.println("F 학점, 점수 :" + value2);
		}
		
		
		/*
		 *  if 문에서 조건의 순서가 바뀌어 있을 경우
		 */
		
int value3 = 85;
		
		if(value3 >= 90) {
			System.out.println("A 학점, 점수 :" + value3);
		}else if(value3 >= 70) {
			System.out.println("B 학점, 점수 :" + value3);     //실행후에 if 문을 빠져 나온다.
		}else if(value3 >= 80) {
			System.out.println("C 학점, 점수 :" + value3);
		}else {
			System.out.println("F 학점, 점수 :" + value3);
		}
		System.out.println("===========================");
		/*
		 * 조건을 부여 할때 세밀하게 적용
		 */
int value4 = 80;
		if(value4 <=100 && value4 >= 90) {
			System.out.println("A 학접입니다.");
		}else if (value4 < 80 && value4 >= 70) {
			System.out.println("C 학접입니다.");
		}else if (value4 < 90 && value4 >=80) {
			System.out.println("B 학점입니다.");
		}else {
			System.out.println("F 학접입니다.");
		}
		
		/*
		 * if 문에서 실행문이 하나일 때 {중괄호} 를 생략 할 수 있다.
		 */
		
		System.out.println("=====================");
		
		if(3 < 5)
			System.out.println("안녕");
		    
		System.out.println("=====================");
		
		if (3 > 5)
			System.out.println("안녕하세요 2");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
