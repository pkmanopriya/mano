package com.accout;
import com.accout.*;
public class Customer extends Account{
	
	public static void main(String[] args) {
		 Customer c=new Customer();
		 c.setAccno(111325643);
		 c.setIfsc("SBI76543");
		 System.out.println(c.getAccno());
		 System.out.println(c.getIfsc());
		 System.out.println(c.location);
		 System.out.println(c.address);
		 System.out.println(c.amount);
	}
	
}
