package com.jacky.grocerylist.rest;

import com.jacky.grocerylist.dict.DefaultServiceResult;
import com.jacky.grocerylist.model.Item;
import com.jacky.grocerylist.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemRest {
    @Autowired
    private ItemService itemService;

    @GetMapping("/view/lists")
    public DefaultServiceResult<Object> queryAll(Authentication authentication) {
        List<Item> items = itemService.findAll();
        return new DefaultServiceResult<>(items);
    }

    @GetMapping("/view/query")
    public DefaultServiceResult<Object> query(Authentication authentication, @RequestParam("id") String id) {
        Item item = itemService.findById(id);
        return new DefaultServiceResult<>(item);
    }

    @PostMapping("/modify/add")
    public DefaultServiceResult<Object> add(Authentication authentication, @RequestBody Item item) {
        String id = itemService.insertItem(item);
        return new DefaultServiceResult<>(id);
    }

    @DeleteMapping("/modify/delete")
    public DefaultServiceResult<Object> delete(Authentication authentication, @RequestParam("id") String id) {
        itemService.delete(id);
        return new DefaultServiceResult<>();
    }
}
