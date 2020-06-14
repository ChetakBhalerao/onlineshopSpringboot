package com.example.onlineshop.model;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class customer {
	@Id // pk
	 @Column(name="id") // gives a diff name in the RDBMS table
	 private int customerId;
		
	 private String fname;	 
    private String lname;
    private String email;
    private String address;
    private String mobile;
    
    public customer() {
   	 this.customerId=new Random().nextInt(100000);
    }
    public customer(String fname, String lname, String mobile, String address,String email) {
		this.customerId=new Random().nextInt(100000);
		this.fname = fname;
		this.lname = lname;
		this.email=email;
		this.mobile = mobile;
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
}
