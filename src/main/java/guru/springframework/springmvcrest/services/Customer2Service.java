package guru.springframework.springmvcrest.services;

import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.respositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Customer2Service {
    @Autowired
    private CustomerRepository customerRepository;
    public  void addCustomer(Customer customer)
    {
        customerRepository.save(customer);
    }
    public Customer getCustomerById(Integer id)
    {
       return customerRepository.findById(id).get();
    }
}
