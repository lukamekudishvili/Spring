package luka.springframework.PetClinic.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "types")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetType extends BaseEntity {
    @Column(name = "name")
    private String name;

}
