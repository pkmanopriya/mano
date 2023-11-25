package com.stringbuilderbuffer;

public class Buffer {

	public static void main(String[] args) {
		long stime=System.currentTimeMillis();
		StringBuffer s=new StringBuffer("Hello ");
		for(int i=0;i<1000;i++) { 
			s.append("World");
		}
		  System.out.println(System.currentTimeMillis()-stime);
	}
	
}
	