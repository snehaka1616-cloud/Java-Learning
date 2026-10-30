package com.sneha.java;
import java.util.HashSet;
public class hashset{
	public static void main(String args[]) {
		HashSet<String> tags = new HashSet<>();
		tags.add("java");
		tags.add("collection");
		tags.add("exception");
		
		for(String tag: tags) {
			System.out.println(tag);
		}
	}

}
