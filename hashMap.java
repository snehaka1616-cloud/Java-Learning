package com.sneha.java;
import java.util.HashMap;
import java.util.Map;


public class hashMap {
	public static void main (String argd[]) {
		HashMap<String,Integer> scores = new HashMap<>();
		
		scores.put("Asha",90);
		scores.put("Rahul",78);
		
		for(Map.Entry<String,Integer> entry : scores.entrySet()){
		 System.out.println(entry.getKey()+ " :" + entry.getValue());
	}
				
  }

}
