package com.ishev.bookstorerestapi.repositories.ebook;

import com.ishev.bookstorerestapi.models.EBook;

import java.util.List;

public interface EBookRepository {

    List<EBook> getAllEBooks();
    List<EBook> getAllEBooksByAuthorName(String authorName);
    List<EBook> getAllEBooksByTitle(String title);
    void updateEBookQuantity(int eBookId, int quantity);

}
