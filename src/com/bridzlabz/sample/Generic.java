package com.bridzlabz.sample;

import java.util.Iterator;
import java.util.LinkedList;

public class Generic<T> {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(20);
		list.add(10);
		list.add(30);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
