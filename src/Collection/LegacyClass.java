package Collection;

import java.util.Stack;
import java.util.Vector;

public class LegacyClass {

	public static void main(String[] args) {
		
		Vector V = new Vector(10);
		V.add(65);
		V.add(9895);
		V.add(9895);
		V.add("Ram");
		V.addAll(V);
		V.addElement(null);
		V.addElement(null);
		V.add(65);
		V.add(9895);
		V.add(9895);
		V.setElementAt("RAKESH", 0);
		
		V.add(65);
		System.out.println(V.firstElement());
		System.out.println(V.lastElement());
		System.out.println(V.capacity());
		System.out.println(V);
		
		Stack S = new Stack();
		S.add(52);
		S.push("Tiger");
		
		S.add(99);
		S.push("Tiii");
		
		S.add(5236);
		S.push("Tigerkll");
		System.out.println(S);
		System.out.println(S.peek());
		System.out.println(S.empty());
		System.out.println(S.pop());
		System.out.println(S.search(52));
		
		
		
		

	}

}
