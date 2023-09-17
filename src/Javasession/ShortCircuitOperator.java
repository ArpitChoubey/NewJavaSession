package Javasession;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		
		int a = 200;
		int b = 9500;
		int c = 900;
		int d = 9870;
		
		// && = Short circuit operator
		
		if (a>b && a>c && a>d) {
			System.out.println("a is greatest");
		}
		else if (b>c && b>d) {
			System.out.println("b is greatest");
			
		}
		else if (c>d) {
			System.out.println("c is greatest");
		}
		else {
			System.out.println("d is greatest");
		}
	}
	

}
