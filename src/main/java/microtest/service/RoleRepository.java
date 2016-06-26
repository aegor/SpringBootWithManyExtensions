package microtest.service;

import microtest.domain.oauth.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Student on 24.06.2016.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

       List<Role> findAll();
       Role findByName(String name);

}
