package mybootapp.Controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mybootapp.Model.Person;
import mybootapp.Repository.CourseRepository;

@Controller
@RequestMapping("/course")
public class CourseControler {

	/*
	 * Injection de la DAO de manipulation des cours.
	 */
	@Autowired
	CourseRepository repo;

	@PostConstruct
	public void init() {
		repo.save(new Person());
		repo.save(new Person());
	}

	@RequestMapping("/list")
	public ModelAndView listCourses() {
		return new ModelAndView("course", "courses", repo.findAll());
	}

	@RequestMapping("/new")
	public String newCourse() {
		final var course = new Person();
		repo.save(course);
		return "redirect:/course/list";
	}

	@RequestMapping("/find")
	public ModelAndView findCourses(String name) {
		final var result = repo.findByNameLike("%" + name + "%");
		return new ModelAndView("course", "courses", result);
	}

}
