package com.studentmgt.studentmgt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="Student")
public class Student {
//instance variable
	@Id
	@GeneratedValue
	@Column(name="id")
private int id;
	@Column(name="name",nullable=false,length=30)
 private String name;
	@Column(name="contact",nullable=false,length=10,unique=true)	
 private String contact;
 @OneToOne(cascade=CascadeType.ALL)
 @JoinColumn(name="aid")
 private Address address;
 //parameterized constructor
 public Student(String name,String contact,Address address) {
	 super();
	 this.id=id;
	 this.name=name;
	 this.contact=contact;
	 this.address=address;
 }
 //default constructor
 public Student() {
		super();
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
}
 
	
}
