package com.ecommerce.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String pbrand;
	private String pname;
	private String prate;
		
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPbrand() {
		return pbrand;
	}
	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPrate() {
		return prate;
	}
	public void setPrate(String prate) {
		this.prate = prate;
	}
	
	private String customer_first_name;
	private String customer_last_name;
	private String customer_email;
	public String getCustomer_first_name() {
		return customer_first_name;
	}
	public void setCustomer_first_name(String customer_first_name) {
		this.customer_first_name = customer_first_name;
	}
	public String getCustomer_last_name() {
		return customer_last_name;
	}
	public void setCustomer_last_name(String customer_last_name) {
		this.customer_last_name = customer_last_name;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	
		
}
