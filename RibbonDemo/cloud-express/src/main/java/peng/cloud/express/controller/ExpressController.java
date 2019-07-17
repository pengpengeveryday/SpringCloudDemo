package peng.cloud.express.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peng.cloud.express.service.ExpressService;

@RestController
public class ExpressController {

    @Autowired
    private ExpressService expressService;

    @RequestMapping("/express")
    public String handleExpress(String bookName) {
        return expressService.handleExpress(bookName);
    }
}