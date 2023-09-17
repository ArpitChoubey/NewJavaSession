package Javasession;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		System.out.println(a==b);
		
		if (a==b) {
			System.out.println("hello");
		}
		else {
			System.out.println("Jio");
		}
		
		boolean flag = true;
		if (flag) {
			System.out.println("Hi Selenium");
		}
		else {
			System.out.println(" Now Selenium 4.0");
		}
		
		String browser = "Firefox";
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
		case "Opera":
			System.out.println("Launch Opera");
			break;
		case "IE":
			System.out.println("Launch IE");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;

		default:
			System.out.println("Launch Jio Cinema");
			break;
		}
		
		String browser1 = "Chrome   ";
		switch (browser1.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch chrome");
			 break;
		case "Opera":
			System.out.println("Launch Opera");
			 break;
		case "IE":
			System.out.println("Launch IE");
			 break;
		case "safari":
			System.out.println("Launch safari");
			 break;

		default:
			System.out.println("Launch Jio Cinema");
			break;
		}
		
		String envname = "   UAT      ";
		switch (envname.toLowerCase().trim()) {
		case "uat":
			System.out.println(" Pass the uat");
			break;
		case "dev":
			System.out.println(" Pass the dev");
			break;
		case "t":
			System.out.println(" Pass the t");
			break;
		case "prodt":
			System.out.println(" Pass the prodt");
			break;
		default:
			System.out.println("pass the last line as jio");
			break;
		}
		
	} 


}
	
		
		// if (true) { // dead code
		//	System.out.println("hi selenium");
		//}
		// else {
		//	System.out.println(" Bye Selenium");
//}
	
	

