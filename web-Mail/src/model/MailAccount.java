package model;

/**
 * MailAccount entity. @author MyEclipse Persistence Tools
 */

public class MailAccount implements java.io.Serializable {

	// Fields

	private Integer id;
	private String beizhu;
	private String email;
	private String password;
	private String status;
	private String pop3server;
	private String pop3port;
	private String smtpserver;
	private String smtpport;

	// Constructors

	/** default constructor */
	public MailAccount() {
	}

	/** full constructor */
	public MailAccount(String beizhu, String email, String password,
			String status, String pop3server, String pop3port,
			String smtpserver, String smtpport) {
		this.beizhu = beizhu;
		this.email = email;
		this.password = password;
		this.status = status;
		this.pop3server = pop3server;
		this.pop3port = pop3port;
		this.smtpserver = smtpserver;
		this.smtpport = smtpport;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPop3server() {
		return this.pop3server;
	}

	public void setPop3server(String pop3server) {
		this.pop3server = pop3server;
	}

	public String getPop3port() {
		return this.pop3port;
	}

	public void setPop3port(String pop3port) {
		this.pop3port = pop3port;
	}

	public String getSmtpserver() {
		return this.smtpserver;
	}

	public void setSmtpserver(String smtpserver) {
		this.smtpserver = smtpserver;
	}

	public String getSmtpport() {
		return this.smtpport;
	}

	public void setSmtpport(String smtpport) {
		this.smtpport = smtpport;
	}

}