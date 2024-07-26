package com.example.demo.service.impl;

import com.example.demo.entity.TableEntity;
import com.example.demo.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionServiceA {
    @Autowired
    private TableService tableService;
    @Autowired
    private TransactionServiceB transactionServiceB;

    @Transactional
    public void methodA() throws Exception {
        System.out.println("methodA");
        tableService.insertTableA(new TableEntity("a"));
        transactionServiceB.methodB();
    }

}
