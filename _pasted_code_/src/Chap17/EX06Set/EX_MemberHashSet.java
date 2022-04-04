package Chap17.EX06Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// HashSet으로 변환
// Member 클래스의 memberid 컬럼을 equals(), hashCode()

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

	@Override
	public int hashCode() {
		return Objects.hash(memberid);  //this.memberid   , Objects.hsah(memberid)  , memberid  의 3가지 방법
	}

	@Override
	public boolean equals(Object obj) { //객체의 정보가 Object로 업캐스팅
		if (obj instanceof Member) {  //다운캐스팅할때 런타임 오류를 방지 할려면, Object에 Member 객체가 포함 되어 있을때
			Member member = (Member) obj;  //obj는 Object 로 업캐스팅 되어서 다운 캐스팅
			if (this.memberid == member.memberid) { //this.memberid : member1객체 , member.memberid: member2
				return true;
			}
		}
		return false;  //obj가 Member 타입을 내포하지 않을때
	}
}

class MemberHashSet { // MemberArrayList를 객체화 하면 ArrayList 객체가 생성 된다.
	private Set<Member> hashSet;  //Set 선언 : <Member> , 필드의 private (생성자, setter)
	

	public MemberHashSet() { // 기본 생성자 호출시 Set의 참조변수 활성화.
		hashSet = new HashSet<Member>();
	}

	public void addMember(Member member) {// Member 객체를 받아서 맨마지막 방에 값을 추가하는 메소드
		hashSet.add(member); //Member 객체를 인풋 받아 hashSet에 Member 객체를 저장, 중복 저장되면 안된다.
	}

	public boolean removeMember(int memberid) {
		// iterator 사용해서 remove
		Iterator<Member> iterator = hashSet.iterator();

		while (iterator.hasNext()) {
			Member member = iterator.next();
			int getId = member.getMemberid();

			if (memberid == getId) {
				hashSet.remove(member);
				System.out.println("회원님의 " + memberid + "는 삭제 되었습니다.");
				return true;
			}

		}
		return false;

	}

	public void showAllMember() {
		// iterator
		Iterator<Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ,");
		}
		System.out.println("");

	}

	public void showSize() {
		System.out.println(hashSet.size());
	}
}

public class EX_MemberHashSet {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet(); // 객체를 생성하는 순간 arrayList 필드가 활성화
		// 메소드 호출하기 위해서 객체 생성.
		// addMember(),addMember2(),removeMember(), showAllMember()
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손흥민");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee1 = new Member(1001, "이지원");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee1);

		memberHashSet.showSize();

		// 모든 사용자 정보 출력
		memberHashSet.showAllMember();

		// 특정 id를 가진 사용자 제거
		memberHashSet.removeMember(1003);

		memberHashSet.showAllMember();

	}

}
