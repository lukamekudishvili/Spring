package luka.springframework.PetClinic.Services.map;

import luka.springframework.PetClinic.Model.PetType;
import luka.springframework.PetClinic.Services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {
}
