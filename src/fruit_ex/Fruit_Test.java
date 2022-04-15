package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	상속을 다루는 문제 입니다. 하위의 생성자에 super() 상위 
 */

class Fruit {
	String fruitName; // 과일이름
	String color; // 과일 색깔
	int large; // 과일 크기
	
	Fruit(String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	};
	
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLarge() {
		return large;
	}

	public void setLarge(int large) {
		this.large = large;
	}

	
	
	

	@Override
	public String toString() {
		return "과일의 이름은<" + fruitName + ">이고, 색깔은 <" + color + "> 입니다. 크기는 <" + large + "> 입니다.";
	}
}

class Apple extends Fruit {
	Apple(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
}

class Orange extends Fruit {
	Orange(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
}

class Banana extends Fruit {
	Banana(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
}

public class Fruit_Test {

	public static void main(String[] args) {

		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		Scanner sc = new Scanner(System.in);
		int select;

		/*
		 * 1. 코드 작성 : 스캐너를 인풋 받는 코드 작성
		 * ================================================== 
		 * 1. 사과 | 2. 오렌지 | 3. 바나나 | 4. 정보출력 | 5. 종료
		 * ==================================================
		 * 
		 * 선택 >> 1 과일명 : 색깔 : 크기 :
		 * 
		 * 
		 */

		

		// 2. 코드작성 : 스캐너로 인풋 받은 값으로 각각의 객체를 생성해서 ArrayList에 저장

		// 3. 선택 >> 4 ArrayList의 모든 객체를 가져와서 객체를 출력 했을 때, Enhanced For문을 사용해서
		// 출력결과 :
		// 과일의 이름 : <사과> 이고, 색깔은 <빨간색> 이고, 크기는 <10> 입니다.
		// 과일의 이름 : <오렌지> 이고, 색깔은 <오렌지> 이고, 크기는 <20> 입니다.
		// 과일의 이름 : <바나나> 이고, 색깔은 <노란색> 이고, 크기는 <30> 입니다.
		
		do {
			System.out.println("==================================================");
			System.out.println("1. 사과 | 2. 오렌지 | 3. 바나나  | 4. 정보출력 | 5. 종료");
			System.out.println("==================================================");
			
			select = sc.nextInt();
			
			if (select == 1) {
				String fruitName;
				String color;
				int large;
				System.out.print("과일명: ");
				fruitName = sc.next();
				System.out.print("색깔: ");
				color = sc.next();
				System.out.print("크기: ");
				large = sc.nextInt();
				
				Apple apple = new Apple(fruitName,color,large);
				fruitList.add(apple);
				
			} else if (select == 2) {
				String fruitName;
				String color;
				int large;
				
				System.out.print("과일명: ");
				fruitName = sc.next();
				System.out.print("색깔: ");
				color = sc.next();
				System.out.print("크기: ");
				large = sc.nextInt();
				
				Orange orange = new Orange(fruitName,color,large);
				fruitList.add(orange);
			} else if (select == 3) {
				String fruitName;
				String color;
				int large;
				
				System.out.print("과일명: ");
				fruitName = sc.next();
				System.out.print("색깔: ");
				color = sc.next();
				System.out.print("크기: ");
				large = sc.nextInt();
				
				Banana banana = new Banana(fruitName,color,large);
				fruitList.add(banana);
			}else if(select == 4) {
				for(Fruit fruits : fruitList) {
					System.out.println(fruits);
				}
			}else if(select == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}while(true);

		
	}

}
