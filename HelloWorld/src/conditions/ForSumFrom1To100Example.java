package conditions;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int sumsum=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2!=0) {
				sum1 += i;
			}
			if (i%2==0) {
				sum2 += i;
			}
		}
		System.out.println("ㅡㅡ;;");
		System.out.println(sumsum=sum1+sum2);
	}
}
