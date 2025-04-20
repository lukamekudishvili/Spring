package luka.springframework.PetClinic.Services.map;

import luka.springframework.PetClinic.Model.Pet;
import luka.springframework.PetClinic.Services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {

}
