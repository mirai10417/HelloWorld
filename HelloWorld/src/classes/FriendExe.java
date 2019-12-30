package classes;

import java.util.Scanner;

public class FriendExe {
	static Scanner scanner = new Scanner(System.in);
	private static Friend[] friendArray = new Friend[100];
	static UnivFriend uf = new UnivFriend();
	static ComFriend cf = new ComFriend();		
	static Friend f = new Friend();
	
	
	public static void main(String[] args) {
			
		boolean run = true;
		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.입력 | 2.조회 | 3.리스트 | 4.종료");
			System.out.println("----------------------------");
			int selectNo = scanner.nextInt();
			scanner.nextLine();
			

			if (selectNo == 1) {
				friendName();
			} else if (selectNo == 2) {
				friendSearch();
			} else if (selectNo == 3) {
				friendList();
			} else if (selectNo == 4) {
				run = false;
			}

		}
	System.out.println("프로그램 종료");

	}

	private static void friendName() {				
		int selectNo = 0;
		Friend f = new Friend();	
		System.out.println("대학이름 등록을 원하면 1번  회사이름 등록을 원하면 2번  그외면 3번");
		String name = scanner.nextLine();
		String phone = scanner.nextLine();
//		String univ = scanner.nextLine();
//		String major = scanner.nextLine();
//		String com = scanner.nextLine();
//		String dept = scanner.nextLine();
		
//		if(selectNo==1)
//		{						
//			uf.setName(name);
//			uf.setPhone(phone);			
//			uf.setUniv(univ);
//			uf.setMajor(major);
//		}		
//		if(selectNo==2)
//		{
//			cf.setName(name);
//			cf.setPhone(phone);
//			cf.setCompany(com);
//			cf.setDept(dept);
//		}
		if(selectNo==3)
		{
			f.setName(name);
			f.setPhone(phone);
		}
						
		for(int i=0; i<friendArray.length; i++)			
		{
			if(friendArray[i] == null) {
				friendArray[i] = f;
				break;
			}
		}
	}

	private static void friendSearch() {
		// 작성위치
		System.out.println("찾을 이름을 입력하세요: ");
		String name = scanner.next();			
			if(name.equals(f.getName()))
			{
				System.out.println("당신이 찾는 사람은");
				System.out.println(""+f.getName()+" "+f.getPhone()+" "+uf.getUniv()+" "+uf.getMajor()+" "+cf.getCompany()+" "+cf.getDept());
			}		
	}

	private static void friendList() {
		// 작성위치
		for(Friend f : friendArray) {
			if(f != null) {
				System.out.println(""+f.getName()+" "+f.getPhone()+" "+uf.getUniv()+" "+uf.getMajor()+" "+cf.getCompany()+" "+cf.getDept());				
			}
		}
	}
	
}
