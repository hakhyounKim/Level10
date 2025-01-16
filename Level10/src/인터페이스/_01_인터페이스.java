package 인터페이스;

/*
 추상클래스 vs 인터페이스
 인터페이스는 다중 상속이 목적이다
 인터페이스는 객체 따로 못만든다, 추상 클래스보다 더 추상적이다
 인터페이스 자체는 객체를 생성하는 것이 목적이 아니다!
 
 추상클래스 : 동물 식물 기계
 인터페이스 : movable() , flyable() , eatable() , swimable() , aboardable()
 
 자동차 > 기계 > movable(), aboardable()
 새 > 동물 > flyable(), movable(), eatable(), swimable()
 사람 > 동물 > movable(), swimable(), eatable()
 
 
 						추상클래스 			|			인터페이스
 	개념 			| 물려 받는 것(혈통,가문,계열)		| 장착한다(기능, 행위, 학위, 자격증)
 	다중적용		| 불가능 (부모는 하나)			| 가능
 	생성자		| 가짐						| 가지지 않음
 	메서드		| 완성된 메서드, 미완성 메서드		| 추상메서드 , default(완성된 메서드) , static
 	필드(멤버변수)	| 모든 필드					| 상수 (public final static 자료형 타입)
 	적용 방식		| extends (확장)				| implements (구현)
 */


class A {
	int num = 10;
	final static int num2 = 10;
}

abstract class B {
	int num = 10;
	abstract void init();
}

// 인터페이스에서 멤버 변수는 무조건 상수
// 추상클래스보다 더 추상적인 것 => 인터페이스 => 여러개를 상속받기 위해 사용
interface C {
	int num = 10; // public static final int num = 10;
	void test1(); // public abstract void test1();
	
	static void test2() {
		
	}
	
	default void test3() {
		
	}
}


interface D {
	void test2();
}


class F extends A implements C,D { //인터페이스를 상속할땐 implements 사용

	@Override
	public void test2() {
		
	}

	@Override
	public void test1() {
		
	}
}


interface G extends D { //인터페이스에서 > 인스페이스를 상속할땐 extends 사용
	
}


public class _01_인터페이스 {
	public static void main(String[] args) {
		
//		C c = new C;
	}
}
