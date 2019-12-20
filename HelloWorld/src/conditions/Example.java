package conditions;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
//		exam01();
//		exam02();
		exam07();
	}
	
		public static void exam07() {
			int[] num = new int[5];
			int size = num.length;
			boolean run = true;			
			int balance = 0, menu = 0, amt = 0;			
			Scanner scanner = new Scanner(System.in);
			
			while(run) {
				System.out.println("----------------------");
				System.out.println("1.입력|2.합계|3.평균|4.종료");
				System.out.println("----------------------");
				System.out.println("선택>");
				//작성위치
				menu = scanner.nextInt();
				scanner.nextLine();
				
				for(int i=0; i<5; i++) {
				if(menu==1) {
					System.out.println("입력하세요>");
					num[i] = scanner.nextInt();
					amt = scanner.nextInt();
					balance = num[i] + amt; 
				}
				 else if(menu==2) {
					 menu = scanner.nextInt();
					System.out.println(balance);					
				}else if(menu==3) {
					menu = scanner.nextInt();
					System.out.println(balance/(double)size);
				}else if(menu==4) {
					run=false;
				}
				
				
			}
			System.out.println("프로그램 종료");
		}
		}
}
	
	