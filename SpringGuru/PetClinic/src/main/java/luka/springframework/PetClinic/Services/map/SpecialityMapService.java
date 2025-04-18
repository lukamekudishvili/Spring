package luka.springframework.PetClinic.Services.map;

import luka.springframework.PetClinic.Model.Speciality;
import luka.springframework.PetClinic.Services.SpecialityService;
import org.springframework.stereotype.Service;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
}
