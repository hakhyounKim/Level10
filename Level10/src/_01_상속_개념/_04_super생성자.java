package _01_상속_개념;

class Product{
	String name;
	int price;
	
	
	Product(String name, int price) {
//		super();
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}

/*
 	부모
 	this() => 자기 자신의 기본 생성자 호출
 	super() => 부모의 생성자 호출
 	
 	자식
 	this() => 자기 자신의 객체 주소 값
 	super() => 부모 객체의 주소 값
 */

class Fruit extends Product{
	
	String origin;

	Fruit(String name, int price, String origin) {
		super(name, price);
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Fruit " + super.toString() + " origin=" + origin + "]";
	}
}


public class _04_super생성자 {

	public static void main(String[] args) {

		Product meat = new Product("고기", 10000);
		Fruit banana = new Fruit("바나나", 2000, "필리핀");
		
		System.out.println(meat);
		System.out.println(banana);
		
		
	}

}
