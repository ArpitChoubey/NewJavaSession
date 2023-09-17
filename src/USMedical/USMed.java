package USMedical;

public class USMed extends WHO implements ForitsHRM,UKMed,IndMed  {
	
	int a = 20;

	@Override
	public void Bestservice() {
		System.out.println("Best");
		
	}

	@Override
	public void lungservice() {
		System.out.println("Lung Operation");
		
	}

	@Override
	public void eyesservice() {
		System.out.println("Eyes Operation");
		
	}

	@Override
	public void Xrayservice() {
		
		System.out.println("Eyes Operation");
		
		
	}

	@Override
	public void orthoservice() {
		
		System.out.println("ortho Operation");
	}

	@Override
	public void dentalservice() {
		System.out.println("dental Operation");
		
	}

	@Override
	public void Surface() {
		System.out.println("Cancer Operation");
		
	}

	@Override
	public void physicoservice() {
		System.out.println(" Operation");
		
		
	}

	@Override
	public void cardioservice() {
		System.out.println("Cardio Operation");
		
	}

	@Override
	public void emergenceservice() {
		System.out.println("emergence");
		
	}
    
	
	public void emeservice() {
		System.out.println("Jio");
		
	}

	@Override
	public void Covid() {
		System.out.println("Covid Jio");
		
	}
	
	public static void billing() {
		System.out.println("Test Bill");
	}

}
