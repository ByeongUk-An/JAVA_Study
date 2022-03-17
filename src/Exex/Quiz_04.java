package Exex;

class Student1 {
	int studentID;
	String name;
	int kor;
	int eng;

	Student1(int student, String name, int kor, int eng) {
		this.studentID = student;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.studentID == ((Student1)obj).studentID) {
			System.out.println("같은 학생이다");
			return true;
		}
		return false;
	}
}

public class Quiz_04 {

	public static void main(String[] args) {
		Student1 s1 = new Student1(1262041, "안병욱", 80, 100);
		Student1 s2 = new Student1(1262043, "노재희", 70, 100);
		Student1 s3 = new Student1(1262042, "장지원", 80, 60);
		Student1 s4 = new Student1(1262041, "노재희", 70, 100);

		//studentID 가 같은 경우 같은 학생이다 라고 출력
		
		System.out.println(s1.equals(s4)); // true
		
		
		
	}

}
