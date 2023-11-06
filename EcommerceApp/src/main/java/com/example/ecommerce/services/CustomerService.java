package com.example.ecommerce.services;

import com.example.ecommerce.dto.requests.OrderProductRequest;
import com.example.ecommerce.dto.requests.PaymentRequest;
import com.example.ecommerce.dto.requests.RegistrationRequest;
import com.example.ecommerce.dto.response.LoginResponse;
import com.example.ecommerce.dto.response.PaymentResponse;
import com.example.ecommerce.dto.response.RegistrationResponse;
import com.example.ecommerce.models.Product;

import java.util.List;

public interface CustomerService {

    public RegistrationResponse registerCustomer(RegistrationRequest registrationRequest);
    public LoginResponse login(String email, String password);
    public String changePassword(String oldPassword, String newPassword);
    public String orderProduct(OrderProductRequest orderProductRequest);
    public List<Product> searchProducts(String productName);
    public String addProductToCart (Product product);
    public PaymentResponse makePayment(PaymentRequest paymentRequest);

}
