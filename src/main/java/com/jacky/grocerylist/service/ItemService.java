package com.jacky.grocerylist.service;

import com.jacky.grocerylist.model.Item;

import java.util.List;

public interface ItemService {

    String insertItem(Item item);

    List<Item> findAll();

    Item findById(String id);

    void delete(String id);
}
