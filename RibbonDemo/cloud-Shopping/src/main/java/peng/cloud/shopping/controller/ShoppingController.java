package peng.cloud.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peng.cloud.beans.Order;
import peng.cloud.shopping.service.ShoppingService;

@RestController
public class ShoppingController {

    @Autowired
    private ShoppingService shoppingService;

    @RequestMapping("/buy")
    public Order handleBuy(String name, String price) {
        return shoppingService.handleBuy(name, price);
    }
}