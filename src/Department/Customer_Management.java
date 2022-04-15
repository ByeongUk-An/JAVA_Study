package Department;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/*
 	백화점의 고객 관리 프로그램. (상속과 다형성)
 	
 	고객 등급 : 1. 일반고객 : 보너스포인트(1%적립) 할인율 없음,
 			 2. Gold 고객 : 보너스포인트(2%적립) 할인율 5%,
 			 3. Vip 고객 : 보너스포인트(5%적립) 할인율(10%) 담당에이전트가 존재
 */

class Customer {	//일반고객
	int customerID;  //고객id
	String customerName;  //고객 이름
	String customerGrade;  //고객등급('Silver, Gold, Vip')
	int bonusPoint;  //보너스 포인트 값 :
	double bonusRatio; //보너스 포인트 적립율 : 'Silver:1%, Gold : 2%, VIP : 5% '
	
	//생성자에서 기본으로 2개의 필드의 값을 로드 : customerGrade,bonusRatio
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	public int calcPrice(int price) {
		//물품의 가격을 받아서 보너스 포인트를 적립하고 적립하는 코드
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
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다";
		
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
	
	double saleRatio;	//물품 할인율 : 생성자에서 기본으로 : 5%
	
	//생성자에서 기본으로 3개의 필드의 값을 로드 : customerGrade : Gold , bonusRatio : 2%, saleRatio : 5%
	
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
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다";
	}
}




class VIPCustomer extends Customer {
	private int agentID; //생성자, setter, 필드(X)
	double saleRatio;  //물품할인율 : 10%
	
	//생성자에서 기본으로 3개의 필드의 값을 로드 : customerGrade : VIP , bonusRatio : 5%, saleRatio : 10%
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
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다. 담당하고 계신 agentID는" + agentID + "입니다.";
	}
	
}

public class Customer_Management {
	public static void main(String[] args) {
		Set<Customer> set = new HashSet<Customer>();
		Scanner sc = new Scanner(System.in);
		int select;
		do {
			System.out.println("===========================================================================================");
			System.out.println("1. 일반고객 등록	|   2. Gold 고객등록      |  3. Vip 고객 등록   4. 정보 출력    5. 물품구매  5. 종료");
			System.out.println("===========================================================================================");
			
			System.out.println("선택 >>");
			select = sc.nextInt();
			
			if(select == 1) {
				int customerID;  
				String customerName;
				System.out.println("선택 >>1");
				System.out.println("일반고객 등록 >>");
				System.out.println("일반회원님의 아이디를 입력해주세요.");
				customerID = sc.nextInt();
				System.out.println("일반회원님의 이름을 입력해주세요.");
				customerName = sc.next();
				
				Customer customer = new Customer(customerID,customerName);
				set.add(customer);
				System.out.println(customerName+"님의 회원가입이 완료되었습니다. 회원님의 등급은 Silver 입니다.");
				
				
			}else if(select == 2) {
				int customerID;  
				String customerName;
				System.out.println("선택 >>2");
				System.out.println("Gold고객 등록 >>");
				System.out.println("Gold회원님의 아이디를 입력해주세요.");
				customerID = sc.nextInt();
				System.out.println("Gold회원님의 이름을 입력해주세요.");
				customerName = sc.next();
				
				GoldCustomer goldCustomer = new GoldCustomer(customerID,customerName);
				set.add(goldCustomer);
				System.out.println(customerName+"님의 회원가입이 완료되었습니다. 회원님의 등급은 Gold 입니다.");
			}else if(select == 3) {
				int customerID;  
				String customerName;
				int agentID;
				System.out.println("선택 >>3");
				System.out.println("Vip고객 등록 >>");
				System.out.println("Vip회원님의 아이디를 입력해주세요.");
				customerID = sc.nextInt();
				System.out.println("Vip회원님의 이름을 입력해주세요.");
				customerName = sc.next();
				System.out.println("담당에이젼트(ID) 등록 해주세요.");
				agentID = sc.nextInt();
				
				VIPCustomer vipCustomer = new VIPCustomer(customerID,customerName,agentID);
				set.add(vipCustomer);
				System.out.println(customerName+"님의 회원가입이 완료되었습니다. 회원님의 등급은 Vip 입니다.");
			}else if(select == 4) {
				System.out.println("선택 >>4");
				System.out.println("==고객 정보 출력  입니다. ==");
				for(Customer cus : set ) {
					System.out.println(cus.showCustomerInfo());
				}
			}else if(select == 5) {
				int customerID;
				int price;
				System.out.println("선택 >>5");
				System.out.println("고객 아이디를 입력해주세요.");
				customerID = sc.nextInt();
				System.out.println("==물품가격을 지불해 주세요 ==");
				price = sc.nextInt();
				Iterator<Customer> iter = set.iterator();
				while(iter.hasNext()) {
					Customer customer = iter.next();
					int tempid = customer.getCustomerID();
					if(tempid == customerID) {
						 
						System.out.println(customer.customerName + "고객님" + price + "원 지불 하셨습니다.");
						System.out.println(customer.customerName + "고객님의 등급은" + customer.customerGrade + "이고, 현재 포인트는" + customer.calcBonus(price) +"이고 할인은 " + customer.calcPrice(price) +"원 되었습니다." );
						
					}
					
				}
				
				
				
				/*
				 * ==물품가격을 지불해 주세요 ==
					고객 아이디 :
					구매 물품 가격 :  

					000 고객님 000 원 지불 하셨습니다. 
					000 고객님의 등급은 000 이고 현재 포인트는 000 이고 할인은 000원 되었습니다. 
					*/
				
			}else if(select == 6) {
				System.out.println("프로그램이 종료 됩니다.");
				break;
			}
			
		}while(true);
		
/*
		
		===========================================================================================
		1. 일반고객 등록	|   2. VIP 고객등록      |  3. Gold 고객 등록   4. 정보 출력    5. 물품구매  6. 종료 
		===========================================================================================
		선택 >> 1
		==일반고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 

		선택 >>2
		==VIP 고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 
		담당에이젼트(ID) 등록 : 

		선택 >>3
		==Gold 고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 

		선택 >>4
		==고객 정보 출력  입니다. ==
		고객ID	고객이름	고객등급	할인률	보너스포인트비율	에이젼트ID<VIP고객>



		선택 >>5
		==물품가격을 지불해 주세요 ==
		고객 아이디 :
		구매 물품 가격 :  

		000 고객님 000 원 지불 하셨습니다. 
		000 고객님의 등급은 000 이고 현재 포인트는 000 이고 할인은 000원 되었습니다. 

		*/
		
	}

}
