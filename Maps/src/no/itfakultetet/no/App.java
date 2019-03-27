package no.itfakultetet.no;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("Ola", "Mann");
		map1.put("Petter", "Mann");
		map1.put("Kari", "Kvinne");
		map1.put("Eva", "Kvinne");
		
		System.out.println("Ola er en " + map1.get("Ola"));
		System.out.println("Kari er en " + map1.get("Kari"));
		System.out.println(map1);
		
		// print ut med forbedret for-løkke 
		for (String key : map1.keySet()) {
			System.out.println(key + " er en " + map1.get(key));
				
		}
	
		System.out.println("------------");
		map1.entrySet().forEach(System.out::println);
		
		// med forEach
		map1.forEach((k,v) -> System.out.println(k + " er fremdeles en forbanna " + v));
		
		map1.
		entrySet()
		.stream()
		.filter(x -> x.getValue().contains("Kvinne"))
		.forEach(System.out::println);
		
		
		TreeMap<String, String> tre1 = new TreeMap<>();
		tre1.put("Dagros", "ku");
		tre1.put("Litago", "ku");
		tre1.put("Julius", "ape");
	
		System.out.println("tre1: "+tre1);
		
		Map<String,String> map2 = Map.of("Dagros", "Ku", "Litago", "Ku", "Julius", "ape");
		System.out.println("map2: "+map2);
		
		
	
	}

}
