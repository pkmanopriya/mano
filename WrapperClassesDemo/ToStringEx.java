package com.wrapperClass.demo;

public class ToStringEx {
	
int rollno;
String name;
String city;
   
  //con
 ToStringEx(int rollno,String name,String city){
	 this.rollno=rollno;
	 this.name=name;
	 this.city=city;
 }
 
   //to String
 public String toString() {
	 return rollno+" "+name+" "+city;
 }
 
  public static void main(String[] args) {
	  ToStringEx s1=new ToStringEx(101,"abc","pune");
	  ToStringEx s2=new ToStringEx(102,"pqr","mumbai");
	  		
    	System.out.println(s1);
	    System.out.println(s2);
	  
  }
 }

