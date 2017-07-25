package com.niit.model;
import java.io.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.niit.model.User;
@Entity
@Table(name="USER")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="email")
	private String email;
	@Column(name="username")
	private String username;
	@Column(name="userpassword")
	private String userpassword;
	@Column(name="useraddress")
	private String useraddress;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isIsonline() {
		return isonline;
	}
	public void setIsonline(boolean isonline) {
		this.isonline = isonline;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column(name="status")
	private String status;
	@Column(name="role")
	private String role;
	@Column(name="isonline")
	private boolean isonline;

}
