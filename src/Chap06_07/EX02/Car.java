package Chap06_07.EX02;

public class Car {

	String company;
	String model;
	String color;
	int maxSpead;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {  // RAM(메모리)의 값을 부여할때 setter
		this.company = company;  //this 는 객체 자신을 뜻한다.
	}							 //메소드에 인풋되는 변수명, 인풋되는 변수를 받는 변수명
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpead() {
		return maxSpead;
	}
	public void setMaxSpead(int maxSpead) {
		this.maxSpead = maxSpead;
	}

}
