package luka.springframework.PetClinic.Model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {
    private Set<Speciality> speciality=new HashSet<>();

    public Set<Speciality> specialities() {
        return speciality;
    }

    public Set<Speciality> getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Set<Speciality> speciality) {
        this.speciality = speciality;
    }
}
