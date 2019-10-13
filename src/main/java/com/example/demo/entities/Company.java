package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;



@Entity
@Table (name="company_info")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@NotNull
	private String ecpd_id;
	
	@NotNull
	private String company_name;
	
	@NotNull
	private String auth_poc;
	
	@NotNull
	@Email
	private String auth_poc_email;
	
	@NotNull
	private String auth_poc_contact;
	
	@NotNull
	private boolean poc_approval;
	
	@Lob
	private byte[] documents;
	
	public Company(Long id,String ecpd_id,String company_name,String auth_poc,String auth_poc_email,String auth_poc_contact,
			boolean poc_approval,byte[] documents)
	{
		this.id=id;
		this.ecpd_id=ecpd_id;
		this.company_name=company_name;
		this.auth_poc=auth_poc;
		this.auth_poc_email=auth_poc_email;
		this.auth_poc_contact=auth_poc_contact;
		this.poc_approval=poc_approval;
		this.documents=documents;
	}
	
	public Company()
	{
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getEcpd_id() {
		return ecpd_id;
	}
	public void setEcpd_id(String ecpd_id) {
		this.ecpd_id = ecpd_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getAuth_poc() {
		return auth_poc;
	}
	public void setAuth_poc(String auth_poc) {
		this.auth_poc = auth_poc;
	}
	public String getAuth_poc_email() {
		return auth_poc_email;
	}
	public void setAuth_poc_email(String auth_poc_email) {
		this.auth_poc_email = auth_poc_email;
	}
	public String getAuth_poc_contact() {
		return auth_poc_contact;
	}
	public void setAuth_poc_contact(String auth_poc_contact) {
		this.auth_poc_contact = auth_poc_contact;
	}
	public boolean isPoc_approval() {
		return poc_approval;
	}
	public void setPoc_approval(boolean poc_approval) {
		this.poc_approval = poc_approval;
	}
	public byte[] getDocuments() {
		return documents;
	}
	public void setDocuments(byte[] documents) {
		this.documents = documents;
	}
	
}
