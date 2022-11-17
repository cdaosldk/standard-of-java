abstract class Player { // 추상클래스(미완성 설계도)
	abstract void play(int pos); // 추상메서드(구현부, 즉 몸통이 없는)
	abstract void stop();
}

// 추상클래스는 상속을 통해 완성해야 객체 생성가능

class AudioPlayer extends Player { // 상속받은 자식클래스는 조상의 추상메서드를 전부 구현해야 한다!
	void play(int pos) {System.out.println(pos + "위치부터 play합니다"); }
	void stop() {System.out.println("재생을 멈춥니다"); }
}


public class PlayerTest {
	public static void main(String[] args) {
//		Player p = new Player(); // 추상 클래스의 객체를 생성
		Player ap = new AudioPlayer(); // 다형성, 조상이 호출해도 사용가능
		ap.play(100);
		ap.stop();
	}

}
