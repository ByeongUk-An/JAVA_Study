package Chap17.EX05;

import java.util.ArrayList;

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
}

class MemberArrayList { // MemberArrayList�� ��üȭ �ϸ� ArrayList ��ü�� ���� �ȴ�.
	private ArrayList<Member> arrayList;

	public MemberArrayList() { // �⺻ ������
		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member member) {// Member ��ü�� �޾Ƽ� �Ǹ����� �濡 ���� �߰��ϴ� �޼ҵ�
		arrayList.add(member);  // 
	}

	public void addMember2(int a, Member member) { // �Ű����� 2���� �޾Ƽ� Ư�� index ���ȣ�� ���� �߰�(����).
		try {
			arrayList.add(a, member);
		}catch(IndexOutOfBoundsException e) {
			
		}
	}

	public boolean removeMember(int memberid) {
		// Array List�� ����� memberid�� �˻��ؼ� �ش� ��ü�� �����ϴ� �޼ҵ�
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);  //�� �濡�� Member ��ü�� member ���������� �Ҵ�.
			int getId = member.getMemberid();  //��ü�� getMemberid() , ��ü���ο� �ִ� memberid�� �����´�.
			if (getId == memberid) {
				arrayList.remove(i);
				System.out.println("ȸ������ " + memberid + "�� ���� �Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println(memberid + "�� �������� �ʽ��ϴ�.");
		return false;

	}

	public void showAllMember() {
		// ArrayList�� ����� ��� ����� ������ ��� �ϴ� �޼ҵ�
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
		MemberArrayList memberArrayList = new MemberArrayList();  //��ü�� �����ϴ� ���� arrayList �ʵ尡 Ȱ��ȭ
			//�޼ҵ� ȣ���ϱ� ���ؼ� ��ü ����.
			// addMember(),addMember2(),removeMember(), showAllMember()
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�����");
		Member memberPark = new Member(1003,"�ڼ���");
		Member memberHong = new Member(1004,"ȫ�浿");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		
		
		//Ư�� index�濡 �߰��� ����� ����� �߰�
		memberArrayList.addMember2(3, memberHong);
		
		memberArrayList.showSize();
		
		//��� ����� ���� ���
		memberArrayList.showAllMember();
		
		//Ư�� id�� ���� ����� ����
		memberArrayList.removeMember(1003);
		//Ư�� id�� ���� ����� ������ ���� ���
		memberArrayList.showAllMember();
		
	}

}
