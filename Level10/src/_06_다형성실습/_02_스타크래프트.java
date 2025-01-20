package _06_다형성실습;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;

/*
 Damage() 메소드를 가진 Interface Damageable 를 정의하고
 최하위 유닛들 (모든) 에게 Damageable 상속
 main에서 각각의 유닛들을 손상시킨 후 -> repair() 돌려보기
 */

interface Repairable {
}

interface Damageable {
	void attackOpUnit(Damageable unit, int power);
}

abstract class Unit implements Damageable {
	protected final int MAX_HP;
	protected int hp; // 체력
	protected int damage; // 공력력
	protected String name; // 이름
	private static int cnt = 0; // 총 유닛의 갯수
	protected boolean dead; // 살았는지 죽었는지 확인

	public Unit(int hp, int damage) {
		MAX_HP = hp;
		this.hp = MAX_HP;
		this.damage = damage;
		cnt+=1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Unit(int hp, int damage, String name) {
		MAX_HP = hp;
		this.hp = MAX_HP;
		this.name = name;
		this.damage = damage;
		initMsg();
		cnt+=1;
	}

	private void initMsg() {
		System.out.println("[생성 ]" + this);

	}

	public static int getCnt() {
		return cnt;
	}

	@Override
	public void attackOpUnit(Damageable unit, int damage) {
		
		Unit opUnit = (Unit) unit;
		if(opUnit.dead) return;
		
		opUnit.hp -= damage;
		String msg = String.format("[%s가 %s - %d 데미지 공격]", this, opUnit, damage);
		System.out.println(msg);
		
		if(opUnit.hp <= 0) {
			opUnit.dead = true;
			cnt--;
		}
	}

	@Override
	public String toString() {
		return String.format("%s (%d / %d)", name ,hp, MAX_HP);
	}
}

abstract class GroundUnit extends Unit {

	public GroundUnit(int hp, int damage) {
		super(hp, damage);
	}
}

abstract class AirUnit extends Unit {

	public AirUnit(int hp , int damage) {
		super(hp, damage);
	}
}

class Tank extends GroundUnit implements Repairable {

	public Tank() {
		super(250,35);
		name = "Tank";
	}
}

class Marin extends GroundUnit implements Repairable {

	public Marin() {
		super(80,5);
		name = "Marin";
	}
}

class Battlecruiser extends AirUnit implements Repairable {

	public Battlecruiser() {
		super(500,25);
		name = "Battlecruiser";
	}
}

class DropShip extends AirUnit implements Repairable {

	public DropShip() {
		super(200,5);
		name = "DropShip";
	}
}

class SCV extends GroundUnit implements Repairable {

	public SCV() {
		super(130,5);
		name = "SCV";
	}
}

class Zealot extends GroundUnit implements Repairable {

	public Zealot() {
		super(160,15);
		name = "Zealot";
	}
}

class Goliath extends GroundUnit implements Repairable {

	public Goliath() {
		super(125,25);
		name = "Goliath";
	}
}

class Dragoon extends GroundUnit implements Repairable {

	public Dragoon() {
		super(180,30);
		name = "Dragoon";
	}
}


public class _02_스타크래프트 {
	public static void main(String[] args) {
	
	//[문제] 10개 유닛 만들어서 서로 랜덤하게 공격하다가 한명 살아남을때까지 반복
		
	Random rd = new Random();	
	String[] units = {"Tank","Marin","Battlecruiser","DropShip","Zealot", "Goliath", "Dragoon"};
	
	String packageNmae = _02_스타크래프트.class.getPackageName()+"."; //풀경로 : 패키지 이름부터 시작한다
//	System.out.println(packageNmae);
	
	ArrayList<Unit> list = new ArrayList<Unit>();
	int size = 10;
	int cnt = 0;
	
	while(cnt != size) {
		try {
			Class<?> clazz = Class.forName(packageNmae + units[rd.nextInt(units.length)]);
			
			Object obj = clazz.getDeclaredConstructor().newInstance(); //new Tank();
			
			Unit unit = (Unit) obj;
			unit.setName(unit.getName()+(cnt+1));
			System.out.println(unit);
			list.add(unit);
			cnt++;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	Tank tank = new Tank();
//	Marin marin = new Marin();
//	tank.attackOpUnit(marin, 75);
	
	
	Unit winner = null;
	
	while(true) {
		if(Unit.getCnt() <= 1) break;
		int rdIdx1 = rd.nextInt(size);
		int rdIdx2 = rd.nextInt(size);
		if(rdIdx1 == rdIdx2) continue;
		
		if(list.get(rdIdx1).dead || list.get(rdIdx2).dead) {
			continue;
		}
		
		list.get(rdIdx1).attackOpUnit(list.get(rdIdx2), rd.nextInt(20)+10);
		if(list.get(rdIdx2).dead) {
			winner = list.get(rdIdx1);
			continue;
		}
		
		list.get(rdIdx2).attackOpUnit(list.get(rdIdx1), rd.nextInt(20)+10);
		
		if(list.get(rdIdx1).dead) {
			winner = list.get(rdIdx2);
			continue;
		}
	}
	
	System.out.println("==============================");
	System.out.println("최후의 승자 = " +winner);
	
	
	
	

	}
}
