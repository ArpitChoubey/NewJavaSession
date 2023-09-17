package Javasession;

public class Incremental {
	static {
		System.out.println("Jio Network");
	}
	static {
		System.out.println("Airtel Network");
	}
	

	public static void main(String[] args) {
		
		
		int a = -98;
		int b = a++;
		
		System.out.println(a);
		System.out.println(b);
		
		int u = 5;
		int y = ++u;
		System.out.println(u);
		System.out.println(y);
		
		int w = -99;
		int q = ++w;
		System.out.println(w);
		System.out.println(q);
		
		int jio = -463;
		System.out.println(jio++);
		System.out.println(++jio);
		
		int jio1 = -99;
		int api = jio1--;
		System.out.println(jio1);
		System.out.println(api);
		
		int aa = 9;
		int bb = --aa;
		System.out.println(aa);
		System.out.println(bb);
		
		int s1 = -10000;
		int s2 = --s1;
		System.out.println(s1);
		System.out.println(s2);
		
		int s3 = 40;
		System.out.println(s3--);
		System.out.println(s3);
		
		int na = 1;
		int test = na++ + na++ + na++ + na++ + na++;
		System.out.println(test);
		

		
		
	}

}
