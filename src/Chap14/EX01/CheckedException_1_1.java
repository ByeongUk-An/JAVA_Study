package Chap14.EX01;

public class CheckedException_1_1 {

	public static void main(String[] args) {
		
		try {
		System.out.println(10/8);	//프로그램이 비정상 종료 되어 버린다.
		}catch(ArithmeticException e) {//예외에 대한 처리
			//try{}에서 오류가 발생할 경우에 작동.
			//e.printStackTrace();  //오류에 대한 자세한 정보를 출력
			System.out.println("0을 넣을수 없습니다.");
		}finally {
			//try{} 오류가 없어도 작동(o), 오류가 있어도 (o)
			//try{}가 작동되면 항상 작동
			//객체를 사용후 객체의 메모리를 제거 할때 ,예) sc.close();
			System.out.println("Finally 블락은 항상 호출이 된다.");
		}
		
		System.out.println("프로그램을 정상 종료 합니다.");	//정상 종료
	}

}
