import java.util.HashSet;

public class Ex11_11 {

	public static void main(String[] args) {
		HashSet<E> set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);

	}

}
// equals()와 HashCode()를 오버라이딩해야 HashSet()이 바르게 동작
class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() { return name + ":" + age; }
}