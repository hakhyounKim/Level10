package _02_접근제어자_실습;

import _01_상속_개념.AccessTest;

class Child extends AccessTest {
	int f = 50;
	Child() {
		super.a = 100;
		super.printAll();

	}
}


public class _01_접근제어자_테스트 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.a = 100;
		c.f = 200;
		System.out.println(c.a);
		System.out.println(c.f);
		
		System.out.println("-------------");
		AccessTest acc = new AccessTest();
		System.out.println(acc.a);
		
	}

}
