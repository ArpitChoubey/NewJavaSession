package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Emumration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Vector v= new Vector();
		v.add(500);
		v.addAll(v);
		v.add(52552);
		v.add("Ram");
		
		//System.out.println(v);
		
		Enumeration E =v.elements();
		while(E.hasMoreElements()) {
			System.out.println(E.nextElement());
		}
		
		
		
		
		
		
	}

}
