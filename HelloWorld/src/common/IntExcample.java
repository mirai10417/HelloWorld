package common;

public class IntExcample {
		public static void main(String[] args) {
			{
		int var1 = 10;
		int var2 = 010;
		int var3 = 0x11;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
	
		for (int i=0; i<10; i++) 
			{
			System.out.format("%02X%n", var3++);
			}
		System.out.format("%02x%n", var3++);
	}
}
}
