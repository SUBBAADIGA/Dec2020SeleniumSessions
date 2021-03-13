package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class ToprintallValuesfromHashmap {

	public static void main(String[] args) {
		
		
		Map<String, String> credmap=new HashMap<String,String>();
		credmap.put("Admin", "admin@test.com:test@123");
		credmap.put("Customer", "customer@test.com:test@124");
		credmap.put("Vendor", "vendor@test.com:test@126");
		credmap.put("Manager", "manager@test.com:test@128");
		credmap.put("USER", "subrahmanya.adiga@symphonysummit.com:test@123");
		
		for(Map.Entry<String, String> ent:credmap.entrySet())
		{
			System.out.println("Key"+"--"+ent.getKey()+"--"+"Value"+" "+ent.getValue());
		}

	}

}
