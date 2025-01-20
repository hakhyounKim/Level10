package _10_컬렉션프레임워크;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class User2 {
	String name;
	int age;
	
	User2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
//	@Override
//	public String toString() {
//		return "User2 [name=" + name + ", age=" + age + "]";
//	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User2 other = (User2) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
}


public class _04_set이론 {

	public static void main(String[] args) {
		
		Set<Integer> list1 = new HashSet<Integer>();
		list1.add(1);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		//ArrayList > [1,1,2,3]
		
		System.out.println(list1); //Set > [1,2,3]
		
		Set<String> list2 = new HashSet<String>(Arrays.asList("test1","test2","test3","test2"));
		System.out.println(list2.size()); //중복된 부분은 포함 x 되어 사이즈 3
		System.out.println(list2); //[test2, test3, test1]
		System.out.println("=====================================");
		// set은 인덱스가 없기 때문에 데이터 순서에 관련해서 값을 저장하는 순서를 우리가 정할 수 없다.
		
		Set<Integer> intHashSet = new HashSet<Integer>();
		Set<Integer> intLinkedHashSet = new LinkedHashSet<Integer>();
		Set<Integer> intTreeSet = new TreeSet<Integer>();
		
		for(int i : new int[] {20,12,30,100,3,1,8,5,4,7,2,9,6,7}) {
			intHashSet.add(i);	//인덱스가 없어 순서 상관 없이 숫자 들어감
			intLinkedHashSet.add(i);	// 배열 순서대로 들어감
			intTreeSet.add(i);	//적은 숫자부터 들어감
		}
		
		Set[] list3 = new Set[]{intHashSet,intLinkedHashSet,intTreeSet};
		
		for(Set test : list3) {
			System.out.println(test);
		}
		
		System.out.println("=====================================");
		
		Set<String> strHashSet = new HashSet<>();
		Set<String> strLinkedHashSet = new LinkedHashSet<>();
		Set<String> strTreeSet = new TreeSet<>();
		
		for(String i : new String[] {"Fox","Banana","Elephant","Car","Apple"}) {
			strHashSet.add(i);	//인덱스가 없어 랜덤으로 숫자 들어감
			strLinkedHashSet.add(i);	// 배열 순서대로 들어감
			strTreeSet.add(i);	//적은 숫자부터 들어감
		}
		
		Set[] list4 = new Set[]{strHashSet,strLinkedHashSet,strTreeSet};
		
		for(Set test : list4) {
			System.out.println(test);
		}
		
		System.out.println("=====================================");
		
		Iterator<String> iterator = strHashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}System.out.println();
		
		System.out.println("=====================================");
		
		
		Set<User2> userList = new HashSet<>();
		userList.add(new User2("test1",10));
		userList.add(new User2("test1",10));
		userList.add(new User2("test1",10));
		userList.add(new User2("test1",10));
		userList.add(new User2("test1",10));
		
		User2 user1 = new User2("test1", 10);
		User2 user2 = new User2("test1", 10);
		
		System.out.println(user1);
		System.out.println(user2);
		
		System.out.println(user1 == user2);
		System.out.println(userList);
	}
}
