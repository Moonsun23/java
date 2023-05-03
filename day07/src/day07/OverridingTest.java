package day07;

class Weapon{
	int fire() {
		return 1;									// 데미지 1을 가지는 매개변수 
	}
//	int fire(int damage) {
//		return damage;								// -> 메서드 오버로드
//	}
}
class Canon extends Weapon{							// override 조건: 정확하게 일치해야함
	@Override										//	(at을 붙이면 어노테이션이라고 함)	// 덮어쓰고있다는 것을 알려줌
	int fire() {
		return 10;
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		int weaponDamage= weapon.fire();
		System.out.println("Weapon의 데미지는 "+ weaponDamage);
		
		// 동적 바인딩 이라고 함...
		weapon= new Canon();
		int canonDamage=weapon.fire();
		System.out.println("Canon의 데미지는 "+ canonDamage);
	}
}
