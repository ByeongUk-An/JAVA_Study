package Chap14.EX09;

class SeasonException extends Exception {
	public SeasonException() {
		super();
	}

	public SeasonException(String message) {
		super(message);
	}
}

class WeekException extends Exception {
	public WeekException() {
		super();
	}

	public WeekException(String message) {
		super(message);
	}
}

class ScoreKorException extends Exception {
	public ScoreKorException() {
		super();
	}

	public ScoreKorException(String message) {
		super(message);
	}
}

class ScoreEngException extends Exception {
	public ScoreEngException() {
		super();
	}

	public ScoreEngException(String message) {
		super(message);
	}
}

class UserIdException extends Exception {
	public UserIdException() {
		super();
	}

	public UserIdException(String message) {
		super();
	}
}

class A {
	String season; // ��, ����, ����, �ܿ� (���ܹ߻� : ��,����,���� �ܿ︸ �Է��ϼ���)
	String week; // ��,ȭ,��,��,��,��,�� (���� �߻� : ��,ȭ,��,��,��,��,�� �� �Է��ϼ���")
	int scoreKor; // 0~100 ���� �Է� (���� �߻� : 0~100 ���� ������ �Է��ϼ���)
	int scoreEng; // 0~100 ���� �Է� (���� �߻� : 0~100���� ������ �Է��ϼ���)
	String userID; // 12���̻� 20�� ������ ���� (���� �߻� : 12���̻� 20�� ������ ���ڸ� ��������)

	void seasonfn(String season) throws SeasonException {
		if (season.equals("��")) {
			System.out.println("���̿���");
			this.season = season;
		} else if (season.equals("����")) {
			System.out.println("�����̿���");
			this.season = season;
		} else if (season.equals("����")) {
			System.out.println("�����̿���");
			this.season = season;
		} else if (season.equals("�ܿ�")) {
			System.out.println("�ܿ��̿���");
			this.season = season;
		} else {
			throw new SeasonException("���ܹ߻� : �� ���� ���� �ܿ︸ �Է��ϼ���");
		}
	}

	void weekfn(String week) throws WeekException {
		switch (week) {
		case "��":
			System.out.println("�������̿���");
			this.week = week;
			break;
		case "ȭ":
			System.out.println("ȭ�����̿���");
			this.week = week;
			break;
		case "��":
			System.out.println("�������̿���");
			this.week = week;
			break;
		case "��":
			System.out.println("������̿���");
			this.week = week;
			break;
		case "��":
			System.out.println("�ݿ����̿���");
			this.week = week;
			break;
		case "��":
			System.out.println("������̿���");
			this.week = week;
			break;
		case "��":
			System.out.println("�Ͽ����̿���");
			this.week = week;
			break;
		default:
			throw new WeekException("���ܹ߻� : �� ȭ �� �� �� �� �� �� �Է��ϼ���");
		}
	}

	void scoreKorfn(int scoreKor) throws ScoreKorException {
		if (scoreKor < 0 || scoreKor > 100) {
			throw new ScoreKorException("���� �߻� : 0~100 ���� ������ �Է� �ϼ���");
		} else {
			System.out.println("���� �ԷµǾ����ϴ�");
			this.scoreKor = scoreKor;
			System.out.println("���������� :" + this.scoreKor + "�� �Դϴ�.");
		}
	}
	
	void scoreEngfn(int scoreEng) throws ScoreEngException {
		if (scoreEng < 0 || scoreEng > 100) {
			throw new ScoreEngException("���� �߻� : 0~100 ���� ������ �Է� �ϼ���");
		} else {
			this.scoreEng = scoreEng;
			System.out.println("�����ԷµǾ����ϴ� ����� ���������� :" + this.scoreEng + "�� �Դϴ�.");
		}
	}
	
	void userIDfn(String userID) throws UserIdException {
		if(userID.length()<12 || userID.length()>20) {
			throw new UserIdException("���ܹ߻� : 12���̻� 20�� ������ ���ڸ� ��������");
		}else {
			this.userID = userID;
			System.out.println("�����ԷµǾ����ϴ�. ����� ���̵�� : " + this.userID + "�Դϴ�.");
			
		}
	}
}

public class UserException_EX {

	public static void main(String[] args) {
		A a = new A();
		try {
			a.seasonfn("��");
		} catch (SeasonException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("============================");

		try {
			a.weekfn("��");
		} catch (WeekException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("============================");
		
		try {
			a.scoreKorfn(1010);
		}catch(ScoreKorException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("============================");
		
		try {
			a.scoreEngfn(100);
		}catch(ScoreEngException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("============================");
		
		try {
			a.userIDfn("abcdefg1234567");
		}catch(UserIdException e) {
			System.out.println(e.getMessage());
		}
	}

}
