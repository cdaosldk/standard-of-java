import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("현재 월을 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default:
		case 12: case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다.");
		}
		//또는 if문
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("현재의 계절은 봄입니다.");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("현재의 계절은 여름입니다.");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("현재의 계절은 가을입니다.");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.println("현재의 계절은 겨울입니다.");
		}
		scanner.close();
	} // main의 끝
}
