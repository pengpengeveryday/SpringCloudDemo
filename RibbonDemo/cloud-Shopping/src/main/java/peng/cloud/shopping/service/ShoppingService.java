package peng.cloud.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import peng.cloud.beans.Order;

@Service
public class ShoppingService {
    @Autowired
    RestTemplate restTemplate;

    public Order handleBuy(String bookName, String price) {
        String address = restTemplate.getForObject(
                "http://ribbon-express/express?name=" + bookName,
                String.class);
        Order order = new Order();
        order.setName(bookName);
        order.setPrice(price);
        order.setAddress(address);
        return order;
    }
}
