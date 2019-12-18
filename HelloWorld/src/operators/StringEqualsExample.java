package operators;
class Student {
	int age;
	String name;
	
}

public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = "신민철";
		String str2 = "신민철";
		String str3 = new String ("신민철");
		int num1 = 10;
	
		Student stu1 = new Student();
		System.out.println(stu1);
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
	
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		if(str1.contentEquals(str3)) {			// 클래스를 비교 할 경우 equals
			System.out.println("같은 내용입니다");
		}
		else {
			System.out.println("다른 내용입니다");
		}
	}
}


