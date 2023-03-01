package com.bridzlabz.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CollectionEx {

	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(4, "sangeetha");
		m.put(1,"posam");
		m.put(3,"reddy");
		m.put(2,"geetha");
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.containsKey(2));
		System.out.println(m.get(4));
		System.out.println(m.getOrDefault(1, "geetha"));
		//System.out.println(m.merge(3, "reddy", "ry"));
		Set set = m.entrySet();
		Iterator itr =  set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
 	}

}
