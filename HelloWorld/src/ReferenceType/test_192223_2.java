package ReferenceType;

public class test_192223_2 {
	public static void main(String[] args) {
		
//		double s1 = divideBy(15, 6);
//		System.out.println("s1은 "+ s1);
//		String str = printResult("윤현수");				//문자
//		System.out.println(str);						//문자
		double s2 = calcurlator(50, 2, "*");
		System.out.println("s2은 "+ s2);
	}
//	public static double divideBy(int a, int b)	
//	{
//		double result = 0;
//		result = (double)a / b;
//		return result;
//	}
	
	public static String printResult(String name)
	{
		String str = "반갑습니다"+name+"저는 흑우입니다.";
		return str;
	}
	
	public static double calcurlator(double a, double b, String cal)
	{
		
		double result = 0; 
		if(cal.equals("+"))
		{
		result = a + b;	
		}
		if(cal.equals("-"))
		{
		result = a - b;	
		}
		if(cal.equals("*"))
		{
		result = a * b;	
		}
		if(cal.equals("/"))
		{
		result = a / b;	
		}
		return result;
	}
	
}