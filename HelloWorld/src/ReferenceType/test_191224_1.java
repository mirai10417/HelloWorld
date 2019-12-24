package ReferenceType;
// 반대로도 해보기 1이 제일 끝부터
public class test_191224_1 {
	public static void main(String[] args) {
		int[][] num = new int[5][5];
		int count=25;	
		for(int i=4; i>=0; i--)
		{						
			for(int j=4; j>=0; j--)
			{
				num[i][j]=count;
				count--;
				System.out.print(num[i][j]+"   " );				
			}
			System.out.println();
		}

	}
}                      
//0 0 1			(i*5)+(j+1)=
//0 1 2
//0 2 3
//0 3 4
//0 4 5
//
//1 0 6
//1 1 7
//1 2 8 
//1 3 9
//1 4 10 
//
//2 0 11 
//2 1 12
//2 2 13
//2 3 14
//2 4 15

