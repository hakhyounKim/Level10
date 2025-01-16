package 추상_개념;

// 부모 클래스 == 상위클래스 == 슈퍼클래스
class Parent {
	int a=10;
	int b=20;
}

// 자식 클래스 == 하위클래스 == 서브클래스
class Child extends Parent {
	int c=30;
	int d=40;
}

public class _02_추상클래스 {

	public static void main(String[] args) {
		
		// casting : 형변환
		System.out.println( (int)10.2345); // (int) -> 강제 형변환
		

		// upcasting : 하위클래스가 상위타입 전환 : 자식클래스 객체가 부모 클래스 객체 전환
		Parent p = new Parent();
		Child c = new Child();
		
		Parent parent = new Child(); //업캐스팅
		
		
		//downcasting : 상위 클래스를 하위 타입 변환?? ->> 불가능
//		Child child = new Parent(); //--> 불가능 더 작은애를 큰 애로 바꿀 수 없음
		
		Child child = (Child)parent;
//		child.
		
	}

}
