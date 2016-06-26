package microtest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.data.rest.core.annotation.RestResource;
import microtest.domain.model.City;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "citys", path = "cities")
public interface CityRepository extends PagingAndSortingRepository<City, Long> {

	// search block
	// find city by its params
	public Page<City> findByNameContainingAndCountryContainingAllIgnoringCase(
			@Param("name") String name, @Param("country") String country,
			Pageable pageable);

	// find city by its name and country
	/*
	public List<City> findByNameAndCountryAllIgnoringCase(@Param("name") String name,
			@Param("country") String country);
	*/
	// find city by its map
	public List<City> findByMap(String map);

	// find city by its name and map
	public List<City> findByNameAndMap(@Param("name") String name, @Param("map") String map);

	// find city by its name
	public List<City> findByNameLike(@Param("name") String name);

	// find city by its index and order by name
	@RestResource(path = "indexes", rel = "indexes")
	public List<City> findByIndexOrderByNameAsc(@Param("index") Long index);

	// find city by its index, who less then parameter index
	public List<City> findByIndexLessThan(@Param("index") Long index);

	// find city by its index, who greater then parameter index
	public List<City> findByIndexGreaterThan(@Param("index") Long index);

	// find city by its index, who between 620041 and 628541 indexes
	@Query("select c from City c where index between 620041 and 628541")
	public List<City> findAllByCities ();

	// find city by its name or country with "like"
	@Query("SELECT c FROM City c WHERE " +
			"LOWER(c.name) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR " +
			"LOWER(c.country) LIKE LOWER(CONCAT('%',:searchTerm, '%'))")
	public List<City> findBySearchTerm(@Param("searchTerm") String searchTerm);

}
