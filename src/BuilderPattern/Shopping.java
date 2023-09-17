package BuilderPattern;

public class Shopping {
	
	public Shopping login () {
		System.out.println("Login to app ");
		return this;// void will replace to current class object (Shopping)
	}

	
	public Shopping loginapp (int a) {
		System.out.println("ABCLogin to app ");
		return this;
	}
	
	public Shopping search () {
		System.out.println("XYZLogin to app ");
		return this;
	}
	public Shopping logout () {
		System.out.println("logout to app ");
		return this;
	}
	
}

