package StringManipulation;



public class StringImmutable {

	public static void main(String[] args) {
		 
		String s= "Selenium";
		String t = s + "Hello";
		System.out.println(t);
		System.out.println(s);
		
		String st = "Java";
		System.out.println(st + "Python");
		System.out.println(st);

		st= st + "Automation";
		System.out.println(st);
		
		StringBuilder sb = new StringBuilder("Testing");
		int i = 200;
		int j = 400;
		System.out.println(i==j);
		System.out.println("----------------------------");
		
		System.out.println(sb);
		sb.append("Automation");
		System.out.println(sb);
		
		String f = "                                        Arrange                             ";
		System.out.println(f.trim());
		
	}

}
