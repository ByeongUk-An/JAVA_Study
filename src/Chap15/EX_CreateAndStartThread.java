package Chap15;

/*
 	쓰레드 4개 생성 : 1. Thread를 상속, 2. Runnable 구현, 3.익명 내부클래스를 생성해서 구현
 	각 값을 String 배열에 저장후 아래와 같이 출력 하세요
 	
 	1       2      3      4
 	이름    이순신  이순신  신사임당
 	나이     40     50    60    
 	국어     100    90    80
 	영어     70     60   100 
 	수학     50     70    80
 
 */

class Student extends Thread {
	public void run() {
		String[] strArray = {"이름","나이","국어","영어","수학"};
		
		for(int i = 0; i<strArray.length; i++) {
			System.out.print(strArray[i]+" ");
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	};
}
class Hong implements Runnable {
	public void run() {
		String[] strArray2 = {"홍길동","40","100","70","50"};
		try {
			Thread.sleep(20);
		} catch (InterruptedException e1) {
			
		}
		for(int i = 0; i< strArray2.length; i++) {
			System.out.print(strArray2[i]+" ");
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	};
}

public class EX_CreateAndStartThread {

	public static void main(String[] args) {
		Thread st = new Student();
		
		Runnable st1 = new Hong();
		Thread thread2 = new Thread(st1);
		
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] strArray3 = {"이순신","50","90","60","70"};
				try {
					Thread.sleep(40);
				} catch (InterruptedException e1) {
					
				}
				
				for(int i =0;i<strArray3.length;i++) {
					System.out.print(strArray3[i]+" ");
					try {Thread.sleep(300);} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
			String[] strArray4 = {"신사임당","60","80","100","80"};
			
			try {
				Thread.sleep(60);
			} catch (InterruptedException e1) {
				
			}
			
			for(int i=0;i<strArray4.length;i++) {
				System.out.println(strArray4[i]+" ");
				try {Thread.sleep(300);} catch (InterruptedException e) {}
			}
			}
		});
		st.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
