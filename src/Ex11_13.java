import java.util.*;

public class Ex11_13 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for (int i = 0; i < set.size(); i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num); // set.add(new Integer(num));
		}
		System.out.println(set);
	}

}