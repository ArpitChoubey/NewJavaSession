package OOPS_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW h = new BMW();
		h.Start();
		h.Stop();
		h.Refuel();
		h.Autoparking();
		h.Autorefuel();
		h.engine();
		
		System.out.println("-----------------------------------");
		
		Car c= new Car();
		c.Start();
		c.Stop();
		c.Refuel();
		c.Autorefuel();
		c.engine();

		System.out.println("-----------------------------------");
		
		Car c1 = new BMW();// Top/Up Casting - child class object can be referred by parent class ref variable 
		// Top Casting - can be accessed only inherited and overridden methods 
		// down casting - parent class object can be referred by child class ref variable and is not allowed (Class Cast Exception){BMW b =(BMW)new Car();}
		c1.Start();
		c1.Stop();
		c1.Refuel();
		c1.engine();
		c1.Autorefuel();
		c1.engine();
		// c1.Autoparking();ref type checked is failed - not allowed 
	}

}
