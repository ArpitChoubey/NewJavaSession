package Javasession;

import java.util.Arrays;

public class Arrayslimitation {

	public static void main(String[] args) {
		
		int product[] = new int[50];
		// limitation of Arrays 
		//1. size are fixed -static Array to overcome this problem , we need dynamic Array is Arraylist.
		//2. Similar type of data ,to overcome this problem and object array is required.
		// object is the class in Java
		
		Object emp[] = new Object[4];
		emp[0] = "Tom";
		emp[1] = 'A';
		emp[2] = 54.33;
		emp[3]= 3;
		System.out.println(Arrays.toString(emp));
		
		for (int i=0;i<emp.length;++i) {
		System.out.println(emp[i]);
		
		
		int a []= new int [4];
		a[0]=14;
		a[1]=67;
		a[2]=65;
		a[3]=43;
		for (int e : a) {// for each loop
			System.out.println(e);
			
			
		}
		}

	}

}
