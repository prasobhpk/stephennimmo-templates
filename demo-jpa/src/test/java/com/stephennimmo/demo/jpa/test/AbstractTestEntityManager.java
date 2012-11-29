package com.stephennimmo.demo.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class AbstractTestEntityManager {
	
	private static final String TEST_UNIT_NAME = "demoManager";
	protected static EntityManagerFactory entityManagerFactory;
	protected static EntityManager entityManager;

	@BeforeClass
	public static void prepareEntityManagerFactory() {
		entityManagerFactory = Persistence.createEntityManagerFactory(TEST_UNIT_NAME);
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
	}
	
	@After
	public void rollbackTransactionAndReleaseEntityManager() {
		entityManager.getTransaction().rollback();
	}

	@AfterClass
	public static void releaseEntityManager() {
		if (entityManager.getTransaction().isActive()) {
			entityManager.getTransaction().rollback();
		}

		if (entityManager.isOpen()) {
			entityManager.close();
		}
		entityManagerFactory.close();
	}

}
