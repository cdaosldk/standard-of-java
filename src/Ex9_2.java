class Person {
	long id;
	private long obj;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id == ((Person)obj).id; 
		// obj가 Object이므로 id 값을 참조하기위해서는 Person으로 형변환이 필요하다.
		else
			return false;
		/*if(!(obj instanceof Person))
			return false;
		
		Person p =(Person)obj;
		
		return this.obj == p.id;*/
	}
	
	Person(long id) {
		this.id = id;
	}
}


public class Ex9_2 {
	public static void main (String args[]) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
	}
}
