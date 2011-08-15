package nimmo.template.hazelcast.mapstore;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import nimmo.template.hazelcast.object.Person;
import nimmo.template.hazelcast.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazelcast.core.MapStore;

@Service
public class PersonMapStore implements MapStore<Integer, Person> {
	
	@Autowired PersonRepository personRepository;

	public Person load(Integer id) {
		return personRepository.findById(id);
	}

	public Map<Integer, Person> loadAll(Collection<Integer> keys) {
		Map<Integer, Person> map = new HashMap<Integer, Person>();
		List<Person> persons = personRepository.findByIds(keys);
		for (Person person : persons) {
			map.put(person.getId(), person);
		}
		return map;
	}

	public Set<Integer> loadAllKeys() {
		Set<Integer> keys = new HashSet<Integer>();
		List<Person> persons = personRepository.findAll();
		for (Person person : persons) {
			keys.add(person.getId());
		}
		return keys;
	}

	public void delete(Integer key) {
		personRepository.delete(key);
	}

	public void deleteAll(Collection<Integer> keys) {
		for (Integer key : keys) {
			personRepository.delete(key);
		}
	}

	public void store(Integer key, Person person) {
		personRepository.saveOrUpdate(person);
	}

	public void storeAll(Map<Integer, Person> map) {
		Collection<Person> persons = map.values();
		for (Person person : persons) {
			personRepository.saveOrUpdate(person);
		}
	}
}
