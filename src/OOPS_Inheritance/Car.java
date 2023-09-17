package OOPS_Inheritance;

public class Car extends Bus {
	
	public void Start() {
		System.out.println("Start Car");
	}

	public void Stop() {
		System.out.println("Stop Car-----");
	}
	
	public void Refuel() {
		System.out.println("Refuel--- Car");
	}
	
	private void Color() {
		System.out.println("Pink Color");// private  method -- cannot be overriden
	}
	
	public final void Service() {  
		System.out.println("Service Car"); // Final - is used to prevent inheritance and method overriding ,
	}
	
	public static void bill() {  
		System.out.println("billing Car");// Static method -- cannot be overriden and when u have a static method in parent class and have same in child class
	}
}
