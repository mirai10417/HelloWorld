package classes;

import java.util.Scanner;

public class FriendExe {
	static Scanner scanner = new Scanner(System.in);
	private static Friend[] friendArray = new Friend[100];
//	static UnivFriend uf = new UnivFriend();
//	static ComFriend cf = new ComFriend();		
//	static Friend f = new Friend();
	static UnivFriend[] uf2 = new UnivFriend[100];
	static ComFriend[] cf2 = new ComFriend[100];


	
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
		int input = 0;		
		Friend f = new Friend();	
		System.out.println("대학친구 등록을 원하시면 1번  | 회사이름 등록을 원하시면  2번  | 그외면 "+ "3번");
		input=scanner.nextInt();
		
						
		if(input==1)
		{					
			UnivFriend uf = new UnivFriend();
			System.out.println("대학친구 이름을 입력하세요: ");
			String name = scanner.next();
			uf.setName(name);
			System.out.println("대학친구 번호를 입력하세요: ");
			String phone = scanner.next();
			uf.setPhone(phone);
			System.out.println("대학친구 학교를 입력하세요: ");
			String univ = scanner.next();
			uf.setUniv(univ);
			System.out.println("대학친구 전공을 입력하세요: ");
			String major = scanner.next();
			uf.setMajor(major);
			System.out.println(" "+uf.getName()+" "+uf.getPhone()+" "+" "+uf.getUniv()+" "+uf.getMajor() );
			for(int i=0; i<100; i++)
			{
				if(uf2[i]==null)
				{
					uf2[i] = uf;
//					friendArray[i] = uf2[i];
					break;
				}					
			}			
		}		
		if(input==2)
		{
			ComFriend cf = new ComFriend();
			System.out.println("회사친구 이름을 입력하세요: ");
			String name = scanner.next();
			cf.setName(name);
			System.out.println("회사친구 번호를 입력하세요: ");
			String phone = scanner.next();
			cf.setPhone(phone);
			System.out.println("회사친구 회사를 입력하세요: ");
			String company = scanner.next();
			cf.setCompany(company);
			System.out.println("회사친구 부서를 입력하세요: ");
			String dept = scanner.next();
			cf.setDept(dept);
			System.out.println(" "+cf.getName()+" "+cf.getPhone()+" "+" "+cf.getCompany()+" "+cf.getDept() );
			for(int i=0; i<100; i++)
			{
				if(cf2[i]==null)
				{
					cf2[i] = cf;
//					friendArray[i] = cf2[i];
					break;
				}					
			}		
		}
		if(input==3)
		{		
			Friend f2 = new Friend();
			System.out.println("친구 이름을 입력하세요: ");
			String name = scanner.next();
			f.setName(name);
			System.out.println("친구 번호를 입력하세요: ");
			String phone = scanner.next();
			f.setPhone(phone);
			System.out.println(" "+f.getName()+" "+f.getPhone());
			for(int i=0; i<100; i++)
			{
				if(friendArray[i]==null)
				{
					friendArray[i] = f;
					break;
				}					
			}		
		}
						
		
	}

	private static void friendSearch() {
		// 작성위치
		System.out.println("찾을 이름을 입력하세요: ");
		String name = scanner.next();
		for(int i=0; i<100; i++) {
			if(friendArray[i] != null)
			{
				if(friendArray[i].getName().equals(name))
				{
					System.out.println("당신이 찾는 사람은");
					System.out.println(friendArray[i]);
					break;
				}
			}
			if(uf2[i] != null) 
			{
				if(uf2[i].getName().equals(name))
				{
					System.out.println("당신이 찾는 사람은");
					System.out.println(uf2[i]+" "+uf2[i].getName()+" "+uf2[i].getPhone());
					break;
				}
			}
			 if(cf2[i] != null)
			{
				if(cf2[i].getName().equals(name))
				{
					System.out.println("당신이 찾는 사람은");
					System.out.println(cf2[i]+" "+cf2[i].getName()+" "+cf2[i].getPhone());
					break;
				}	
			}
		}
	}


	private static void friendList() {
		// 작성위치
		for(int i=0; i<100; i++)
		{
			if(friendArray[i] != null || uf2[i] != null || cf2[i] != null){
			{			
			System.out.println(friendArray[i]);
			System.out.println(uf2[i]);
			System.out.println(cf2[i]);
			}
		}
	}
	
}
}
