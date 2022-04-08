package Chap14.EX09;

class MyAllException extends Exception{    // �Ϲݿ��� (checked Exception) - ���� ���� (����ó��)
	public MyAllException() {
		super();
	}
	public MyAllException(String message) {  //���� �޼��� ��� , e.getMessage() 
		super(message);      
	}
}

//�Ϸ� �ð� 40�� : 5:10�б��� �Ϸ�. p.jangwoo@gmail.com

class A {
	//private : ����ȭ, ��ü������ �ٷ� ���� ���� ���ϵ��� ���� 
		// ������, setter <== ������ �ʵ��� ���� �Ҵ�. 
	
	private String season ;   //��, ����, ����, �ܿ�  (���ܹ߻� : ��,����,����,�ܿ︸ �Է��ϼ���)
	private String week ; 	  //��, ȭ, ��, ��, ��, ��, ��  (���� �߻� : ��, ȭ, ��, ��, ��, ��, �� �� �Է��ϼ���")
	private int scoreKor;     //0 ~ 100 ���� �Է� (���� �߻� : 0 ~ 100 ���� ������ �Է� �ϼ���")
	private int scoreEng; 	  //0 ~ 100 ���� �Է� (���� �߻� : 0 ~ 100 ���� ������ �Է� �ϼ���")
	private String userID;    // 12���̻� 20�� ������ ���� ( ���� �߻� : 12���̻� 20�� ������ ���ڸ� ��������")
	
	//�ϳ��� �޼ҵ�� ó�� 
	void studentInfo(String season, String week, int scoreKor, int scoreEng, String userID) throws MyAllException {
		if (season != "��" && season != "����" && season != "����" && season != "�ܿ�") {
			throw new MyAllException ("���ܹ߻� : ��,����,����,�ܿ︸ �Է��ϼ���");
		}else if (week != "��" && week != "ȭ" && week != "��" && week != "��" && week != "��" && week != "��" && week != "��" ) {
			throw new MyAllException ("���� �߻� : ��, ȭ, ��, ��, ��, ��, �� �� �Է��ϼ���");
		}else if (scoreKor < 0 || scoreKor > 100) {
			throw new MyAllException ("���� �߻� : 0 ~ 100 ���� ������ �Է� �ϼ���");
		}else if (scoreEng < 0 || scoreEng > 100) {
			throw new MyAllException ("���� �߻� : 0 ~ 100 ���� ������ �Է� �ϼ���");
		}else if (userID.length() < 12 || userID.length() > 20 ) {
			throw new MyAllException (" ���� �߻� : 12���̻� 20�� ������ ���ڸ� ��������");
		}else {
			System.out.println("���������� ���� ��� �� �Է� �Ǿ����ϴ�. ");
			this.season = season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
		}
		System.out.println(season + "," + week + "," + scoreKor + "," + scoreEng + "," + userID);	
		System.out.println();
	}		
}

public class UserException_EX {
	public static void main(String[] args)  {
		A a = new A() ;
		
		//��� �ʵ��� ���� ���� 
		try {
			a.studentInfo("��", "��", 80, 90, "aaaaaaaaaaaabbb");
		} catch (MyAllException e) {			
			//e.printStackTrace();		//void    
			System.out.println(e.getMessage());    //Retrun String 
			
		}
		
		//season �ʵ� �׽�Ʈ 
		System.out.println("===============================");
		
		try {
			a.studentInfo("��", "��", 80, 90, "aaaaaaaaaaaabbb");
		} catch (MyAllException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}

}
