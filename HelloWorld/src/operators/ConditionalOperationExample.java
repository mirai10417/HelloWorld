package operators;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 69;
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
