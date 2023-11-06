package com.example.ecommerce.serviceImpl;

import com.example.ecommerce.dto.requests.OrderProductRequest;
import com.example.ecommerce.dto.requests.PaymentRequest;
import com.example.ecommerce.dto.requests.RegistrationRequest;
import com.example.ecommerce.dto.response.LoginResponse;
import com.example.ecommerce.dto.response.PaymentResponse;
import com.example.ecommerce.dto.response.RegistrationResponse;
import com.example.ecommerce.models.Product;
import com.example.ecommerce.repositories.CustomerRepository;
import com.example.ecommerce.services.CustomerService;
//import com.example.ecommerce.utilities.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public RegistrationResponse registerCustomer(RegistrationRequest registrationRequest) {
//        Customer customer = Mapper.map(registrationRequest);
//        customerRepository.save(customer);
//        RegistrationResponse response = Mapper.map(customer);

//        return response;
        return null;
    }

    @Override
    public LoginResponse login(String email, String password) {

        return null;
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        return null;
    }

    @Override
    public String orderProduct(OrderProductRequest orderProductRequest) {
        return null;
    }

    @Override
    public List<Product> searchProducts(String productName) {
        return null;
    }

    @Override
    public String addProductToCart(Product product) {
        return null;
    }

    @Override
    public PaymentResponse makePayment(PaymentRequest paymentRequest) {
        return null;
    }
}
