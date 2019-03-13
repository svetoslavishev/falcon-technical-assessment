package com.ishev.bookstorerestapi.controllers;

import com.ishev.bookstorerestapi.services.ebook.EBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ebooks")
public class EBookRestController {

    private EBookService eBookService;

    @Autowired
    public EBookRestController(EBookService eBookService) {
        this.eBookService = eBookService;
    }

}
