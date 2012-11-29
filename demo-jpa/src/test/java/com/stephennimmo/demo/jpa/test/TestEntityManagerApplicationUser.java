package com.stephennimmo.demo.jpa.test;

import org.junit.Test;

import com.stephennimmo.demo.jpa.ApplicationUser;

public class TestEntityManagerApplicationUser extends AbstractTestEntityManager {

	@Test
	public void testInsert() {
		entityManager.persist(new ApplicationUser());
	}

}
