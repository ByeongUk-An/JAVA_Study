package Cooperation;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//객체간의 협업
/*			학생의 용돈 : 100,000원
 		학생  :            버스를 탈때(-1000원)  지하철을 탈때 (-1,500원)
 		버스  : 1,000원  승객수 증가, 수입 증가
 		지하철 : 1,500원                      승객수 증가, 수입 증가
 */

class Student {
	String studentName;   //학생명
	int money;            //학생이 가진돈, 초기값 : 100,000원
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {  //학생이 버스를 탔을때? 버스에 돈을 지불 해야 한다.
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeOutBus (Bus bus) { //버스를 내릴떄
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

	public void takeSubway(Subway subway) { //지하철을 탈때
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeOutSubway (Subway subway) { //지하철을 내릴때
		subway.takeOut();
	}
		
	public void showInfo() {
		System.out.println(studentName +"님의 남은 돈은 " + money + "원 입니다");
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(studentName);
	}
	
}

class Bus {
	int busNumber;  // 100번 버스, 200버스   <== 인풋값을 받아서, 생성자.
	int passengerCount;  //승객수
	int money;           //버스의 수입
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {  //승차
		this.money += money;
		passengerCount++;
	}
	public void takeOut() { //승객수만 감소
		passengerCount--;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
	}

}

class Subway {
	int lineNumber;  //1002번,1003번
	int passengerCount; //승객수
	int money;            // 지하철의 수입
	
	//생성자를 통해서 지하철 호선을 인풋 받아서 활성화.
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void takeOut() { //승객수만 감소
		passengerCount--;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "번 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
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
			System.out.println("1. 학생객체 생성  | 2. 학생정보 출력 및 선택");
			System.out.println("3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료");
			System.out.println("===================================================");
			System.out.println("선택>>");
			select = sc.nextInt();
			
			if(select == 1) {
				String studentName;
				int money;
				System.out.println("선택>> 1");
				System.out.println("학생 이름 :");
				studentName = sc.next();
				System.out.println("돈 입력 :");
				money = sc.nextInt();
				
				Student student = new Student(studentName,money);
				studentList.add(student);
				
			}else if(select == 2) {
				String studentName;
				System.out.println("선택>> 2");
				System.out.println("학생이름    가진돈");
				for(Student student : studentList) {
					System.out.println(student.studentName+"    " + student.money);
				}
				System.out.println("학생선택 (이름입력)");
				studentName = sc.next();
				for(Student student : studentList) {
					if(student.studentName.equals(studentName)) {
						System.out.println(student.studentName + "님을 선택하였습니다");
						studentNo = student.studentName;
					}
				}
				
			}else if(select == 3) {
				System.out.println("선택>> 3");
				
				
				for(Student student : studentList) {
					if(student.studentName.equals(studentNo)) {
						student.takeBus(bus100);
						System.out.println(student.studentName + "님" + bus100.busNumber + "번 버스를 탔습니다. 즐거운 하루되세요."  );
						System.out.println(student.studentName + "님의 남은돈은" + student.money + "입니다");
						bus100.showBusInfo();
					}
				}
				
				
			}else if(select == 4) {
				System.out.println("선택>> 4");
				
				for(Student student : studentList) {
					if(student.studentName.equals(studentNo)) {
						
						student.takeOutBus(bus100);
						System.out.println(student.studentName + "님" + bus100.busNumber + "번 버스를 내렸습니다. 굿바이~~~");
						System.out.println(student.studentName + "님의 남은돈은" + student.money + "입니다.");
						bus100.showBusInfo();
					}
				}
				
				
				
			}else if(select == 5) {
				System.out.println("선택>> 5");
				
				
				for(Student student : studentList) {
					if(student.studentName.equals(studentNo)) {
						
						student.takeSubway(subwaygreen);
						System.out.println(student.studentName + "님" + subwaygreen.lineNumber + "호선을 탔습니다. 즐거운 하루되세요."  );
						System.out.println(student.studentName + "님의 남은돈은" + student.money + "입니다");
						System.out.println("지하철" + subwaygreen.lineNumber + "호선의 승객은" + subwaygreen.passengerCount + "명이고 수입은" + subwaygreen.money + "입니다.");
					}
				}
			}else if(select == 6) {
				System.out.println("선택>> 6");
				
				for(Student student : studentList) {
					if(student.studentName.equals(studentNo)) {
						
						student.takeOutSubway(subwaygreen);
						System.out.println(student.studentName + "님" + subwaygreen.lineNumber + "호선을 내렸습니다. 굿바이~~~");
						System.out.println(student.studentName + "님의 남은돈은" + student.money + "입니다.");
						System.out.println("지하철" + subwaygreen.lineNumber + "호선의 승객은 " + subwaygreen.passengerCount + "명이고 수입은" + subwaygreen.money + "입니다.");
					}
				}
			}else if(select == 7) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			}
			
		}
		
		
		
		
		/*
		학생 5명 입력 : 학생당 100,000만원 초기값 할당. 
		=============================================
		1. 학생객체 생성  | 2. 학생정보 출력 및 선택  
		3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료  
		=============================================
		선택>> 1
		학생이름  : 
		 돈 입력   : 

		선택>> 2 
		=====학생정보 출력=====
		학생이름	가진돈



		학생선택(이름입력)>> 


		선택>> 3
		000 님 000 번 버스를 탔습니다. 즐거운 하루되세요. 
		000 님의 남은돈은 000 입니다. 
		버스 000번의 승객은 000명이고 수입은000 입니다. 

		선택>> 4
		000 님 000 번 버스를 내렸습니다. 굿바이~~~. 
		000 님의 남은돈은 000 입니다. 
		버스 00번의 승객은 000명이고 수입은 000 입니다. 

		선택>> 5
		000 님 000 호선 지하철를 탔습니다. 즐거운 하루되세요. 
		000 님의 남은돈은 000 입니다. 
		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 

		선택>> 6
		000 님 000 호선 지하철를 내렸습니다. 안녕 ~~~
		000 님의 남은돈은 000 입니다. 
		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 
		*/ 
//		Student student1 = new Student("안병욱", 100000);
//		Student student2 = new Student("장지원", 100000);
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
