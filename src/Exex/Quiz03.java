package Exex;

class Student {
	// Java�� ���� ����� �Ұ�. �θ� class�� �Ѱ��� ����. Java�� ��� class�� Object�� �ڽ� class��
    // Object class���� ������ �ʵ峪 method�� ������ �� ����
	
	String name; // �л��̸�
	int studentID; // �й�
	int kor; // ��������
	int eng; // ��������
	int math; // ��������
	int sum; // �����հ�
	double avg; // �������

	void hobby() {
		System.out.println("�� �л��� ��̴� �Դϴ�.");
	}


	@Override
	public String toString() { 
		//Object Ŭ������ �޼ҵ�, ��ü ��ü�� ����Ҷ�,[��Ű����.Ŭ������@�ؽ��ڵ�]
		return "�̸� : " + name + ", �й� : " + studentID + ", ���� : " + kor + ", ���� : " + eng + ", ���� : " + math + "�հ� : "
				+ sum + ", ��� : " + avg;

	}
}

	class S_ö�� extends Student {
		S_ö��() {  //������: 1. Ŭ������� ����, 2. ����Ÿ���� ������Ѵ�.
		};

		S_ö��(int k, int e, int m, String h, int id) {
			super.kor = k;  //super �θ� Ŭ����, this : �ڽ��� ��ü
			super.eng = e;
			super.math = m;
			super.name = h;
			super.studentID = id;

			super.sum = k + e + m;
			super.avg = (double)((k + e + m) / 3); // ����� ��� �Ҷ��� (double)�� ĳ����
		}

		@Override
		void hobby() {
			System.out.println("ö���� ��̴� ���� �Դϴ�.");
		}

	}

	class S_���� extends Student {
		S_����() {
		};

		S_����(int k, int e, int m, String h, int id) {
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
			System.out.println("������ ��̴� �߰��� �Դϴ�.");
		}

	}

	class S_���� extends Student {
		S_����() {
		};

		S_����(int k, int e, int m, String h, int id) {
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
			System.out.println("������ ��̴� ��ȭ�����Դϴ�.");
		}

	}

	public class Quiz03 {

		public static void main(String[] args) {
			Student a1 = new S_ö��(70,40,80,"��ö��",124152);
			Student b1 = new S_����(90,100,870,"�̿���",163312);
			Student c1 = new S_����(90,40,60,"�ֿ���",164572);
			
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

