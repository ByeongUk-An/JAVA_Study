package Chap17.EX06;

// p.jangwoo@gmail.com , 조장님에게도 전송.  완료시간 : 5:20  
// HashSet으로 변환 
// Member 클래스의  memberid 컬럼을 equals(), hashCode() 재정의해서 동일한 객체로 인식

//중요 : Set은 중복된 값을 저장 할 수 없다. 
	//Wrapper 클래스는 Integer, Long, Double, Float, Charactor, Byte, Short, Boolean 
	//Wrapper 클래스는 equals(), hashCode() 메소드가 재정의 되어 있다. 
	//특정 객체를 생성후 그 객체를 Set 에 저장할 경우 그 객체의 Object 클래스의 equls(), hashCode ()를 재정의 해 줘야한다. 
	//객체의 특정 필드의 값이 같은때 중복을 식별하는 필드를 생성. 


import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member{					// DTO, VO  :  각 계층간에 데이터를 받아서 전달해주는 클래스 
	private int memberid;        //Set에 넣을 식별자, memberid 필드의 값이 같을때 같은 객체이다라고 선언 
								 //equals(), hashCode()
	private String memberName; 
	
	public Member (int memberid, String memberName) {  //생성자 를 통해서 필드의 값할당 
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
		
			return memberName + " 회원님의 아이디는 " + memberid + "입니다. "; 
		}
	@Override			//member1.equals(member2)
	public boolean equals(Object obj) {      //객체의 정보가 Object 로 업캐스팅 
		if (obj instanceof Member) {    //다운캐스딩할때 런타임 오류를 방지 할려면, Object에 Member 객체가 포함 되어 있을때 
			Member member = (Member) obj;   // obj는 Object 로 업캐스팅 되어서 다운 캐스팅 
			if ( this.memberid == member.memberid) {  //this.memberid : member1객체의, member.memberid : member2
				return true; 
			}else {
				return false; 
			}			
		}
		return false;		//obj가 Member 타입을 내포하지 않을때 
	}
	@Override
		public int hashCode() {     //memberid 필드의 값이 동일 할때 동일한 hashCode를 생성. 
			//return memberid;		//this.memberid 
			//return this.memberid;   //하나의 필드만을 조건으로 hashCode() 생성, 
			return Objects.hashCode(memberid);  //권장 사항, 
				//Objects.hashCode(memberid, memberName); 여러개의 필드를 조건으로 hashCode를 생성할 수 있다. 
					// mmemberid, memberName 필드의 값이 모두 동일 할경우 동일한 hashCode(); 			
		}		
}

class MemberHashSet{         // MemberArrayList를 객체화 하면 ArrayList 객체가 생성 된다. 
	private Set<Member> hashSet;    //Set 선언 : <Member> , 필드의 private ( 생성자, setter)
	
			//Set<Member> hashSet = new HashSet<Member>(); 
	
		//List<Member> aList = new ArrayList<Member>() ;		제너릭 타입클래스 객체 생성. 
		//ArrayList<Member> arrayList = new ArrayList<Member>(); 
	
	public MemberHashSet () {		//기본 생성자 호출시 Set의 참조변수 활성화. 
		hashSet = new HashSet<Member>(); 		
	}
	
	public void addMember(Member memeber ) { //Member 객체를 받아서 맨마지막 방에 값을 추가하는 메소드 
		//코드 블락 
		hashSet.add(memeber); 		//Member 객체를 인풋 받아 hashSet에 member 객체를 저장, 중복 저장되면 안된다. 
									//Member 객체의 memberid 필드의 값이 동일할 경우, 동일한 객체이다라고 정의 
									// equals(), hashCode() 메소드 재정의 : memberid
	}

		
	public boolean removeMember (int memberid) {   //memberid는 Member객체 내의 필드이므로 Set에저장된 객체를 가져와야한다. 
		// Set은 index가 존재하지 않으므로 기본 for 문은 사용할 수 없다. 
		// 향상된 for 문을 사용할 수 있고, iterator를 사용할 수있다.  
		// iterator 사용해서  remove
		
		Iterator<Member> ir = hashSet.iterator();    //iterator : 순회자 
		while (ir.hasNext()) {						//hasNext() : hashSet에 값이존재할때 true, false
			Member member = ir.next();			//Next(); 값을 더져주고 다음 값으로 이동. 
			int tempid = member.getMemberid(); 
			
			if (tempid == memberid) {
				hashSet.remove(member); 
				return true; 
			}
		}
			System.out.println("아이디가 존재하지 않습니다. ");
				return false; 
			}


	public void showAllMember() { 
			//iterator
		Iterator<Member> ir = hashSet.iterator();   //지역 변수 
		while (ir.hasNext()) {
			Member member = ir.next();      // hashSet읙 값을 가지고 온다. 
			System.out.println(member);   //hashSet 의 객체를 출력 , toString()재정의 : 필드의 값을 출력. 
		}		
		
	}
	public void showSize() {
		System.out.println(hashSet.size());  //값의 갯수 
	}
		
}

public class EX_MemberHashSet {
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();  

		Member memberLee = new Member(1001, "이지원"); 
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee2 = new Member(1001, "이지원"); 
		Member memberLee3 = new Member(1001, "이지우");
		
		memberHashSet.addMember(memberLee);    //각 객체를 생성해서 ArrayList에 저장 
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee2);	
		memberHashSet.addMember(memberLee2);
		
		memberHashSet.showSize();  //4개출력 
		
		
		//모든 사용자 정보 출력 
		memberHashSet.showAllMember();   //4명 출력
		System.out.println("====================");
		
		//특정 id를 가진 사용자 제거 
		memberHashSet.removeMember(1003); 
		
		memberHashSet.showAllMember();	 //3명 출력
		
	}

}
