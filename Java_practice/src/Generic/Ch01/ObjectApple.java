package Generic.Ch01;

class Apple {
}

class Banana {
}

class Goods {
	private Object object;
	public Object get() {
		return object;
	}
	public void set(Object object) {
		this.object = object;
	}
}

public class ObjectApple {
	public static void main(String[] args) {
		Goods goods1 = new Goods();
		goods1.set(new Apple());
		Apple apple = (Apple)goods1.get();
		
		Goods goods2 = new Goods();
		goods2.set(new Banana());
		Banana banana =(Banana)goods2.get();
	}

}
