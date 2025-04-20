package luka.springframework.PetClinic.repositories;

import luka.springframework.PetClinic.Model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
