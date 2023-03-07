//@author Ana Paula Hong 22731

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * The FactoryConection class is a generic class that returns a Map object of the type specified by the
 * value parameter
 */
public class FactoryConection <K,V>{
    public Map<K,V> FactoryMaps(int value){
		
		// Declaring a variable of type Map that is null.
        Map<K,V> typeMap = null;
		switch(value){
			case 1:
				// HashMap
				// Creating a new HashMap object and assigning it to the variable typeMap.
                typeMap = new HashMap<K, V>();
				break;
			case 2:
				// TreeMap
				// Creating a new TreeMap object and assigning it to the variable typeMap.
                typeMap = new TreeMap<K, V>();
				break;
			default:
				// LinkedHashMap
				// Creating a new LinkedHashMap object and assigning it to the variable typeMap.
                typeMap = new LinkedHashMap<K, V>();
				break;
		}
		return typeMap;
		
	}
}
