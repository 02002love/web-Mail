package model;

import java.sql.Time;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer id;
	private String mingcheng;
	private String password;
	private String usertype;
	private Time createtime;
	private String descrption;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String mingcheng, String password, String usertype,
			Time createtime) {
		this.mingcheng = mingcheng;
		this.password = password;
		this.usertype = usertype;
		this.createtime = createtime;
	}

	/** full constructor */
	public Users(String mingcheng, String password, String usertype,
			Time createtime, String descrption) {
		this.mingcheng = mingcheng;
		this.password = password;
		this.usertype = usertype;
		this.createtime = createtime;
		this.descrption = descrption;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMingcheng() {
		return this.mingcheng;
	}

	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public Time getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Time createtime) {
		this.createtime = createtime;
	}

	public String getDescrption() {
		return this.descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

}