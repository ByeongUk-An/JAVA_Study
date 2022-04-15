package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	����� �ٷ�� ���� �Դϴ�. ������ �����ڿ� super() ���� 
 */

class Fruit {
	String fruitName; // �����̸�
	String color; // ���� ����
	int large; // ���� ũ��
	
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
		return "������ �̸���<" + fruitName + ">�̰�, ������ <" + color + "> �Դϴ�. ũ��� <" + large + "> �Դϴ�.";
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
		 * 1. �ڵ� �ۼ� : ��ĳ�ʸ� ��ǲ �޴� �ڵ� �ۼ�
		 * ================================================== 
		 * 1. ��� | 2. ������ | 3. �ٳ��� | 4. ������� | 5. ����
		 * ==================================================
		 * 
		 * ���� >> 1 ���ϸ� : ���� : ũ�� :
		 * 
		 * 
		 */

		

		// 2. �ڵ��ۼ� : ��ĳ�ʷ� ��ǲ ���� ������ ������ ��ü�� �����ؼ� ArrayList�� ����

		// 3. ���� >> 4 ArrayList�� ��� ��ü�� �����ͼ� ��ü�� ��� ���� ��, Enhanced For���� ����ؼ�
		// ��°�� :
		// ������ �̸� : <���> �̰�, ������ <������> �̰�, ũ��� <10> �Դϴ�.
		// ������ �̸� : <������> �̰�, ������ <������> �̰�, ũ��� <20> �Դϴ�.
		// ������ �̸� : <�ٳ���> �̰�, ������ <�����> �̰�, ũ��� <30> �Դϴ�.
		
		do {
			System.out.println("==================================================");
			System.out.println("1. ��� | 2. ������ | 3. �ٳ���  | 4. ������� | 5. ����");
			System.out.println("==================================================");
			
			select = sc.nextInt();
			
			if (select == 1) {
				String fruitName;
				String color;
				int large;
				System.out.print("���ϸ�: ");
				fruitName = sc.next();
				System.out.print("����: ");
				color = sc.next();
				System.out.print("ũ��: ");
				large = sc.nextInt();
				
				Apple apple = new Apple(fruitName,color,large);
				fruitList.add(apple);
				
			} else if (select == 2) {
				String fruitName;
				String color;
				int large;
				
				System.out.print("���ϸ�: ");
				fruitName = sc.next();
				System.out.print("����: ");
				color = sc.next();
				System.out.print("ũ��: ");
				large = sc.nextInt();
				
				Orange orange = new Orange(fruitName,color,large);
				fruitList.add(orange);
			} else if (select == 3) {
				String fruitName;
				String color;
				int large;
				
				System.out.print("���ϸ�: ");
				fruitName = sc.next();
				System.out.print("����: ");
				color = sc.next();
				System.out.print("ũ��: ");
				large = sc.nextInt();
				
				Banana banana = new Banana(fruitName,color,large);
				fruitList.add(banana);
			}else if(select == 4) {
				for(Fruit fruits : fruitList) {
					System.out.println(fruits);
				}
			}else if(select == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

		}while(true);

		
	}

}
