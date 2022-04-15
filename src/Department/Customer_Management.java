package Department;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/*
 	��ȭ���� �� ���� ���α׷�. (��Ӱ� ������)
 	
 	�� ��� : 1. �Ϲݰ� : ���ʽ�����Ʈ(1%����) ������ ����,
 			 2. Gold �� : ���ʽ�����Ʈ(2%����) ������ 5%,
 			 3. Vip �� : ���ʽ�����Ʈ(5%����) ������(10%) ��翡����Ʈ�� ����
 */

class Customer {	//�Ϲݰ�
	int customerID;  //��id
	String customerName;  //�� �̸�
	String customerGrade;  //�����('Silver, Gold, Vip')
	int bonusPoint;  //���ʽ� ����Ʈ �� :
	double bonusRatio; //���ʽ� ����Ʈ ������ : 'Silver:1%, Gold : 2%, VIP : 5% '
	
	//�����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε� : customerGrade,bonusRatio
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	public int calcPrice(int price) {
		//��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϰ� �����ϴ� �ڵ�
		bonusPoint += price * bonusRatio;
		return 0;
	}
	
	public int calcBonus(int price) {
		bonusPoint += price * bonusRatio;
		return bonusPoint;
	}
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�";
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			Customer customer = (Customer) obj;
			if(this.customerID == customer.customerID) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(customerID);
	}
}

class GoldCustomer extends Customer {  
	
	double saleRatio;	//��ǰ ������ : �����ڿ��� �⺻���� : 5%
	
	//�����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε� : customerGrade : Gold , bonusRatio : 2%, saleRatio : 5%
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.05;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int)(price * saleRatio);
	}
	@Override
	public int calcBonus(int price) {
		bonusPoint += price * bonusRatio;
		return bonusPoint;
	}
	
	@Override
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�";
	}
}




class VIPCustomer extends Customer {
	private int agentID; //������, setter, �ʵ�(X)
	double saleRatio;  //��ǰ������ : 10%
	
	//�����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε� : customerGrade : VIP , bonusRatio : 5%, saleRatio : 10%
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int)(price * saleRatio);
	}
	@Override
	public int calcBonus(int price) {
		bonusPoint += price * bonusRatio;
		return bonusPoint;
	}

	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�. ����ϰ� ��� agentID��" + agentID + "�Դϴ�.";
	}
	
}

public class Customer_Management {
	public static void main(String[] args) {
		Set<Customer> set = new HashSet<Customer>();
		Scanner sc = new Scanner(System.in);
		int select;
		do {
			System.out.println("===========================================================================================");
			System.out.println("1. �Ϲݰ� ���	|   2. Gold �����      |  3. Vip �� ���   4. ���� ���    5. ��ǰ����  5. ����");
			System.out.println("===========================================================================================");
			
			System.out.println("���� >>");
			select = sc.nextInt();
			
			if(select == 1) {
				int customerID;  
				String customerName;
				System.out.println("���� >>1");
				System.out.println("�Ϲݰ� ��� >>");
				System.out.println("�Ϲ�ȸ������ ���̵� �Է����ּ���.");
				customerID = sc.nextInt();
				System.out.println("�Ϲ�ȸ������ �̸��� �Է����ּ���.");
				customerName = sc.next();
				
				Customer customer = new Customer(customerID,customerName);
				set.add(customer);
				System.out.println(customerName+"���� ȸ�������� �Ϸ�Ǿ����ϴ�. ȸ������ ����� Silver �Դϴ�.");
				
				
			}else if(select == 2) {
				int customerID;  
				String customerName;
				System.out.println("���� >>2");
				System.out.println("Gold�� ��� >>");
				System.out.println("Goldȸ������ ���̵� �Է����ּ���.");
				customerID = sc.nextInt();
				System.out.println("Goldȸ������ �̸��� �Է����ּ���.");
				customerName = sc.next();
				
				GoldCustomer goldCustomer = new GoldCustomer(customerID,customerName);
				set.add(goldCustomer);
				System.out.println(customerName+"���� ȸ�������� �Ϸ�Ǿ����ϴ�. ȸ������ ����� Gold �Դϴ�.");
			}else if(select == 3) {
				int customerID;  
				String customerName;
				int agentID;
				System.out.println("���� >>3");
				System.out.println("Vip�� ��� >>");
				System.out.println("Vipȸ������ ���̵� �Է����ּ���.");
				customerID = sc.nextInt();
				System.out.println("Vipȸ������ �̸��� �Է����ּ���.");
				customerName = sc.next();
				System.out.println("��翡����Ʈ(ID) ��� ���ּ���.");
				agentID = sc.nextInt();
				
				VIPCustomer vipCustomer = new VIPCustomer(customerID,customerName,agentID);
				set.add(vipCustomer);
				System.out.println(customerName+"���� ȸ�������� �Ϸ�Ǿ����ϴ�. ȸ������ ����� Vip �Դϴ�.");
			}else if(select == 4) {
				System.out.println("���� >>4");
				System.out.println("==�� ���� ���  �Դϴ�. ==");
				for(Customer cus : set ) {
					System.out.println(cus.showCustomerInfo());
				}
			}else if(select == 5) {
				int customerID;
				int price;
				System.out.println("���� >>5");
				System.out.println("�� ���̵� �Է����ּ���.");
				customerID = sc.nextInt();
				System.out.println("==��ǰ������ ������ �ּ��� ==");
				price = sc.nextInt();
				Iterator<Customer> iter = set.iterator();
				while(iter.hasNext()) {
					Customer customer = iter.next();
					int tempid = customer.getCustomerID();
					if(tempid == customerID) {
						 
						System.out.println(customer.customerName + "����" + price + "�� ���� �ϼ̽��ϴ�.");
						System.out.println(customer.customerName + "������ �����" + customer.customerGrade + "�̰�, ���� ����Ʈ��" + customer.calcBonus(price) +"�̰� ������ " + customer.calcPrice(price) +"�� �Ǿ����ϴ�." );
						
					}
					
				}
				
				
				
				/*
				 * ==��ǰ������ ������ �ּ��� ==
					�� ���̵� :
					���� ��ǰ ���� :  

					000 ���� 000 �� ���� �ϼ̽��ϴ�. 
					000 ������ ����� 000 �̰� ���� ����Ʈ�� 000 �̰� ������ 000�� �Ǿ����ϴ�. 
					*/
				
			}else if(select == 6) {
				System.out.println("���α׷��� ���� �˴ϴ�.");
				break;
			}
			
		}while(true);
		
/*
		
		===========================================================================================
		1. �Ϲݰ� ���	|   2. VIP �����      |  3. Gold �� ���   4. ���� ���    5. ��ǰ����  6. ���� 
		===========================================================================================
		���� >> 1
		==�Ϲݰ� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 

		���� >>2
		==VIP �� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 
		��翡����Ʈ(ID) ��� : 

		���� >>3
		==Gold �� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 

		���� >>4
		==�� ���� ���  �Դϴ�. ==
		��ID	���̸�	�����	���η�	���ʽ�����Ʈ����	������ƮID<VIP��>



		���� >>5
		==��ǰ������ ������ �ּ��� ==
		�� ���̵� :
		���� ��ǰ ���� :  

		000 ���� 000 �� ���� �ϼ̽��ϴ�. 
		000 ������ ����� 000 �̰� ���� ����Ʈ�� 000 �̰� ������ 000�� �Ǿ����ϴ�. 

		*/
		
	}

}
