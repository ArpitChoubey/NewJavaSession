package USMedical;

public abstract class Title {
	
	
	public void Forget() {
		System.out.println("Forget Password -------");
		
	}
	
	public void Forget(int i) {
		System.out.println("Forget Password -------"+i);
		
	}
	public abstract void gettitle();
	
	public abstract void url();
	
	public void CalculatePageLoadTimeout() {
		System.out.println("Page Load Timeout");
	}
	
	public final void displaylogo() {
		System.out.println("Display Logo");
	}
	

}
