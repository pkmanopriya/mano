package com.arrayAddition;

public class ArrayPassing {
       public static void add(int[]a) {
    	      int sum=0;
    	      for(int i:a) {
    	    	  sum+=i;
    	      }
    	      System.out.println("Sum of Elements = "+sum);
       }
       public static void main(String[]args) {
               int arr[]= {34,64,78,12};
               add(arr);
       }
}
