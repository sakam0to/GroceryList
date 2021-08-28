package com.jacky.grocerylist.service.impl;

import com.jacky.grocerylist.model.Item;
import com.jacky.grocerylist.repository.ItemRepository;
import com.jacky.grocerylist.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public String insertItem(Item item) {
        item.setId(UUID.randomUUID().toString());
        itemRepository.insert(item);
        return null;
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item findById(String id) {
        return itemRepository.findOne(id);
    }

    @Override
    public void delete(String id) {
        itemRepository.delete(id);
    }
}
