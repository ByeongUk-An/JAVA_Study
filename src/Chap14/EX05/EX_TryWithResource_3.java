package Chap14.EX05;
//자동 리소스(객체) 제거

// 필드의 값 할당. 생성자 호출시 필드에 값을 부여,
class Abc implements AutoCloseable {
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg; // 평균 계산

	Abc(String name, int studentID, int kor, int eng, int math) {
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (double) (kor + eng + math) / 3;
	}

	@Override
	public void close() throws Exception {
		System.out.println("이름은" + name + "이며 학번은 " + studentID + "입니다.");
		System.out.println("국어 점수는" + kor + "점, 영어 점수는" + eng + "점 수학 점수는" + math + "입니다.");
		System.out.println("세 과목의 평균은 :" + avg);
		if (name != null || studentID != 0 || kor != 0 || eng != 0 || math != 0 || avg != 0.0) {
			name = null;
			studentID = 0;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0.0;
			System.out.println("리소스가 해제되었습니다.");
		}
	}
}

public class EX_TryWithResource_3 {

	public static void main(String[] args) {
		// 1. 객체의 모든 필드를 초기화 하고 자동으로 close();
		try (Abc a2 = new Abc("안병욱", 14505338, 81, 71, 63);) {

		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
//			e.printStackTrace();
		}
		System.out.println("======================");
		// 2. 수동 close() , finally 블락에서 close() 호출
		Abc a3 = null;
		try {
			a3 = new Abc("홍길동", 1262041, 51, 11, 39);
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다");
		} finally {
			if (a3.name != null || a3.studentID != 0 || a3.kor != 0 || a3.eng != 0 || a3.math != 0 || a3.avg != 0.0) {
				try {
					a3.close();
				} catch (Exception e) {
					System.out.println("예외가 발생했습니다.");
					e.printStackTrace();
				}
			}
		}
	}

}
