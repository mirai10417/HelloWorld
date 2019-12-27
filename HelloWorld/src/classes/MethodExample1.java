package classes;

public class MethodExample1 {
	public static void main(String[] args) {
		showName();
		showName("하이");
		showAge(50);
	}
	public static void showName() {
		System.out.println("HELLO, I AM CHARLIE");
	}	
	
	public static void showName(String name) {
	System.out.println("HELLO, I AM CHARLIE2  " + name);
	}
	
	public static void showAge(int age) {
	System.out.println("HELLO, I AM CHARLIE3  " + age + "year old.");
	}
	
	
	
	}
}
