package mybootapp.Repository;

import mybootapp.Model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupRepository extends CrudRepository<Person, Long> {

	List<Person> findByName(String name);

	List<Person> findByNameLike(String name);

}
