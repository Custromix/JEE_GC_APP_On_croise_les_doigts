package mybootapp.Repository;

import java.util.List;
import java.util.Optional;

import mybootapp.Model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

	List<Person> findByName(String name);

	List<Person> findByNameLike(String name);

}
