//package com.example.ecommerce.utilities;
//
//import com.example.ecommerce.dto.requests.RegistrationRequest;
//import com.example.ecommerce.dto.response.RegistrationResponse;
//import com.example.ecommerce.models.Customer;
//
//public class Mapper {
//
//    public static Customer map(RegistrationRequest registrationRequest){
//        Customer customer = new Customer();
//        customer.setEmail(registrationRequest.getEmail());
//        customer.setName(registrationRequest.getName());
//        customer.setPhoneNumber(registrationRequest.getPhoneNumber());
//
//        return customer;
//    }
//    public static RegistrationResponse map(Customer customer){
//        RegistrationResponse response = new RegistrationResponse();
//        response.setEmail(customer.getEmail());
//        response.setName(customer.getName());
//        response.setId(customer.getId());
//        return response;
//    }
//}
//
