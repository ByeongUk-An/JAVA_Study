package chap16.EX13;

//�� ���� ��ǥ ���� ����ؼ� ���̸� ���ϴ� ���α׷��� �ۼ� �ϼ���. ���׸� �޼ҵ带 ���.

class Point <T,V> {  //������ ��ǥ�� ��� �׸�
	T x;  //������ x��ǥ
	V y;  //������ y��ǥ
	
	Point(T x, V y) {	//������. Setter ��� �����ڸ� ���ؼ� ��ǥ�� �Ҵ�.
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public V gety() {
		return y;
	}
}
class GenericMethod {
	public static <T,V> double makeRectangle (Point <T,V> p1, Point<T,V> p2) {
		// �ڵ� �ۼ�
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.gety()).doubleValue();
		double bottom = ((Number)p2.gety()).doubleValue();
		
		double width = left-right;
		double height = top-bottom;
		
		return width * height;		//���� * ����
	}
}

public class EX_Make_Rectangle {
	public static void main(String[] args) {
		Point <Double,Double> p1 = new Point<Double,Double>(1.0,2.0);
		Point <Double,Double> p2 = new Point<Double,Double>(10.0,50.0);
		
		double rect = GenericMethod.makeRectangle(p1, p2);
		System.out.println("�� ���� ���̴� :" + rect + "�Դϴ�.");
	}

}

