package com.snimmo.demo.web.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.snimmo.demo.web.model.User;

@ApplicationScoped
public class UserService {
	
	@Inject
    private EntityManager em;

    public User findById(Long id) {
        return em.find(User.class, id);
    }
    
	@SuppressWarnings("unchecked")
	public List<User> findAll(){
    	Query query = em.createQuery("select u from User u");
        return (List<User>) query.getResultList();
    }
    
    public User find(String userName, String password) {
    	Query q = em.createQuery("select u from User u where u.userName = :userName and u.password = :password");
    	q.setParameter("userName", userName);
    	q.setParameter("password", password);
        try {
			return (User) q.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
    }

}
