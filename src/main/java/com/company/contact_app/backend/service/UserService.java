package com.company.contact_app.backend.service;

import lombok.NonNull;

public interface UserService {
    void saveContact(String name, String phoneNumber);
    void findNumber(String name);
}
