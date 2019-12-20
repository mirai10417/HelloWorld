package ReferenceType;

public class test {
	public static void main(String[] args) {
		int[] num = new int[25];
		int summary = 0;
		int sum = 0;
		double avg = 0;
		// sum/갯수
		
		for(int i=0; i<25; i++) {				//	25=num.length같은 말
			num[i]=i+1;			
//			System.out.print(num[i]+" ");
//			if(num[i]%5==0)
//			System.out.println();
			summary = summary + num[i];
						
		}
		avg = ((double)summary)/num.length;
		System.out.println(summary);
		System.out.println(avg);
	}
}



// i*5+j
// 