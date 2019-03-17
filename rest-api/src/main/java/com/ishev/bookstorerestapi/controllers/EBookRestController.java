package com.ishev.bookstorerestapi.controllers;

import com.ishev.bookstorerestapi.models.EBook;
import com.ishev.bookstorerestapi.services.ebook.EBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ebooks")
public class EBookRestController {

    private final EBookService eBookService;

    @Autowired
    public EBookRestController(EBookService eBookService) {
        this.eBookService = eBookService;
    }

    @GetMapping
    public List<EBook> getEBooksCatalog() {
        return eBookService.getAllEBooks();
    }

    @GetMapping("/author/{authorName}")
    public List<EBook> searchEBooksByAuthorName(@PathVariable String authorName) {
        return eBookService.getAllEBooksByAuthorName(authorName);
    }

    @GetMapping("/title/{title}")
    public List<EBook> searchEBooksByTitle(@PathVariable String title) {
        return eBookService.getAllEBooksByTytle(title);
    }

    @PutMapping("/{eBookId}/{quantity}")
    public void updateBookQuantity(@PathVariable int eBookId, @PathVariable int quantity) {
        eBookService.updateEBookQuantity(eBookId, quantity);
    }

}
