package Chap06_07.EX02;

class Abc {
	int m = 3;  //필드 (Heap 에 저장) , 객채화 시켜을때 사용가능
	int n = 4;
	
	void work1() {  //메소드 (인풋값이 없는 메소드)
		int k = 5;		//지역변수 : (Stack 영역에 저장) , 메소드가 종료시 없어진다.
		System.out.println(k);
		work2(3); // 다른 메소드 호출
	}
	
	void work2(int i) {
		int j = 4;		// 지역 변수 (Stack 공간에 변수와 값이 저장)
		System.out.println(i + j);
		
		int l ;			// 지역변수 이므로 강제 초기화가 되지 않는다. (Stack)
//		l = 0;
//		System.out.println(l);  // 
	}
}

public class FieldComponent {

	public static void main(String[] args) {
		Abc bc = new Abc(); //Abc 객체 생성
		
		System.out.println(bc.m);
		System.out.println(bc.n);
		
		
		
		
	}

}
