package com.danito.cart.repository;

import com.danito.cart.entities.CartItem;
import com.danito.cart.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

    public List<CartItem> findByCustomer(Customer customer);


}
