package com.ishev.bookstorerestapi.controllers;

import com.ishev.bookstorerestapi.models.EBook;
import com.ishev.bookstorerestapi.services.ebook.EBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ebooks")
public class EBookRestController {

    private final EBookService eBookService;

    @Autowired
    public EBookRestController(EBookService eBookService) {
        this.eBookService = eBookService;
    }

    @GetMapping("/author/{authorName}")
    public List<EBook> searchEBooksByAuthorName(@PathVariable String authorName) {
        return eBookService.getAllEBooksByAuthorName(authorName);
    }

    @GetMapping("/title/{title}")
    public List<EBook> searchEBooksByTitle(@PathVariable String title) {
        return eBookService.getAllEBooksByTytle(title);
    }

    @GetMapping("/{id}")
    public EBook getBookById(@PathVariable int id) {
        return eBookService.getEBookById(id);
    }
}
