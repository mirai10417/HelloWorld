package conditions;			// ★★★ 숙제

public class GetMaxValue_FALSE {
	public static void main(String[] args) {
		int[] num= {8,7,6,5,4};
		int temp=0;
		for(int j=0; j<num.length-1; j++)
		{
			for(int i=0; i<num.length-1; i++) {
				if(num[i] > num[i+1]) {
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
			}
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]+" ");
				}
	
	}
}
//public class GetMaxValue {
//	public static void main(String[] args) {
//int[] num= {8,7,6,5,4};
//int temp=0;
//for(int j=0; j<num.length-1; j++)
//{
//	for(int i=0; i<num.length-1; i++) {
//		if(num[i]>num[i+1]) {
//			temp=num[i];
//			num[i]=num[i+1];
//			num[i+1]=temp;
//		}
//	}
//}
//
//for(int i=0; i<num.length; i++) {
//	System.out.println(num[i]+" ");
//		}
//	}
//}											// 정렬하는 친구