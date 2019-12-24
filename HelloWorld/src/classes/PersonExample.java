package classes;
import java.util.Scanner;

public class PersonExample {
	public static void main(String[] args) {
		int menu=1;
		String temp = null;
		Person human1 = new Person("US", 176, 1000000000, "남자");
//		human1.say();
//		human1.introduce();
		Person[] PersonArray = new Person[5];
		PersonArray[0] = human1;				
				
		Person human2 = new Person();
		human2.Adult = "괴물";
		human2.height = 230.1;
		human2.money = 999999999;
		human2.nation = "not earth";

		Scanner scanner = new Scanner(System.in);
		
		Person[] noPerson = new Person[3];	// 배열 입력값에 따라 for문의 값도 제대로 줘야함.
											// int면 0으로 처리해서 상관없음
		noPerson[1]=human2;
//		noPerson[1]=nohuman.height;		// noPerson[1]영역은 Person형이 아니기때문에 바로 들어갈 수 없음
//		noPerson[1].height=111;			//	그래서 Person형인 nohuman형을 먼저 넣어주고 그 후 nohuman의 값들을 넣을 수 있음
		noPerson[1].nation="zzzzzzzzzz";
		noPerson[0]=human1;
	
		if(menu==1) {
		for(int i=0; i<2; i++)
			{			
			System.out.println("성별을 입력하세요: ");
			temp=scanner.nextLine();
				if(temp.equals("남자"))
				{
					System.out.println("안녕 날 소개하지");
					noPerson[i].introduce();
				}
				else 
				{
					System.out.println("안녕 날 소개하지");
					noPerson[i].introduce();	
				}				
				
			}
		}
		
//		for(Person human : noPerson) {		//확장 for문 이렇게도 쓸 수 있음				
//			human.introduce();			
//		}
		
//		System.out.println(nohuman);
//		System.out.println(noPerson);
		
		
	}
}

// 해당되는 사람의 입력받은 사람건만 출력