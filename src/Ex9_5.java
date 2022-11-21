class Card3 {
	String kind;
	int number;
	
	Card3() {
		this("SPADE", 1); // Card(String kind, int number);를 호출
	}
	
	Card3(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : " + kind + ", number : " + number;
		// Card3 인스턴스의 kind와 number를 문자열로 반환한다.
	}
}

public class Ex9_5 {
	public static void main(String[] args) {
		Card3 c1 = new Card3();
		Card3 c2 = new Card3("HEART", 10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
