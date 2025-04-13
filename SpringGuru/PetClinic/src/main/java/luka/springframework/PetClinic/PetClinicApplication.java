package luka.springframework.PetClinic;

import luka.springframework.PetClinic.Services.OwnerService;
import luka.springframework.PetClinic.Services.map.OwnerMapService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}

}
