package com.cg.bank;

public class Customer {
int customerId;
String customerName;
String bankName;
String Ifsc;
Address address;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int customerId, String customerName, String bankName, String ifsc, Address address) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.bankName = bankName;
	Ifsc = ifsc;
	this.address = address;
}
public Customer(String customerName, String bankName, String ifsc, Address address) {
	super();
	
	this.customerName = customerName;
	this.bankName = bankName;
	Ifsc = ifsc;
	this.address = address;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getIfsc() {
	return Ifsc;
}
public void setIfsc(String ifsc) {
	Ifsc = ifsc;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", bankName=" + bankName
			+ ", Ifsc=" + Ifsc + ", address=" + address + "]";
}

}
