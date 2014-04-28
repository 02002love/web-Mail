package model;

import java.util.Date;

/**
 * FaJianXiang entity. @author MyEclipse Persistence Tools
 */

public class FaJianXiang implements java.io.Serializable {

	// Fields

	private Integer id;
	private String fajianren;
	private String shoujianren;
	private Date fasongshijian;
	private String title;
	private String content;
	private String attchement;
	private String status;

	// Constructors

	/** default constructor */
	public FaJianXiang() {
	}

	/** minimal constructor */
	public FaJianXiang(String fajianren, String shoujianren, Date fasongshijian) {
		this.fajianren = fajianren;
		this.shoujianren = shoujianren;
		this.fasongshijian = fasongshijian;
	}

	/** full constructor */
	public FaJianXiang(String fajianren, String shoujianren,
			Date fasongshijian, String title, String content,
			String attchement, String status) {
		this.fajianren = fajianren;
		this.shoujianren = shoujianren;
		this.fasongshijian = fasongshijian;
		this.title = title;
		this.content = content;
		this.attchement = attchement;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFajianren() {
		return this.fajianren;
	}

	public void setFajianren(String fajianren) {
		this.fajianren = fajianren;
	}

	public String getShoujianren() {
		return this.shoujianren;
	}

	public void setShoujianren(String shoujianren) {
		this.shoujianren = shoujianren;
	}

	public Date getFasongshijian() {
		return this.fasongshijian;
	}

	public void setFasongshijian(Date fasongshijian) {
		this.fasongshijian = fasongshijian;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAttchement() {
		return this.attchement;
	}

	public void setAttchement(String attchement) {
		this.attchement = attchement;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}