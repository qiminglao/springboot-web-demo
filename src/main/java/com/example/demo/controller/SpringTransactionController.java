package com.example.demo.controller;

import com.example.demo.service.impl.TransactionServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class SpringTransactionController {
    @Autowired
    private TransactionServiceA transactionServiceA;

    /**
     * https://www.cnblogs.com/chanshuyi/p/head-first-of-spring-transaction.html
     */
    @RequestMapping("/spring-transaction")
    public String testTransaction() throws Exception {
        transactionServiceA.methodA();
        return "SUCCESS";
    }

}
