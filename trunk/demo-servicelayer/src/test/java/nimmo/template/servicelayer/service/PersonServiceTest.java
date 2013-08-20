package nimmo.template.servicelayer.service;

import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.occupytheserver.demo.servicelayer.dto.Job;
import com.occupytheserver.demo.servicelayer.dto.Person;
import com.occupytheserver.demo.servicelayer.service.PersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=false)
@Transactional
public class PersonServiceTest {
	
	@Autowired PersonService personService;
	
	@Test
	@Rollback(false)
	public void testSaveOrUpdate() {
		Person person = new Person(System.currentTimeMillis(), "Bob", "Sanchez");
		Job job = new Job(System.currentTimeMillis()+3, "testjob");
		job.setPerson(person);
		person.getJobs().add(job);
		person = personService.saveOrUpdate(person);
		Assert.notNull(person);
	}
	/*
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
	*/

}
