package com.ishev.bookstorerestapi.repositories.ebook;

import com.ishev.bookstorerestapi.models.EBook;
import org.hibernate.Session;
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
        List<EBook> result;

        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            result = session.createQuery("from EBook where upper(authorName) like :authorName")
                    .setParameter("authorName", authorName.toUpperCase())
                    .list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        return result;
    }

    @Override
    public List<EBook> getAllEBooksByTitle(String title) {
        List<EBook> result;

        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            result = session.createQuery("from EBook where upper(title) like :title")
                    .setParameter("title", title.toUpperCase() + "%")
                    .list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        return result;
    }
}
