class Ex7_13 {
	class InstanceInner {}
	static class StaticInner {}
	
	// 인스턴스 멤버간엔 서로 직접 접근이 가능
	InstanceInner iv = new InstanceInner();
	// static 멤버 간엔 서로 직접 접근이 가능
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		// static 멤버는 인스턴스멤버에 직접 접근할 수 없다.
		// InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		// 굳이 접근하려면 아래와 같이 객체를 생성해야한다.
		// 인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성할수 있다.
		Ex7_13 outer = new Ex7_13();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		// 인스턴스 메서드에서는 인스턴스 멤버와 static멤버 모두 접근가능하다
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		// 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
		// LocalInner iv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}
