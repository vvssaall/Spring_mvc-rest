/*package guru.springframework.springmvcrest.services;

import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.respositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

   private final CustomerRepository customerRespository;

    public CustomerServiceImpl(CustomerRepository customerRespository) {
        this.customerRespository = customerRespository;
    }

    @Override
    public Customer findCustomerById(Integer id) {
        return customerRespository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers()
    {
        return customerRespository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRespository.save(customer);
    }
}

*/
