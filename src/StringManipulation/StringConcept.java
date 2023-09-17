package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {
		 
		String s = "Hello";
		String s1 = "Hello";
		String s2 = "Hello Jio";
		
		System.out.println(s==s1);
		System.out.println(s1==s2);
		
		System.out.println("-My\nName********\n*****is***\n**Arpit--------");
		
		
		String st1= new String("Hello Selenium");
		String st2= new String("World");
		System.out.println(st1.intern());
		
		System.out.println(st1==st2);
		System.out.println(s.equals(st1));
		
		String st3= new String();// 1 object will be created
		System.out.println(st3.length());
		
		

	}

}
