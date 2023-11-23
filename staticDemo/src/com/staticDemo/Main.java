package com.staticDemo;
class Calculator{
	   static int a=40;
	   static int b=20;
	   Calculator(){
		      System.out.println("Addition "+ (a+b));
	   }
	   static {
		      System.out.println("Multiplication "+a*b);
	   }
	   public static void div() {
		      System.out.println("Division "+a/b);
	   }
	   public class Main{
		   public static void main (String[]args) {
			     Calculator c=new Calculator();
			     Calculator.div();
		   }
	   }
}
