package dao;

import java.util.List;

import model.MailAccount;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MailAccount entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see model.MailAccount
 * @author MyEclipse Persistence Tools
 */

public class MailAccountDAO extends HibernateDaoSupport implements MailAccountDAOImp {
	private static final Logger log = LoggerFactory
			.getLogger(MailAccountDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#save(model.MailAccount)
	 */
	public void save(MailAccount transientInstance) {
		log.debug("saving MailAccount instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#delete(model.MailAccount)
	 */
	public void delete(MailAccount persistentInstance) {
		log.debug("deleting MailAccount instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#findById(java.lang.Integer)
	 */
	public MailAccount findById(java.lang.Integer id) {
		log.debug("getting MailAccount instance with id: " + id);
		try {
			MailAccount instance = (MailAccount) getHibernateTemplate().get(
					"model.MailAccount", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#findByExample(model.MailAccount)
	 */
	public List findByExample(MailAccount instance) {
		log.debug("finding MailAccount instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MailAccount instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MailAccount as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#findByBeizhu(java.lang.Object)
	 */
	public List findByBeizhu(Object beizhu) {
		return findByProperty(BEIZHU, beizhu);
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#findByEmail(java.lang.Object)
	 */
	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#findByPassword(java.lang.Object)
	 */
	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#findByStatus(java.lang.Object)
	 */
	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#findByPop3server(java.lang.Object)
	 */
	public List findByPop3server(Object pop3server) {
		return findByProperty(POP3SERVER, pop3server);
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#findByPop3port(java.lang.Object)
	 */
	public List findByPop3port(Object pop3port) {
		return findByProperty(POP3PORT, pop3port);
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#findBySmtpserver(java.lang.Object)
	 */
	public List findBySmtpserver(Object smtpserver) {
		return findByProperty(SMTPSERVER, smtpserver);
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#findBySmtpport(java.lang.Object)
	 */
	public List findBySmtpport(Object smtpport) {
		return findByProperty(SMTPPORT, smtpport);
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#findAll()
	 */
	public List findAll() {
		log.debug("finding all MailAccount instances");
		try {
			String queryString = "from MailAccount";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#merge(model.MailAccount)
	 */
	public MailAccount merge(MailAccount detachedInstance) {
		log.debug("merging MailAccount instance");
		try {
			MailAccount result = (MailAccount) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#attachDirty(model.MailAccount)
	 */
	public void attachDirty(MailAccount instance) {
		log.debug("attaching dirty MailAccount instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.MailAccountDAOImp#attachClean(model.MailAccount)
	 */
	public void attachClean(MailAccount instance) {
		log.debug("attaching clean MailAccount instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MailAccountDAOImp getFromApplicationContext(
			ApplicationContext ctx) {
		return (MailAccountDAOImp) ctx.getBean("MailAccountDAO");
	}
}