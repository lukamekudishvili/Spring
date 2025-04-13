package luka.springframework.PetClinic.Services.map;

import luka.springframework.PetClinic.Model.Vet;
import luka.springframework.PetClinic.Services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {
}
