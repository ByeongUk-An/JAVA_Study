package chap16.Ex06.EX1;

// GenericPrinter에 사용될 객체[재료]

public class Powder extends Meterial {  // 추상클래스 상속
	public void doPrinting() {  // 추상 메소드를 구현
		System.out.println("파우더 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Powder 입니다.";
	}
}
