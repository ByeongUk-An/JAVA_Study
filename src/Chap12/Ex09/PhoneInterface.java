package Chap12.Ex09;

public interface PhoneInterface {
	int TIMEOUT = 10000;   // public static final  생략됨
	void sendCall();	   // public abstract
	void receiveCall();	   // public abstract
	default void printLogo() {
		System.out.println("로고를 출력 합니다.");
	}
}
