package com.bridzlabz.sample;

import java.util.ArrayList;
import java.util.Arrays;

public class SampleEx {
          public void countingCharacters(ArrayList<String>  list,char[] arr) {
        	  
        	  int count = 0;
        	  for(String s : list)
        	  {
        		 
        	  for(int i = 0;i < s.length();i++ ) {
        		 for(int j = 0;j < arr.length; j++ ) {
        		  if( Character.toUpperCase(arr[j]) == Character.toUpperCase( s.charAt(i)))
        		  {
        			
        			  count++;
        		  }
        		 
        	  }
        	  
        	 }
        	 
           }
        	 System.out.println(count);
        	  
          }
	public static void main(String[] args) {
		SampleEx ex = new SampleEx();
		ArrayList<String> list = new ArrayList<>();
            list.addAll(Arrays.asList("Sangeetha","Geetha","Chitti","Sreemai","Suma"));
            System.out.println(list);
            char[] arr = {'A','s','I','o','E','U'};
             
            ex.countingCharacters(list, arr);
	}

}
