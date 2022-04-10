package school;

import java.util.ArrayList;

public class Student {
	private int StudentId;  //�й�
	private String studentName; //�̸�
	private Subject majorSubject;  //���� ����
	
	//�л��� ���� ����Ʈ
	//addSubjectScore() �޼��尡 ȣ��Ǹ� ����Ʈ�� �߰� ��
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.StudentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	
	public void addSubjectScore(Score score){
		scoreList.add(score);
	}

	
	public int getStudentId() {
		return StudentId;
	}


	public void setStudentId(int studentId) {
		StudentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Subject getMajorSubject() {
		return majorSubject;
	}


	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}


	public ArrayList<Score> getScoreList() {
		return scoreList;
	}


	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}


	
}