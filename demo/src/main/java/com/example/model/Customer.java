package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "customer")
public class Customer {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "cut_id")
private int cut_id;
@Column(name = "name")
@NotEmpty(message = "*Please provide your name")
private String name;
@Column(name = "email")
@Email(message = "*Please provide a valid Email")
@NotEmpty(message = "*Please provide an email")
private String email;
@Column(name = "address")
@NotEmpty(message = "*Please provide your address")
private String address;
@Column(name = "phone")
@NotEmpty(message = "*Please provide your phone number")
private int phone;
public int getCut_id() {
	return cut_id;
}
public void setCut_id(int cut_id) {
	this.cut_id = cut_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}


}
