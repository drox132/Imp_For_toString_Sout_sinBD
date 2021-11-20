package com.company.repository;

import com.company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> listUser;

    public UserRepository(){
        listUser = new ArrayList<>();
    }


    public void insertUser (User createUser){

        listUser.add(createUser);

    }

    public List<User> selectAllUser (){
        List<User> listDeArray=listUser;
        return listDeArray;
    }

}
