package com.occupytheserver.demo.hazelcast.repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.occupytheserver.demo.hazelcast.object.Entity;

public class GenericRepositoryHibernate<ID extends Serializable, T extends Entity> extends HibernateDaoSupport implements GenericRepository<ID, T> {
 
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
    public T findById(ID id) {
    	return (T)getHibernateTemplate().get(persistentClass, id);
    }
    
    public List<T> findByIds(Collection<ID> ids) {
    	//TODO Make faster
    	List<T> aList = new ArrayList<T>();
    	for (ID id : ids) {
			aList.add(findById(id));
		}
    	return aList;
    }
 
    public List<T> findAll() {
        return findByCriteria();
    }
 
    public T saveOrUpdate(T entity) {
    	getHibernateTemplate().saveOrUpdate(entity);
        return entity;
    }
    
    public void delete(ID id) {
    	T entity = findById(id);
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
