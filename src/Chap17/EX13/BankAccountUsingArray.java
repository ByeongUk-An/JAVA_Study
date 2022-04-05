package Chap17.EX13;

import java.util.Arrays;
import java.util.Scanner;
//�Ϸ�ð� ���� ��ħ9:30�б���

class Account {
	private String ano; // ���¹�ȣ
	private String owner; // ���� ��, �̸�
	private int balance; // ����ݾ�

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
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

//	public static Account findAccount(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}

public class BankAccountUsingArray {
	// �Ϲݹ迭�� ����ؼ� Account ��ü ����
	private static Account[] accountArray = new Account[100]; // �迭�� ��ü ����.
	private static int index;
	private static Scanner scanner = new Scanner(System.in);

	private static void createAccount(Account account) {
		// �ڵ� �ۼ� : 1. ���� ����. ��ĳ�ʷ� 1.���¹�ȣ 2. �̸� 3. �ʱ� ���� �ݾ�
		// �迭 ��ü�� ����.
		System.out.println("---------");
		System.out.println("���»��� ���Դϴ�.");
		System.out.println("---------");
		accountArray[index++] = account;
		System.out.println(index +"��° ���°� ������ �Ǿ����ϴ�.");
		
		
		
	}

	private static void accountList() {
		// �ڵ� �ۼ� : 2. �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
		System.out.println("---------");
		System.out.println("�����ȸ");
		System.out.println("---------");

		for (int i = 0; i < index; i++) {
			
			System.out.print(accountArray[i].getAno() + " ");
			System.out.print(accountArray[i].getOwner() + " ");
			System.out.println(accountArray[i].getBalance());
		}
	}

	private static void deposit(String accountNo, int balance) {
		// �ڵ� �ۼ� : 3. ���� <== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݱݾ��� �޾Ƽ� �ش���¿� ����.
		System.out.println("------");
		System.out.println("������ �Ǿ����ϴ�.");
		System.out.println("------");
		Account account = findAccount(accountNo);
		account.setBalance(account.getBalance() + balance);
		System.out.println("���� �ܾ���" + account.getBalance()+"�� �Դϴ�.");
	}

	private static void withdraw(String accountNo, int balance) {
		// �ڵ� �ۼ� : 4. ��� <== ���¹�ȣ�� ��ǲ �޾� �ش� ���¸� ��ü���� ã�Ƽ� ���.
		System.out.println("---------");
		System.out.println("��� �Ǿ����ϴ�.");
		System.out.println("---------");
		Account account = findAccount(accountNo);
		account.setBalance(account.getBalance() - balance);
		System.out.println("���� �ܾ���" +account.getBalance()+"�� �Դϴ�.");
	}

	// �迭���� Account ��ü ���� ano[���¹�ȣ] �� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < index; i++) {
			if (ano.equals(accountArray[i].getAno())) {
				account = accountArray[i];
			}
		}
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
				System.out.print("���¹�ȣ �Է� >> ");
				String accountNo = scanner.next();
				System.out.print("�Աݾ� �Է� >> ");
				int balance = scanner.nextInt();
				deposit(accountNo, balance);

			} else if (selectNo == 4) {
				System.out.print("���¹�ȣ �Է� >> ");
				String accountNo = scanner.next();
				System.out.print("��ݾ� �Է� >> ");
				int balance = scanner.nextInt();
				withdraw(accountNo, balance);
			} else if (selectNo == 5) {
				run = false;
				// break
			}

		}
		scanner.close();
		System.out.println("���α׷� ����");

	}

}
