import java.util.*;

public class Ex11_3 {
	public static void main(String[] args) {
		Stack st = new Stack();
		String expression = "((3+5)*8-2)"; 
		//여는 괄호일때 스택 쌓기, 닫는 괄호에서 스택 꺼내기
		
		System.out.println("expression : " + expression);
		
		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if( ch == '(') {
					st.push(ch + "");
				} else if (ch == ')') {
					st.pop();
				}
			}
			
			if(st.isEmpty()) {// 괄호의 대칭이 맞다면
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e){
			System.out.println("괄호가 있지 않습니다.");
		}
	}
}
