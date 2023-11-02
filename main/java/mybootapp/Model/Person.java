package mybootapp.Model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mybootapp.Controller.GroupController;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = true)
	private String name;

	@Column(nullable = true)
	private String firstname;

	@Column(nullable = true)
	private String username;

	@Column(nullable = true)
	private String adress;

	@ManyToOne
	private Groupe groups;


}
