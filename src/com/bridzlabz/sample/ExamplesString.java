package com.bridzlabz.sample;

import java.util.Scanner;

public class ExamplesString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "i am sangeetha";
		String str2 = "posam";
		String s2 = "";
	
		
      for(int i = str1.length()-1; i >= 0; --i) {
    	   s2 = s2 + str1;
    	    System.out.print(s2.charAt(i)); 
    	   }
      /* int i = str1.length()-1;
       while(i>=0)
       {
    	   s2 = s2 + str1;
   	    System.out.print(s2.charAt(i));
   	    --i;
       }*/
	}

}
