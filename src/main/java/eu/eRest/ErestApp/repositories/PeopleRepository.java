package eu.eRest.ErestApp.repositories;

import eu.eRest.ErestApp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
