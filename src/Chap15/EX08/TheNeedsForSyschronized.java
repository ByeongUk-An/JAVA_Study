package Chap15.EX08;

//동기화 (Synchronized) : 여러 쓰레드가 하나의 공유된 필드를 접근할경우
	//					한작업을 완전히 완료후 다음작업을 처리 하도록 설정.
	// 내가 작업할때 lock을 걸고 작업을 마치면 lock을 해제 한다.

//1. 동기화를 처리하지 않았을때 예문

class MyData {
	int data = 3;
	
	public void plusData() {
		int mydata = data;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		data = mydata + 1;
	}
}

class PlusThread extends Thread {
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행 결과:" + myData.data);
	}
}

public class TheNeedsForSyschronized {
	public static void main(String[] args) {
		//공유 객체 생성
		MyData myData = new MyData();
		
		//1. PlusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		
		//2. PlusThread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
		
	}
}
