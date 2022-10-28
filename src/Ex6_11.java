class Data_1 {
	int value;
	Data_1() {} //생성자가 하나도 없었기 때문에 컴파일러가 자동으로 생성해줌
}

class Data_2 {
	int value;
	
	Data_2() {} // 기본 생성자
	Data_2(int x) { // 매개변수가 있는 생성자
		value = x;
	}
}

public class Ex6_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile 에러발생 -> 생성자 이름에 문제있음
	}
}
