package Practice.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	
	/*
	 * An object that maps keys to the values. A map cannot contain duplicate keys,
	 * 		each key can map to at most one value
	 * 
	 * Some map implementation, like the TreeMap class, make specific guarantees as
	 * 	 to their order 
	 * 			~ others, like the HashMap class --> do not !!!
	 * 
	 * 		TreeMap: it is sorted
	 * 		HashTable: it is synchronized + it is slow !!!
	 * 		HashMap: is not synchronized
	 * 			HashTable does not allow null keys or values, HashMap allow one null key and
	 * 				 any number of null values
	 * 
	 * Hashfunction -> ~ O(1)
	 * 
	 */
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>() ;
		
		map.put("Adam", 23) ;
		map.put("Kevin", 33) ;
		map.put("Anna", 12) ;
		
		System.out.println(map.get("Kevin"));
	}

}
