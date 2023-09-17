package Javasession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraydesign {

	public static void main(String[] args) {
		
		ArrayList<String> emplist = new ArrayList<String>(Arrays.asList("Tom","Vikrant","Rohit"));
		emplist.remove(0);
		
		System.out.println(emplist.size());
		System.out.println(emplist.get(0));
		emplist.add(0, "Sachin");
	
		emplist.add(3, "Neelam");
		emplist.add(4, "Sarvin");
		System.out.println(emplist.size());
		System.out.println(emplist);
		emplist.remove(1);
		System.out.println(emplist.size());
		System.out.println(emplist);
		Collections.sort(emplist);
		System.out.println(emplist);
		Collections.reverse(emplist);
		System.out.println(emplist);
		
		int test[] = {4,5,66,88,99};
		 Arrays.sort(test);
	  System.out.println(Arrays.toString(test));
		
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		System.out.println(nums.size());
		
		ArrayList<String> emplist2 = new ArrayList<String>(Collections.nCopies(10, "IPHONE"));
		System.out.println(emplist2.size());
		System.out.println(emplist2);
		
		
				
		
		
		
	}

}


