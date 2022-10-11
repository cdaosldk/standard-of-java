
public class gugu { 
	public void dan(int n) {
		for (int i = 1; i < 10; i++) {
			System.out.println(n * i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugu gugu = new gugu();// gugu 클래스의 객체 생성
		for (int i = 1; i < 10; i++) {
			gugu.dan(i); // 객체를 통해 dan 메소드를 호출
		}
	}
}
//static 메소드 gugu 클래스의 dan 메소드를 호출하려면 gugu 클래스의 객체를 먼저 생성한 후에
//그 객체의 메소드인 dan 메소드를 호출해야 한다. 하지만 dan 메소드를 main 메소드처럼 static으로 선언한다면
//다음과 같이 객체 생성없이 메소드 호출만으로 가능하다.
//