package microtest.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

//construct city @Entity
@Entity
public class City implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	public Long id;

	@Column(nullable = false)
	public String name;

	@Column(nullable = false)
	public String state;

	@Column(nullable = false)
	public String country;

	@Column(nullable = false)
	public String map;

	@Column(nullable = false)
	public Long index;

	protected City() {
	}

	public City(String name, String country, String map, String state, Long index) {
		super();
		this.name = name;
		this.country = country;
		this.map = map;
		this.state = state;
		this.index = index;
	}

	public String toString() {
		return "sample.data.jpa.domain.City(name=" + this.name + ", state=" + this.state + ", country=" + this.country + ", map=" + this.map + ", index=" + this.index + ")";
	}

	//setters city's fields
	public void setName(String name) {
		this.name = name;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public void setIndex(Long index) {
		this.index = index;
	}

	//getters city's fields
	public String getName() {
		return this.name;
	}

	public String getState() {return this.state;}

	public String getCountry() {
		return this.country;
	}

	public String getMap() {
		return this.map;
	}

	public Long getIndex() {
		return this.index;
	}
}
