package 상속_개념;

class D { //extends object
	int d;
	D() {
		System.out.println("D 생성!! ");
	}
}

class E extends D{
	int e;
	E() {
		System.out.println("E 생성!!!");
	}
}

class F extends E{
	int f;
	F() {
		System.out.println("F 생성!!!");
	}
}


public class _02_상속2 {

	public static void main(String[] args) {
		
		F f = new F();
		
	}
}
