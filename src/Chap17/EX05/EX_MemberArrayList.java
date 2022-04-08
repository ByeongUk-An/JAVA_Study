package Chap17.EX05;

// p.jangwoo@gmail.com 

import java.util.ArrayList;

class Member{					// DTO, VO  :  각 계층간에 데이터를 받아서 전달해주는 클래스 
	private int memberid; 
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
}

class MemberArrayList{         // MemberArrayList를 객체화 하면 ArrayList 객체가 생성 된다. 
	private ArrayList<Member> arrayList;
	
		//List<Member> aList = new ArrayList<Member>() ;		제너릭 타입클래스 객체 생성. 
		//ArrayList<Member> arrayList = new ArrayList<Member>(); 
	
	public MemberArrayList () {		//기본 생성자 
		arrayList = new ArrayList<Member>(); 		
	}
	
	public void addMember(Member memeber ) { //Member 객체를 받아서 맨마지막 방에 값을 추가하는 메소드 
		//코드 블락 
		arrayList.add(memeber); 		// 
	}
	public void addMember2(int a, Member member) {     // 매개 변수 2개를 받아서  //특정 index 방번호에 값을 추가(삽입). 
		//코드 블락 
		
		try {
			arrayList.add(a, member);
		}catch (IndexOutOfBoundsException e) {
			System.out.println(" 예외가 발생되었습니다. 방번호를 정확하게 입력 하세요. ");
		}
		
		
	}
	public boolean removeMember (int memberid) {
				// Array List에 저장된 memberid를 검색해서 해당 객체를 삭제하는 메소드 
		
		for (int i = 0 ; i < arrayList.size() ;  i++) {
			Member member = arrayList.get(i);    //각 방에 저장된 Member 객체를 member 참조변수에 할당.
			int tempid = member.getMemberid();    //객체의 getMemberid() , 객체 내부의 memberid 
			
			if(tempid == memberid) {
				arrayList.remove(i);    // arrayList 방의 저장된 객체를 제거 
				System.out.println("회원님의 " + memberid + "는 삭제 되었습니다. ");
				return true; 
			}
		}
		System.out.println(memberid + " 가 존재 하지 않습니다. ");
		return false;

	}
	public void showAllMember() { 
			//ArrayList에 저장된 모들 사용자 정보를 출력 하는 메소드 
		for (int i = 0 ; i < arrayList.size() ; i++) {
			System.out.println(arrayList.get(i));     //각방의 Member 객체 자체를 출력 
		}
		
	}
	public void showSize() {
		System.out.println(arrayList.size());
	}
		
}



public class EX_MemberArrayList {
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();  
		    //객체를 생성하는 순간  arrayList 필드가 활성화 
			//메소드 호출하기 위해서 객체 생성. 
			// addMember(), addMember2(), removeMember(), showAllMember() 
		
		
		Member memberLee = new Member(1001, "이지원"); 
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);    //각 객체를 생성해서 ArrayList에 저장 
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showSize();
		
		//특정 index방에 추가적 사용자  사용자 추가 
		memberArrayList.addMember2(5, memberHong);    //예외 처리 
		
		memberArrayList.showSize();
		
		//모든 사용자 정보 출력 
		memberArrayList.showAllMember();
		
		//특정 id를 가진 사용자 제거 
		memberArrayList.removeMember(1003); 
		
		
		
	}

}
