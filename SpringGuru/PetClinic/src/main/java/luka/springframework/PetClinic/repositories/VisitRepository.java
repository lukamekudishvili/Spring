package luka.springframework.PetClinic.repositories;


import luka.springframework.PetClinic.Model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
