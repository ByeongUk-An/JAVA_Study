package Ex99; //���

class Human { // �θ� Ŭ����
	String name; // �ν��Ͻ� �ʵ� : ��üȭ ���Ѿ� ��� ����, Heap
	int age;

	void eat() { // �ν��Ͻ� �޼ҵ� : ��üȭ ���Ѿ� ��� ����, Heap�� ����Ǿ� �ִ� �޼ҵ��(pointer = �ּҰ�)�� ������ �ִ�.
		System.out.println("����� �Խ��ϴ�."); // ���� ��ġ�� Ŭ���� �������� �ν��Ͻ��޼ҵ� ������ ��ġ => ���� �޼ҵ��� �ڵ尡 ����
	}

	void sleep() {
		System.out.println("����� ���� ��ϴ�.");
	}
}
class Student extends Human {
	int studentID;
	void goToSchool() {
		System.out.println("�л��� �б��� ���ϴ�.");
	}
}
class Worker extends Human {
	int workerID;
	void goToCompany() {
		System.out.println("���忡 ���ϴ�.");
	}
}

public class Test01 {

	public static void main(String[] args) {

		Human h = new Human();  // �θ� Ŭ����
		h.name = "ȫ�浿";
		h.age = 30;
		h.eat();
		h.sleep();
		
		Student s = new Student();  // �ڽ� Ŭ���� : �ڽ� Ŭ������ �θ�Ŭ������ �ʵ�� �޼ҵ带 ��� �޴´�.
		s.name = "�Ż��Ӵ�";  //�θ�Ŭ������ �ʵ�
		s.eat();  // �θ� Ŭ������ �޼ҵ�
		s.sleep();  // �θ� Ŭ������ �޼ҵ�
		
		s.studentID = 1111;   //�ڽ� Ŭ������ �ʵ�
		s.goToSchool();  // �ڽ� Ŭ������ �޼ҵ�
		
		Worker w = new Worker();  // �ڽ�Ŭ����
		w.name = "�̼���"; //�θ�Ŭ������ �ʵ�
		w.eat();  //�θ� Ŭ������ �޼ҵ�
		w.sleep(); // �θ� Ŭ������ �޼ҵ�
		
		w.workerID = 2222;  // �ڽ� Ŭ������ �ʵ�
		w.goToCompany(); // �ڽ� Ŭ������ �޼ҵ�
		
		
		Human h1 = new Student();  //��ĳ���� ��Ӱ��迡���� ����!!  �ڽĿ��� �θ�Ÿ������ ����ȯ   h1�� Human�� �ʵ�� �޼ҵ常 ��밡��
										//h : Human, Student Ÿ���� ��� ���������, Human �� ������ �����ϴ�.
		h1.name = "BTS";  // �θ�Ŭ����
		h1.eat();	// �θ�Ŭ����
		
		
		// ��ĳ������ �ǰ� �ٽ� Student�� ��� �Ϸ��� �ٿ�ĳ������ ���־�� �Ѵ�.
		// �ٿ�ĳ���� : �θ� ==> �ڽ����� Ÿ�� ��ȯ
		// �ٿ�ĳ������ if ���ǹ����� instanceof�� ����ؼ� Ȯ�� �� ���  => �ٿ�ĳ������ �������� ������ �������� ��Ÿ�� ������ �߻��� �� �ִ�.
		System.out.println(h1 instanceof Human);   // instanceof h1�� Human�� Ÿ���� ������ �ִ��� Ȯ��  // ����� : true
		System.out.println(h1 instanceof Student); // instanceof h1�� Student�� Ÿ���� ������ �ִ��� Ȯ��   // ����� : true
		
		if ( h1 instanceof Student) { // �ٿ�ĳ������ �Ҷ����� ��Ÿ�� ������ �����ϱ� ���� ��ü�� �ٿ�ĳ������ ������ Ÿ���� �����ϴ��� Ȯ��
			Student s2 = (Student) h1;
			// �ٿ�ĳ������ �׻� �������� �տ� Ÿ���� ������� �Ѵ�.  ��ĳ������ �ڵ����� �����Ϸ��� ĳ������ ���ش�.
			s2.studentID = 123123;
			s2.goToSchool();
		}
		
		if(h1 instanceof Worker) {
			Worker w4 = (Worker) h1;   // ���� �츮�� Worker�� ��ĳ���� ���� �ʾҴ�. ������ ���������� �¾� ������ �߻� ���� ������ ��Ÿ�ӿ����� ������ �߻��Ѵ�.	
			System.out.println("h1���� Worker�� ������ �ȴ�.");
		}else {
			System.out.println("h1�� Worker�� �����Ѵ�.");
			System.out.println(h1 instanceof Worker);  //false	
		}
		
		   
		

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
