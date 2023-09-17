package USMedical;

public class TestMed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		USMed m = new USMed();
		m.emergenceservice();
		m.dentalservice();
		m.lungservice();
		m.Covid();
		m.billing();
		System.out.println(m.a);
		
		System.out.println("----------------------------------------");
	
		
		
		UKMed d = new USMed();
		d.dentalservice();
		d.emergenceservice();
		

	}

}
