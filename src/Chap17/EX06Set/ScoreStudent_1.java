package Chap17.EX06Set;

import java.util.ArrayList;
import java.util.Scanner;

/*
    1. 학생수 : 임의의 값을 입력 했을때 ArrayList의 capacity 크기지정
    2. 점수 입력 : 입력 받은 학생수에 따라서 점수 입력. ArrayList에 객체를 저장
    3. 점수 리스트 : ArrayList에 저장된 Student 객체를 가져와서 score 출력
    4. 분석 : 최고점 :  , 평균점수 :
    5. 종료
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

				+ "1. 학생수 | 2. 점수입력 | 3. 점수 리스트 |4. 분석 | 5. 종료\n"

				+ "---------------------------------------------------");

		while (run == true) { //

			System.out.println("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생 수>");
				studentNo = scanner.nextInt();
			} else if (selectNo == 2) {
				scores = new int[studentNo];

				if (studentNo == 0) {
					System.out.println("학생수를 먼저 입력 하세요.");
				} else {
					for (int i = 0; i < studentNo; i++) {
						System.out.println((i + 1) + "번 학생 점수를 입력하세요 :");
						st.add(scanner.nextInt());
					}
				}
				System.out.println("점수 입력이 끝났습니다.");
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNo; i++) {
					System.out.println(i + "번 학생의 점수는 :" + st.get(i));
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
				System.out.println("최고점수: " + max);
				System.out.println("평균: " + (double) avg);
			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}

		}
	}
}
