package luka.springframework.PetClinic.Model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

@MappedSuperclass
@Setter
@Getter
public abstract class Person extends BaseEntity{
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
}
