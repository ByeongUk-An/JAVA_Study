package Chap06_07.Ex03;
class Car {
	String company;
	String model;			//�ν��Ͻ� : ��üȭ�� ������ ��� ������ �ʵ�.
	String color;			//[�ʵ�� : �ʵ��� ��]�� Heap ������ ����
	double maxSpeed;

	Car() {
	}

	Car(String a, String b, String c, double d) {
		this.company = a;
		this.model = b;
		this.color = c;
		this.maxSpeed = d;
	}

	void work() {		//�޼ҵ�(�ν��Ͻ� �޼ҵ�) : Heap ������ �޼ҵ��� �����͸� ����
		System.out.println("company :" + company + ", model :" + model + ", color :" + color + ", maxSpeed :" + maxSpeed);
	}
}
public class Q1 {
	

	public static void main(String[] args) {
		// �����ڸ� ���ؼ� �⺻ ���� �Ҵ��� �޸��� ������ work() �޼ҵ带 ����ؼ� ���.
		Car Car = new Car("Benz", "�ƹ氡����", "���", 180.0);
		Car.work();
	}

}