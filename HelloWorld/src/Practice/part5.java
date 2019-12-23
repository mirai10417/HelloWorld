package Practice;

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
		int[][] array = {							//	6번 
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
			sum=sum + array[i][j];
			count++;
			}
		}
		avg=sum / count;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
