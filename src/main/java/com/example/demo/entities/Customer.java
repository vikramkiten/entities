package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="customer_info")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@NotNull
	private String  account_number;
	
	@NotNull
	private String mobile_number;
	
	public Customer()
	{
		
	}
	
	public Customer(Long id,String account_number,String mobile_number)
	{
		this.id=id;
		this.account_number=account_number;
		this.mobile_number=mobile_number;
		
	}

	@Override
	public String toString() {
		return "Customer [account_number=" + account_number + ", id=" + id + ", mobile_number=" + mobile_number
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

}
