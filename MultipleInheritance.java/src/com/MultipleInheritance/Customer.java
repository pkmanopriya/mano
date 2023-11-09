package com.MultipleInheritance;

public class Customer implements Car,Bike{
	   public void speedOfBike() {
		   System.out.printIn("Maximum Speed of Bike is 120");
	   }
	   public void mileageOfBike() {
		   System.out.printIn("Mileage Of This Bike is 40/L");
	   }
	   public void speedOfCar() {
		   System.out.printIn("Maximum Speed Of Car is 200");
	   }
	   Public void mileageOfCar() {
		   System.out.printIn("Mileage Of This Car is 35/L");
	   }
	   public static void main(String[] args) {
		    Customer c=new Customer();
		    c.mileageOfBike();
		    c.speedOfCar();
		    c.mileageOfCar();
	   }
}
	   
	   
	   

