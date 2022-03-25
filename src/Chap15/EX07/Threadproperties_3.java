package Chap15.EX07;

//일반 쓰레드 : setDaemon(false) default off : 마지막 쓰레드가 종료되더라도 자신의 일을 끝까지 한다.
//데몬 쓰레드 : setDaemon(true) , 쓰레드를 start 시작하기전에 설정, 수정 변경은 불가.
// - 마지막 쓰레드가 종료되는 시점에 종료
// - 일반적으로 다른 쓰레드의 작업을 돕는 보조 역할
// - 종료시점이 마지막 일반쓰레드 종료될때 종료된다.
// - 가비지 컬렉트(GC) (메모리의 사용되지 않는 객체를 GC가 객체를 제거)
// 		프로세서가 종료시점에 자동저장, 화면 자동갱신....
// - 무한 루프를 사용해서 항시 대기하고 있다가 특정 조건이 만족하면 작업을 수행하고 다시 대기 상태에 들어간다.

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + ": " + (isDaemon() ? "데몬쓰레드" : "일반 쓰레드"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + ": " + i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class Threadproperties_3 {

	public static void main(String[] args) {
		/*
		 * // 일반 쓰레드 Thread thread1 = new MyThread(); thread1.setDaemon(false); // 디폴트
		 * (default) thread1.setName("thread1"); thread1.start();
		 */
		// 2.Demon 쓰레드 : 마지막 쓰레드가 종료 되는 시점에 종료
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread1");
		thread2.start();

		// 3.5초 후 main 쓰레드 종료
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
		}
		System.out.println("main Thread 종료");
	}

}
