package com.example.demo.service.impl;

import com.example.demo.entity.TableEntity;
import com.example.demo.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionServiceB {

    @Autowired
    private TableService tableService;

    @Transactional
    public void methodB() throws Exception {
        System.out.println("methodB");
        tableService.insertTableB(new TableEntity("b"));
        throw new RuntimeException();
    }
}
