package luka.springframework.PetClinic.repositories;

import luka.springframework.PetClinic.Model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
