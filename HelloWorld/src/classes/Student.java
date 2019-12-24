package classes;

public class Student {
	// 필드
	String university;
	String studentNo;
	String studentName;
	String major;
	int age;
	
	// 생성자
	Student()
	{
		
	}
	Student(String university, String studentNo, String studentName)
	{											//			      ↓↓↓↓↓↓↓↓↓						  ↓↓↓↓↓↓↓↓↓↓		
		this.university = university;			// Student(String university == this.university = university;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}
	// 메소드
	
	void introduce()
	{
		System.out.println("학번은: "+ studentNo + "이고 이름은 " + studentName +" 이고"+ "학교는 "+university+ " 입니다.");
	}
	void study() 
	{
		System.out.println("공부한다.");
	}
	void basketBall()
	{
		System.out.println("농구한다.");	
	}
	void sleep()
	{
		System.out.println("잠을잔다.");
	}
	void doHomework()
	{
		System.out.println("숙제한다.");
	}
}