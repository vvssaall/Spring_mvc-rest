package guru.springframework.springmvcrest.controller;

import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.services.Customer2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer2")
public class Customer2Controller {
    @Autowired
    private Customer2Service customer2Service;
    @RequestMapping(value = "/addCustomer",method = RequestMethod.POST)
    public void createCustomer(@RequestBody Customer customer)
    {
       customer2Service.addCustomer(customer);
    }
    @RequestMapping(value = "/getCustomer/{id}",method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable Integer id)
    {
      return customer2Service.getCustomerById(id);
    }
}
