package _08_열거타입_enum;

import java.util.ArrayList;

public class _03_enum_개념3 {

	public static void main(String[] args) {
		
		ArrayList<PizzaMenu> list = new ArrayList<PizzaMenu>();
		list.add(PizzaMenu.CP);
		list.add(PizzaMenu.PP);
		list.add(PizzaMenu.SP);
		list.add(PizzaMenu.MP);
		list.add(PizzaMenu.HP);
		list.add(PizzaMenu.BP);

		for(PizzaMenu pizza : list) {
			System.out.println(pizza.getDesc());
		}
		System.out.println(" - - - - - - - - - -");
		for(PizzaMenu pizza : list) {
			System.out.println(pizza.name());
		}
		System.out.println(" - - - - - - - - - -");
		for(PizzaMenu pizza : list) {
			System.out.println(pizza.ordinal());
		}
		System.out.println(" - - - - - - - - - -");
		PizzaStore store = new PizzaStore();
		store.printAllMenus();
		System.out.println(" - - - - - - - - - -");
		
		store.takeOrder("마라피자");
		store.takeOrder("고구마피자");
	}

}
