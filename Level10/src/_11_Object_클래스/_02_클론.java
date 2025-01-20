package _11_Object_클래스;

class Bag {
	
}

class Person {
	String name;
	int age;
	Bag bag;
	
	
	Person(String name, int age, Bag bag) {
		super();
		this.name = name;
		this.age = age;
		this.bag = bag;
	}


	@Override
	public String toString() {
		return name + " : " + age + " : " + bag;
	}
	

	
	
}

public class _02_클론 {

	public static void main(String[] args) {
		
		Bag bag1 = new Bag("갤럭시탭");
		Bag bag2 = new Bag("맥북");
		
		bag1.contains = "아이패드";
		
		
		Person p1 = new Person("김학현", 10, bag1);
		
//		Person p2 = p1;
		
		Person p2 = p1.clone();
		//p2.bag = bag2;
		p2.name = "둘리";
		System.out.println(p1);
		System.out.println(p2); 

	}

}
