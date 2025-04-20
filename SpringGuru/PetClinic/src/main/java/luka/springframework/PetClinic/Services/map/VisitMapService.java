package luka.springframework.PetClinic.Services.map;

import luka.springframework.PetClinic.Model.Visit;
import luka.springframework.PetClinic.Services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {
}
