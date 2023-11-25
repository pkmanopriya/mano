package com.interfaceDemo;

public class Account {
	    public void credit() {
	    	System.out.println("Amount credited is 2000");
	    }
	    public void debit() {
	    	System.out.println("Amount debited is 1000");
	    }
	    public void loan() {
	    	System.out.println("Loan in bank is 40000");
	    }
	    public static void main(String[] args) {
	    	 Account a=new Account();
	    	 a.credit();
	    	 a.debit();
	    	 a.loan();
}

}


	   