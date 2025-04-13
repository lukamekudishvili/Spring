package luka.springframework.PetClinic.Services.map;

import luka.springframework.PetClinic.Model.Pet;
import luka.springframework.PetClinic.Services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {

}
