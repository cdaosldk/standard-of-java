
public class Ex2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 5;
		System.out.println("x="+x);
		System.out.println("y+"+y);
		
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x="+x);
		System.out.println("y="+y); //x의 값을 tmp로 옮긴 후 y값을 x로 저장, tmp값을 y로 저장하면 x와 y값을 바꿀 수 있다.
	}

}
