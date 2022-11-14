package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent { // 접근제어자가 public인 MyParent이므로 접근 가능
	public void printMembers() {
		// System.out.println(prv); // error, 범위이탈
		// System.out.println(dft); // error, 범위이탈
		System.out.println(prt); // ok, 자손클래스
		System.out.println(pub); // ok
	}
}
public class MyParentTest2 {
	public static void main(String[] args) {
		MyParent p = new MyParent();
		
		// System.out.println(p.prv); // error, 같은 클래스 아님
		// System.out.println(p.dft); // error, 접근 권한없음
		// System.out.println(p.prt); // error, 접근 권한없음
		System.out.println(p.pub); // ok
	}

}
