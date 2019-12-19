package conditions;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A");
		} else { //ELSE 뒤에는 조건이 없어야 함, 근데 if를 한번 더 쓰는건 가능
			if(score >= 80) {
				System.out.println("점수가 80보다 큽니다.");
				System.out.println("등급은 B");
			} else {
				if(score >= 70) {
					System.out.println("점수가 70보다 큽니다.");
					System.out.println("등급은 C");
				} else {
					System.out.println("점수가 60보다 큽니다.");
					System.out.println("등급은 D");
				}
			}
		}
	}
}

