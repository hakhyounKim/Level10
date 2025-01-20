package _02_접근제어자_실습;

final class Test{
	int num1;
	int num2;
	
	Test(int num1 , int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	void printNums() {
		System.out.printf("num1 = %d, num2 = %d \n" , num1 , num2);
	}
}

//final 클래스는 상속 받을 수 없다
//class child extends Test{}

class Parent{
	int num2 = 20;
	final int num1 = 10; //초기갑 변경이 불가능 하다 : 원시 타입은 값 변경이 불가능 하다
	
	//메서드에 final 키워드를 붙이면 오버라이딩이 불가능하다 => 오버라이딩 => 내용 수정
	final void printNum() {
		System.out.println(num1);
	}
}

class Childs extends Parent{

// 	final이 붙으면 자식 클래스에서 오버라이딩 불가하다
//	void printNum() { //Cannot override the final method from parent
//	}
}


public class _02_final_테스트 {

	public static void main(String[] args) {
		
		final Parent p = new Parent(); //참조 타입, 새로운 객체로 변경 불가능
		//주소 값 변경이 불가능하다
		//p.num1 = 100;
		p.num2 = 10;
		
		
	}
}
