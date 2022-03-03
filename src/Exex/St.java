package Exex;

public class St {

	public static void main(String[] args) {
		//String 에 값을 할당 할때 생성자를 통해서 할당. // 별도의 메모리 공간을 가진다
		String aa = new String("안녕");
		String bb = new String("안녕");
		
		
		
		

		System.out.println(aa);
		System.out.println(bb);
		// 기본 자료형일때 : == (값을 비교)
		// 참조 자료형일떄 : == (참조하는 주소의 번지를 비교)
		// 참조 자료형일때 값을 비교 : equals(변수명) 을 사용
		// 메모리의 주소 값을 비교 (aa, bb는 다른 메모리 주소를 가진다.
		if(aa == bb) {
			System.out.println(true);
			
		}else {
			System.out.println(false);   // false 출력 (가르키는 주소값이 다르다.)
		}
		// String 에 값을 리터럴 값을 바로 할당. // 메모리 공간을 공유 한다.
		String a = "사과";
		String b = "사과";
		
		if(a==b) {   //참조 자료형에서 "==" : 메모리의 주소를 비교
			System.out.println(true); // true 가 출력 (값을 비교한다)
		}else {
			System.out.println(false);
		}
		
		
	}

}
