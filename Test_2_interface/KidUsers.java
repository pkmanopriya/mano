package com.interfaceTest;

public class KidUsers implements LibraryUser {
	private int age;
	private String bookType;
	KidUsers(int age,String bookType){
	     this.age=age;
	     this.bookType=bookType;
}
  public void registerAccount() {
	  if(age<12) {
		  System.out.println("Sorry,successfully registed under a Kids Account");
	  }
	  else {
	  System.out.println("Sorry,Age must be less than 12 to register as a kid");
	  }
  }
  public void requestBook() {
	  if(bookType.equalsIgnoreCase("Kids")) {
		  System.out.println("Book issued succcessfully,please return it within 10 days");
	  }
	  else {
		  System.out.println("Oops,you are allowed to take only kids books");
	  }
  }
  }
	  	
