package Javasession;

import java.util.ArrayList;
import java.util.Arrays;

public class Concept {
	
	// Method Overloading-
	
	public void test() {
		System.out.println("Test Method");
	}
	
	public void test(double d) {
		System.out.println(d);
	}
	
	public void test(int a) {
		System.out.println("Test Method");
	}
	
	public void test(String a, int b) {
		System.out.println(a+b);
	}
	
	public void test(int a,String b) {
		System.out.println(a+b);
	}
	
	public void test(String a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		int[] p = {1,4,5,2,3,22,31,2};
		
		int q [] = new int [p.length-1];
		
		int count = 0;
		
		for (int e : p) {
			if (!(e == 22)) {
				q [count]=e;
				count++;
				}
		}
		
		System.out.println(Arrays.toString(q));
		
		ArrayList<String> emplist = new ArrayList<String>(Arrays.asList("Tom","Vikrant","Rohit"));
		emplist.add("Navvn");
		emplist.trimToSize();
		System.out.println(emplist);
		
		for (int i =1; i<=100; i++) {
			System.out.println(i);
			if (i%7 == 0) {
				System.out.println("See You Tomorrow");
			}
		}
		

	}

}
