import java.util.Arrays;

public class arraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr= { "가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr)); //toString: 배열을 문자열로 반환한다
		
		for(int i = 0; i < 10; i++) {
			int tmp = (int)(Math.random()*3);
		System.out.println(strArr[tmp]);
		}
	}

}
