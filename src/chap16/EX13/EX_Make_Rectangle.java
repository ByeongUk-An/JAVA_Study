package chap16.EX13;

//두 점의 좌표 값을 사용해서 넓이를 구하는 프로그램을 작성 하세요. 제네릭 메소드를 사용.

class Point <T,V> {  //한점의 좌표를 담는 그릇
	T x;  //한점의 x좌표
	V y;  //한점의 y좌표
	
	Point(T x, V y) {	//생성자. Setter 대신 생성자를 통해서 좌표값 할당.
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
		// 코드 작성
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.gety()).doubleValue();
		double bottom = ((Number)p2.gety()).doubleValue();
		
		double width = left-right;
		double height = top-bottom;
		
		return width * height;		//가로 * 세로
	}
}

public class EX_Make_Rectangle {
	public static void main(String[] args) {
		Point <Double,Double> p1 = new Point<Double,Double>(1.0,2.0);
		Point <Double,Double> p2 = new Point<Double,Double>(10.0,50.0);
		
		double rect = GenericMethod.makeRectangle(p1, p2);
		System.out.println("두 점의 넓이는 :" + rect + "입니다.");
	}

}

