package luka.springframework.PetClinic.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vet extends Person {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities",joinColumns=@JoinColumn(name="vet_id"),
            inverseJoinColumns = @JoinColumn(name="speciality_id"))
    private Set<Speciality> speciality=new HashSet<>();

}
