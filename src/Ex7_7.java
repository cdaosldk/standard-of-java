
public class Ex7_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = new FireEngine();
		
		fe.water();
		car = fe; //car = (Car)fe;에서 형변환이 생략됨
		//car.water(); 컴파일 에러, Car 타입 참조변수로는
		//water()를 호출할 수 없다
		fe2 = (FireEngine)car; // 자손타입 ← 조상타입. 형변환 생략 불가
		fe2.water();
	}
}

class Truck {
	String color;
	int door;
	
	void drive() { // 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	
	void stop() { // 정지하는 기능
		System.out.println("stop!");
	}
}

class FireEngine extends Truck { // 소방차
	void water() {
		System.out.println("water!!!!");
	}
}
