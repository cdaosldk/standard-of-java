
public class Ex7_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();		
	}
}
class Parent { int x = 10; /* super.x */ }

class Child extends Parent {
	int x = 20; // this.x
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.=" + super.x);
	}
}
