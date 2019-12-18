package operators;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
//		int x = 10;
//		int y = 10;
//		int z;
//		
//		System.out.println("-------------");
//		x++;
//		++x;
//		System.out.println("x=" +x);
//		
//		System.out.println("-------------");
//		y--;
//		--y;
//		System.out.println("y=" +y);
//		
//		System.out.println("-------------");
//		z = x++;						//	x=12출력 값은 13
//		System.out.println("z=" +z); 	//	z=12
//		System.out.println("x=" +x);	//	x=13
		
		boolean play = true;
		System.out.println(play);
		
		for (int i=0; i<10; i++) {
			play = !play;
			System.out.println(play);
			
			if(play)
				System.out.println(play + "한번 더 출력");
		}
	}
}
