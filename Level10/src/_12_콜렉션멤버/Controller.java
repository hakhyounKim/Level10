package _12_콜렉션멤버;

import java.util.HashMap;
import java.util.Map;

public class Controller {
	
	
	private Map<Menu, Action> mapList;
	
	public Controller() {
		mapList = new HashMap<Menu, Action>();
		
		mapList.put(Menu.INSERT, new ActionInsert());
	}
	
	public Action getAction(Menu key) {
		return mapList.get(key);
	}
	
	public void run() {
		while(true) {
			System.out.println("=====[메뉴] =====");
			System.out.println("1) 추가");	//id 중복 제거
			System.out.println("2) 삭제");	//id로 삭제
			System.out.println("3) 수정");	//id로 삭제 -> 비번 검색 -> 비번 맞으면 이름 수정
			System.out.println("4) 출력"); 	//이름 순으로 출력
			System.out.println("5) 저장");	//member.txt => id 순으로 저장
			System.out.println("6) 로드");	//member.txt 로드
			System.out.println("0) 종료");
			int sel = 1;
			if(sel == 1) { //추가하는 기능 DAO
				getAction(Menu.INSERT).excute();
			}else if(sel == 2){
				getAction(Menu.DELETE).excute();
			}else if(sel == 3) {
				
			}else if(sel == 4) {
				
			}else if(sel == 5) {
				
			}else if(sel == 6) {
				
			}else if(sel == 0) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
	
}
