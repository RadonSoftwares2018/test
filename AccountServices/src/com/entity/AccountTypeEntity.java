package com.entity;

import javax.persistence.*;

@Entity
@Table(name="AccountTable")
public class AccountTypeEntity 
{
	@Id
	@Column(precision=4)
	private int accountId;
	@Column(length=10, nullable=false)
	private String accountType;
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
