package Generic.Ch01.Single;

class MyClass<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

public class SingleGenericArgument {
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();
		mc1.setT("¾È³ç");
		System.out.println(mc1.getT());
	}

}
