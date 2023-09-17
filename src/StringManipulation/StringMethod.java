package StringManipulation;

public class StringMethod {

	public static void main(String[] args) {
		
		String G = "Hello World I am so happy This is my new home";
		int len= G.length();
		System.out.println(len);
		System.out.println(G.charAt(15));
		// System.out.println(G.charAt(20));// StringIndexOutOfBoundsException
		System.out.println(G.indexOf("T"));
		System.out.println(G.indexOf("i"));
		System.out.println(G.indexOf("i",G.indexOf("i")+1 ));
		System.out.println(G.indexOf("happy"));
		
		String m= " Welcome Admin";
		if(m.indexOf("Admin")==0) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		System.out.println("---------------------------------------------------");
	
	String y = " I am    looking      out  for a change";
	System.out.println(y.trim());
	System.out.println(y.replace("   ", ""));
	System.out.println(y.toUpperCase());
	System.out.println(y.toLowerCase());
	System.out.println(y.contains("out"));
	
	String dob = "01-09-1990";
	System.out.println(dob.replace('-','/'));
			
	
	String h= "              FIREFOX                ";
	if (h.trim().equalsIgnoreCase("firefox")) {
		System.out.println("Pass");
	}
	}
		

	}



