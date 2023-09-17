package Javasession;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int a []= new int [4];
		a[0]=14;
		a[1]=67;
		a[2]=65;
		a[3]=43;
		System.out.println(a[2]);
		// System.out.println(a[-1]);// ArrayIndexOutOfBoundsException.
		//System.out.println(a[5]);//ArrayIndexOutOfBoundsException
		
		int len= a.length;
		System.out.println(len);
		int hi= len-1;
		System.out.println(hi);
		
		for (int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
          System.out.println(Arrays.toString(a));
          
          String browser[] = {"chrome","IE","Firefox","Safari","Opera","Edge"};
          for (int k=0;k<browser.length;++k) {
        	  System.out.println(browser[k]);
        	  if (browser[k].equals("Opera")) {
        		  System.out.println("This is not working properly");
        		   
                		
        	  }
        	  
          }
          
	}

}

