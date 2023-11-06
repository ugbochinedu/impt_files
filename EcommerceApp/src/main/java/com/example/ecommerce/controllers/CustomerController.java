package com.example.ecommerce.controllers;

import com.example.ecommerce.dto.requests.RegistrationRequest;
import com.example.ecommerce.dto.response.ApiResponse;
import com.example.ecommerce.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ecommerce")
public class CustomerController {
    @Autowired
    CustomerService customerService ;

    @PostMapping("/post")
    public String find(){
        return "post mapping was successful";
    }

//    @PostMapping("/registration")
    public ResponseEntity<?> customerRegistration(@RequestBody RegistrationRequest registrationRequest){
        return new ResponseEntity<>(new ApiResponse(true,
                customerService.registerCustomer(registrationRequest)),
                HttpStatus.CREATED);
    }
    @GetMapping("/customer_login")
    public ResponseEntity<?> customerLogin(@PathVariable String email, @PathVariable String password){
       return new ResponseEntity<>(new ApiResponse(true,
                customerService.login(email, password)),
                HttpStatus.FOUND);
    }
}
