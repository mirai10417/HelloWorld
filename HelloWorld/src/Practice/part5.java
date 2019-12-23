package Practice;
import java.util.Scanner;

public class part5 {
	public static void main(String[] args) {
//		int[][] array = {								6번 
//				{95,86},
//				{83,92,96},
//				{78,83,93,87,88}
//		};
//		System.out.println(array[0].length);
//		System.out.println(array.length);
//		System.out.println(array[2].length);
//		===================================================================
//		int max = 0;									7번
//		int[] array = {1, 5, 3, 8, 2};
//		
//		for(int i=0; i<array.length; i++)
//		{
//			if(array[i]>max)
//			{
//				max=array[i];
//			}
//		}
//		System.out.println("max: " + max);
//		int[][] array = {							//	6번 
//				{95,86},
//				{83,92,96},
//				{78,83,93,87,88}
//		};
//		
//		int sum = 0;
//		double avg = 0.0;
//		int count = 0;
//		
//		for(int i=0; i<array.length; i++)
//		{
//			for(int j=0; j<array[i].length; j++)
//			{
//			sum=sum + array[i][j];
//			count++;
//			}
//		}
//		avg=sum / count;
//		
//		System.out.println("sum: " + sum);
//		System.out.println("avg: " + avg);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int amt=0;
				
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1)
			{				
				System.out.println("학생수>");
				studentNum=scanner.nextInt();
				scores = new int[studentNum];
			}
			else if(selectNo==2)
			{	
				amt=scanner.nextInt();
				for(int i=0; i<scores.length; i++)
				{				
				System.out.println(amt);
				}
			}
//			else if(selectNo==3)
//			{
//				
//			}
//			else if(selectNo==4)
//			{
//				
//			}
//			else if(selectNo==5)
//			{
//				run=false;
//			}
		}
		System.out.println("프로그램 종료");
	}
}
