package Generic.Ch01.Single;

class HeyClass<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class SingleGenericArgument1 {
	public static void main(String[] args) {
		HeyClass<String> hc1 = new HeyClass<String>();
		hc1.setT("¾È³ç¾È³ç³ª´ÂÁö¼ö¾ß");
		System.out.println(hc1.getT());

		HeyClass<Integer> hc2 = new HeyClass<Integer>();
		hc2.setT(121212);
		System.out.println(hc2.getT());

	}

}
