package ExceptionHandling;

public class TryCatchBlock {
	
	String name;
	
	public static void main(String[] args) {
	
		TryCatchBlock obj= new TryCatchBlock();
		obj=null;
		try {
		obj.name="NAVEEN";
		}
		catch(Exception E) {
			System.out.println("NPE is coming");
		}
		
	System.out.println("A");
	System.out.println("AB");
	
	
	try {
	int i =9/0;
	}
	catch(ArithmeticException e) {
		System.out.println("AE is coming.....");
		// e.printStackTrace();
	}
		
		

	finally {
		System.out.println("Finally Block is coming");// multiple finally is not allowed after trycatch or try block and used in database while closing the DB connection
		//System.exit(1);// finally block will be exist 
	}
	
	
	System.out.println("BYE");
	System.out.println("HELLO");
	
	}
}
