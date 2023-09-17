package Javasession;

public class Employee {
	
	String name;
	int age;
	String city;
	int number;

	public static void main(String[] args) {
		
		Employee obj = new Employee();

		obj.name = "Tom";
		obj.age = 25;
		obj.city = "New York";
		obj.number = 95;
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.city);
		System.out.println(obj.number);
		System.out.println(obj.name +" "+ obj.number);
		
		Employee obj1 = new Employee();
		obj1.name = "Aman";
		obj1.age = 29;
		obj1.city = "LA";
		obj1.number = 90;
		obj= obj1;
		System.out.println(obj.name);
		// System.gc();// to call garbage collector and is not recommended but depends upon jvm
		
		
		
		
		

	}

}
