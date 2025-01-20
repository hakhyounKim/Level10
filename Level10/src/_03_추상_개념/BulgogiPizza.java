package _03_추상_개념;

public class BulgogiPizza extends Pizza {

	BulgogiPizza(int pirce, String brand) {
		super(pirce, brand, "불고기 피자");
	}

	@Override
	void putTopping() {
		System.out.println("불고기 토핑 !!!");
		
	}
	
	
}
