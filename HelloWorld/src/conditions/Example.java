package conditions;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
//		exam01();
//		exam02();
		exam07();
	}
	
		public static void exam07() {
			int[] score = new int[5];
			int size = score.length;
			boolean run = true;			
			int balance = 0, menu = 0, amt = 0;			
			Scanner scanner = new Scanner(System.in);
			int sum=0;
			
			while(run) {
				System.out.println("----------------------");
				System.out.println("1.입력|2.합계|3.평균|4.종료");
				System.out.println("----------------------");
				System.out.println("선택>");
				//작성위치
				menu = scanner.nextInt();
				scanner.nextLine();
				
				for(int i=0; i<score.length; i++) {
				if(menu==1) {
					System.out.println("입력하세요>");
					score[i] = scanner.nextInt();
					amt = scanner.nextInt();
					balance = score[i] + amt;
					sum=sum+score[i];					
				}

		}
}
			}
}
	