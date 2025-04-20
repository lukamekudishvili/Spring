package luka.springframework.PetClinic.repositories;

import luka.springframework.PetClinic.Model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
