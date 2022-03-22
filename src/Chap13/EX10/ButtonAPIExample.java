package Chap13.EX10;



class Button {
	//OnClickListener : ��ü Ÿ��, ocl : ���� ����
	OnClickListener ocl;	// ocl �⺻ ������ null�� ���ִ�.
	
	//setter�� ���ؼ� OnClickListener �� ���� ���� ocl�� ��ü �ּҸ� ��´�.
	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}
	// �������̽��� �����ϰ� ������ �ڽ� Ŭ������ ���������ʴ´�.
	// ȣ���ϴ� ������ onClick()�޼ҵ带 ������ �ؼ� ȣ��
	interface OnClickListener {	//InnerInterface , static , Button.OnClickListener : �������̽� ����
		void onClick();  //�޼ҵ� ���𸸵�. �������� �������̵� �ؼ� ������
	}
	
	void click() {	// ���������� ocl.onCLick()�� ȣ��
		//ocl.onClick();	//ocl : �������� : null ===> setOnClickListener(OnClickListener ocl)
		System.out.println(ocl);
	}
}

public class ButtonAPIExample {

	public static void main(String[] args) {
		// ������ 1 : Ŭ���� �������
		Button btn = new Button();  //btn ��ü ����,
		
		// A.B = new A.B(){�̳��������̽�B�� �޼ҵ带 ������ �ڵ�};
		/*
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������1. ���� ���");
				
			}
		}); //OnClickListener ��üŸ������ ��ü ���� �Ű������� ����
		*/
		btn.click();
		// ������ 2 : Ŭ���� ���̹� ����
		Button btn1 = new Button();
		
		//setOnClickListener �޼ҵ忡 �Ű������� OnClickListener �� ���� �͸�ü�� ������ OnClickListener
		btn1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("������2. ���̹� ����");
			}
		});
		
		btn1.click();
		
		
	}

}
