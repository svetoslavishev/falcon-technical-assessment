package com.ishev.bookstorerestapi.repositories.item;

import com.ishev.bookstorerestapi.models.Item;

import java.util.List;

public interface ItemRepository {

    List<Item> getAllItems();

    Item reduceItemInStockQuantity();
}
