package com.stringbuilderbuffer;

public class Main {

	public static void main(String[] args) {
		    StringBuffer str=new StringBuffer("Let's");
		    str.append("hope for best");
		    str.replace(12,12, " the");
		    str.reverse();
		    str.reverse();
		    System.out.println(str+" "+str.capacity());
		    System.out.println(str.delete(1,4));
		    StringBuffer s=new StringBuffer("");
		    s.delete(0,4);
		    System.out.print(s);
		    
	}
	
}
		    
		    		
