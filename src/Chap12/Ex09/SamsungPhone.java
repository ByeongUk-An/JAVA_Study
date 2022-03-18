package Chap12.Ex09;

public class SamsungPhone implements PhoneInterface {

	//인터페이스에서 정의한 메소드를 구현 한 코드
	@Override
	public void sendCall() {
		System.out.println("빅스비");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화왔다");
	}

	//추가적인 SamsungPhone 만의 기능을 추가
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	



}
