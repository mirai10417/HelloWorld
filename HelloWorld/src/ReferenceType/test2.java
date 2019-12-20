package ReferenceType;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		
		int[] num = new int[5];
		int size = num.length;
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		int amt = 0;
		int sum = 0;
		
		while(run) {
			System.out.println("----------------------");
			System.out.println("1.입력|2.합계|3.평균|4.종료");
			System.out.println("----------------------");
			System.out.println("선택>");
			
			menu = scanner.nextInt();
			scanner.nextLine();
			
			if(menu==1) {				
				amt = scanner.nextInt();
				for (int i=0; i<size; i++)
					System.out.println("점수를 입력하세요");
				num[i]= menu.scanner.nextInt();
			}
		
			
		}
	}
}
