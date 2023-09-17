package Javasession;

public class LoopsConcept {

	public static void main(String[] args) {
		
		int i =1;
		while (i<=10) {
               System.out.println(i);
                ++i;
	}
		int a =0;
		int k=0;
		while (a<=10) {
               System.out.println(a);
                a= a+1;
	}
		while (true) {
			System.out.println("Welcome to Jio Cinema");
			if (k==3) {
			break;
			}
			k++;
			
		}
		int j= 0;
		for (j=1;j<=10;++j) {
			System.out.println(j);
			j=j+1;
			
			
		}
		for (char ch ='A';ch <='Z';ch++) {
			System.out.println(ch);
			System.out.println(ch +"="+(byte)ch);
			
			
		}
		int S = 0;
		for (S=0; S<=100; S++) {
			System.out.println("Naveen");
		}
		int e= 1;
		do {
			System.out.println(e);
			e++;
			break;
			
		} 
		while (e<=10);
}
	
	
	
}