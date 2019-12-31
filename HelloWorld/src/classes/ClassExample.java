package classes;

public class ClassExample {
	public static void main(String[] args) {
		Object[] objAry = new Object[10];
		Object obj = null;
		obj = new Friend();
		System.out.println(obj.hashCode());

		if (obj instanceof Friend) {
			Friend frnd = (Friend) obj;
			System.out.println(frnd.getName() + frnd.getPhone());
		}

		objAry[0] = new Friend();
		objAry[1] = new Member();

		Friend[] fArray = new Friend[10];
		fArray[0] = new UnivFriend("name", "나", "다", "라");

		fArray[1] = new ComFriend("", "", "", "");

		System.out.println(fArray[0].getName());
		System.out.println(fArray[0].getPhone());
		System.out.println(fArray[0].toString());
		
	}
}
