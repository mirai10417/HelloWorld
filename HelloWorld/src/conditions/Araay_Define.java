package conditions;

public class Araay_Define {
	public static void main(String[] args) {
//		int[][] num = new int[5][4];

//		num[0][0]=1; 		
//		num[0][1]=2;		
//		num[0][2]=3;		
//		num[0][3]=4;		
//		num[1][0]=5;		
//		num[1][1]=6;
//		num[1][2]=7;
//		num[1][3]=8;
//		num[2][0]=9;		
//		num[2][1]=10;
//		num[2][2]=11;
//		num[2][3]=12;
//		num[3][0]=13;
//		num[3][1]=14;
//		num[3][2]=15;
//		num[3][3]=16;
//		num[4][0]=17;
//		num[4][1]=18;
//		num[4][2]=19;
//		num[4][3]=20;
		
		int num=1;
		int[][] array=new int[5][2];
		for (int j=0; j<array.length; j++)
		{
			for (int i=0; i<array[0].length; i++)
			{
				array[j][i]=num++;
				System.out.println(array[j][i]);
			}
		}
		
//		for(int i=0; i<num.length; i++)
//		{
//			for(int j=0; j<num.length-1; j++)
//			{
//				System.out.println(num[i][j]);
//			}
//			
//		}
		
		
	}
}
