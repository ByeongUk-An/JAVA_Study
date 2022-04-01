package Chap17.EX05;

import java.util.ArrayList;

class Member { // DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberid;
	private String memberName;

	public Member(int memberid, String meberName) { // 생성자를 통해서 필드의 값할당
		this.memberid = memberid;
		this.memberName = meberName;
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
		return memberName + "회원님의 아이디는 " + memberid + "입니다.";
	}
}

class MemberArrayList { // MemberArrayList를 객체화 하면 ArrayList 객체가 생성 된다.
	private ArrayList<Member> arrayList;

	public MemberArrayList() { // 기본 생성자
		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member member) {// Member 객체를 받아서 맨마지막 방에 값을 추가하는 메소드
		arrayList.add(member);  // 
	}

	public void addMember2(int a, Member member) { // 매개변수 2개를 받아서 특정 index 방번호에 값을 추가(삽입).
		try {
			arrayList.add(a, member);
		}catch(IndexOutOfBoundsException e) {
			
		}
	}

	public boolean removeMember(int memberid) {
		// Array List에 저장된 memberid를 검색해서 해당 객체를 삭제하는 메소드
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);  //각 방에는 Member 객체를 member 참조변수에 할당.
			int getId = member.getMemberid();  //객체의 getMemberid() , 객체내부에 있는 memberid를 가져온다.
			if (getId == memberid) {
				arrayList.remove(i);
				System.out.println("회원님의 " + memberid + "는 삭제 되었습니다.");
				return true;
			}
		}
		System.out.println(memberid + "가 존재하지 않습니다.");
		return false;

	}

	public void showAllMember() {
		// ArrayList에 저장된 모든 사용자 정보를 출력 하는 메소드
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void showSize() {
		System.out.println(arrayList.size());
	}
}



public class EX_MemberArrayList {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();  //객체를 생성하는 순간 arrayList 필드가 활성화
			//메소드 호출하기 위해서 객체 생성.
			// addMember(),addMember2(),removeMember(), showAllMember()
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손흥민");
		Member memberPark = new Member(1003,"박서원");
		Member memberHong = new Member(1004,"홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		
		
		//특정 index방에 추가적 사용자 사용자 추가
		memberArrayList.addMember2(3, memberHong);
		
		memberArrayList.showSize();
		
		//모든 사용자 정보 출력
		memberArrayList.showAllMember();
		
		//특정 id를 가진 사용자 제거
		memberArrayList.removeMember(1003);
		//특정 id를 가진 사용자 제거후 정보 출력
		memberArrayList.showAllMember();
		
	}

}
