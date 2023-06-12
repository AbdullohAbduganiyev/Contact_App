package com.company.contact_app.backend.service;

import com.company.contact_app.backend.dto.Repository;
import lombok.NonNull;

public interface UserService {
    Repository saveContact(@NonNull String name, @NonNull String phoneNumber);
    void findNumber(@NonNull String name);
}
