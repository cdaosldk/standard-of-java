import java.util.*;

public class Ex12_2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
//			Student s = (Student)it.next(); 제네릭스를 사용하지 않으면 형변환 필요.
			Student s = it.next();
			System.out.println(s.name);
			// == System.out.println(it.next().name);
			// 제네릭스 덕분에 형변환을 하지 않아도 되어 간소화 가능
		}
	} // main

	class Student {
		String name = "";
		int ban;
		int no;
	
		Student(String name, int ban, int no) {
			this.name = name;
			this.ban = ban;
			this.no = no;
		}
	}
}
