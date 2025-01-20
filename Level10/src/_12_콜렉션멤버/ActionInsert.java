package _12_콜렉션멤버;

public class ActionInsert implements Action{

	@Override
	public void excute() {
		
		System.out.println("==== [회원 가입] ====");
		
		//추가하는 dao 연결
		String id = "test";
		String pw = "1234";
		String name = "테스트";
	
//		MemberDAO.addMember(id, pw, name);
		System.out.println("회원가입 완료");
	}

	
}
