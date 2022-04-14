package EmployeeInfo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;



class Employee { // 사원의 정보를 담은 클래스
	int empNo; // 사원번호
	String empName; // 사원이름
	String phone; // 연락처
	int age; // 나이
	String dept; // 부서
	String compRank; // 직급

	public Employee() {
	};

	public Employee(int empNo, String empName, String phone, int age, String dept, String compRank) {
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
		this.compRank = compRank;

	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCompRank() {
		return compRank;
	}

	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}

}

public class Employee_info {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee_info info = new Employee_info();

		Scanner sc = new Scanner(System.in);
		int selectNo;
		do {
			System.out.println("=======사원관리 프로그램============");
			System.out.println("# 1. 사원정보 신규등록");
			System.out.println("# 2. 사원정보 검색");
			System.out.println("# 3. 사원정보 수정");
			System.out.println("# 4. 사원정보 삭제");
			System.out.println("# 5. 프로그램 종료");

			selectNo = sc.nextInt();

			if (selectNo == 5) {
				System.out.println("프로그램이 종료 되었습니다.");
				return;
			} else if (selectNo == 1) { // 사원등록
				info.empInsert();
			} else if (selectNo == 2) {
				info.empList();
			} else if (selectNo == 3) {
				info.empEdit();
			} else if (selectNo == 4) {
				info.empDel();
			}

		} while (true);
	}

	private static TreeSet<Employee> set = new TreeSet<Employee>(new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			if (o1.empNo < o2.empNo) {
				return 1;
			} else if (o1.empNo == o2.empNo) {
				return 0;
			} else {
				return -1;
			}
		}

	});
	
	private static Scanner sc = new Scanner(System.in);
	private static void empInsert() {
		
		System.out.println("사원정보 입력");
		System.out.println("사원번호를 입력해주세요");
		int empNo = sc.nextInt();
		System.out.println("이름을 입력해주세요");
		String empName = sc.next();
		System.out.println("휴대전화 번호를 입력해주세요");
		String phone = sc.next();
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		System.out.println("소속 하신 부서를 입력해주세요");
		String dept = sc.next();
		System.out.println("직급을 입력해주세요");
		String compRank = sc.next();

		Employee employ = new Employee(empNo, empName, phone, age, dept, compRank);
		set.add(employ);
		System.out.println(empName + "님의 사원정보가 입력되었습니다.");
	}
	
	private static void empList() {
		System.out.println("사원 리스트");
		Iterator<Employee> ir = set.iterator();
		while(ir.hasNext()) {
			Employee employee = ir.next();
			if(employee != null) {
				System.out.print(employee.getEmpNo());
				System.out.print("    ");
				System.out.print(employee.getEmpName());
				System.out.print("    ");
				System.out.print(employee.getPhone());
				System.out.print("    ");
				System.out.print(employee.getAge());
				System.out.print("    ");
				System.out.print(employee.getDept());
				System.out.print("    ");
				System.out.print(employee.getCompRank());
				System.out.println();
			}
		}
		
	}
	
	private static void empEdit() {
		System.out.println("수정할 사번:");
		int empno = sc.nextInt();
		int select;
		String phone; // 연락처
		int age; // 나이
		String dept; // 부서
		String compRank; // 직급
		Employee employee = findEmp(empno);
		
		if(employee == null) {
			System.out.println("결과 : 일치하는 사번이 없습니다.");
			return;
		}
		
		System.out.println("수정할 필드 선택 [1. 연락처, 2.나이, 3. 부서, 4.직급] : ");
		select = sc.nextInt();
		if(select == 1) {
			System.out.println("수정할 연락처를 입력해주세요.");
			phone = sc.next();
			employee.setPhone(phone);
			System.out.println("연락처가 변경되었습니다.");
		}else if(select == 2) {
			System.out.println("수정할 나이를 입력해주세요");
			age = sc.nextInt();
			employee.setAge(age);
			System.out.println("나이가 변경되었습니다.");
		}else if(select == 3) {
			System.out.println("수정할 부서를 입력해주세요.");
			dept = sc.next();
			employee.setDept(dept);
			System.out.println("부서변경이 되었습니다.");
		}else if(select == 4) {
			System.out.println("수정할 직급을 입력해주세요");
			compRank = sc.next();
			employee.setCompRank(compRank);
			System.out.println("직급이 변경되었습니다.");
		}
		
	}
	
	private static void empDel() {
		
		System.out.println("삭제할 사번을 입력해주세요.");
		int empno = sc.nextInt();
		Employee employee = findEmp(empno);
		
		if(employee == null) {
			System.out.println("결과 : 일치하는 사번이 없습니다.");
			return;
		}else {
			set.remove(employee);
			System.out.println("해당 사번이 삭제되었습니다.");
		}
		
		
			
		
		
	}
	
	private static Employee findEmp(int ano) {
		Employee employee = null;
		
		Iterator<Employee> ir = set.iterator();
		
		while(ir.hasNext()) {
			Employee e1 = ir.next();
			int dbno = e1.getEmpNo();
			if(dbno == ano) {
				employee = e1;
				return employee;
			}
		}
		
		
		return employee;
	}
	
	

}
