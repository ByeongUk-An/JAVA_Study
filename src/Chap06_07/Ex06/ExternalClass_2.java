package Chap06_07.Ex06;

import Chap06_07.Ex05.Bb;  // 다른 패키지의 클래스에서 클래스를 호출 할 때 public 접근 제어자가 부여 되어 있어야 한다.

//import Chap06_07.Ex05.B; // 다른 패키지의 클래스에서 public이 들어 가있지 않으면 접근이 불가능하다.

public class ExternalClass_2 {

	public static void main(String[] args) {
//		B b = new B();
		
		// 다른 패키지의 클래스에서 Bb클래스를 접근 하는 경우
		 //	1. import 를 먼저 사용.
		 // 2. Bb 클래스의 클래스 접근 제어자는 public	
		 // 3. 필드, 메소드 의 접근 제한자에 따라서 접근이 가능 (protected[상속관계] public), 불가능(private,default)
		
		Bb bb = new Bb();  //다른 패키지의 클래스 : 1. 클래스 접근 제어자에 public이 들어가있어야한다.
		
		// <<필드 접근>>
//		bb.a = 10; // private : 범위가 같은 클래스 내에서만 접근이 된다.
//		bb.b = 20; // default : 같은 패키지내에서만 접근이 가능하다.
//		bb.c = 30; // protected : 같은 패키지내에서만 접근이 가능하고 + 다른 패키지에서 접근가능하지만 (상속관계) 일때만 가능하다.
		bb.d = 134; // public : 다른 패키지에서 접근이가능
		bb.print4();
		
		//<<메소드 접근>>
//		bb.print1(); // private
//		bb.print2(); // default
//		bb.print3(); // protected 외부의 다른 패키지에서 접근 할려면 상속 관계가 필요.
		bb.print4(); // public
	}

}
