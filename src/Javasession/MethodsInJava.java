package Javasession;

public class MethodsInJava {
	
	public void EmpName() {
		System.out.println("Hello");
	}
	
	public void Amount() {
		System.out.println("Total Amount");
		
	}

	public String trainerName() {
		System.out.println("Trainer Name");
		String name = "Arpit";
		return name;
	}
	// Method Parameter - int a and int b.
	public int Multiply(int a, int b) {
		System.out.println("Multiplying of two numbers");
		int sum = a*b;
		return sum;
	}

	public static void main(String[] args) {
		
		MethodsInJava obj = new MethodsInJava();
		obj.EmpName();
		obj.Amount();
		String tr= obj.trainerName();
		System.out.println(tr);
		int fr= obj.Multiply(25, 4);// Arguments 
		System.out.println(fr-20);
		
		}
		
		
		
		
		



}
