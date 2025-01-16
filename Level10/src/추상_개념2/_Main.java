package 추상_개념2;

public class _Main {

	public static void main(String[] args) {
		
		System.out.println(MyBakery.getSlogan()); 
		System.out.println(MyChicken.getSlogan()); 
		System.out.println(MyCafe.getSlogan());
		System.out.println("========================");
		
		MyBakery store1 = new MyBakery("구미", false);
		MyBakery store2 = new MyBakery("강남", true);
		MyChicken store3 = new MyChicken("홍대");
		MyChicken store4 = new MyChicken("강남");
		MyChicken store5 = new MyChicken("신촌");
		MyCafe store6 = new MyCafe("대치",true);
		MyCafe store7 = new MyCafe("청담",false);
		MyCafe store8 = new MyCafe("도산대로",false);
		
		store1.takeOrder();
		store2.takeOrder();
		System.out.println("========================");
		store3.takeOrder();
		store4.takeOrder();
		store5.takeOrder();
		System.out.println("========================");
		store6.takeOrder();
		store7.takeOrder();
		store8.takeOrder();
		
//		MyBrand[] myStores = {store1, store2, store3, store4, store5, store6, store7, store8};
//		for(MyBrand store : myStores)
////			MyBakery mystore = (MyBakery)store;
//			if(store instanceof MyBakery) {
//				MyBakery mystore = (MyBakery)store;
//				store.takeOrder(); 
//			}
			
	}
}
