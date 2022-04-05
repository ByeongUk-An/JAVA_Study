package Chap17.EX13;

import java.util.Arrays;
import java.util.Scanner;
//완료시간 내일 아침9:30분까지

class Account {
	private String ano; // 계좌번호
	private String owner; // 계좌 주, 이름
	private int balance; // 통장금액

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
	// 일반배열을 사용해서 Account 객체 생성
	private static Account[] accountArray = new Account[100]; // 배열에 객체 저장.
	private static int index;
	private static Scanner scanner = new Scanner(System.in);

	private static void createAccount(Account account) {
		// 코드 작성 : 1. 계좌 생성. 스캐너로 1.계좌번호 2. 이름 3. 초기 통장 금액
		// 배열 객체에 저장.
		System.out.println("---------");
		System.out.println("계좌생성 중입니다.");
		System.out.println("---------");
		accountArray[index++] = account;
		System.out.println(index +"번째 계좌가 생성이 되었습니다.");
		
		
		
	}

	private static void accountList() {
		// 코드 작성 : 2. 배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액을 출력
		System.out.println("---------");
		System.out.println("목록조회");
		System.out.println("---------");

		for (int i = 0; i < index; i++) {
			
			System.out.print(accountArray[i].getAno() + " ");
			System.out.print(accountArray[i].getOwner() + " ");
			System.out.println(accountArray[i].getBalance());
		}
	}

	private static void deposit(String accountNo, int balance) {
		// 코드 작성 : 3. 예금 <== 계좌번호를 받아서 객체에서 해당 계좌를 찾아서, 입금금액을 받아서 해당계좌에 저장.
		System.out.println("------");
		System.out.println("예금이 되었습니다.");
		System.out.println("------");
		Account account = findAccount(accountNo);
		account.setBalance(account.getBalance() + balance);
		System.out.println("현재 잔액은" + account.getBalance()+"원 입니다.");
	}

	private static void withdraw(String accountNo, int balance) {
		// 코드 작성 : 4. 출금 <== 계좌번호를 인풋 받아 해당 계좌를 객체에서 찾아서 출금.
		System.out.println("---------");
		System.out.println("출금 되었습니다.");
		System.out.println("---------");
		Account account = findAccount(accountNo);
		account.setBalance(account.getBalance() - balance);
		System.out.println("현재 잔액은" +account.getBalance()+"원 입니다.");
	}

	// 배열에서 Account 객체 내의 ano[계좌번호] 와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌.
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
			System.out.println("1.계좌생성  | 2.계좌목록  | 3.예금  | 4.출급  | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {

				System.out.println("계좌번호 입력 >>");
				String accountNo = scanner.next();
				System.out.println("계좌명 입력 >>");
				String accountOwner = scanner.next();
				System.out.println("입금액 입력 >>");
				int balance = scanner.nextInt();

				createAccount(new Account(accountNo, accountOwner, balance)); // 메소드 호출
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				System.out.print("계좌번호 입력 >> ");
				String accountNo = scanner.next();
				System.out.print("입금액 입력 >> ");
				int balance = scanner.nextInt();
				deposit(accountNo, balance);

			} else if (selectNo == 4) {
				System.out.print("계좌번호 입력 >> ");
				String accountNo = scanner.next();
				System.out.print("출금액 입력 >> ");
				int balance = scanner.nextInt();
				withdraw(accountNo, balance);
			} else if (selectNo == 5) {
				run = false;
				// break
			}

		}
		scanner.close();
		System.out.println("프로그램 종료");

	}

}
