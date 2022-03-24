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
	String season; // 봄, 여름, 가을, 겨울 (예외발생 : 봄,여름,가을 겨울만 입력하세요)
	String week; // 월,화,수,목,금,토,일 (예외 발생 : 월,화,수,목,금,토,일 만 입력하세요")
	int scoreKor; // 0~100 값만 입력 (예외 발생 : 0~100 까지 정수만 입력하세요)
	int scoreEng; // 0~100 값만 입력 (예외 발생 : 0~100까지 정수만 입력하세요)
	String userID; // 12자이상 20자 사이의 문자 (예외 발생 : 12자이상 20자 사이의 문자만 넣으세요)

	void seasonfn(String season) throws SeasonException {
		if (season.equals("봄")) {
			System.out.println("봄이에요");
			this.season = season;
		} else if (season.equals("여름")) {
			System.out.println("여름이에요");
			this.season = season;
		} else if (season.equals("가을")) {
			System.out.println("가을이에요");
			this.season = season;
		} else if (season.equals("겨울")) {
			System.out.println("겨울이에요");
			this.season = season;
		} else {
			throw new SeasonException("예외발생 : 봄 여름 가을 겨울만 입력하세요");
		}
	}

	void weekfn(String week) throws WeekException {
		switch (week) {
		case "월":
			System.out.println("월요일이에요");
			this.week = week;
			break;
		case "화":
			System.out.println("화요일이에요");
			this.week = week;
			break;
		case "수":
			System.out.println("수요일이에요");
			this.week = week;
			break;
		case "목":
			System.out.println("목요일이에요");
			this.week = week;
			break;
		case "금":
			System.out.println("금요일이에요");
			this.week = week;
			break;
		case "토":
			System.out.println("토요일이에요");
			this.week = week;
			break;
		case "일":
			System.out.println("일요일이에요");
			this.week = week;
			break;
		default:
			throw new WeekException("예외발생 : 월 화 수 목 금 토 일 만 입력하세요");
		}
	}

	void scoreKorfn(int scoreKor) throws ScoreKorException {
		if (scoreKor < 0 || scoreKor > 100) {
			throw new ScoreKorException("예외 발생 : 0~100 까지 정수만 입력 하세요");
		} else {
			System.out.println("정상 입력되었습니다");
			this.scoreKor = scoreKor;
			System.out.println("국어점수는 :" + this.scoreKor + "점 입니다.");
		}
	}
	
	void scoreEngfn(int scoreEng) throws ScoreEngException {
		if (scoreEng < 0 || scoreEng > 100) {
			throw new ScoreEngException("예외 발생 : 0~100 까지 정수만 입력 하세요");
		} else {
			this.scoreEng = scoreEng;
			System.out.println("정상입력되었습니다 당신의 영어점수는 :" + this.scoreEng + "점 입니다.");
		}
	}
	
	void userIDfn(String userID) throws UserIdException {
		if(userID.length()<12 || userID.length()>20) {
			throw new UserIdException("예외발생 : 12자이상 20자 사이의 문자만 넣으세요");
		}else {
			this.userID = userID;
			System.out.println("정상입력되었습니다. 당신의 아이디는 : " + this.userID + "입니다.");
			
		}
	}
}

public class UserException_EX {

	public static void main(String[] args) {
		A a = new A();
		try {
			a.seasonfn("봄");
		} catch (SeasonException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("============================");

		try {
			a.weekfn("월");
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
