package com.tns.am;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class MallAdmin {
	private int id;
	private String name;
	private String password;
	private String mall;
	private int phone;
	
	
	//non parameterised constructor
	public MallAdmin() {
		super();
	}


// constructor using fields are generated
	public MallAdmin(int id, String name, String password, String mall,int phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.mall = mall;
		this.phone = phone;
	}


	@Id
	@GeneratedValue
	
	// getters and setter are generated
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



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getMall() {
		return mall;
	}



	public void setMall(String mall) {
		this.mall = mall;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}


// toString method is generated
	@Override
	public String toString() {
		return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", mall=" + mall + ", phone="
				+ phone + "]";
	}



	
	
	
}

