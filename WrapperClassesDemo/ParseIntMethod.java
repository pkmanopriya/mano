package com.wrapperClass.demo;

public class ParseIntMethod {
public static void main(String[] args) {
	
	int decimalex=Integer.parseInt("20");
	
	int positivenum=Integer.parseInt("+20");
			
    int negativenum=Integer.parseInt("-20");
	
	System.out.println(decimalex+" "+positivenum+" "+negativenum);

	//parseInt(String s,int radix)
	  //parseINT(charsequence s,int beginingText,int endText,int radix)
	
	int a=Integer.parseInt("+200",16);
	int b=Integer.parseInt("200",8);
	int c=Integer.parseInt("-344",12);
	System.out.println(a+" "+b+" "+c);
	
}
}
	
	

