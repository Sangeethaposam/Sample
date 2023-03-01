package com.bridzlabz.sample;

import java.util.ArrayList;
import java.util.Arrays;

public class Example2 {
	public void searchString(ArrayList<String> list ) {
		ArrayList<String> list2 = new ArrayList<>();
	for(String s : list) {
		String str = "MeNt";
	
		for(int i = 0; i < s.length(); i++) {
			
			if(str.toUpperCase() == Character.toUpperCase(s.charAt(i))) {
				if(s.contains(str))
					list2.add(s);
			}	
		}
	}
	System.out.println(list2);
	}
	public static void main(String[] args) {
		Example2 ex = new Example2();
		ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Enjoyment", "Mentor", "Joy", "Employment"," Mental", "Payment", 
      		  "Sentimental", "Fundamentals"));
          ex.searchString(list);
	}

}
