package Chap17.EX13;

import java.util.Scanner;
//�Ϸ�ð� ���� ��ħ9:30�б���

class Account {
	private String ano; // ���¹�ȣ
	private String owner; // ���� ��, �̸�
	private int balance; // ����ݾ�

	public Account(String ano2, String owner2, int balance2) {
		// TODO Auto-generated constructor stub
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

public class BankAccountUsingArray {
	// �Ϲݹ迭�� ����ؼ� Account ��ü ����
	private static Account[] accountArray = new Account[100]; // �迭�� ��ü ����.
	private static int index = 1;
	private static Scanner scanner = new Scanner(System.in);

	private static void createAccount(Account account) {
		// �ڵ� �ۼ� : 1. ���� ����. ��ĳ�ʷ� 1.���¹�ȣ 2. �̸� 3. �ʱ� ���� �ݾ�
		// �迭 ��ü�� ����.
		System.out.println("---------");
		System.out.println("���»��� ���Դϴ�.");
		System.out.println("---------");
		accountArray[index++] = account;
	}

	private static void accountList() {
		// �ڵ� �ۼ� : 2. �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
		System.out.println("------");
		System.out.println("�����ȸ");
		System.out.println("------");
		for(int i = 0; i<index; i++) {
			
		}
	}

	private static void deposit() {
		// �ڵ� �ۼ� : 3. ���� <== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݱݾ��� �޾Ƽ� �ش���¿� ����.
	}

	private static void withdraw() {
		// �ڵ� �ۼ� : 4. ��� <== ���¹�ȣ�� ��ǲ �޾� �ش� ���¸� ��ü���� ã�Ƽ� ���.
	}

	// �迭���� Account ��ü ���� ano[���¹�ȣ] �� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
	private static Account findAccount(String ano) {
		Account account = null;

		return account;
	}

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.���»���  | 2.���¸��  | 3.����  | 4.���  | 5.����");
			System.out.println("--------------------------------------------------");
			System.out.println("����>");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {

				System.out.println("���¹�ȣ �Է� >>");
				String accountNo = scanner.next();
				System.out.println("���¸� �Է� >>");
				String accountOwner = scanner.next();
				System.out.println("�Աݾ� �Է� >>");
				int balance = scanner.nextInt();

				createAccount(new Account(accountNo, accountOwner, balance)); // �޼ҵ� ȣ��
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
				// break
			}

		}
		scanner.close();
		System.out.println("���α׷� ����");

	}

}
