import java.util.*;

public class Ex11_1 {

	@SuppressWarnings({ "rawtypes", "unchecked", "removal" })
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(6));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(8));
		
		ArrayList list2 = new ArrayList(list1.subList(3, 10));
		print(list1, list2);
		
		Collections.sort(list1); // list1와 list2를 정렬한다.
		Collections.sort(list2);
		print(list1.list2));
		
		System.out.println("list1.containsAll(list2):"
								list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 인덱스가 3인 곳에 A 추가
		print(list1, list2);
		
		list2.set(3, "AA"); // 인덱스가 3인 곳에 AA로 변경
		print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retain(list2):" + list1.retainAll(list2));
		
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i); // 인덱스 i인 곳에 저장된 요소를 삭제
		}
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}
}
