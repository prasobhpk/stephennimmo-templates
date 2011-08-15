package nimmo.template.servicelayer.service;

import java.util.List;

import nimmo.template.servicelayer.dto.Person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=false)
@Transactional
public class PersonServiceTest {
	
	@Autowired PersonService personService;
	
	@Test
	@Rollback(true)
	public void testSaveOrUpdate() {
		Person person = new Person(1234, "Bob", "Sanchez");
		person = personService.saveOrUpdate(person);
		Assert.notNull(person);
	}
	
	@Test
	@Rollback(true)
	public void testFindAll() {
		testSaveOrUpdate();
		List<Person> persons = personService.findAll();
		Assert.notNull(persons);
		Assert.notEmpty(persons);
	}
	
	@Test
	@Rollback(true)
	public void testFindById() {
		testSaveOrUpdate();
		Person person = personService.findById(1234);
		Assert.notNull(person);
	}

}
