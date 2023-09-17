package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		
		Map M = new HashMap();
		M.put(101, "Jio");
		M.put(102, "Dhan");
		M.put(103, "DhanDhan");
		M.put(null,null);
		M.put(901, "JioJ");
		M.put(402, "Dhn");
		M.put(203, "DnDhan");
		M.putAll(M);
		M.put(901, "JioJio");
		System.out.println(M);
		System.out.println(M.size());
		System.out.println(M.containsKey(103));
		System.out.println(M.containsValue("Jio"));
		System.out.println(M.get(102));
		System.out.println(M.remove(103));
		M.replace(103, "Jio Cinema");
		System.out.println(M);
		
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		HashMap HM= new HashMap();
		HM.put(501, "Amit");
		HM.put(502, "Amrit");
		HM.put(503, "Akash");
		HM.put(504, "Anoop");
		HM.put(505, "Ajay");
		HM.put(506, "Anupe");
		HM.put(507, "Amt");
		HM.put(null, null);
		HM.putAll(HM);
		System.out.println(HM);
		System.out.println(HM.size());
		System.out.println(HM.containsKey(509));
		System.out.println(HM.containsValue("Amit"));
		System.out.println(HM.get(502));
		System.out.println(HM.isEmpty());
	
		Set S= HM.entrySet();
		System.out.println(S);
		
		HM.remove(507);
		System.out.println(HM);
		HM.clear();
		System.out.println(HM);
		
		
		

	}

}
