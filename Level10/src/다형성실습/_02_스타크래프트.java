package 다형성실습;

/*
 Damage() 메소드를 가진 Interface Damageable 를 정의하고
 최하위 유닛들 (모든) 에게 Damageable 상속
 main에서 각각의 유닛들을 손상시킨 후 -> repair() 돌려보기
 */

interface Repairable{
	
}

interface Healable{
	
}

class Unit {
	final int MAX_HP;
	int hp;
	
	
	public Unit(int hp) {
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class GroundUnit extends Unit {

	public GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {

	public AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {

	public Tank(int hp) {
		super(250);
	}

	@Override
	public String toString() {
		return String.format("Tank (%d / %d)", hp, MAX_HP);
	}
}

class Marin extends GroundUnit {

	public Marin(int hp) {
		super(120);
	}

	@Override
	public String toString() {
		return String.format("Soldier (%d / %d)", hp, MAX_HP);
	}
}

class Battlecruiser extends AirUnit implements Repairable {

	public Battlecruiser(int hp) {
		super(500);
	}

	@Override
	public String toString() {
		return String.format("Battlecruiser (%d / %d)", hp, MAX_HP);
	}
}

class DropShip extends AirUnit implements Repairable {

	public DropShip(int hp) {
		super(200);
	}

	@Override
	public String toString() {
		return String.format("DropShip (%d / %d)", hp, MAX_HP);
	}
}

class SCV extends GroundUnit implements Repairable {

	public SCV(int hp) {
		super(hp);
	}

	@Override
	public String toString() {
		return String.format("SCV (%d / %d)", hp, MAX_HP);
	}
}

public class _02_스타크래프트 {

	//10개 유닛 만들어서 서로 랜덤하게 공격하다가 한명 살아남을때까지 반복
}
