package Exex;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };
		Scanner sc = new Scanner(System.in);
		String name;
		int i;
		int j;
		while(true) {
			j=0; 
			System.out.println("���� �̸��� �����ּ���!");
			name = sc.next();
			if(name.equals("�׸�")) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			for(i =0; i< course.length; i++) {
				if(course[i].equals(name)) { 
					System.out.println(name + "�� ������ " + score[i]);
					j = 1;
				}
				
			}
				if(j==0) {
					System.out.println("���� �����Դϴ�.");
				}
		}
		sc.close();
	}
}
