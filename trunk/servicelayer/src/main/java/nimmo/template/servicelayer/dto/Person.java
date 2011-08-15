package nimmo.template.servicelayer.dto;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 7551571505080242075L;
	
	private Integer id;
	private String firstName;
	private String lastName;
	
	public Person() {}
	
	public Person(Integer id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
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
}
