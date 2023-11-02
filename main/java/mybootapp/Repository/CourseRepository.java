package mybootapp.Repository;

import java.util.List;

import mybootapp.Model.Person;
import org.springframework.data.repository.CrudRepository;

import mybootapp.Model.Person;

public interface CourseRepository extends CrudRepository<Person, Long> {

	List<Person> findByName(String name);

	List<Person> findByNameLike(String name);

}
