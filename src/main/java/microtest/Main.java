/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package microtest;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)
@EnableAdminServer
public class Main implements CommandLineRunner{

/*	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private EntityManagerFactory emf;*/

//
//	@Autowired
//	private AttractionsRepository attractions;
//
//	@Autowired
//	private CityRepository city;
//
//	@Autowired
//	private CustomerRepository customer;

	// TODO @Override
	public void run(String... args) throws Exception {

/*		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Object cnt = em.createQuery("select count (r) from Role r").getSingleResult();
		System.out.println("roles found:"+cnt);

		if (cnt==0) {
			em.persist(new Role("ROLE_USER"));
			em.persist(new Role("ROLE_USER"));
			em.persist(new Role("ROLE_USER"));
		}

		em.getTransaction().commit();*/
//	this.accountRepository.deleteAll();
//	this.accountRepository.save(new Account("egor", "1234"));

//		Payment p = em.createQuery("select p from Payment p",Payment.class).getSingleResult();
//
//		System.out.println("f:"+p);


/*	EGOR 24 apr 2016	this.attractions.deleteAll();


		// save a couple of customers
		this.attractions.save(new Attractions("BigBen", "BIGBEN"));//как в конструкторе класса Attractions
		this.attractions.save(new Attractions("Bridge", "Bridge1"));
		this.attractions.save(new Attractions("Tower", "Tower1"));

		this.city.save(new City("Атланта", "USA", "33.7489, -84.3879", "GA"));
		this.city.save(new City("Atlanta", "USA", "33.7489, -84.3879", "GA"));

		this.customer.save(new Customer("Alice", "Smith"));*/

/*		System.out.println("Account user");
		Account a = accountRepository.findByUsername("egor");
		System.out.println(a.getUsername());*/

		//mongoOperation.save(user);

		// fetch all customers
//		System.out.println("Attractions found with findAll():");
//		System.out.println("-------------------------------");
//		for (Attractions attraction : this.attractions.findAll()) {
//			System.out.println(attraction);
//		}
//		System.out.println();
/*
		System.out.println("Customer found with findByDescription('Мост1'):");
		System.out.println("--------------------------------");
		System.out.println(this.attractions.findByDescription("Мост1"));

		System.out.println();
		System.out.println("City found with findByMap('33.7489, -84.3879'):");
		System.out.println(this.city.findByMap("33.7489, -84.3879"));

		System.out.println();
		System.out.println("City found findByNameAndMap:");
		System.out.println(this.city.findByNameAndMap("Атланта","33.7489, -84.3879"));

		System.out.println();
		System.out.println(this.city.findByNameAndCountryAllIgnoringCase("London","UK"));*/

/*		System.out.println("City found findByNameLike:");
		for (City city: this.city.findByNameLike("Atlanta")){
			System.out.println(city);
		}*/

	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}

}


