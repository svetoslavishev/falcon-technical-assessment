package com.ishev.bookstorerestapi.repositories.ebook;

import com.ishev.bookstorerestapi.models.EBook;

import java.util.List;

public interface EBookRepository {

    List<EBook> getAllEBooksByAuthorName(String authorName);
    List<EBook> getAllEBooksByTitle(String title);

}
