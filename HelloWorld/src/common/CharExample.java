package common;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 64;
		char c3 = '\u0041';
		int  c4 = 150;
				
//		System.out.println("c1: " + c1 + ", " + "c2: " + c2 + ", " + "c3: " + c3);
//		c1 = (char) (c1 + 1);
//		System.out.println("c1 + 1: " + c1);
	
		
//		for (int i=0; i<26; i++) {
//			c2 = (char)(c2 + 1);
//			System.out.print(c2 +" "); }
			
		for(int i=0; i<26; i++) {
			System.out.print(c1++);
		}
		
	}
}



