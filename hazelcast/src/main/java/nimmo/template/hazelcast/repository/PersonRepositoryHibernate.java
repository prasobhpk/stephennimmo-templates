package nimmo.template.hazelcast.repository;

import nimmo.template.hazelcast.object.Person;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryHibernate extends GenericRepositoryHibernate<Integer, Person> implements PersonRepository {

}
