package ReferenceType;
import java.util.Scanner;

public class haha {
	public static void main(String[] args) {
		
		// 배열생성
		int[] num = new int[5];
		int size = num.length;
		
		// 입력받기
		Scanner scanner = new Scanner(System.in);
		
		// 입력된 이름을 배열의 순서에 맞게 저장
		for(int i=0; i<size; i++) {
			System.out.println("점수를 입력하세요. ");
			num[i] = scanner.nextInt();
		}
		
		// 화면에 입력된 이름을 표시한다.
		for(int i=0; i<size; i++) {
			System.out.println("점수: " + num[i]);
		}
	}
}
