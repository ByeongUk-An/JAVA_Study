package Exex;

class Student {
	// Java는 다중 상속이 불가. 부모 class는 한개만 가능. Java의 모든 class는 Object의 자식 class임
    // Object class에서 정의한 필드나 method를 재사용할 수 있음
	
	String name; // 학생이름
	int studentID; // 학번
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수
	int sum; // 점수합계
	double avg; // 점수평균

	void hobby() {
		System.out.println("각 학생의 취미는 입니다.");
	}


	@Override
	public String toString() { 
		//Object 클래스의 메소드, 객체 자체를 출력할때,[패키지명.클래스명@해쉬코드]
		return "이름 : " + name + ", 학번 : " + studentID + ", 국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math + "합계 : "
				+ sum + ", 평균 : " + avg;

	}
}

	class S_철수 extends Student {
		S_철수() {  //생성자: 1. 클래스명과 동일, 2. 리턴타입이 없어야한다.
		};

		S_철수(int k, int e, int m, String h, int id) {
			super.kor = k;  //super 부모 클래스, this : 자신의 객체
			super.eng = e;
			super.math = m;
			super.name = h;
			super.studentID = id;

			super.sum = k + e + m;
			super.avg = (double)((k + e + m) / 3); // 평균을 계산 할때는 (double)로 캐스팅
		}

		@Override
		void hobby() {
			System.out.println("철수의 취미는 낚시 입니다.");
		}

	}

	class S_영희 extends Student {
		S_영희() {
		};

		S_영희(int k, int e, int m, String h, int id) {
			super.kor = k;
			super.eng = e;
			super.math = m;
			super.name = h;
			super.studentID = id;
			
			super.sum = k + e + m;
			super.avg = (k + e + m) / 3;
		}

		@Override
		void hobby() {
			System.out.println("영희의 취미는 뜨개질 입니다.");
		}

	}

	class S_영식 extends Student {
		S_영식() {
		};

		S_영식(int k, int e, int m, String h, int id) {
			super.kor = k;
			super.eng = e;
			super.math = m;
			super.name = h;
			super.studentID = id;

			super.sum = k + e + m;
			super.avg = (k + e + m) / 3;
		}

		@Override
		void hobby() {
			System.out.println("영식의 취미는 만화보기입니다.");
		}

	}

	public class Quiz03 {

		public static void main(String[] args) {
			Student a1 = new S_철수(70,40,80,"김철수",124152);
			Student b1 = new S_영희(90,100,870,"이영희",163312);
			Student c1 = new S_영식(90,40,60,"최영식",164572);
			
			Student[] arr = {a1,b1,c1};
			
			for(int i = 0; i< arr.length; i++) {
				System.out.println(arr[i]);
				arr[i].hobby();
			}
			for(Student q : arr) {
				System.out.println(q);
				q.hobby();
			}
		}

	}

