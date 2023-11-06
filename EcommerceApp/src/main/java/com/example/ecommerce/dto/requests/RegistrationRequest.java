package com.example.ecommerce.dto.requests;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class RegistrationRequest {
    private String name;
    private String password;
    private String phoneNumber;
    private String email;
}
