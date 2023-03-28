package com.studentmgt.studentmgt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	//instance variable
	@Id
	@GeneratedValue
	private int aid;
	private String hno;
	private String area;
	private String city;
	private String state;
	private String pin;
	//Parameterized constructor
	public Address(String hno,String area,String city,String state,String pin) {
		super();
		this.hno=hno;
		this.area=area;
		this.city=city;
		this.state=state;
		this.pin=pin;
	}
	//default constructor
	public Address() {
		super();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
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
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", hno=" + hno + ", area=" + area + ", city=" + city + ", state=" + state
				+ ", pin=" + pin + "]";
	}

	

}
