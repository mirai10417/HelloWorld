package classes;

public class StudentExample {
	public static void main(String[] args) {
		String str = "HELLO";
		String str1 = new String("HELLO");
		
		Student student = new Student();		//Student=오브젝트 / student=생성자 / new Student()?
		student.studentNo = "191234-1234";
		student.studentName = "김철수";
		student.university = "Yedam";
		student.age = 20;
		student.major = "ENGLISH";
//		student.doHomework();
//		System.out.println(student.major);
		student.introduce();
		
		Student student1 = new Student("Yedam", "921111-1111", "박철수");
		student1.introduce();
		
		
//		System.out.println(student);
	}
}
