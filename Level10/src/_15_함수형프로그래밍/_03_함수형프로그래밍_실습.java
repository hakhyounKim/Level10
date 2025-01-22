package _15_함수형프로그래밍;

import java.util.function.BinaryOperator;

class Calculate {
	int add(int a, int b) {return a+b;}
	int subtract(int a, int b) {return a-b;}
	int multiply(int a, int b) {return a * b;}
}

@FunctionalInterface
interface CalFunction {
	int calculate(int a, int b);
}

public class _03_함수형프로그래밍_실습 {

	public static void main(String[] args) {
		Calculate cal = new Calculate();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.subtract(10, 20));
		System.out.println(cal.multiply(10, 20));
		System.out.println("=======================");
		
		//함수형 인터페이스 CalFunction 만들어서 위와 같은 결과 실행
		//각각 인터페이스 변수 3개 생성해서 이름 => add, subtract, multiply 로 생성 후 호출
		
		CalFunction add = (a, b) -> a + b;
		System.out.println(add.calculate(10, 20));
		
		CalFunction subtract = (a, b) -> a - b;
		System.out.println(subtract.calculate(10, 20));
		
		CalFunction multiply = (a, b) -> a * b;
		System.out.println(multiply.calculate(10, 20));
		System.out.println("=======================");
		
		
		BinaryOperator<Integer> add2 = (a, b) -> a+b;
		System.out.println(add2.apply(10, 20));
		
	}

}
