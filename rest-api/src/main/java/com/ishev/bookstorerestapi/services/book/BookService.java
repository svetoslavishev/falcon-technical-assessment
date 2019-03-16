package com.ishev.bookstorerestapi.services.book;

import com.ishev.bookstorerestapi.models.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    List<Book> getAllBooksByAuthorName(String authorName);

    List<Book> getAllBooksByTitle(String title);

    Book getBookById(int id);
}
