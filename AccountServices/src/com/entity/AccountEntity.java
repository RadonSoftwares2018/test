package com.entity;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="AccountDetails")
public class AccountEntity 
{
	@Id
	@Column(precision=4)
	private int accountNumer;
	@Column(length=20, nullable=false)
	private String customerName;
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dateOfBirth;
	@Column(length=10, nullable=false)
	private String gnder;
	@Column(length=10, nullable=false)
	private String accountType;
	@Column(length=100, nullable=false)
	private String address;
	@Column(length=50, unique=true)
	private String email;
	
	
	public int getAccountNumer() {
		return accountNumer;
	}
	public void setAccountNumer(int accountNumer) {
		this.accountNumer = accountNumer;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGnder() {
		return gnder;
	}
	public void setGnder(String gnder) {
		this.gnder = gnder;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
