package com.wrapperClass.demo;

//convert object to primitative
public class UnboxingExample {
	 
	public static void main(String[] args) {
		//convert Integer to int
		
		@SuppressWarnings("removal")
		Integer a=new Integer(10);
		int i=a.intValue();//convert integer to int
		int j=a;//unboxing
		System.out.println(a+" "+i+" "+j);
	}
}