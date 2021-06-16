package com.gachifarm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@SuppressWarnings("serial")
@Entity
public class Account implements Serializable{
	@Id
	@Column(name="user_id")
	@NotNull
	String userId;
	
	@NotNull
	String password;
	
	@NotNull
	String userName;
	
	String phone;
	
	@NotNull
	String email;
	
	@Embedded
	Address address;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Account [userId=" + userId + ", password=" + password + ", userName=" + userName + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + "]";
	}

}
