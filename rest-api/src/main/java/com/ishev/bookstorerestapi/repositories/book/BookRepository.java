package com.ishev.bookstorerestapi.repositories.book;

import com.ishev.bookstorerestapi.models.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getAllBooks();
    List<Book> getAllBooksByAuthorName(String authorName);
    List<Book> getAllBooksByTitle(String title);
    void updateBookQuantity(int bookId, int quantity);

}
