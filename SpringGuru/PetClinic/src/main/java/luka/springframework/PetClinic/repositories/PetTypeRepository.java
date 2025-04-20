package luka.springframework.PetClinic.repositories;

import luka.springframework.PetClinic.Model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
