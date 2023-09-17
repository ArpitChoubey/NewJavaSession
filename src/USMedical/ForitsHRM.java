package USMedical;

public interface ForitsHRM  {
	
	int a = 20; // static and Final Variable in nature (Default)
	
public void Bestservice();
	
	public void lungservice();
	
	public void eyesservice();
	
	public void emergenceservice();
	
	public static void billing() {
		System.out.println("Test Bill");
		// we can have static method with method body after 1.8 jdk can not be overridden
	}
	default void Medical() {
		System.out.println("Standard Method");
		//default method with method body can be overridden after 1.8 jdk
		// default static is not allowed 
	}
	

}
