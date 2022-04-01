package Chap17.EX06Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// HashSet���� ��ȯ
// Member Ŭ������ memberid �÷��� equals(), hashCode()

class Member { // DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid;
	private String memberName;

	public Member(int memberid, String meberName) { // �����ڸ� ���ؼ� �ʵ��� ���Ҵ�
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
		return memberName + "ȸ������ ���̵�� " + memberid + "�Դϴ�.";
	}

	@Override
	public int hashCode() {
		return Objects.hash(memberid);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (this.memberid == member.memberid) {
				return true;
			}
		}
		return false;
	}
}

class MemberHashSet { // MemberArrayList�� ��üȭ �ϸ� ArrayList ��ü�� ���� �ȴ�.
	private Set<Member> hashSet;
	

	public MemberHashSet() { // �⺻ ������
		hashSet = new HashSet<Member>();
	}

	public void addMember(Member member) {// Member ��ü�� �޾Ƽ� �Ǹ����� �濡 ���� �߰��ϴ� �޼ҵ�
		hashSet.add(member); //
	}

	public boolean removeMember(int memberid) {
		// iterator ����ؼ� remove
		Iterator<Member> iterator = hashSet.iterator();

		while (iterator.hasNext()) {
			Member member = iterator.next();
			int getId = member.getMemberid();

			if (memberid == getId) {
				hashSet.remove(member);
				System.out.println("ȸ������ " + memberid + "�� ���� �Ǿ����ϴ�.");
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
		MemberHashSet memberHashSet = new MemberHashSet(); // ��ü�� �����ϴ� ���� arrayList �ʵ尡 Ȱ��ȭ
		// �޼ҵ� ȣ���ϱ� ���ؼ� ��ü ����.
		// addMember(),addMember2(),removeMember(), showAllMember()
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�����");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee1 = new Member(1001, "������");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee1);

		memberHashSet.showSize();

		// ��� ����� ���� ���
		memberHashSet.showAllMember();

		// Ư�� id�� ���� ����� ����
		memberHashSet.removeMember(1003);

		memberHashSet.showAllMember();

	}

}
