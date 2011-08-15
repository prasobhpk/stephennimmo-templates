package nimmo.template.hazelcast.object;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;

public class Person extends AbstractEntity {
	
	private static final long serialVersionUID = 2078371486224376648L;
	
	private Integer id;
	private String firstName;
	private String lastName;
	
	public Person() {}
	
	public Person(Integer id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Serializable getKey() {
		return id;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public boolean equals(Object object) {
		return EqualsBuilder.reflectionEquals(this, object);
	}
}
