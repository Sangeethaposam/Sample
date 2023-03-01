package com.bridzlabz.sample;

import java.util.*;

public class SetEx {

	public static void main(String[] args) {
		//Set<Integer> s = new LinkedHashSet<>();
		//Set<Integer> s = new HashSet<>();
		Set<Integer> s = new TreeSet<>();
          s.add(3);
          s.add(2);
          s.add(1);
          s.add(6);
          s.add(5);
          System.out.println(s);
	}

}
