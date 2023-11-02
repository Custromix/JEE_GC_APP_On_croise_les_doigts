package mybootapp.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = true)
    private String name;

    @OneToMany
    private Set<Person> persons = new HashSet<>();

    public boolean addPerson(Person person){
        boolean isAdded = false;
        if (!this.persons.contains(person)) {
            this.persons.add(person);
            isAdded = true;
        }

        return isAdded;
    }

}
