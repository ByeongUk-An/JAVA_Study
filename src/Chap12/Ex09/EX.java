package Chap12.Ex09;

public class EX {

	public static void main(String[] args) {
		//1. SamnsungPhone 타입으로 지정
		SamsungPhone s1 = new SamsungPhone();
		s1.printLogo();  //interface에서 상속되어 내려온 기능
		s1.sendCall();
		s1.receiveCall();
		s1.flash();
		
		System.out.println("========================");
		
		//2. PhoneInterface 로 업캐스팅
		PhoneInterface p1 = new SamsungPhone();
		p1.printLogo();
		p1.sendCall();
		p1.receiveCall();
		SamsungPhone ss = (SamsungPhone) p1; // p1 : PhoneInterface ===> SamsungPhone 로 타입 변환
		ss.flash();  // flash는 다운캐스팅후 출력
		
		
		
	}

}
