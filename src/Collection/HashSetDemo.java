package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		List L= new ArrayList();
		L.add("HH");
		
		L.add('h');
		L.add(10);
		L.add("KL Rahul");
		L.addAll(L);
		
		
		HashSet H= new HashSet();
		H.add(200);
		H.add("Aman");
		H.add(21);
		H.add(214566666);
		H.add("Anan0");
		H.add("Jio");
		H.addAll(L);
		System.out.println(H);
		System.out.println(H.isEmpty());
		System.out.println(H.hashCode());
		System.out.println(H.contains(null));
		System.out.println(H.iterator());
		
		
		

	}

}
