package chap01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력해주세요.");
		Scanner scanner = new Scanner(System.in);   //Scanner scanner <- 소문자로 되어있는 부분은 약칭이다. 다른이름으로 사용이가능 주로 sc로사용
		
		String name = scanner.next(); //문자열을 인풋받도록 함
		System.out.println("이름은 " + name);
		
		String city = scanner.next();
		System.out.println("도시는 " + city + ", ");
		
		int age = scanner.nextInt(); // 정수값을 인풋받아서 읽어 들임
		System.out.println("나이는 " + age + ", ");
		
		double weight = scanner.nextDouble(); // 실수 값을 인풋 받아서 읽어들임
		System.out.println("체중은 " + weight + ", ");
		
		boolean single = scanner.nextBoolean(); // 논리값을 읽어 들임(True, False)
		System.out.println("독신여부는 " + single + "입니다.");
		
		scanner.close();  //scanner를 사용했으면 항상 close를 사용해주어야한다.
	}

}
