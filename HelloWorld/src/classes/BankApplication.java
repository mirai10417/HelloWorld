package classes;
import java.util.Scanner;

// ★ 계좌값이 계속 저장될려면 어떻게 해야하는가? 
public class BankApplication {
	private static Account[] accountArray = new Account[100];
	int baseMoney=0;
	static Account ac = new Account();
	private static Scanner sc = new Scanner(System.in);
	
			
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");			
			int selectNo = sc.nextInt();
			sc.nextLine();
						
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();				
			}else if(selectNo == 5) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
	}
	//계좌생성하기
	private static void createAccount() {
		//작성위치		
		Account ac = new Account();		
		System.out.print("계좌번호: ");
		String ano = sc.nextLine();
//		sc.nextLine();
		ac.setAno(ano);
		System.out.print("계좌주: ");
		String owner = sc.nextLine();
		ac.setOwner(owner);
		System.out.print("초기입금액: ");
		int balance = sc.nextInt();
		ac.setBalance(balance);
		System.out.println("결과: 계좌가 생성되었습니다.");		
		
		
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = ac;
				break;
			}
		}		
	}
	//계좌목록보기
	private static void accountList() {
		for (Account ac : accountArray) {
			if (ac != null) {
				System.out.print("계좌번호: ");
				System.out.print(ac.getAno());
				System.out.print("  계좌주: ");
				System.out.print(ac.getOwner());
				System.out.print("  계좌주: ");
				System.out.print(ac.getBalance());
				System.out.println();						
			}
		}		
	}
	private static char[] Account(String ano, String owner, int balance) {
		// TODO Auto-generated method stub
		return null;
	}
	//예금하기
	private static void deposit() {
		//작성위치		
		int deposit=0;
		System.out.println("----------");
		System.out.println("   예 금       ");
		System.out.println("----------");
		System.out.print("계좌번호: ");		
		String ano = sc.next();
		System.out.print("예금액: ");
		int balance = sc.nextInt();
			for (Account ac : accountArray)
			{
				if(ac != null)
				if(ano.equals(ac.getAno()))
				{
					System.out.print("현재 잔액입니다.  ");
					System.out.println(ac.getBalance()+balance);
					ac.setBalance(ac.getBalance()+balance);
				}				
			}		
	}
	//출금하기
	private static void withdraw() {
		//작성위치
		System.out.println("----------");
		System.out.println("   출 금       ");
		System.out.println("----------");
		System.out.print("계좌번호: ");		
		String ano = sc.next();
		System.out.print("출금액: ");
		int balance = sc.nextInt();		
		for (Account ac : accountArray)
		{
			if(ac != null) 
			{
				if(ano.equals(ac.getAno()) && ac.getBalance() >= balance)
				{
					System.out.println("현재 잔액: "+ac.getBalance() + " 출금액: "+balance);
					System.out.print("현재 잔액: ");
					System.out.println(ac.getBalance()-balance);
					ac.setBalance(ac.getBalance()-balance);
				}
				else if(ac.getBalance() < balance)
					System.out.println("현재 잔액보다 출금액이 더 큽니다");		
				}
		}
	}
}