package luka.springframework.PetClinic.Services;

import luka.springframework.PetClinic.Model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
