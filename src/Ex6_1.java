
public class Ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t;  // TV인스턴스를 참조하기 위한 변수 t를 선언
		t = new TV(); // TV인스턴스를 생성한다.
		t.channel = 7; // TV인스턴스의 멤버변수 Channel의 값을 7로 한다.
		t.channelDown(); // TV인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
	}
}
class TV {
	//TV의 속성(멤버변수)
	String color; // 색상
	boolean power; // 전원상태(ON/OFF)
	int channel; // 채널
	
	// TV의 기능(메서드)
	void power() {power = !power;} // TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel;} // TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel;} // TV의 채널을 낮추는 기능을 하는 메서드
}
