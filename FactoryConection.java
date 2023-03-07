import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FactoryConection <K,V>{
    public Map<K,V> FactoryMaps(int value){
		
		Map<K,V> typeMap = null;
		switch(value){
			case 1:
				// HashMap
				typeMap = new HashMap<K, V>();
				break;
			case 2:
				// TreeMap
				typeMap = new TreeMap<K, V>();
				break;
			default:
				// LinkedHashMap
				typeMap = new LinkedHashMap<K, V>();
				break;
		}
		return typeMap;
		
	}
}
