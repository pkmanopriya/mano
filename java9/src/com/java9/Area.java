package com.java9;

public interface Area {
	public default void areaOfCircle(int r) {
		   System.out.print("Area Of Circle:");
		   System.out.println((double)3.14*r*r);
	}
	 public default void area(int l,int b,int base,int h) {
		   areaOfRectangle1(l,b);
		   areaOfRectangle1(base,h);
	 }
	 private void areaOfRectangle1(int l,int b) {
		   System.out.print("Area Of Rectangle:");
		   System.out.println(l*b);
	 }
	 private static void areaOfRectangle(int b,int h) {
		   System.out.print("AreaOfRectangle:");
		 System.out.println((double)0.5*b*h);
	 }
	 
}
	
