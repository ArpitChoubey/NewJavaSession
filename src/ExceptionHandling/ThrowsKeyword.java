package ExceptionHandling;

public class ThrowsKeyword {
	
	public void m1() {
		System.out.println("Jio");
		m2();
	}
	
	public void m2() {
		System.out.println("Jio");
		try {
		m3();
		}
		catch(Exception E) {
			System.out.println("Exception is coming ------");
		}
	}
	
	public void m3() throws Exception {
		System.out.println("Jio");
		int i =5/0;
	}

	public static void main(String[] args) {
		ThrowsKeyword b= new ThrowsKeyword();
		b.m1();
		
		System.out.println("Jio Cinema");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("IE is coming");
			e.printStackTrace();
		}
         
		System.out.println("Jio World");
	}

}
