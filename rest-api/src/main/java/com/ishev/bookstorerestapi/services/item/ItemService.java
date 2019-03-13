package com.ishev.bookstorerestapi.services.item;

import com.ishev.bookstorerestapi.models.Item;

import java.util.List;

public interface ItemService {

    List<Item> getAllItems();

    Item reduceItemInStockQuantity();

}
