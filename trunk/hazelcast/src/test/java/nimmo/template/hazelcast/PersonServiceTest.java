package nimmo.template.hazelcast;

import nimmo.template.hazelcast.object.Person;
import nimmo.template.hazelcast.service.PersonService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.hazelcast.core.Transaction;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class PersonServiceTest {
	
	@Autowired PersonService personService;
	
	@Test
	public void testCommitTransaction(){
		Transaction transaction = personService.getTransaction();
		transaction.begin();
		personService.put(new Person(1, "Tom", "Transaction"));
		transaction.commit();
		Person tom = personService.get(1);
		Assert.notNull(tom);
	}
	
	@Test
	public void testRollbackTransaction(){
		Transaction transaction = personService.getTransaction();
		transaction.begin();
		personService.put(new Person(2, "Phil", "Philly"));
		transaction.rollback();
		Person phil = personService.get(2);
		Assert.isNull(phil);
	}
	
	@Test
	public void testGet() {
		Person person = personService.get(1234);
		Assert.notNull(person);
	}
	
	@Test
	public void testPut() {
		Person person = new Person(1234, "Bob", "Sanchez");
		personService.put(person);
		person = personService.get(1234);
		Assert.notNull(person);
	}

}
