package com.danito.cart.controllers;

import com.danito.cart.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/cart")
    public String showShoppingCart(Model model){ //@AuthenticationPrincipal Authentication authentication

        return "shoping cart";
    }
}
