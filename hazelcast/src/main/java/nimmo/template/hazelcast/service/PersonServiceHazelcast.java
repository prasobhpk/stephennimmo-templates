package nimmo.template.hazelcast.service;

import nimmo.template.hazelcast.object.Person;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceHazelcast extends GenericServiceHazelcast<Integer, Person> implements PersonService {

}
