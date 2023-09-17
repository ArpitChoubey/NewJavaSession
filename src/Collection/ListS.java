package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListS {

	public static void main(String[] args) {
		
		
		List L= new ArrayList();
		L.add("HH");
		
		L.add('h');
		L.add(10);
		L.add("KL Rahul");
		L.addAll(L);
		
		
		L.iterator();
		
		
		System.out.println(L.size());
		System.out.println(L);
		
		//Iterator itr=	L.iterator();
		
		//while(itr.hasNext()) {
		//	System.out.println(itr.next());
		}
		
	
	
	
	}


