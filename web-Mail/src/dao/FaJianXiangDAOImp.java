package dao;

import java.util.List;

import model.FaJianXiang;

public interface FaJianXiangDAOImp {

	// property constants
	public static final String FAJIANREN = "fajianren";
	public static final String SHOUJIANREN = "shoujianren";
	public static final String TITLE = "title";
	public static final String CONTENT = "content";
	public static final String ATTCHEMENT = "attchement";
	public static final String STATUS = "status";

	public abstract void save(FaJianXiang transientInstance);

	public abstract void delete(FaJianXiang persistentInstance);

	public abstract FaJianXiang findById(java.lang.Integer id);

	public abstract List findByExample(FaJianXiang instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByFajianren(Object fajianren);

	public abstract List findByShoujianren(Object shoujianren);

	public abstract List findByTitle(Object title);

	public abstract List findByContent(Object content);

	public abstract List findByAttchement(Object attchement);

	public abstract List findByStatus(Object status);

	public abstract List findAll();

	public abstract FaJianXiang merge(FaJianXiang detachedInstance);

	public abstract void attachDirty(FaJianXiang instance);

	public abstract void attachClean(FaJianXiang instance);

}