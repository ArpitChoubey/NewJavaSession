package StringManipulation;

import java.util.Arrays;

public class StringMetSplit {

	public static void main(String[] args) {
		
		
		String K= "JAVA_PYTHON_RUBY_VBSCRIPT_SCALA";
		String c[]= K.split("_");
		System.out.println(c[0]);
		System.out.println(c[2]);
		System.out.println(Arrays.toString(c));
		
	
		String d = "xXXXJAVAXxXXXXXPYTHONxxxxXXSELENIUM";
		String h[]= d.split("xXX");
		System.out.println(h[2]);
		System.out.println(h[0].length());
		System.out.println(h[3]);
		System.out.println(Arrays.toString(h));
		
		String emp= "Madhav|Singh|QA|SDET|India|PUNE";
		String t[]= emp.split("\\|");
		for (String f: t) {
			System.out.println(f);
		}
		
		String a = "200A";
		String  b= a.replace("A", "");
		System.out.println(a+25);
		// int b = Integer.parseInt(a);// string into int 
		System.out.println(b+25);
		int z = Integer.parseInt(b);
		System.out.println(z+25);
		
		// int to string 
		
		int h1 = 9090;
		System.out.println(h1+10);
		String x = String.valueOf(h1);
		System.out.println(x+30);
		
	}

}
