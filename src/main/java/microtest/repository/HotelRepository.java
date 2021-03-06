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

package microtest.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import microtest.domain.model.City;
import microtest.domain.model.Hotel;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "hotels", path = "hotels")
public interface HotelRepository extends PagingAndSortingRepository<Hotel, Long> {

	// find hotels by part of city's name
	@Query("SELECT h " +
			"FROM Hotel h JOIN h.city c " +
			"WHERE " +
			"LOWER(c.name) LIKE LOWER(CONCAT('%',:cityName, '%'))")
	public List<City> findByCityName(@Param("cityName") String cityName);

}
