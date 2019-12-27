package classes;
import java.util.Scanner;


public class PlayBaseBall {
	public static void main(String[] args) {
		int[] comAry = new int[3];
		int[] balance = new int[3];
		int[] balance2 = new int[3];
		int a=0;
		int b=9;
		// 랜덤함수 발생
		for(int i=0; i<3; i++) 
		{			
			comAry[i] = (int)(Math.random()*9)+1;
			System.out.print(comAry[i] + " ");		
			balance[i] = comAry[i];
		}
		System.out.println();
//		System.out.println(""+balance[0]+" "+balance[1]+" "+ balance[2]);
		
		// 사용자 숫자 입력
		Scanner sc = new Scanner(System.in);
		int[] userAry = new int[3];
		System.out.println("정수를 입력하세요. ");
		for(int i=0; i<3; i++) 
		{			
			userAry[i] = sc.nextInt();
			balance2[i] = userAry[i];
//			System.out.print(balance2[i]);
		}
				
//		for(int i=0; i<3; i++)
//		{			
//			for(int j=0; j<3; j++)
//				if(balance[i]==balance2[i])
//				{					
//					System.out.println(""+balance[i]+""+balance2[j]+"");
//					break;
//				}
//			
//		}
		while(true) {
		if(true) {
		if(balance[0]==balance2[0])
		{
			System.out.println("1 스트라이크");
		}
		else if(balance[0]==balance2[1])
		{
			System.out.println("1 볼");
		}
		else if(balance[0]==balance2[2])
		{
			System.out.println("1 볼");
			
		}
		}
		if(true) {
		if(balance[1]==balance2[0])
		{
			System.out.println("1 볼");
		}
		else if(balance[1]==balance2[1])
		{
			System.out.println("1 스트라이크");
		}
		else if(balance[1]==balance2[2])
		{
			System.out.println("1 볼");
			
		}
		}
		if(true) {
			if(balance[2]==balance2[0])
			{
				System.out.println("1 볼");
			}
			else if(balance[2]==balance2[1])
			{
				System.out.println("1 볼");
			}
			else if(balance[2]==balance2[2])
			{
				System.out.println("1 스트라이크");
				
			}
			System.out.println("꽝입니다.");
		}
		
		break;
	}
}
	
	
}
