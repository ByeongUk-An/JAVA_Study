package Exex;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = { "가위", "바위", "보" };
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {
			int n = (int) (Math.random() * 3);
			System.out.print("가위 바위 보!!!!!");
			String play = sc.next();
			if (play.equals("그만")) {
				System.out.println("게임을 종료하겠다요!!!");
				break;
			}
			System.out.print("사용자는 " + play + ", 컴퓨터 = " + str[n] + ", ");
			if (play.equals("가위")) {
				if (str[n].equals("가위")) {
					System.out.println("비김.");
				}else if (str[n].equals("바위")) {
					System.out.println("컴퓨터가 이김."); 
				}else if (str[n].equals("보")) {
					System.out.println("사용자가 이김.");
				}} else if (play.equals("바위")) {
				if (str[n].equals("가위")) {
					System.out.println("사용자가 이김.");
				}else if (str[n].equals("바위")) {
					System.out.println("비김.");
				}else if (str[n].equals("보")) {
					System.out.println("컴퓨터가 이김.");
				}} else if (play.equals("보")) {
				if (str[n].equals("가위")) {
					System.out.println("컴퓨터가 이김.");
				}else if (str[n].equals("바위")) {
					System.out.println("사용자가 이김.");
				}else if (str[n].equals("보")) {
					System.out.println("비김.");
				}} else {
				System.out.println("잘못 입력했다요.");
			}
				
		}
		sc.close();

	}
}
