package common;

public class BooleanExample {
	public static void main(String[] args) {
		boolean trueOrFalse = 100 > 20;
		int var1 = 10;
		trueOrFalse = var1 > 15;
		
		for(int i=0; i<10; i++) 
		{
			trueOrFalse = var1 > 15;
			var1++;
		if(trueOrFalse)
			System.out.println("참일 경우에");
		
		else
			System.out.println("거짓일 경우에");System.out.print("END OF PROGRAM"); 
		}
	}

}
