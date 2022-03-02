package Exex;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		Scanner sc = new Scanner(System.in);
		String name;
		int i;
		int j;
		while(true) {
			j=0; 
			System.out.println("과목 이름을 말해주세요!");
			name = sc.next();
			if(name.equals("그만")) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			for(i =0; i< course.length; i++) {
				if(course[i].equals(name)) { 
					System.out.println(name + "의 점수는 " + score[i]);
					j = 1;
				}
				
			}
				if(j==0) {
					System.out.println("없는 과목입니다.");
				}
		}
		sc.close();
	}
}
