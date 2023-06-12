package com.company.contact_app.backend.model;

import lombok.Data;
import lombok.NonNull;
@Data
public class User {
    private @NonNull String fullName;
    private @NonNull String username;
    private @NonNull String phoneNumber;
}
