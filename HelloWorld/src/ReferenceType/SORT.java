package ReferenceType;

public class SORT {
	public static void main(String[] args) {
//		int a=6, b=7, c=3, d=5, e=9;
		int maxValue = Integer.MAX_VALUE;
		int[] num = {11,12,13,14};		
		int temp=0;
		
		System.out.println(Integer.MAX_VALUE);
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i]<maxValue)
			{
				maxValue = num[i];	//	10	11	->	maxvalue=11;			num	 12 13 14 
//				if(maxValue<num[i])
//				{
//					System.out.println(maxValue);
//				}
			}
		}
		System.out.println(maxValue);
	}
}

