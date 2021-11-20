package com.company.service.implementation;

import com.company.model.User;
import com.company.repository.UserRepository;
import com.company.service.UserService;

import java.util.List;

public class UserServiceImplementation implements UserService {

    private UserRepository userRepository =new UserRepository();

    public UserServiceImplementation() {
    }


    private List<User> selectAllUser() {
        return userRepository.selectAllUser();
    }

    @Override
    public void insertUser(User createUser) {
         userRepository.insertUser(createUser);

    }

    @Override
    public void mostrarDatos() {

        List<User> listUsers = this.selectAllUser();

        for (User particularUseer:listUsers) {
            System.out.println(particularUseer.toString());
        }

        for (User particularUseer:listUsers){
            System.out.print("id = " + particularUseer.getId() + " " );
            System.out.print("name = " + particularUseer.getName() + " ");
            System.out.print("age = " .concat(String.valueOf(particularUseer.getAge())) .concat(" "));
            String isDeveloper= " isDeveloper =";
            System.out.println(isDeveloper.concat(String.valueOf(particularUseer.isDeveloper())));

        }
    }
}
