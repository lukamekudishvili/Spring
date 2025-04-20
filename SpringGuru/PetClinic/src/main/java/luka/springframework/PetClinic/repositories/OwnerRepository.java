package luka.springframework.PetClinic.repositories;

import luka.springframework.PetClinic.Model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
