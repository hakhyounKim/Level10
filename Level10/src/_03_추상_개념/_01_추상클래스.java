package _03_추상_개념;

// 클래스 설계 : 상태(state => data) , 행동(기능 == method)

// 단 하나라도 미완성된 메서드가 있으면 추상 클래스로 만들어줘야 한다!!
abstract class A {
	
	// 미완성된 메서드 => body {} 가 존재하지 않는다
	abstract void printAnything();
	
	// 완성된 메서드
	void printSomething() {
		System.out.println("something");
	}
}


//추상 클래스를 상속받은 클래스는 반드시 미완성된 클래스를 완성시켜줘야함
class B extends A {

	@Override
	void printAnything() {
		System.out.println("나는 b 야");
		
	}
}


public class _01_추상클래스 {

	public static void main(String[] args) {
		
		//추상 클래스는 미완성된 클래스이기 때문에 객체 생성이 불가능하다
//		A a = new A();
		B b = new B();
		b.printAnything();
		b.printSomething();
	}

}
