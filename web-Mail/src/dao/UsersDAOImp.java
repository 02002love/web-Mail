package dao;

import java.util.List;

import model.Users;

public interface UsersDAOImp {

	// property constants
	public static final String MINGCHENG = "mingcheng";
	public static final String PASSWORD = "password";
	public static final String USERTYPE = "usertype";
	public static final String DESCRPTION = "descrption";

	public abstract void save(Users transientInstance);

	public abstract void delete(Users persistentInstance);

	public abstract Users findById(java.lang.Integer id);

	public abstract List findByExample(Users instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByMingcheng(Object mingcheng);

	public abstract List findByPassword(Object password);

	public abstract List findByUsertype(Object usertype);

	public abstract List findByDescrption(Object descrption);

	public abstract List findAll();

	public abstract Users merge(Users detachedInstance);

	public abstract void attachDirty(Users instance);

	public abstract void attachClean(Users instance);

}