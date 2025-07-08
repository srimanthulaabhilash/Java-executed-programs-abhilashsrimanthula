package com.Set.Collections;
import java.util.HashSet;

public class setDemo {

	public static void main(String[] args) {
		//set===> HashSet, LinkedHashSet,  Tree Set
		//HashSet ==> No duplicates, no insertion Order
		//LinkedHashSet==> No duplicates insertion Order yes
		//treeSet===>No duplicates, sorted data(ascending order) 
		HashSet<String> hs= new HashSet<String>();
		hs.add("abhilash");
		hs.add("bittu");
		hs.add("ammulu");
		hs.add("Bindhu");
		
		System.out.println(hs);
		String name = "tmato";
		char[] charname = name.toCharArray();
		HashSet<Character> hs2 = new HashSet<Character>();
		for(Character temp: charname) {
			hs2.add(temp);
		}
			System.out.println(hs2);
	}	

}


