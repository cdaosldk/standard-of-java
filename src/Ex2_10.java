import java.util.Scanner;

public class Ex2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n", num);
		
		scanner.close(); //스캐너를 다 쓰면 닫아줘야 한다
	} 
}
