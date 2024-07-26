package com.example.demo.service.impl;

import com.example.demo.entity.TableEntity;
import com.example.demo.mapper.TableMapper;
import com.example.demo.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableServiceImpl implements TableService {

    @Autowired
    private TableMapper tableMapper;

    @Override
    public void insertTableA(TableEntity tableEntity) {
        tableMapper.insertTableA(tableEntity);
    }

    @Override
    public void insertTableB(TableEntity tableEntity) {
        tableMapper.insertTableB(tableEntity);
    }
}
