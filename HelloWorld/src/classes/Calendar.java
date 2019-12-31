package classes;

public class Calendar {
	public static void main(String[] args) {
		createCal(9);
		
	}
	
	public static void createCal(int mon)
	{
		int month = 2;
		System.out.println(getMaxDate(month));			// 해당 월 일의 갯수
		System.out.println(getFirstDayofMonth(month));	// 시작요일
		System.out.println();
		// 7일 단위로 출력.
		String[] weeks = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i=0; i<weeks.length; i++)
		{
			System.out.print(" "+weeks[i]);	
		}
		System.out.println();
		System.out.println("==============================================");
		
		int spaceCnt = 0;
		for (int i=1; i<getFirstDayofMonth(month); i++)
		{
			System.out.println("    ");
			spaceCnt++;
		}
		
		for(int i=1; i<getMaxDate(month); i++)
		{		
		
		System.out.printf("%4d", i);
		if(i % 7 == 0)
			System.out.println();
		}
	}	
	
	public static int getFirstDayofMonth(int month)
	{
		int result = 0;
		if(month==9) {
			result = 1;
		}else if(month==10) {
			result = 3;
		}else if(month==11) {
			result = 6;
		}else if(month==12) {
			result = 1;
		}
		return result;
	}
	public static int getMaxDate(int month)	//	월을 넣으면 해당되는 날의 갯수 출력
	{
		int daycnt = 0;
		if(month<=7){
			if(month%2==1){
				daycnt = 31;
			}else if(month==2) {
				daycnt=28;
			}else{
				daycnt=30;
			}
			}else{
				if(month%2==0)
				{
					daycnt=31;
				}else{
					daycnt=30;
					}
			}
		return daycnt;		
	}
}
