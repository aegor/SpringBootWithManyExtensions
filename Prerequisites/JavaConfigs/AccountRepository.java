package microtest.repository;

//import org.springframework.data.repository.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import microtest.domain.model.Account;

public interface AccountRepository extends MongoRepository<Account, Long> {

    // find account by his username
    public Account findByUsername(@Param("userName") String userName);

}
