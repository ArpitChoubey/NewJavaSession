package BuilderPattern;

public class TestAbc {

	public static void main(String[] args) {
		
		Shopping sh = new Shopping();
		sh.login().search().loginapp(20).logout();// method in a chain is a builder pattern and useful in E-commerce Project and Page object Model (POM)
 
		
		sh.login().logout();
		
	}

}
