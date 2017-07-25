package com.niit.model;
import java.io.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Friends")
public class Friend implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="id")
	private int id;
	@Column(name="userid")
	private String userid;
	@Column(name="friendid")
	private String friendid;
	@Column(name="status")
	private String status;
	@Column(name="isonline")
	private char isonline;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getFriendid() {
		return friendid;
	}
	public void setFriendid(String friendid) {
		this.friendid = friendid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public char getIsonline() {
		return isonline;
	}
	public void setIsonline(char isonline) {
		this.isonline = isonline;
	}
}
