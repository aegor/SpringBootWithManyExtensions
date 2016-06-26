package microtest.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import microtest.domain.model.Attractions;

@RepositoryRestResource(collectionResourceRel = "attaction", path = "attractions")
public interface AttractionsRepository extends PagingAndSortingRepository<Attractions, Long> {

	// find attraction by its description
	public Attractions findByDescription(@Param("description") String description);

}