package classes;
import java.util.Scanner;

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
		System.out.println(ac.getAno());
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = ac;
				break;
			}
		}
//		System.out.println(ac); // 자꾸 주소값 나옴 ㅡ_ㅡ
	}
	//계좌목록보기
	private static void accountList() {
//		Account ac = new Account();		빈껍데기를 만들어서 빈껍데기에 집어 넣겠다.
//		for (int i=0; i<10; i++)
//		{
//			if(ac != null) 
//			{
//				System.out.println();
//			}			
//		}
//		작성위치
		for (Account ac : accountArray) {
			if (ac != null)
				System.out.println(ac);
		}
	}
	//예금하기
	private static void deposit() {
		//작성위치
	}
	//출금하기
	private static void withdraw() {
		//작성위치
	}
	//Account 배열에서 ano와 동일한 Account 객체 찾기
//	private static Account findAccount(String ano) {
//		//작성위치
//	}
}
