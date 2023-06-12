package com.company.contact_app.backend.service;

import com.company.contact_app.backend.db.Database;
import com.company.contact_app.backend.dto.Repository;
import lombok.NonNull;

import java.util.Objects;

public class UserServiceImpl implements UserService {


    @Override
    public Repository saveContact(@NonNull String name, @NonNull String phoneNumber) {
        try{
            if (name.isBlank()){
                return new Repository("User name is required!",false);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void findNumber(@NonNull String name) {
        Database.USERS.stream()
                .filter(user -> Objects.equals(user.getUsername(),name))
                .findFirst()
                .orElse(null);
    }

}
