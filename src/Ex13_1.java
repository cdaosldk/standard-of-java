
public class Ex13_1 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r); // 생성자 Thread(Runnable Target)
		
		t1.start();
		t2.start();
	}

}

class ThreadEx1_1 extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(getName()); // 조상인 Thread 클래스의 getName 메서드 호출
		}
	}
}

class ThreadEx1_2 implements Runnable { // Runnable ~ 쓰레드를 만드는 데 사용됨
	public void run() {
		for (int i = 0; i < 5; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다
			System.out.println(Thread.currentThread().getName());
		}
	}
}