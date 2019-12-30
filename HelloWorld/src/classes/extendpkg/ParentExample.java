package classes.extendpkg;

public class ParentExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method1();
		parent.method2();	
//		parent.method3();					//	부모클래스의에 정의되지 않아 사용x 자식한데만 있는건 부모한데 사용 못함
		
		Child child = (Child) parent;		//	강제 형 변환
		child.field2 = "data2";
		child.method3();
		
//		Parent parent3 = new Child();
//		parent3.method1();
//		
//		Child child3 = new Parent();
//		child3.method1();
		
		Parent parent2 = new Parent();		// ????
		if(parent2 instanceof Child)
		{
			Child child2 = (Child) parent2;
			child2.method3();			
		}
		else
			System.out.println("형 변환 할 수 없습니다.");
	}
		
}
