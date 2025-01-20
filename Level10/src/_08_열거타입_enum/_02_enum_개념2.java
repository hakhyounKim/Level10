package _08_열거타입_enum;

class Button2 {
	
	enum Mode {
		LIGHT, DARK
	};

	enum Space {
		SINGLE, DOUBLE
	};
	
	
	private Mode mode = Mode.LIGHT;
	private Space space = Space.SINGLE;
	
	public void changeMode() {
		mode = mode == Mode.LIGHT? Mode.DARK : Mode.LIGHT;
	}

	public Mode getMode() {  //=> 일반 클래스처럼 사용 가능
		return mode;
	}

	public void setMode(Mode Mode) {
		this.mode = Mode;
	}

	public Space getSpace() {
		return space;
	}

	public void setSpace(Space Space) {
		this.space = Space;
	}
}



public class _02_enum_개념2 {
	public static void main(String[] args) {
		
		Button2 btn2 = new Button2();
		System.out.println(btn2.getMode());
		System.out.println(btn2.getSpace());
		btn2.setSpace(Button2.Space.DOUBLE);
		System.out.println(btn2.getSpace());
	}
}
