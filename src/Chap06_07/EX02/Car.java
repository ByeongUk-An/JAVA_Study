package Chap06_07.EX02;

public class Car {

	String company;
	String model;
	String color;
	int maxSpead;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {  // RAM(�޸�)�� ���� �ο��Ҷ� setter
		this.company = company;  //this �� ��ü �ڽ��� ���Ѵ�.
	}							 //�޼ҵ忡 ��ǲ�Ǵ� ������, ��ǲ�Ǵ� ������ �޴� ������
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
