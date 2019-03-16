package com.ishev.bookstorerestapi.services.book;

import com.ishev.bookstorerestapi.models.Book;
import com.ishev.bookstorerestapi.repositories.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooksByAuthorName(String authorName) {
        return bookRepository.getAllBooksByAuthorName(authorName);
    }

    @Override
    public List<Book> getAllBooksByTitle(String title) {
        return bookRepository.getAllBooksByTitle(title);
    }

    @Override
    public Book getBookById(int id) {
        return bookRepository.getBookById(id);
    }
}
