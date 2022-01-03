package com.danito.cart.repository;

import com.danito.cart.entities.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void AddOneCustomer() {

        Customer newItem = new Customer();
        newItem.setEmail("dani@mail.com");
        newItem.setFirstName("dani");
        newItem.setLastName("Vargas");

        Customer saveCustomer = customerRepository.save(newItem);

        assertTrue(saveCustomer.getId() > 0);
    }
}