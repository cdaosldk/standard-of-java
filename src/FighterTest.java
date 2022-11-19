abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다.");
	}
}
	
interface Fightable {
	void move(int x, int y); // public, abstract가 생략됨
	void attack(Fightable f); // public, abstract가 생략됨
}

class Fighter extends Unit2 implements Fightable {
	public void move(int x, int y) { // 오버라이딩 규칙: 조상보다 접근 제어자가 좁으면 안된다
		System.out.println("[" + x +"," + y + "]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
	
	Fightable getFightable() { // 싸울 수 있는 상대를 불러온다
		Fighter f = new Fighter(); // Fighter를 생성해서 반환
		return (Fightable)f;
	}
}
public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter(); // == Fightable f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter()); // == Fighter f2 = new Fighter(); f.attack(f2);

	}
}
