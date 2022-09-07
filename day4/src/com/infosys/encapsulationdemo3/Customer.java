package com.infosys.encapsulationdemo3;
class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
    
	public void setCustomerDetails(String customerId,String customerName, long contactNumber, String address) {
	this.customerId=customerId;
	this.customerName=customerName;
	this.contactNumber=contactNumber;
	this.address=address;
		
		
	}
    public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
}