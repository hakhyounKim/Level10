package 추상_개념2;

public class MyCafe extends MyBrand{

	public static String getSlogan() {
		return String.format(SLOGAN, "학현 커피");
	}
	
	private static int myNum = 0;
	private boolean isTakeout;
	
	public MyCafe(String name, boolean isTakeout) {
		super(++myNum, name);
		this.isTakeout = isTakeout;
	}

	@Override
	public void takeOrder() {
		System.out.printf("학현 커피 %s커피를 주문했습니다. " , super.info());
		System.out.println((isTakeout? "테이크아웃 하시겠습니까? " : "매장에서 드시겠습니까? "));
	}

}
