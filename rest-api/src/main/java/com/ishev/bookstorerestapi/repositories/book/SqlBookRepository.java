package com.ishev.bookstorerestapi.repositories.book;

import com.ishev.bookstorerestapi.models.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlBookRepository implements BookRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public SqlBookRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> result;

        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            result = session.createQuery("from Book").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        return result;
    }

    @Override
    public List<Book> getAllBooksByAuthorName(String authorName) {

        List<Book> result;

        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            result = session.createQuery("from Book where upper(authorName) like :authorName")
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
    public List<Book> getAllBooksByTitle(String title) {
        List<Book> result;

        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            result = session.createQuery("from Book where upper(title) like :title")
                    .setParameter("title", title.toUpperCase() + "%")
                    .list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        return result;
    }

    @Override
    public Book getBookById(int id) {

        Book result;

        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            result = (Book) session.createQuery("from Book where itemId = :id")
                    .setParameter("id", id)
                    .uniqueResult();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        return result;
    }
}
