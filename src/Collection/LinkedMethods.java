package Collection;

import java.util.LinkedList;

public class LinkedMethods {

	public static void main(String[] args) {
		
		LinkedList LI = new LinkedList();
		LI.add("HTR");
		LI.add("Deepak");
		LI.add("Deepak");
		LI.add(null);
		LI.add(100);
		LI.addAll(LI);
		LI.remove(1);
		System.out.println(LI);
		System.out.println(LI.size());
		LI.removeFirst();
		System.out.println(LI);
		System.out.println("-----------------------------");
		System.out.println(LI.lastIndexOf(0));
		System.out.println(LI.indexOf(1));
		

	}

}
