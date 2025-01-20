package _10_컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//컬렉션 프레임워크 : 데이터 저장 알고리즘을 이미 만든 클래스 모음집

class User implements Comparable<User>{
	String name;
	int age;
	
	User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + age + " ";
	}

	@Override
	public int compareTo(User o) {
		
		if(age > o.age) { //나이 순 정렬
			return 1;
		}else if(age < o.age){
			return -1;
		}else {
			return name.compareTo(o.name); //이름 순 정렬
		}
	}

}


public class _01_ArrayList_이론 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(list2);
		
		ArrayList<Integer> list3 = (ArrayList<Integer>) list2.clone();
		System.out.println(list3);
		
		System.out.println(list2 == list3); //깊은 복사, 주소 값 다름
		
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("홍길동",30));
		list.add(new User("김학현",30));
		list.add(new User("학현",32));
		list.add(new User("아리",28));
		list.add(new User("뚱이",12));
		list.add(new User("또치",25));
		
		System.out.println(list);
		Collections.sort((List<User>) list);
		System.out.println(list);
		
	}

}
