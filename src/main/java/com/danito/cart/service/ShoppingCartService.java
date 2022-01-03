package com.danito.cart.service;

import com.danito.cart.entities.CartItem;
import com.danito.cart.entities.Customer;
import com.danito.cart.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    private CartItemRepository cartItemRepository;

    public List<CartItem> listCartItem(Customer customer){
        return cartItemRepository.findByCustomer(customer);
    }
}
