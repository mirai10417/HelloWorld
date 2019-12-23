package ReferenceType;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = {1,2,3,4,5};		// int intAry[] 앞에 선언한 변수와 같음
//		System.out.println(intAry[2]);
//		intAry[2] = 30;
//		System.out.println(intAry[2]);
		int sum=0;
		
//		String[] strAry = {"Hello", "NIce","good","wonderful"};
		for(int i=0; i<5; i++) {
			if(intAry[i]%2==1) {
				sum = sum+intAry[i];
			}
		}
		System.out.println("intAry 0,2,4 더한값"+sum);
	}				 
}


