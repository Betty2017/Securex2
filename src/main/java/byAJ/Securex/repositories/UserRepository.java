package byAJ.Securex.repositories;

import org.springframework.data.repository.CrudRepository;

import byAJ.Securex.models.User;


public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername (String username);

}
