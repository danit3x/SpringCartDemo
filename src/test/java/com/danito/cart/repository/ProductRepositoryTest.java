package com.danito.cart.repository;

import com.danito.cart.entities.Product;
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
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void AddOneProduct(){

        Product newItem = new Product();
        newItem.setName("Mostachol");
        newItem.setAlias("Fideos");
        newItem.setShortDescription("Fideos de huevo con forma de mostachol");

        Product saveProduct = productRepository.save(newItem);

        assertTrue(saveProduct.getId() >0);


    }
}