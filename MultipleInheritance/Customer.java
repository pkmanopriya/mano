package com.MultipleInheritance;

public class Customer implements Car,Bike{
	   public void speedOfBike() {
		   System.out.println("Maximum Speed of Bike is 120");
	   }
	   public  void mileageofbike() {
		   System.out.println("Mileage Of This Bike is 40/L");
	   }
	   public void speedOfCar() {
		   System.out.println("Maximum Speed of Car is 200");
	   }
	   public void mileageOfCar() {
		   System.out.println("Maximum Of This Car is 35/l");
	   }
	   public static void main(String[] args) {
		      Customer c=new Customer();
		      c.speedOfBike();
		      c.mileageOfBike();
		      c.speedOfCar();
		      c.mileageOfCar();
	   }
}
		   


	  
