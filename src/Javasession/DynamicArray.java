package Javasession;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		ar.add(600);
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		//System.out.println(ar.get(9));// IndexOutOfBoundsException
		//System.out.println(ar.get(-1));// IndexOutOfBoundsException
		ar.add('M');
		ar.add("testing");
		ar.add("Begum");
		System.out.println(ar.size());
		System.out.println(ar.get(8));// load factory of Arraylist = physical capacity/current size by 2
		
		
		
		// Generic in Arraylist 
		ArrayList<String> browserlist = new ArrayList<String>();
		
		browserlist.add("Opera");
		browserlist.add("Safari");
		browserlist.add("Firefox");
		System.out.println("---");
		System.out.println(browserlist.size());
		System.out.println(browserlist.get(2));
		
		for (String e : browserlist) {
			System.out.println(e);
			
			ArrayList<Object> Empinfo = new ArrayList<Object>();
			Empinfo.add("Opera");
			Empinfo.add('M');
			Empinfo.add(200);
			System.out.println("---");
			System.out.println(Empinfo.size());
			System.out.println(Empinfo.get(2));
			
			for (Object f : Empinfo) {
				System.out.println(f);
				
			
		}
		
		
		
		
		
		
		
		

	}

}
}