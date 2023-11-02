package mybootapp.Controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mybootapp.Model.Person;
import mybootapp.Repository.PersonRepository;

@Controller
@RequestMapping("/person")
public class PersonController {

	/*
	 * Injection de la DAO de manipulation des cours.
	 */
	@Autowired
	private PersonRepository repository;

	@PostConstruct
	public void init() {
		repository.save(new Person());
		repository.save(new Person());
	}

	@RequestMapping("/list")
	public ModelAndView listCourses() {
		return new ModelAndView("person", "courses", repository.findAll());
	}

	@RequestMapping("/new")
	public String newCourse() {
		final var person = new Person();
		repository.save(person);
		return "redirect:/person/list";
	}

	@RequestMapping("/find")
	public ModelAndView findCourses(String name) {
		final var result = repository.findByNameLike("%" + name + "%");
		return new ModelAndView("person", "courses", result);
	}

}
