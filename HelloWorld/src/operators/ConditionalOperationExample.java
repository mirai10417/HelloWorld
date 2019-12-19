package operators;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 69;
		int var1 = 10;
		long var2 = 10000000L;
		char var3 = 'a';
		double var4 = 10;
		float var5=10;
		char grade;
		grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : 'D';
//		if(score>90) {
//			grade = 'A';
//		}
//			
//		else {
//			if (score > 80)
//				grade = 'B';
//			else
//				grade = 'C';
//		}
		System.out.println(grade);
	}
} 