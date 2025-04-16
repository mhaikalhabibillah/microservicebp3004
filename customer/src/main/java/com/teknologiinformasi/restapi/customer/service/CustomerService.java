package com.teknologiinformasi.restapi.customer.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teknologiinformasi.restapi.customer.model.Customer;
import com.teknologiinformasi.restapi.customer.repository.CustomerRepository;



@Service
public class CustomerService {


   @Autowired
   private CustomerRepository customerRepository;


   public List<Customer> getAll() {
       return customerRepository.findAll();
   }


   public Optional<Customer> getById(Long id) {
       return customerRepository.findById(id);
   }


   public Customer createCustomer(Customer customer) {
       return customerRepository.save(customer);
   }


   public Customer updateCustomer(Long id, Customer customerDetails) {
       Customer customer = customerRepository.findById(id)
           .orElseThrow(() -> new RuntimeException("Customer not found with id " + id));
       customer.setName(customerDetails.getName());
       customer.setEmail(customerDetails.getEmail());
       customer.setAddress(customerDetails.getAddress());
       return customerRepository.save(customer);
   }


   public void deleteCustomer(Long id) {
       Customer customer = customerRepository.findById(id)
           .orElseThrow(() -> new RuntimeException("Customer not found with id " + id));
       customerRepository.delete(customer);
   }
}




