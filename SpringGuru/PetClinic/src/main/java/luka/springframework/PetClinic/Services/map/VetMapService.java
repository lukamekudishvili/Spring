package luka.springframework.PetClinic.Services.map;

import luka.springframework.PetClinic.Model.Speciality;
import luka.springframework.PetClinic.Model.Vet;
import luka.springframework.PetClinic.Services.SpecialityService;
import luka.springframework.PetClinic.Services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {
    private final SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet save(Vet object){
        if(!object.getSpeciality().isEmpty()){
            object.getSpeciality().forEach(speciality -> {
                if(speciality.getId()==null){
                    Speciality savedSpecialty=specialityService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }
}
