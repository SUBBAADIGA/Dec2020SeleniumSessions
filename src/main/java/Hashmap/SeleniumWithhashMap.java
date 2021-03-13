package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class SeleniumWithhashMap {

	public static void main(String[] args) 
	{
		
		//Hashmap--->> Key and value
		// Hashmap is a class implementing Map interface
		
		Map<String, String> m1=new HashMap<String, String>();
		
		m1.put("Name", "TOM");
		m1.put("Name", "RAM");
		m1.put("Name", "TOM"); //dublicate is allowed
		System.out.println(m1.get("Name")); //TOM
		System.out.println(m1.get("CITY")); //null
	}

}
