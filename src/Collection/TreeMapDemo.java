package Collection;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
	
		
		TreeMap T= new TreeMap();
		T.put(901, "Tior");
		T.put(908, "Tiore");
		T.put(971, "Tiorooo");
		T.put(909, "Tioriii");
		T.put(9078, "Tiorppp");
		T.putAll(T);
		System.out.println(T.ceilingEntry(909));
		System.out.println(T);
		System.out.println(T.size());
		System.out.println(T.firstKey());
		System.out.println(T.floorKey(908));
		System.out.println(T.higherKey(909));
		System.out.println(T.keySet());
		System.out.println(T.pollFirstEntry());
		System.out.println(T.subMap(901, 9078));
		
		

	}

}
