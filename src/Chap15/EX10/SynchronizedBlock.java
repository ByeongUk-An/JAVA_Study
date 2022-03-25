package Chap15.EX10;

//��� ����ȭ : �޼ҵ� ������ �Ϻκи� ����ȭ �Ѵ�.

class MyData { //�����尡 �����ϴ� ��ü �ʵ� ����
	int data = 3;
	public void plusData() {  //
		
		synchronized (this) { //��� ����ȭ : �޼ҵ��� �Ϻκи� ����ȭ, this : �ڱ��ڽ��� ��ü
		int mydata = data;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		data = mydata + 1;
		}
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
		System.out.println(getName() + "���� ���:" + myData.data);
	}
}
public class SynchronizedBlock {

	public static void main(String[] args) {
		public static void main(String[] args) {
			//���� ��ü ����
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
