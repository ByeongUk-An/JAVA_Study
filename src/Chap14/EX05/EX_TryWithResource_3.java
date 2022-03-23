package Chap14.EX05;
//�ڵ� ���ҽ�(��ü) ����

// �ʵ��� �� �Ҵ�. ������ ȣ��� �ʵ忡 ���� �ο�,
class Abc implements AutoCloseable {
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg; // ��� ���

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
		System.out.println("�̸���" + name + "�̸� �й��� " + studentID + "�Դϴ�.");
		System.out.println("���� ������" + kor + "��, ���� ������" + eng + "�� ���� ������" + math + "�Դϴ�.");
		System.out.println("�� ������ ����� :" + avg);
		if (name != null || studentID != 0 || kor != 0 || eng != 0 || math != 0 || avg != 0.0) {
			name = null;
			studentID = 0;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0.0;
			System.out.println("���ҽ��� �����Ǿ����ϴ�.");
		}
	}
}

public class EX_TryWithResource_3 {

	public static void main(String[] args) {
		// 1. ��ü�� ��� �ʵ带 �ʱ�ȭ �ϰ� �ڵ����� close();
		try (Abc a2 = new Abc("�Ⱥ���", 14505338, 81, 71, 63);) {

		} catch (Exception e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
//			e.printStackTrace();
		}
		System.out.println("======================");
		// 2. ���� close() , finally ������� close() ȣ��
		Abc a3 = null;
		try {
			a3 = new Abc("ȫ�浿", 1262041, 51, 11, 39);
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��߽��ϴ�");
		} finally {
			if (a3.name != null || a3.studentID != 0 || a3.kor != 0 || a3.eng != 0 || a3.math != 0 || a3.avg != 0.0) {
				try {
					a3.close();
				} catch (Exception e) {
					System.out.println("���ܰ� �߻��߽��ϴ�.");
					e.printStackTrace();
				}
			}
		}
	}

}
