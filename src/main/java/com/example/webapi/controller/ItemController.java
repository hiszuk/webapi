package com.example.webapi.controller;

import java.util.List;

import com.example.webapi.entity.Item;
import com.example.webapi.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ItemController {

    @Autowired 
    private ItemService itemService;

    @CrossOrigin
    @GetMapping(value = "/items")
    public List<Item> selectAll() {
        return itemService.selectAll();
    }

}