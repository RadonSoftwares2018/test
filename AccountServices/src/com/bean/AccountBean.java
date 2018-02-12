package com.bean;

import java.util.*;
import javax.faces.model.*;

import com.entity.AccountEntity;
import com.entity.AccountTypeEntity;
import com.service.AccountDataService;


public class AccountBean
{
	private int accountNumer;
	private String customerName;
	private Date dateOfBirth;
	private String gnder;
	private String accountType;
	private String address;
	private String email;
	private List<SelectItem> listAccountType = new ArrayList<SelectItem>();
	private List<AccountTypeEntity> intermediateList = new ArrayList<AccountTypeEntity>();
	
	public AccountBean()
	{
		try
		{
			intermediateList = new AccountDataService().getAcccountType();
			AccountTypeEntity ate = null;
			for (int i = 0; i < intermediateList.size(); i++) 
			{
				ate = intermediateList.get(i);
				listAccountType.add(new SelectItem(ate.getAccountId(),ate.getAccountType()));
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

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

	public List<SelectItem> getListAccountType() {
		return listAccountType;
	}

	public void setListAccountType(List<SelectItem> listAccountType) {
		this.listAccountType = listAccountType;
	}

	public List<AccountTypeEntity> getIntermediateList() {
		return intermediateList;
	}

	public void setIntermediateList(List<AccountTypeEntity> intermediateList) {
		this.intermediateList = intermediateList;
	}
	
	public String saveData()
	{
		String result="";
		AccountEntity acc = new AccountEntity();
		acc.setAccountNumer(this.accountNumer);
		acc.setAccountType(this.accountType);
		acc.setAddress(this.address);
		acc.setCustomerName(this.customerName);
		acc.setDateOfBirth(this.dateOfBirth);
		acc.setEmail(this.email);
		acc.setGnder(this.gnder);
		
		AccountDataService ads = new AccountDataService();
		int AccNo = ads.saveData(acc);
		if(AccNo!=0)
		{
			result="success";
		}
		else
		{
			result="fail";
		}
		return result;
	}
}
