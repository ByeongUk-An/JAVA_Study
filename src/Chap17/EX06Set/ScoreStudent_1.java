package Chap17.EX06Set;

import java.util.ArrayList;
import java.util.Scanner;

/*
    1. �л��� : ������ ���� �Է� ������ ArrayList�� capacity ũ������
    2. ���� �Է� : �Է� ���� �л����� ���� ���� �Է�. ArrayList�� ��ü�� ����
    3. ���� ����Ʈ : ArrayList�� ����� Student ��ü�� �����ͼ� score ���
    4. �м� : �ְ��� :  , ������� :
    5. ����
 */
class Student {
	int score;

	Student(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}

public class ScoreStudent_1 {

	public static void main(String[] args) {

		boolean run = true;

		int scores[] = null;

		int studentNo = 0;

		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> st = new ArrayList<Integer>(studentNo);
		System.out.println("---------------------------------------------------\n"

				+ "1. �л��� | 2. �����Է� | 3. ���� ����Ʈ |4. �м� | 5. ����\n"

				+ "---------------------------------------------------");

		while (run == true) { //

			System.out.println("����>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("�л� ��>");
				studentNo = scanner.nextInt();
			} else if (selectNo == 2) {
				scores = new int[studentNo];

				if (studentNo == 0) {
					System.out.println("�л����� ���� �Է� �ϼ���.");
				} else {
					for (int i = 0; i < studentNo; i++) {
						System.out.println((i + 1) + "�� �л� ������ �Է��ϼ��� :");
						st.add(scanner.nextInt());
					}
				}
				System.out.println("���� �Է��� �������ϴ�.");
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNo; i++) {
					System.out.println(i + "�� �л��� ������ :" + st.get(i));
				}
			} else if (selectNo == 4) {
				int max = scores[0];
				int sum = 0;
				for (int i = 0; i < studentNo; i++) {
					if (max <= st.get(i)) {
						max = st.get(i);
					}
				}
				for (int i = 0; i < studentNo; i++) {
					sum += st.get(i);
				}
				int avg = sum / studentNo;
				System.out.println("�ְ�����: " + max);
				System.out.println("���: " + (double) avg);
			} else if (selectNo == 5) {
				run = false;
				System.out.println("���α׷� ����");
			}

		}
	}
}
