package 추상_개념2;

public class MyChicken extends MyBrand{

	private static int MyNum = 0;
	
	public static String getSlogan() {
		return String.format(SLOGAN, "학현 치킨");
	}
	
	public MyChicken(String name) {
		super(++MyNum, name);
	}

	@Override
	public void takeOrder() {
		System.out.printf("학현 치킨 %s치킨을 주문했습니다. \n" ,super.info());
		
	}
	

}
