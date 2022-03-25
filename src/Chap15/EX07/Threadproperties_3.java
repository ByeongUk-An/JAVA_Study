package Chap15.EX07;

//�Ϲ� ������ : setDaemon(false) default off : ������ �����尡 ����Ǵ��� �ڽ��� ���� ������ �Ѵ�.
//���� ������ : setDaemon(true) , �����带 start �����ϱ����� ����, ���� ������ �Ұ�.
// - ������ �����尡 ����Ǵ� ������ ����
// - �Ϲ������� �ٸ� �������� �۾��� ���� ���� ����
// - ��������� ������ �Ϲݾ����� ����ɶ� ����ȴ�.
// - ������ �÷�Ʈ(GC) (�޸��� ������ �ʴ� ��ü�� GC�� ��ü�� ����)
// 		���μ����� ��������� �ڵ�����, ȭ�� �ڵ�����....
// - ���� ������ ����ؼ� �׽� ����ϰ� �ִٰ� Ư�� ������ �����ϸ� �۾��� �����ϰ� �ٽ� ��� ���¿� ����.

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + ": " + (isDaemon() ? "���󾲷���" : "�Ϲ� ������"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + ": " + i + "��");
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
		 * // �Ϲ� ������ Thread thread1 = new MyThread(); thread1.setDaemon(false); // ����Ʈ
		 * (default) thread1.setName("thread1"); thread1.start();
		 */
		// 2.Demon ������ : ������ �����尡 ���� �Ǵ� ������ ����
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread1");
		thread2.start();

		// 3.5�� �� main ������ ����
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
		}
		System.out.println("main Thread ����");
	}

}
