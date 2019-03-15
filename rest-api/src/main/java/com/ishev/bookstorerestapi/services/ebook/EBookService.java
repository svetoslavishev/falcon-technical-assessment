package com.ishev.bookstorerestapi.services.ebook;

import com.ishev.bookstorerestapi.models.EBook;

import java.util.List;

public interface EBookService {

    List<EBook> getAllEBooksByAuthorName(String authorName);

    List<EBook> getAllEBooksByTytle(String title);
}
