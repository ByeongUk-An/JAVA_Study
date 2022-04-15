package Cooperation;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//��ü���� ����
/*			�л��� �뵷 : 100,000��
 		�л�  :            ������ Ż��(-1000��)  ����ö�� Ż�� (-1,500��)
 		����  : 1,000��  �°��� ����, ���� ����
 		����ö : 1,500��                      �°��� ����, ���� ����
 */

class Student {
	String studentName;   //�л���
	int money;            //�л��� ������, �ʱⰪ : 100,000��
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {  //�л��� ������ ������? ������ ���� ���� �ؾ� �Ѵ�.
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeOutBus (Bus bus) { //������ ������
		bus.takeOut();
	}
	
	
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void takeSubway(Subway subway) { //����ö�� Ż��
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeOutSubway (Subway subway) { //����ö�� ������
		subway.takeOut();
	}
		
	public void showInfo() {
		System.out.println(studentName +"���� ���� ���� " + money + "�� �Դϴ�");
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(studentName);
	}
	
}

class Bus {
	int busNumber;  // 100�� ����, 200����   <== ��ǲ���� �޾Ƽ�, ������.
	int passengerCount;  //�°���
	int money;           //������ ����
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {  //����
		this.money += money;
		passengerCount++;
	}
	public void takeOut() { //�°����� ����
		passengerCount--;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "�� ������ �°��� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�");
	}

}

class Subway {
	int lineNumber;  //1002��,1003��
	int passengerCount; //�°���
	int money;            // ����ö�� ����
	
	//�����ڸ� ���ؼ� ����ö ȣ���� ��ǲ �޾Ƽ� Ȱ��ȭ.
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void takeOut() { //�°����� ����
		passengerCount--;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "�� ����ö�� �°��� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�");
	}

}

public class CooperationBetweenObject {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		int select;
		String studentNo = null;
		int busNum = 0;
		int subNum = 0;
		Bus bus100 = new Bus(100);
		Subway subwaygreen = new Subway(2);
		
		while(true) {
			System.out.println("===================================================");
			System.out.println("1. �л���ü ����  | 2. �л����� ��� �� ����");
			System.out.println("3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����");
			System.out.println("===================================================");
			System.out.println("����>>");
			select = sc.nextInt();
			
			if(select == 1) {
				String studentName;
				int money;
				System.out.println("����>> 1");
				System.out.println("�л� �̸� :");
				studentName = sc.next();
				System.out.println("�� �Է� :");
				money = sc.nextInt();
				
				Student student = new Student(studentName,money);
				studentList.add(student);
				
			}else if(select == 2) {
				String studentName;
				System.out.println("����>> 2");
				System.out.println("�л��̸�    ������");
				for(Student student : studentList) {
					System.out.println(student.studentName+"    " + student.money);
				}
				System.out.println("�л����� (�̸��Է�)");
				studentName = sc.next();
				for(Student student : studentList) {
					if(student.studentName.equals(studentName)) {
						System.out.println(student.studentName + "���� �����Ͽ����ϴ�");
						studentNo = student.studentName;
					}
				}
				
			}else if(select == 3) {
				System.out.println("����>> 3");
				
				
				for(Student student : studentList) {
					if(student.studentName.equals(studentNo)) {
						student.takeBus(bus100);
						System.out.println(student.studentName + "��" + bus100.busNumber + "�� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���."  );
						System.out.println(student.studentName + "���� ��������" + student.money + "�Դϴ�");
						bus100.showBusInfo();
					}
				}
				
				
			}else if(select == 4) {
				System.out.println("����>> 4");
				
				for(Student student : studentList) {
					if(student.studentName.equals(studentNo)) {
						
						student.takeOutBus(bus100);
						System.out.println(student.studentName + "��" + bus100.busNumber + "�� ������ ���Ƚ��ϴ�. �¹���~~~");
						System.out.println(student.studentName + "���� ��������" + student.money + "�Դϴ�.");
						bus100.showBusInfo();
					}
				}
				
				
				
			}else if(select == 5) {
				System.out.println("����>> 5");
				
				
				for(Student student : studentList) {
					if(student.studentName.equals(studentNo)) {
						
						student.takeSubway(subwaygreen);
						System.out.println(student.studentName + "��" + subwaygreen.lineNumber + "ȣ���� �����ϴ�. ��ſ� �Ϸ�Ǽ���."  );
						System.out.println(student.studentName + "���� ��������" + student.money + "�Դϴ�");
						System.out.println("����ö" + subwaygreen.lineNumber + "ȣ���� �°���" + subwaygreen.passengerCount + "���̰� ������" + subwaygreen.money + "�Դϴ�.");
					}
				}
			}else if(select == 6) {
				System.out.println("����>> 6");
				
				for(Student student : studentList) {
					if(student.studentName.equals(studentNo)) {
						
						student.takeOutSubway(subwaygreen);
						System.out.println(student.studentName + "��" + subwaygreen.lineNumber + "ȣ���� ���Ƚ��ϴ�. �¹���~~~");
						System.out.println(student.studentName + "���� ��������" + student.money + "�Դϴ�.");
						System.out.println("����ö" + subwaygreen.lineNumber + "ȣ���� �°��� " + subwaygreen.passengerCount + "���̰� ������" + subwaygreen.money + "�Դϴ�.");
					}
				}
			}else if(select == 7) {
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				break;
			}
			
		}
		
		
		
		
		/*
		�л� 5�� �Է� : �л��� 100,000���� �ʱⰪ �Ҵ�. 
		=============================================
		1. �л���ü ����  | 2. �л����� ��� �� ����  
		3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����  
		=============================================
		����>> 1
		�л��̸�  : 
		 �� �Է�   : 

		����>> 2 
		=====�л����� ���=====
		�л��̸�	������



		�л�����(�̸��Է�)>> 


		����>> 3
		000 �� 000 �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
		000 ���� �������� 000 �Դϴ�. 
		���� 000���� �°��� 000���̰� ������000 �Դϴ�. 

		����>> 4
		000 �� 000 �� ������ ���Ƚ��ϴ�. �¹���~~~. 
		000 ���� �������� 000 �Դϴ�. 
		���� 00���� �°��� 000���̰� ������ 000 �Դϴ�. 

		����>> 5
		000 �� 000 ȣ�� ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
		000 ���� �������� 000 �Դϴ�. 
		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 

		����>> 6
		000 �� 000 ȣ�� ����ö�� ���Ƚ��ϴ�. �ȳ� ~~~
		000 ���� �������� 000 �Դϴ�. 
		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 
		*/ 
//		Student student1 = new Student("�Ⱥ���", 100000);
//		Student student2 = new Student("������", 100000);
//		
//		Bus bus100 = new Bus(100);
//		
//		Subway subwayGreen = new Subway(2);
//		
//		
//		student1.takeBus(bus100);
//		student2.takeSubway(subwayGreen);
//		
//		
//		student1.showInfo();
//		student2.showInfo();
//		
//		bus100.showBusInfo();
//				
//		subwayGreen.showSubwayInfo();


	}

}
