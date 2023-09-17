package USMedical;

public class Emp {
	
	String name;
	String city;
	int age;
	
	public void Emp() {
		
		System.out.println("Hello World ");
		
	}
	
	public Emp(String name, int age, String city) {
		
		this.name = name;
		this.age = age;
		this.city= city;
	}
	
	public Emp(String name, int i) {
		
		this.name = name;
		this.age= age;
	}
	
	public Emp(String name) {
         this("Arpit",45,"Bangalore");
		
		this.name = name;
		this.age = 60;
		this.city= "Pune";
	
		
	}
	

	
	

}
