package luka.springframework.PetClinic.Services.map;

import luka.springframework.PetClinic.Model.Owner;
import luka.springframework.PetClinic.Services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
