package com.occupytheserver.demo.servicelayer.repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class GenericRepositoryHibernate<ID extends Serializable, T> extends HibernateDaoSupport implements GenericRepository<ID, T> {
 
    private Class<T> persistentClass;
 
    @SuppressWarnings("unchecked")
	public GenericRepositoryHibernate() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
     }
    
    @Autowired
	public void initSessionFactory(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
 
    @SuppressWarnings("unchecked")
    public T findById(ID id, boolean lock) {
    	return (T)getHibernateTemplate().get(persistentClass, id);
    }
 
    public List<T> findAll() {
        return findByCriteria();
    }
 
    public T saveOrUpdate(T entity) {
    	getHibernateTemplate().save(entity);
        return entity;
    }
    
    public void delete(ID id) {
    	T entity = findById(id, true);
        delete(entity);
    }
 
    public void delete(T entity) {
    	getHibernateTemplate().delete(entity);
    }
 
    public void flush() {
        getSession().flush();
    }
 
    public void clear() {
        getSession().clear();
    }
 
    /**
     * Use this inside subclasses as a convenience method.
     */
    @SuppressWarnings("unchecked")
    protected List<T> findByCriteria(Criterion... criterion) {
        Criteria crit = getSession().createCriteria(persistentClass);
        for (Criterion c : criterion) {
            crit.add(c);
        }
        return crit.list();
   }
 
}
