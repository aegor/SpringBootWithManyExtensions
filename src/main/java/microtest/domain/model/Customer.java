package microtest.domain.model;

import org.springframework.data.annotation.Id;

//construct customer @Entity
public class Customer {

	@Id
	public String id;

	public String firstName;
	public String lastName;

	public Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//getters customer's fields
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	//setters customer's fields
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String toString() {
		return "sample.data.jpa.domain.Customer(firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ")";
	}
}