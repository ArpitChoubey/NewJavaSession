package OOPS_Inheritance;

public class BMW extends Car {
	
	// Method overriding -When you have method in a parent class and the same method in child class
	// with the Same name and return
	// with the same number of parameter and same sequence of parameter
	@Override
	public void Start() {
		System.out.println("Start Car------");
	}
	@Override
	public void Stop() {
		System.out.println("Stop Car-----");
	}
	
		public void Autoparking() {
			System.out.println("Auto ------- Car");
		}

		


}
