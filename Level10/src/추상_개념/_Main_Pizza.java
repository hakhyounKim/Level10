package 추상_개념;

import java.util.ArrayList;

public class _Main_Pizza {

	public static void main(String[] args) {
		
		PizzaService service = new PizzaService();
		
		ArrayList<Pizza> orderList = new ArrayList<Pizza>();
		
		// 업캐스팅
		orderList.add(new SweetPotatoPizza(12000, "피자헛"));
		orderList.add(new BulgogiPizza(10000, "일인피자"));
		orderList.add(new PineApplePizza(15000, "미스터피자"));
		orderList.add(new BulgogiPizza(10000, "도미노피자"));
		orderList.add(new SweetPotatoPizza(17000, "피자스쿨"));
		orderList.add(new PineApplePizza(20000, "한국피자"));
		
		service.orderPizzas(orderList);
		

	}

}
