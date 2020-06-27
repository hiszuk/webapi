package com.example.webapi.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Item implements Serializable{
    static final long serialVersionUID = 1L;
    public int id;
    public String title;
    public String content;
    public String status;
}
