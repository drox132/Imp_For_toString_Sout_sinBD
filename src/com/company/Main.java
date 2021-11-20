package com.company;

import com.company.model.User;
import com.company.repository.UserRepository;
import com.company.service.implementation.UserServiceImplementation;

public class Main {

    public static void main(String[] args) {


        UserServiceImplementation userServiceImplementation= new UserServiceImplementation();


        User uno = new User(2,"Julio",26,true);
        userServiceImplementation.insertUser(uno);

        userServiceImplementation.insertUser(new User(1, "Francisco",29,true));


        userServiceImplementation.mostrarDatos();

        //userServiceImplementation.selectAllUser();
       // System.out.println(userServiceImplementation.selectAllUser());









    }
}
