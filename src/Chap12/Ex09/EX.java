package Chap12.Ex09;

public class EX {

	public static void main(String[] args) {
		//1. SamnsungPhone Ÿ������ ����
		SamsungPhone s1 = new SamsungPhone();
		s1.printLogo();  //interface���� ��ӵǾ� ������ ���
		s1.sendCall();
		s1.receiveCall();
		s1.flash();
		
		System.out.println("========================");
		
		//2. PhoneInterface �� ��ĳ����
		PhoneInterface p1 = new SamsungPhone();
		p1.printLogo();
		p1.sendCall();
		p1.receiveCall();
		SamsungPhone ss = (SamsungPhone) p1; // p1 : PhoneInterface ===> SamsungPhone �� Ÿ�� ��ȯ
		ss.flash();  // flash�� �ٿ�ĳ������ ���
		
		
		
	}

}
