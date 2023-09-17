package Javasession;

public class Browsers {
	
	String Name;
	static String hq = "Bangalore";
	
	public int getBrowserVersion() {
		System.out.println("Get Browser Version");
		return 110;
	}
	public static String getBrowser() {
		System.out.println("Get Browser Vendor");
		return "Chrome";
	}
    
	public static void main(String[] args) {
		
		Browsers b = new Browsers();
		b.getBrowserVersion();// call by value
		Browsers.getBrowser();// class name for static properties
		// b.getBrowser();
		
		

	}

}
