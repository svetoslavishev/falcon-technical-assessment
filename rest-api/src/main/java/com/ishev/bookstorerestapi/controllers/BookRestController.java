package com.ishev.bookstorerestapi.controllers;

import com.ishev.bookstorerestapi.models.Book;
import com.ishev.bookstorerestapi.services.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookRestController {

    private final BookService bookService;

    @Autowired
    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooksCatalog() {
        return bookService.getAllBooks();
    }

    @GetMapping("/author/{authorName}")
    public List<Book> searchBooksByAuthorName(@PathVariable String authorName) {
        return bookService.getAllBooksByAuthorName(authorName);
    }

    @GetMapping("/title/{title}")
    public List<Book> searchBooksByTitle(@PathVariable String title) {
        return bookService.getAllBooksByTitle(title);
    }

    @PutMapping("/{bookId}/{quantity}")
    public void updateBookQuantity(@PathVariable int bookId, @PathVariable int quantity) {
        bookService.updateBookQuantity(bookId, quantity);
    }
}
