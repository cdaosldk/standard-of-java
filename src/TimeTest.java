
class Time {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if (isVaildhour(hour)) return; // alt + shift + m
		
		this.hour = hour;
	}
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isVaildhour(int hour) {
		return hour < 0 || hour > 23;
	}
	public int getHour() { return hour; };
}

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		//t.hour = -100 
		t.setHour(21); //hour의 값을 21로 변경
		System.out.println(t.getHour());
		t.setHour(100); // 100은 유효한 값이 아니므로 호출해도 변경 안됨
	}
}
