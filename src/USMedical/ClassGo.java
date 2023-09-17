package USMedical;

public class ClassGo {

	public static void main(String[] args) {
		
		Page P = new Page();
		P.CalculatePageLoadTimeout();
		P.displaylogo();
		P.gettitle();
		P.url();
		P.Forget();
		P.Forget(20);
		
		
		System.out.println("-------------------------------------------");
		Title T = new Page();
		T.CalculatePageLoadTimeout();
		T.displaylogo();
		T.Forget();
		T.Forget(30);

	}

}
