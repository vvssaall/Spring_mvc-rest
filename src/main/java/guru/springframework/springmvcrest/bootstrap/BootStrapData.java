/*package guru.springframework.springmvcrest.bootstrap;

import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.respositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRespository;

    public BootStrapData(CustomerRepository customerRespository) {
        this.customerRespository = customerRespository;
    }

    @Override
    public void run(String... args) throws Exception {

        Customer c1= new Customer();
        c1.setFirstname("vishal");
        c1.setLastname("KC");
        customerRespository.save(c1);

        Customer c2= new Customer();
        c2.setFirstname("Diplip");
        c2.setLastname("Thapa");
        customerRespository.save(c2);

        Customer c3= new Customer();
        c3.setFirstname("Sagar");
        c3.setLastname("Kuwar");
        customerRespository.save(c3);

        System.out.println("Customer saved"+ customerRespository.count());
    }
}
*/