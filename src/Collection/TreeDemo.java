package Collection;

import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		
		
		TreeSet T = new TreeSet();
		T.add(220);
		T.add(50);
		T.add(252);
		T.add(352);
		T.add(152);
		T.add(452);
		T.addAll(T);
		T.remove(3);
		T.add(999899999);
		System.out.println(T.comparator());
		System.out.println(T);
		T.clear();
		System.out.println(T);
		
		

	}

}
