package com.jacky.grocerylist.repository;

import com.jacky.grocerylist.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {

}
