package com.ishev.bookstorerestapi.repositories.request;

import com.ishev.bookstorerestapi.models.Request;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class SqlRequestRepository implements RequestRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public SqlRequestRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createRequest(Request request) {
        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            request.setDate(new Date());
            session.save(request);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
    }

    @Override
    public void deleteRequest(int id) {
        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            Request request = session.get(Request.class, id);
            session.delete(request);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
    }

    @Override
    public List<Request> getAllRequests() {

        List<Request> result;

        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            result = session.createQuery("from Request").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        return result;
    }
}
