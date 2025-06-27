package com.lukacode.restful_Web_Services_Demo.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users=new ArrayList<>();

    static {
        users.add(new User(1,"Luka Mekudishvili",LocalDate.now().minusYears(23)));
        users.add(new User(2,"Luka2 Mekudishvili2",LocalDate.now().minusYears(23)));
        users.add(new User(3,"Luka3 Mekudishvili3",LocalDate.now().minusYears(23)));
    }
    public List<User> findAll(){
        return users;
    }

    public User save(User userToSave){
        Predicate<? super User> predicate=user -> user.getId().equals(userToSave.getId());
        if(users.stream().filter(predicate).findFirst().orElse(null)==null){
            users.add(userToSave);

            return userToSave;
        }
         throw new RuntimeException("User already exists!");
    }

    public User getUserById(Integer id){
        Predicate<? super User> predicate= (Predicate<User>) user -> user.getId().equals(id);

        return users.stream().filter(predicate).findFirst().orElse(null);

    }

    public void deleteById(Integer id){
        Predicate<? super User> predicate= user -> user.getId().equals(id);
        users.removeIf(predicate);
    }

}
