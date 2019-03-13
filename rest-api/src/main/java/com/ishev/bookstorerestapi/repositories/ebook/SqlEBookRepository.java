package com.ishev.bookstorerestapi.repositories.ebook;

import com.ishev.bookstorerestapi.models.EBook;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlEBookRepository implements EBookRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public SqlEBookRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<EBook> getAllEBooksByAuthorName(String authorName) {
        return null;
    }
}
