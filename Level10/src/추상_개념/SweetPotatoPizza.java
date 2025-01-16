package 추상_개념;

public class SweetPotatoPizza extends Pizza{

	SweetPotatoPizza(int pirce, String brand) {
		super(pirce, brand, "고구마 피자");
	}

	@Override
	void putTopping() {
		System.out.println("고구마 토핑!!!");
		
	}
	
	
}
