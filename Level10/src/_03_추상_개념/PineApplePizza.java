package _03_추상_개념;

public class PineApplePizza extends Pizza{

	PineApplePizza(int pirce, String brand) {
		super(pirce, brand, "파인애플 피자");
	}

	@Override
	void putTopping() {
		System.out.println("파인애플 토핑!!!");
	}
	
	
}
