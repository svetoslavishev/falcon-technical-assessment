package com.ishev.bookstorerestapi.repositories.book;

import com.ishev.bookstorerestapi.models.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getAllBooksByAuthorName(String authorName);

    List<Book> getAllBooksByTitle(String title);

    Book getBookById(int id);
}
