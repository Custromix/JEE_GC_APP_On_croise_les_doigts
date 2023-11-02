package mybootapp.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mybootapp.Model.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

	List<Course> findByName(String name);

	List<Course> findByNameLike(String name);

}
