package com.cg.bank;

public class Address {
int hNo;
String streetName;
String city;
String state;
int pinCode;
public Address(int hNo, String streetName, String city, String state, int pinCode) {
	super();
	this.hNo = hNo;
	this.streetName = streetName;
	this.city = city;
	this.state = state;
	this.pinCode = pinCode;
}
public int gethNo() {
	return hNo;
}
public void sethNo(int hNo) {
	this.hNo = hNo;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPinCode() {
	return pinCode;
}
public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
}
@Override
public String toString() {
	return "Address [hNo=" + hNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state + ", pinCode="
			+ pinCode + "]";
}

}
