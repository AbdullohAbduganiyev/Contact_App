package com.company.contact_app.backend.db;

import com.company.contact_app.backend.model.User;

import java.util.ArrayList;
import java.util.List;

public interface Database {
    List<User> USERS = new ArrayList<>();

    static void loadData(){
        User user1 = new User("Davlataliyev Donyor","Donyor","+998931419445");
        User user2 = new User("Alisher","javabackenddeveloper","+9989900787802");
        User user3 = new User("Ibrohim Hamidov","IbrohimB29","+998977776399");
        User user4 = new User("Bakhtiyorov_Jamshid","JamshidB29","+998933138827");
    }

}
