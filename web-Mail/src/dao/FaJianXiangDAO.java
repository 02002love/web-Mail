package dao;

import java.util.Date;
import java.util.List;

import model.FaJianXiang;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FaJianXiang entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see model.FaJianXiang
 * @author MyEclipse Persistence Tools
 */

public class FaJianXiangDAO extends HibernateDaoSupport implements FaJianXiangDAOImp {
	private static final Logger log = LoggerFactory
			.getLogger(FaJianXiangDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#save(model.FaJianXiang)
	 */
	public void save(FaJianXiang transientInstance) {
		log.debug("saving FaJianXiang instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#delete(model.FaJianXiang)
	 */
	public void delete(FaJianXiang persistentInstance) {
		log.debug("deleting FaJianXiang instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#findById(java.lang.Integer)
	 */
	public FaJianXiang findById(java.lang.Integer id) {
		log.debug("getting FaJianXiang instance with id: " + id);
		try {
			FaJianXiang instance = (FaJianXiang) getHibernateTemplate().get(
					"model.FaJianXiang", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#findByExample(model.FaJianXiang)
	 */
	public List findByExample(FaJianXiang instance) {
		log.debug("finding FaJianXiang instance by example");
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
	 * @see dao.FaJianXiangDAOImp#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding FaJianXiang instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FaJianXiang as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#findByFajianren(java.lang.Object)
	 */
	public List findByFajianren(Object fajianren) {
		return findByProperty(FAJIANREN, fajianren);
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#findByShoujianren(java.lang.Object)
	 */
	public List findByShoujianren(Object shoujianren) {
		return findByProperty(SHOUJIANREN, shoujianren);
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#findByTitle(java.lang.Object)
	 */
	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#findByContent(java.lang.Object)
	 */
	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#findByAttchement(java.lang.Object)
	 */
	public List findByAttchement(Object attchement) {
		return findByProperty(ATTCHEMENT, attchement);
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#findByStatus(java.lang.Object)
	 */
	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#findAll()
	 */
	public List findAll() {
		log.debug("finding all FaJianXiang instances");
		try {
			String queryString = "from FaJianXiang";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#merge(model.FaJianXiang)
	 */
	public FaJianXiang merge(FaJianXiang detachedInstance) {
		log.debug("merging FaJianXiang instance");
		try {
			FaJianXiang result = (FaJianXiang) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#attachDirty(model.FaJianXiang)
	 */
	public void attachDirty(FaJianXiang instance) {
		log.debug("attaching dirty FaJianXiang instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see dao.FaJianXiangDAOImp#attachClean(model.FaJianXiang)
	 */
	public void attachClean(FaJianXiang instance) {
		log.debug("attaching clean FaJianXiang instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FaJianXiangDAOImp getFromApplicationContext(
			ApplicationContext ctx) {
		return (FaJianXiangDAOImp) ctx.getBean("FaJianXiangDAO");
	}
}