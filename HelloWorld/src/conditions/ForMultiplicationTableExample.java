package conditions;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		
		for (int n=1; n<=9; n++) 
		{ 
			System.out.println(n);
			for (int m=2; m<=9; m++) 
			{				
				System.out.print (m + "*" + n + "=" + (m*n) + "    ");
				
			}
		
		}
		
	}
}

