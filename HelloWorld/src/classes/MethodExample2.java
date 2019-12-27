package classes;

public class MethodExample2 {
	public static void main(String[] args) {
////		m,.mz -_-z =_=z
////		double result = sum(3.3, 4.5);
////		System.out.println("결과: " + result);		
//		int[] intAry = {2,3,4,5,6,7};
//		int sum = sum(intAry);
//		System.out.println("합계는 " + sum);
//		
//		int[] intAry2 = {3,4,5};
//		sum(intAry2);		
//		sum = sum(intAry2);
//		System.out.println("합계는 " + sum);
//		
		printString(8, "돌려돌려돌림판");
	}
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	public static int sum(int[] iAry)
	{
		int sum = 0;
		for(int i=0; i<iAry.length; i++)
		{
			sum = sum + iAry[i];			
		}
		return sum;
	}
	
	//
	//
	//
	//
	//
	//
	
	public static void printString(int x, String str)	
	{
		for(int i=1; i <= x; i++)	//<-- 	i=1; 1<=5 조건인데 5가 더 크니까 여기서 i먼저 반복하고 j로 내려가는겁니까??  
		{							//		1<=5 조건 한번만 만족하고 일단 j로 가는 겁니까??
			for(int j=1; j <= i; j++)	
			{
				System.out.print(str);				
			}
			System.out.println();
		}
	}
	
	
	
}
