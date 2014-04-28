package dao;

import java.util.List;

import model.MailAccount;

public interface MailAccountDAOImp {

	// property constants
	public static final String BEIZHU = "beizhu";
	public static final String EMAIL = "email";
	public static final String PASSWORD = "password";
	public static final String STATUS = "status";
	public static final String POP3SERVER = "pop3server";
	public static final String POP3PORT = "pop3port";
	public static final String SMTPSERVER = "smtpserver";
	public static final String SMTPPORT = "smtpport";

	public abstract void save(MailAccount transientInstance);

	public abstract void delete(MailAccount persistentInstance);

	public abstract MailAccount findById(java.lang.Integer id);

	public abstract List findByExample(MailAccount instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByBeizhu(Object beizhu);

	public abstract List findByEmail(Object email);

	public abstract List findByPassword(Object password);

	public abstract List findByStatus(Object status);

	public abstract List findByPop3server(Object pop3server);

	public abstract List findByPop3port(Object pop3port);

	public abstract List findBySmtpserver(Object smtpserver);

	public abstract List findBySmtpport(Object smtpport);

	public abstract List findAll();

	public abstract MailAccount merge(MailAccount detachedInstance);

	public abstract void attachDirty(MailAccount instance);

	public abstract void attachClean(MailAccount instance);

}