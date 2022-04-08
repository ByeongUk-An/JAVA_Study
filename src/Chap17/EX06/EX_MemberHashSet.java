package Chap17.EX06;

// p.jangwoo@gmail.com , ����Կ��Ե� ����.  �Ϸ�ð� : 5:20  
// HashSet���� ��ȯ 
// Member Ŭ������  memberid �÷��� equals(), hashCode() �������ؼ� ������ ��ü�� �ν�

//�߿� : Set�� �ߺ��� ���� ���� �� �� ����. 
	//Wrapper Ŭ������ Integer, Long, Double, Float, Charactor, Byte, Short, Boolean 
	//Wrapper Ŭ������ equals(), hashCode() �޼ҵ尡 ������ �Ǿ� �ִ�. 
	//Ư�� ��ü�� ������ �� ��ü�� Set �� ������ ��� �� ��ü�� Object Ŭ������ equls(), hashCode ()�� ������ �� ����Ѵ�. 
	//��ü�� Ư�� �ʵ��� ���� ������ �ߺ��� �ĺ��ϴ� �ʵ带 ����. 


import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member{					// DTO, VO  :  �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ���� 
	private int memberid;        //Set�� ���� �ĺ���, memberid �ʵ��� ���� ������ ���� ��ü�̴ٶ�� ���� 
								 //equals(), hashCode()
	private String memberName; 
	
	public Member (int memberid, String memberName) {  //������ �� ���ؼ� �ʵ��� ���Ҵ� 
		this.memberid = memberid; 
		this.memberName = memberName; 
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}	
	
	@Override
		public String toString() {
		
			return memberName + " ȸ������ ���̵�� " + memberid + "�Դϴ�. "; 
		}
	@Override			//member1.equals(member2)
	public boolean equals(Object obj) {      //��ü�� ������ Object �� ��ĳ���� 
		if (obj instanceof Member) {    //�ٿ�ĳ�����Ҷ� ��Ÿ�� ������ ���� �ҷ���, Object�� Member ��ü�� ���� �Ǿ� ������ 
			Member member = (Member) obj;   // obj�� Object �� ��ĳ���� �Ǿ �ٿ� ĳ���� 
			if ( this.memberid == member.memberid) {  //this.memberid : member1��ü��, member.memberid : member2
				return true; 
			}else {
				return false; 
			}			
		}
		return false;		//obj�� Member Ÿ���� �������� ������ 
	}
	@Override
		public int hashCode() {     //memberid �ʵ��� ���� ���� �Ҷ� ������ hashCode�� ����. 
			//return memberid;		//this.memberid 
			//return this.memberid;   //�ϳ��� �ʵ常�� �������� hashCode() ����, 
			return Objects.hashCode(memberid);  //���� ����, 
				//Objects.hashCode(memberid, memberName); �������� �ʵ带 �������� hashCode�� ������ �� �ִ�. 
					// mmemberid, memberName �ʵ��� ���� ��� ���� �Ұ�� ������ hashCode(); 			
		}		
}

class MemberHashSet{         // MemberArrayList�� ��üȭ �ϸ� ArrayList ��ü�� ���� �ȴ�. 
	private Set<Member> hashSet;    //Set ���� : <Member> , �ʵ��� private ( ������, setter)
	
			//Set<Member> hashSet = new HashSet<Member>(); 
	
		//List<Member> aList = new ArrayList<Member>() ;		���ʸ� Ÿ��Ŭ���� ��ü ����. 
		//ArrayList<Member> arrayList = new ArrayList<Member>(); 
	
	public MemberHashSet () {		//�⺻ ������ ȣ��� Set�� �������� Ȱ��ȭ. 
		hashSet = new HashSet<Member>(); 		
	}
	
	public void addMember(Member memeber ) { //Member ��ü�� �޾Ƽ� �Ǹ����� �濡 ���� �߰��ϴ� �޼ҵ� 
		//�ڵ� ��� 
		hashSet.add(memeber); 		//Member ��ü�� ��ǲ �޾� hashSet�� member ��ü�� ����, �ߺ� ����Ǹ� �ȵȴ�. 
									//Member ��ü�� memberid �ʵ��� ���� ������ ���, ������ ��ü�̴ٶ�� ���� 
									// equals(), hashCode() �޼ҵ� ������ : memberid
	}

		
	public boolean removeMember (int memberid) {   //memberid�� Member��ü ���� �ʵ��̹Ƿ� Set������� ��ü�� �����;��Ѵ�. 
		// Set�� index�� �������� �����Ƿ� �⺻ for ���� ����� �� ����. 
		// ���� for ���� ����� �� �ְ�, iterator�� ����� ���ִ�.  
		// iterator ����ؼ�  remove
		
		Iterator<Member> ir = hashSet.iterator();    //iterator : ��ȸ�� 
		while (ir.hasNext()) {						//hasNext() : hashSet�� ���������Ҷ� true, false
			Member member = ir.next();			//Next(); ���� �����ְ� ���� ������ �̵�. 
			int tempid = member.getMemberid(); 
			
			if (tempid == memberid) {
				hashSet.remove(member); 
				return true; 
			}
		}
			System.out.println("���̵� �������� �ʽ��ϴ�. ");
				return false; 
			}


	public void showAllMember() { 
			//iterator
		Iterator<Member> ir = hashSet.iterator();   //���� ���� 
		while (ir.hasNext()) {
			Member member = ir.next();      // hashSet�� ���� ������ �´�. 
			System.out.println(member);   //hashSet �� ��ü�� ��� , toString()������ : �ʵ��� ���� ���. 
		}		
		
	}
	public void showSize() {
		System.out.println(hashSet.size());  //���� ���� 
	}
		
}

public class EX_MemberHashSet {
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();  

		Member memberLee = new Member(1001, "������"); 
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee2 = new Member(1001, "������"); 
		Member memberLee3 = new Member(1001, "������");
		
		memberHashSet.addMember(memberLee);    //�� ��ü�� �����ؼ� ArrayList�� ���� 
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee2);	
		memberHashSet.addMember(memberLee2);
		
		memberHashSet.showSize();  //4����� 
		
		
		//��� ����� ���� ��� 
		memberHashSet.showAllMember();   //4�� ���
		System.out.println("====================");
		
		//Ư�� id�� ���� ����� ���� 
		memberHashSet.removeMember(1003); 
		
		memberHashSet.showAllMember();	 //3�� ���
		
	}

}
