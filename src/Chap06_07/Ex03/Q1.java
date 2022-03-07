package Chap06_07.Ex03;
class Car {
	String company;
	String model;			//인스턴스 : 객체화를 했을때 사용 가능한 필드.
	String color;			//[필드명 : 필드의 값]은 Heap 영역에 저장
	double maxSpeed;

	Car() {
	}

	Car(String a, String b, String c, double d) {
		this.company = a;
		this.model = b;
		this.color = c;
		this.maxSpeed = d;
	}

	void work() {		//메소드(인스턴스 메소드) : Heap 영역의 메소드명과 포인터를 저장
		System.out.println("company :" + company + ", model :" + model + ", color :" + color + ", maxSpeed :" + maxSpeed);
	}
}
public class Q1 {
	

	public static void main(String[] args) {
		// 생성자를 통해서 기본 값을 할당후 메모리의 내용을 work() 메소드를 사용해서 출력.
		Car Car = new Car("Benz", "아방가르드", "흰색", 180.0);
		Car.work();
	}

}