package com.ishev.bookstorerestapi.controllers;

import com.ishev.bookstorerestapi.services.item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/items")
public class ItemRestController {
    private final ItemService itemService;

    @Autowired
    public ItemRestController(ItemService itemService) {
        this.itemService = itemService;
    }
}
