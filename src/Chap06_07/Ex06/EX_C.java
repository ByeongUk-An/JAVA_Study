package Chap06_07.Ex06;

import Chap06_07.Ex05.C;

public class EX_C {
	

	public static void main(String[] args) {
		
		// 다른 클래스에 존재함 / public 만 접근 / model , color 메모리로 접근 불가
				//model과 color는 setter 를 public 통해서 할당후 출력
				C c = new C();
				c.maxspeed = 300;
				c.setModel("Sonata");
				c.setColor("red");
				c.print();
//				
		
		
	}

}
