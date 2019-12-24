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
		int sum=0;		
		int avg=0;
		int maxvalue=0;
		
		
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
			}
			else if(selectNo==2)
			{	
				System.out.println("점수를 입력하세요: ");
				scores = new int[studentNum];
				for(int i=0; i<studentNum; i++)
				{				
				scores[i] = scanner.nextInt();
				sum=sum+scores[i];		
				
				}			
			}
			else if(selectNo==3)
			{
				System.out.println("점수 리스트입니다: ");
				
				for(int i=0; i<studentNum; i++) {
					if(i<studentNum) { 
					System.out.println(scores[i]);							
					}
				}		
			}
			
			else if(selectNo==4)
			{
				for(int i=0; i<studentNum; i++)
				{
				if(maxvalue<scores[i])
				maxvalue=scores[i];
				avg = scores[i]/studentNum;
				}				
				
				
				System.out.println("최고 점수는: " + maxvalue);
				System.out.println("평균 점수는: " + avg);
			}
			else if(selectNo==5)
			{
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

