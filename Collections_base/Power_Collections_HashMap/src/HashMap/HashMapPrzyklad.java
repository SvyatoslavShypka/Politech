package HashMap;

import java.util.HashMap;

public class HashMapPrzyklad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> HS = new HashMap<String, Integer>(); 
		
		HS.put("Tomasz", 2234);
		HS.put("Piotr", 5657);
		HS.put("Aneta", 1111);
		
		System.out.println(HS.get("Aneta"));
	}

}
