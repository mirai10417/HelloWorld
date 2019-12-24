package classes;

public class Person {
	String nation;
	double height;
	int money;
	String Adult;
	
	Person(String nation, double height, int money, String Adult)
	{
		this.nation = nation;
		this.height = height;
		this.money = money;
		this.Adult = Adult;
	}
	
	Person()
	{
		
	}
	
	void say()
	{
		System.out.println("왈왈왈왈,멍멍멍멍");
	}
	
	void soccer()
	{
		System.out.println("뻥뻥뻥뻥,퍽퍽퍽퍽");
	}
	
	void introduce()
	{
		System.out.println("내 나라는 " + nation +"이고  키는 "+ height +"이고  재산은" + money +" 이며 성별은 "+ Adult +"야ㅎㅎ");
	}
}
