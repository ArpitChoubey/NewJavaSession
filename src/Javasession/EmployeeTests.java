package Javasession;

public class EmployeeTests {
	
	String name1;
	int b;
	
	
	public EmployeeTests(int a) {
		this.b=a;
	}
	public EmployeeTests(String name ) {
		this.name1= name;
		
	}
	public EmployeeTests(int a, String name ) {
		
	}
	

	public EmployeeTests(String name1, int b) {// source then constructor feature right click
		
		this.name1 = name1;
		this.b = b;
	}
	public static void main(String[] args) {
		
		EmployeeTests b1 = new EmployeeTests(20);
		System.out.println(b1.b);
		
		EmployeeTests c1 = new EmployeeTests("Tom");
		System.out.println(c1.name1);
		
		EmployeeTests d = new EmployeeTests("Tom",25);
		System.out.println(d.name1);
		System.out.println(d.b);
	
		

	}

}
