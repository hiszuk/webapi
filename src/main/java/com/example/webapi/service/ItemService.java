package com.example.webapi.service;

import java.util.List;

import com.example.webapi.entity.Item;
import com.example.webapi.repository.ItemDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemDao itemMapper;

    public List<Item> selectAll() {
        return itemMapper.selectAll();
    }

    public Item selectByKey(int id) {
        return itemMapper.selectByKey( id );
    }

}