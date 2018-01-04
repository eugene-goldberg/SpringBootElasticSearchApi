package sample.data.jest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
public class Loaders {
private int i = 0;
    @Autowired
    private CustomerRepository repository;

    @PostConstruct
    @Transactional
    public void loadAll(){
        CustomerRepository cr = repository;
//        this.repository.deleteAll();
        saveCustomers();
//        fetchAllCustomers();
//        fetchIndividualCustomers();

    }

    private void saveCustomers() {
        this.repository.save(new Customer("Jerry", "Smith"));
        this.repository.save(new Customer("Will", "Smith"));
    }

    private void fetchAllCustomers() {
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : this.repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();
    }

    private void fetchIndividualCustomers() {
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(this.repository.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Customer customer : this.repository.findByLastName("Smith")) {
            System.out.println(customer);
        }
    }
}
