package com.springframework.pets;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service
//@Profile({"dog","default"})
public class DogPetService implements PetService {
    @Override
    public String getType() {
        return "Dogs are the Best!";
    }
}
